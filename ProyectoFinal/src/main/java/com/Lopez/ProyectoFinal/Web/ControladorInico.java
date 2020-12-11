package com.Lopez.ProyectoFinal.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Lopez.ProyectoFinal.DAO.VentaDAO;
import com.Lopez.ProyectoFinal.Entidades.Venta;

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
	
	@GetMapping ("/Agregar")
	public String Agregar(Venta venta) {
		
		return "Agregar";
	}
	
	@PostMapping ("/Guardar")
	public String Guardar (Venta venta) {
		VenDAO.save(venta);
		
		
		return "redirect:/";
		
	}
	
	@GetMapping("/editar/{id_venta}")
	public String editar(Venta venta, Model m) {
		venta = VenDAO.findById(venta.getId_venta()).orElse(null);
		m.addAttribute("venta",venta);
		
		return "agregar";
	}
	@GetMapping("/eliminar/{id_venta}")
	public String eliminar(Venta venta) {
	    VenDAO.delete(venta);;
		return "redirect:/";				
	}
	
}
