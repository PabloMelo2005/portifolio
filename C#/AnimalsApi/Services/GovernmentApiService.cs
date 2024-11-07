using AnimaisExtincaoAPI.Models;

namespace AnimaisExtincaoAPI.Services
{
    public class GovernmentApiService
    {
        private readonly HttpClient _httpClient;

        public GovernmentApiService(HttpClient httpClient)
        {
            _httpClient = httpClient;
        }

        //Fazer uma requisição para a web, buscando a unidade governamental por ID:
        public async Task<Unidade?> GetUnitByIdAsync(string codigoUnit)
        {
            var response = await _httpClient.GetAsync($"https://estruturaorganizacional.dados.gov.br/doc/unidade-organizacional/{codigoUnit}.json"); //Integração com a API https://api.siorg.economia.gov.br

            if (response.IsSuccessStatusCode)
            {
                var apiResponse = await response.Content.ReadFromJsonAsync<ApiResponse>();
                return apiResponse?.Unidade;
            }

            return null;
        }
    }
}
