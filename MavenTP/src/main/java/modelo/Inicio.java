package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Inicio 
{
	
	public static void main(String[] args) 
	{
		System.out.println();
		Scanner scanner= new Scanner(System.in);
		ArrayList<Persona> personas=new ArrayList<Persona>(); 
		
		while (true)
		{
			System.out.println("Ingrese nombre");
			String nombre= scanner.nextLine();
			
			System.out.println("Ingrese Apellido");
			String apellido= scanner.nextLine();
			
			System.out.println("Ingrese fecha nacimiento");
			String fechaNac= scanner.nextLine();
			
			Persona persona=new Persona();
			persona.setName(nombre);
			persona.setApellido(apellido);
			persona.setFechaNacimiento(fechaNac);
			
			personas.add(persona);
			
			System.out.println("Desea Agregar otra persona : s/n");
			String rta=scanner.nextLine();
			
			if (rta.equals("n")) 
			{
				break;
			}
			
		}
		
		for (Persona persona : personas)
		{
			System.out.println("Nombre:"+persona.getName());
			System.out.println("Apellido: "+persona.getApellido());
			System.out.println("Fecha Nacimiento: "+persona.getFechaNacimiento());
			System.out.println("---------");
		}
	}
}
