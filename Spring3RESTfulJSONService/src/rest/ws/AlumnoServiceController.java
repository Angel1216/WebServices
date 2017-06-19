package rest.ws;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import rest.beans.Alumno;
//import rest.facade.IFacade;

@Controller
@RequestMapping(value = "/alumno")
public class AlumnoServiceController {
	
	//@Autowired
	//private IFacade facade;
	
	@RequestMapping(value = "/", method = RequestMethod.GET, produces="application/json", headers="Accept=application/json")
	public @ResponseBody List<Alumno> obtenerAlumnos(){

		List<Alumno> lstAlumno = new ArrayList<Alumno>(); 
		
		Alumno alumno = new Alumno();
		alumno.setDni("DNI");
		alumno.setNombre("Nombre");
		alumno.setApellidos("apellidos");
		alumno.setDireccion("direccion");
		
		lstAlumno.add(alumno);
		
		//return this.facade.obtenerTodosAlumnos();
		return lstAlumno;
	}
	
	
	
	// here borrar --
	@RequestMapping(value = "/{dni}", method = RequestMethod.GET, produces="application/json", headers="Accept=application/json")
	public @ResponseBody Alumno obtenerAlumno(@PathVariable("dni")String dni){
			
			Alumno alumno = new Alumno();
			alumno.setDni("DNI");
			alumno.setNombre("Nombre");
			alumno.setApellidos("apellidos");
			alumno.setDireccion("direccion");
			
	
			
			//return this.facade.obtenerTodosAlumnos();
			return alumno;
	}
	
	/*
	@RequestMapping(value = "/{dni}", method = RequestMethod.GET, produces="application/json")
	public @ResponseBody Alumno obtenerAlumno(@PathVariable("dni")String dni){
		
		return this.facade.obtenerAlumno(dni);
	}
	
	
	@RequestMapping(value = "/", method = RequestMethod.POST, headers ="Accept=application/json")
	public @ResponseBody void insertarAlumno(@RequestBody Alumno alumno){
		
		this.facade.insertarAlumno(alumno);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.PUT, headers ="Accept=application/json")
	public @ResponseBody void modificarAlumno(@RequestBody Alumno alumno){
		
		this.facade.modificarAlumno(alumno);
	}
	
	@RequestMapping(value = "/{dni}", method = RequestMethod.DELETE)
	public @ResponseBody void eliminarAlumno(@PathVariable("dni")String dni){
		this.facade.eliminarAlumno(dni);
	}
	*/

}