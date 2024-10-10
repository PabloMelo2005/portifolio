using System;

namespace PizzaStoreApi.Models
{
    public class Pizza
    {
        public int Id { get; set; }
        public string? Name { get; set; }
        public string? Size { get; set; }
        public decimal Price { get; set; }

    }
}