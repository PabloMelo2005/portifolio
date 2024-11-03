using Microsoft.AspNetCore.Mvc;
using AnimaisExtincaoAPI.Data;
using AnimaisExtincaoAPI.Models;
using Microsoft.EntityFrameworkCore;

namespace AnimaisExtincaoAPI.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class AnimaisController : ControllerBase
    {
        private readonly AppDbContext _context;
        private readonly HttpClient _httpClient;
        private readonly string _apiKey; // Armazenar a chave de API

        public AnimaisController(AppDbContext context, HttpClient httpClient)
        {
            _context = context;
            _httpClient = httpClient;
            _httpClient.DefaultRequestHeaders.Add("User-Agent", "IntegracaoViacep");
        }

        // GET: api/animais/{id}
        [HttpGet("{id:int}")]
        public async Task<ActionResult<Animal>> GetAnimal(int id)
        {
            var animal = await _context.Animais.FindAsync(id);

            if (animal == null)
            {
                return NotFound();
            }

            return animal;
        }

        // POST: api/animais
        [HttpPost]
        public async Task<ActionResult<Animal>> PostAnimal(Animal animal)
        {
            _context.Animais.Add(animal);
            await _context.SaveChangesAsync();

            return CreatedAtAction(nameof(GetAnimal), new { id = animal.Id }, animal);
        }

        // PUT: api/animais/{id}
        [HttpPut("{id}")]
        public async Task<IActionResult> PutAnimal(int id, Animal animal)
        {
            if (id != animal.Id)
            {
                return BadRequest("ID do animal não corresponde ao ID fornecido na URL.");
            }

            _context.Entry(animal).State = EntityState.Modified;

            try
            {
                await _context.SaveChangesAsync();
            }
            catch (DbUpdateConcurrencyException)
            {
                if (!_context.Animais.Any(e => e.Id == id))
                {
                    return NotFound("Animal não encontrado.");
                }
                else
                {
                    throw;
                }
            }

            return NoContent();
        }

        // DELETE: api/animais/{id}
        [HttpDelete("{id}")]
        public async Task<IActionResult> DeleteAnimal(int id)
        {
            var animal = await _context.Animais.FindAsync(id);
            if (animal == null)
            {
                return NotFound("Animal não encontrado.");
            }

            _context.Animais.Remove(animal);
            await _context.SaveChangesAsync();

            return NoContent();
        }
    }
}