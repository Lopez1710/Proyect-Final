package com.Lopez.ProyectoFinal.Entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


	
	@Entity
	@Data
	@Table (name="ventas")
	
	public class Venta implements Serializable {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		 
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		private long id_venta;
		private String producto;
		private String precio;
		private String cantidad;

}
