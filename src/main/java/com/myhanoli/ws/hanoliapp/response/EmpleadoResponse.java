package com.myhanoli.ws.hanoliapp.response;

import java.io.Serializable;


public class EmpleadoResponse implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private int codigo;
	private String descripcion;

	public EmpleadoResponse() {
    
    }

	public EmpleadoResponse(int codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public int getCodigo() {
		return codigo;
	}

	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public static class EmpleadosBuilder {
		private int codigo;
		private String descripcion;
		
		public EmpleadosBuilder() {
        	
        }
		
		public EmpleadosBuilder codigo(int codigo) {
			this.codigo = codigo;
			return this;
		}


		public EmpleadosBuilder descripcion(String descripcion) {
			this.descripcion = descripcion;
			return this;
		}


		public EmpleadoResponse build() {
			EmpleadoResponse resp = new EmpleadoResponse();
			
			resp.codigo = this.codigo;
			resp.descripcion = this.descripcion;
			
			return resp;
		}

	}
}