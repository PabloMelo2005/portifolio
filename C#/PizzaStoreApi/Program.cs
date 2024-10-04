using Microsoft.OpenApi.Models;

var builder = WebApplication.CreateBuilder(args);

builder.Services.AddEndpointsApiExplorer();
builder.Services.AddSwaggerGen(
    c => {
        c.SwaggerDoc("v1", new OpenApiInfo {Title = "Pizza Store API", Description = "Fazendo Pizzas por amor", Version = "v1"});
    }
);

var app = builder.Build();

if (app.Environment.IsDevelopment())
{
  app.UseSwagger();
  app.UseSwaggerUI(
    c => c.SwaggerEndpoint("/swagger/v1/swagger.json", "Pizza")
  );
}

app.MapGet("/", () => "Hello World!");

app.Run();
