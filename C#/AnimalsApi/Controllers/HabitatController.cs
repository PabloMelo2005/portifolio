using System.Text.Json;
using Microsoft.AspNetCore.Mvc;
using HabitatsAPI.Response;
using HabitatsAPI.Models;

namespace HabitatsAPI.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class HabitatsController : ControllerBase
    {
        private readonly HttpClient _httpClient;
        private readonly string _apiKey;

        public HabitatsController(HttpClient httpClient, IConfiguration configuration)
        {
            _httpClient = httpClient;
            _httpClient.DefaultRequestHeaders.Add("User-Agent", "IntegracaoViacep");

            // Obtenha a chave de API do appsettings.json
            _apiKey = configuration["ApiSettings:IUCNApiKey"];
        }

        [HttpGet("GetHabitats")]
        public async Task<ActionResult<List<Habitat>>> GetHabitats()
        {
            var url = "https://api.iucnredlist.org/api/v4/habitats/";

            try
            {
                // Adiciona o cabeçalho de autorização Bearer com a chave de API
                _httpClient.DefaultRequestHeaders.Authorization =
                    new System.Net.Http.Headers.AuthenticationHeaderValue("Bearer", _apiKey);

                HttpResponseMessage response = await _httpClient.GetAsync(url);

                if (!response.IsSuccessStatusCode)
                {
                    return StatusCode((int)response.StatusCode, "Erro ao obter dados da API externa.");
                }

                string respostaAPI = await response.Content.ReadAsStringAsync();

                // Deserializa a resposta JSON em HabitatResponse
                var habitatsResponse = JsonSerializer.Deserialize<HabitatResponse>(respostaAPI, new JsonSerializerOptions
                {
                    PropertyNameCaseInsensitive = true
                });

                if (habitatsResponse?.Result == null || habitatsResponse.Result.Count == 0)
                {
                    return NotFound("Nenhum habitat encontrado.");
                }

                return Ok(habitatsResponse.Result);
            }
            catch (HttpRequestException ex)
            {
                return StatusCode(503, $"Erro na requisição: {ex.Message}");
            }
            catch (Exception ex)
            {
                return StatusCode(500, $"Erro inesperado: {ex.Message}");
            }
        }
    }
}
