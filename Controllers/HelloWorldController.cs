﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace MVCPeliculas.Controllers
{
    public class HelloWorldController : Controller
    {
        // GET: HelloWorld
        public ActionResult Index()
        {
            return View();
        }

        public ActionResult Welcome(string nombre,string apellido ,int numVeces = 1)
        {
            ViewBag.Mensaje = "Hola " + nombre +  " " + apellido;
           
            ViewBag.NumVeces = numVeces;
            return View();
        }
    }
}