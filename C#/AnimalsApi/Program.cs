using Microsoft.EntityFrameworkCore;
using Microsoft.OpenApi.Models;
using AnimaisExtincaoAPI.Data;
using AnimaisExtincaoAPI.Models;
using AnimaisExtincaoAPI.Services; 

var builder = WebApplication.CreateBuilder(args);

builder.Services.AddEndpointsApiExplorer();
builder.Services.AddSwaggerGen(
    c =>
    {
        c.SwaggerDoc("v1", new OpenApiInfo
        {
            Title = "Extinction Animals API",
            Description = "Tornando a catalogação de animais em extinção cada vez menos complexa!",
            Version = "v1"
        });
    }
);

// Configuração da conexão com o banco de dados sqlite
var connectionString = builder.Configuration.GetConnectionString("Animais") ?? "Data Source=Animais.db";
builder.Services.AddSqlite<AppDbContext>(connectionString);

//Configuração da utilização da ApiGovernamental
builder.Services.AddHttpClient<GovernmentApiService>(); 


var app = builder.Build();

if (app.Environment.IsDevelopment())
{
    app.UseSwagger();
    app.UseSwaggerUI(
        c => c.SwaggerEndpoint("/swagger/v1/swagger.json", "Animais em Extinção v1")
    );
}

app.UseHttpsRedirection();

// GET: Lista todos os animais
app.MapGet("/animais", async (AppDbContext db) => await db.Animais.ToListAsync());

// GET: Busca um animal por ID
app.MapGet("/animal/{id}", async (AppDbContext db, int id) => await db.Animais.FindAsync(id));

// PUT: Atualiza um animal pelo ID
app.MapPut("/animal/{id}", async (AppDbContext db, Animal updateAnimal, int id) =>
{
    var animal = await db.Animais.FindAsync(id);
    if (animal is null) return Results.NotFound();

    // Atualização dos campos do animal
    animal.Nome = updateAnimal.Nome;
    animal.NomeCientifico = updateAnimal.NomeCientifico;
    animal.Familia = updateAnimal.Familia;
    animal.Ordem = updateAnimal.Ordem;
    animal.Dieta = updateAnimal.Dieta;
    animal.Habitat = updateAnimal.Habitat;
    animal.PesoMedio = updateAnimal.PesoMedio;
    animal.Tamanho = updateAnimal.Tamanho;
    animal.PrincipaisAmeacas = updateAnimal.PrincipaisAmeacas;
    animal.TendenciaPopulacional = updateAnimal.TendenciaPopulacional;
    animal.PopulacaoEstimada = updateAnimal.PopulacaoEstimada;
    animal.StatusConservacao = updateAnimal.StatusConservacao;

    await db.SaveChangesAsync();
    return Results.NoContent();
});

//Deletar um animal
app.MapDelete("/animal/{id}", async (AppDbContext db, int id) =>
{
    var animal = await db.Animais.FindAsync(id);
    if (animal is null) return Results.NotFound();

    db.Animais.Remove(animal);
    await db.SaveChangesAsync();
    return Results.Ok();
});

//Editar os dados de um animal
app.MapPost("/animal", async (AppDbContext db, Animal animal) =>
{
    await db.Animais.AddAsync(animal);
    await db.SaveChangesAsync();
    return Results.Created($"/animal/{animal.Id}", animal);
});

// Endpoint para buscar informações de uma unidade governamental:
app.MapGet("/governmentAPI/{codigoUnidade}", async (GovernmentApiService governmentService, string codigoUnidade) =>
{
    var orgao = await governmentService.GetUnitByIdAsync(codigoUnidade);
    return orgao is not null ? Results.Ok(orgao) : Results.NotFound();
})
.WithName("GetUnitByIdAsync")
.WithOpenApi();


app.Run();
