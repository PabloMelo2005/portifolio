using System.Collections.Generic;
using HabitatsAPI.Models;

namespace HabitatsAPI.Response
{
    public class HabitatResponse
    {
        public List<Habitat> Result { get; set; } = new List<Habitat>();
    }
}
