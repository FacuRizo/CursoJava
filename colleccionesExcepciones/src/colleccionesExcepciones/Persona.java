package colleccionesExcepciones;


import java.time.LocalDate;


public class Persona 
{
	
	private String nombre;
	private String apellido;
	private LocalDate fechaDeNacimiento;
	
	public Persona (String nombre, String apellido, LocalDate fechaDeNacimiento) 
	{
		this.nombre=nombre;
		this.apellido=apellido;
		this.fechaDeNacimiento= fechaDeNacimiento;
		
	}

	public String getNombre() 
	{
		return nombre;
	}
	
	public String getApellido() 
	{
		return apellido;
	}
	
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}	
	
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento)
	{
		this.fechaDeNacimiento=fechaDeNacimiento;
	}
	
	public int edad ()
	{
		LocalDate fechaHoy=LocalDate.now();
		return (fechaHoy.getYear()-this.fechaDeNacimiento.getYear());
	}
}
