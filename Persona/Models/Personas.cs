using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Data.Entity;
using System.ComponentModel.DataAnnotations;

namespace MvcPersona.Models
{
    public class Personas
    {
        public int ID { get; set; }
        public string DUI { get; set; }
        public string Nombre { get; set; }
        public string Apellido { get; set; }
        [Display(Name = "Fecha de nacimiento")]
        [DataType(DataType.Date)]
        [DisplayFormat(DataFormatString = "{0:yyyy-MM-dd}", ApplyFormatInEditMode= true)]
        public DateTime FechaNacimiento { get; set; }
        public string Direccion { get; set; }
        [Display(Name = "Correo electronico")]
        public string CorreoElectronico { get; set; }
    }
    public class PersonaDBContext : DbContext
    {
        public DbSet<Personas> Personas { get; set; }
    }


}