package progOO;


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
		System.out.println("Total:"+ carrito.costoFinal());				

	}
		
	public static Carrito agregarC (Path arch)	throws IOException 
	{
		try {
			Producto producto1 =null;
			Producto producto2 =null;
			Producto producto3 =null;	
			List<String>lineas;	
			lineas=Files.readAllLines(arch);
			for (int i =0; i<3;i++)
			{
				String[] datos = lineas.get(i).split("\t");
				float precioU=Float.parseFloat(datos[0]);
	            String nom = datos[1];
	            String codigo =datos[2];
	            switch (i)
	            {
	            case 0:
	            	producto1=new Producto(nom,codigo,precioU);
	            	/*producto1.setPrecio(precioU);
	                producto1.setNombre(nom);
	                producto1.setCodigo(codigo);*/
	            	break;
	            case 1:
	            	producto2=new Producto(nom,codigo,precioU);
	            	/*producto2.setPrecio(precioU);
	                producto2.setNombre(nom);
	                producto2.setCodigo(codigo);*/
	            	break;
	            case 2:
	            	/*producto3.setPrecio(precioU);
	                producto3.setNombre(nom);
	                producto3.setCodigo(codigo);*/
	            	producto3=new Producto(nom,codigo,precioU);
	            	break;
	            	
	            }
	            
			}
			return new Carrito(producto1,producto2,producto3);
	    } catch (IOException e) 
		{
	        e.printStackTrace(); 
	        throw new RuntimeException("Error ", e);
	    }
		
        
	}


}
