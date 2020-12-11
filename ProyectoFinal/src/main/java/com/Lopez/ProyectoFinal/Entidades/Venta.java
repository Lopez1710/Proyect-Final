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
		public long getId_venta() {
			return id_venta;
		}
		public void setId_venta(long id_venta) {
			this.id_venta = id_venta;
		}
		public String getProducto() {
			return producto;
		}
		public void setProducto(String producto) {
			this.producto = producto;
		}
		public String getPrecio() {
			return precio;
		}
		public void setPrecio(String precio) {
			this.precio = precio;
		}
		public String getCantidad() {
			return cantidad;
		}
		public void setCantidad(String cantidad) {
			this.cantidad = cantidad;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		

}
