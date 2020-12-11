package com.Lopez.ProyectoFinal.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Lopez.ProyectoFinal.DAO.VentaDAO;

@Controller // Controla los Recursos de La web
public class ControladorInico {
	@Autowired // trae todas las clases de SQL
	private VentaDAO VenDAO;
	
	@GetMapping ("/") //Mapea el sitio web
	public String Inicio(Model m){
		
		var MostrarVentas = VenDAO.findAll(); //aplicamos el findAll
		
		m.addAttribute("Venta", MostrarVentas);
		
		return "Index";
	
	}
}
