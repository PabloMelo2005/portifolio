using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace AnimalsApi.Migrations
{
    /// <inheritdoc />
    public partial class InitialCreate : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateTable(
                name: "Animais",
                columns: table => new
                {
                    Id = table.Column<int>(type: "INTEGER", nullable: false)
                        .Annotation("Sqlite:Autoincrement", true),
                    Nome = table.Column<string>(type: "TEXT", nullable: true),
                    NomeCientifico = table.Column<string>(type: "TEXT", nullable: true),
                    Familia = table.Column<string>(type: "TEXT", nullable: true),
                    Ordem = table.Column<string>(type: "TEXT", nullable: true),
                    Dieta = table.Column<string>(type: "TEXT", nullable: true),
                    Habitat = table.Column<string>(type: "TEXT", nullable: true),
                    PesoMedio = table.Column<double>(type: "REAL", nullable: true),
                    Tamanho = table.Column<double>(type: "REAL", nullable: true),
                    PrincipaisAmeacas = table.Column<string>(type: "TEXT", nullable: true),
                    TendenciaPopulacional = table.Column<string>(type: "TEXT", nullable: true),
                    PopulacaoEstimada = table.Column<int>(type: "INTEGER", nullable: true),
                    StatusConservacao = table.Column<string>(type: "TEXT", nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Animais", x => x.Id);
                });
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "Animais");
        }
    }
}
