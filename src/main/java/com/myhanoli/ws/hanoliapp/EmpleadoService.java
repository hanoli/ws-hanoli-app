package com.myhanoli.ws.hanoliapp;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.myhanoli.ws.hanoliapp.response.EmpleadoResponse;


@SuppressWarnings("restriction")
@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL,parameterStyle=ParameterStyle.WRAPPED)
public interface EmpleadoService {
	
	@WebMethod(operationName="getEmpleados")
	@WebResult(name="ResultadoOperacion") EmpleadoResponse getEmpleadoById(@WebParam(name="idEmpleado") int idEmpleado);


}
