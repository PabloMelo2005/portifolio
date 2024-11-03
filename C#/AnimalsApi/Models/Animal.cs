
namespace AnimaisExtincaoAPI.Models
{
    public class Animal
    {
        public int Id { get; set; }

        public string? Nome { get; set; }

        public string? NomeCientifico { get; set; }

        public string? Familia { get; set; }

        public string? Ordem { get; set; }

        public string? Dieta { get; set; }

        public string? Habitat { get; set; }

        public double? PesoMedio { get; set; }

        public double? Tamanho { get; set; }

        public string? PrincipaisAmeacas { get; set; }

        public string? TendenciaPopulacional { get; set; }

        public int? PopulacaoEstimada { get; set; }

        public string? StatusConservacao { get; set; }
    }
}
