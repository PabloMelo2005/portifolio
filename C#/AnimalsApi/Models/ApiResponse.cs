using System.Text.Json.Serialization;

namespace AnimaisExtincaoAPI.Models
{

    //Configuração da classe que será utilizada para as inserção das informações utilizadas na integração:
    public class Servico
    {
        [JsonPropertyName("codigoErro")]
        public int CodigoErro { get; set; }

        [JsonPropertyName("mensagem")]
        public string? Mensagem { get; set; }

        [JsonPropertyName("data")]
        public string? Data { get; set; }

        [JsonPropertyName("versaoServico")]
        public string? VersaoServico { get; set; }

        [JsonPropertyName("ipRequisitante")]
        public string? IpRequisitante { get; set; }

        [JsonPropertyName("ticket")]
        public object? Ticket { get; set; }
    }

    public class Unidade
    {
        [JsonPropertyName("codigoUnidade")]
        public string? CodigoUnidade { get; set; }

        [JsonPropertyName("codigoUnidadePai")]
        public string? CodigoUnidadePai { get; set; }

        [JsonPropertyName("codigoOrgaoEntidade")]
        public string? CodigoOrgaoEntidade { get; set; }

        [JsonPropertyName("codigoTipoUnidade")]
        public string? CodigoTipoUnidade { get; set; }

        [JsonPropertyName("nome")]
        public string? Nome { get; set; }

        [JsonPropertyName("sigla")]
        public string? Sigla { get; set; }

        [JsonPropertyName("codigoEsfera")]
        public string? CodigoEsfera { get; set; }

        [JsonPropertyName("codigoPoder")]
        public string? CodigoPoder { get; set; }

        [JsonPropertyName("codigoNaturezaJuridica")]
        public string? CodigoNaturezaJuridica { get; set; }

        [JsonPropertyName("codigoSubNaturezaJuridica")]
        public object? CodigoSubNaturezaJuridica { get; set; }

        [JsonPropertyName("nivelNormatizacao")]
        public string? NivelNormatizacao { get; set; }

        [JsonPropertyName("versaoConsulta")]
        public string? VersaoConsulta { get; set; }

        [JsonPropertyName("dataInicialVersaoConsulta")]
        public string? DataInicialVersaoConsulta { get; set; }

        [JsonPropertyName("dataFinalVersaoConsulta")]
        public object? DataFinalVersaoConsulta { get; set; }

        [JsonPropertyName("operacao")]
        public object? Operacao { get; set; }

        [JsonPropertyName("codigoUnidadePaiAnterior")]
        public object? CodigoUnidadePaiAnterior { get; set; }

        [JsonPropertyName("codigoOrgaoEntidadeAnterior")]
        public object? CodigoOrgaoEntidadeAnterior { get; set; }
    }

    

    //Classe que busca as respostas da API:
    public class ApiResponse
    {
        [JsonPropertyName("servico")]
        public Servico? Servico { get; set; }

        [JsonPropertyName("unidade")]
        public Unidade? Unidade { get; set; }

    }
}
