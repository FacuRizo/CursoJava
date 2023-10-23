package colleccionesExcepciones;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;

public class Main 
{

	public static void main(String[] args) throws IOException 
	
	{

		Carrito carrito =null;
		Scanner input = new Scanner(System.in);
		String path="";
		Path arch;		
		System.out.println("Escriba nombre del archivo");
		path =input.nextLine();
		arch=Paths.get("resources/"+path);
		input.close();
		carrito=agregarC(arch);
		System.out.println("Total:"+ carrito.costoFinalSinDesc());				

	}
		
	public static Carrito agregarC (Path arch)	throws IOException 
	{
		try {
			Carrito carrito = new Carrito();
			Producto prod = new Producto(null, null, 0);
			List<String>lineas;
			lineas=Files.readAllLines(arch);
			for (String linea: lineas)
			{
				String[] datos = linea.split("\t");
				prod.setPrecio(Float.parseFloat(datos[0]));
	            prod.setNombre(datos[1]);
	            prod.setCodigo(datos[2]);	            
	            carrito.agregarProducto(prod);
	            
			}
			return carrito;
	    } catch (IOException e) 
		{
	        e.printStackTrace(); 
	        throw new RuntimeException("Error ", e);
	    }
		
        
	}


}
