package com.data;

public class Contacto {
		private String nombre;
		private long celular;
		public Contacto(String nombre, long celular) {
			super();
			this.nombre = nombre;
			this.celular = celular;
		}

		public Contacto() {
			super();
		}
		

		@Override
		public String toString() {
			return "contacto [nombre=" + nombre + ", celular=" + celular + "]";
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public String getNombre() {
			return nombre;
		}
		
		
		public long getCelular() {
			return celular;
		}
		public void setCelular(long celular) {
			this.celular = celular;
		}

		

	}