package com.myhanoli.ws.hanoliapp;

import javax.jws.WebService;
import com.myhanoli.ws.hanoliapp.response.EmpleadoResponse;


@SuppressWarnings("restriction")
@WebService(endpointInterface="com.myhanoli.ws.hanoliapp.EmpleadoService")
public class EmpleadoServiceImpl implements EmpleadoService {
	

	public EmpleadoResponse getEmpleadoById(int idEmpleado) {
	
		EmpleadoResponse resp = (idEmpleado == 10)
				? new EmpleadoResponse.EmpleadosBuilder().codigo(100).descripcion("Exito").build()
				: new EmpleadoResponse.EmpleadosBuilder().codigo(-1).descripcion("Not Found").build();
	
		return new EmpleadoResponse.EmpleadosBuilder().codigo(resp.getCodigo()).descripcion(resp.getDescripcion()).build();
    
	}


	
}
