using AnimaisExtincaoAPI.Controllers;
using AnimaisExtincaoAPI.Data;
using HabitatsAPI.Controllers;
using Microsoft.EntityFrameworkCore;
using System.Net.Http.Headers;

var builder = WebApplication.CreateBuilder(args);

// Configuração da string de conexão com MySQL
builder.Services.AddDbContext<AppDbContext>(options =>
    options.UseMySql(
        builder.Configuration.GetConnectionString("DefaultConnection"),
        new MySqlServerVersion(new Version(8, 0, 25))
    ));

// Configuração do HttpClient com o cabeçalho "User-Agent" e injeção do Bearer Token
builder.Services.AddHttpClient<HabitatsController>(client =>
{
    client.DefaultRequestHeaders.Add("User-Agent", "IntegracaoViacep");

    // Configuração do Authorization header para o Bearer Token
    var apiKey = builder.Configuration["F7bN89KYZs4vCP8NdFevh7Z3hRU4zAQLDdXj"];
    if (!string.IsNullOrEmpty(apiKey))
    {
        client.DefaultRequestHeaders.Authorization = new AuthenticationHeaderValue("Bearer", apiKey);
    }
});

// Adicionando serviços e configuração padrão da API
builder.Services.AddControllers();
builder.Services.AddEndpointsApiExplorer();
builder.Services.AddSwaggerGen();
builder.Services.AddSingleton<IConfiguration>(builder.Configuration);

var app = builder.Build();

if (app.Environment.IsDevelopment())
{
    app.UseSwagger();
    app.UseSwaggerUI();
}

app.UseHttpsRedirection();
app.UseAuthorization();
app.MapControllers();

app.Run();
