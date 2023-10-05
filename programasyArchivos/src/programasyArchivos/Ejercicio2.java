package programasyArchivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//import java.util.Scanner;
import java.util.List;

public class Ejercicio2 
{
    public static void main(String[] args)throws  IOException
    {
    	// en el terminal java -cp src programasyArchivos.Ejercicio2 numeros.txt
    	// numeros.txt se encuentra en la carpeta resources
        Path arch;
        int total=0;
        int num=0;
        List<String> lin;
        
      //  Scanner input;
     //   arch=Paths.get(args[0]);
        try 
        {
            if (args.length!=1)
            {
                throw new IllegalArgumentException("Ingrese direccion del archivo");
            }
        }
        catch (IllegalArgumentException e) 
        {
            System.out.println(e.getMessage());
            return;  
        }
        arch = Paths.get("resources/" + args[0]);
      //  arch =Paths.get(args[0]);
        lin= Files.readAllLines(arch);
        for (String lines : lin)
        {
            String numList[]=lines.split(" ");
        
            for (String lineas : numList)
            {
                num=Integer.parseInt(lineas);         
                total+=num;
            }
        }        
        System.out.println("La suma de numero es: "+total);


    }
    

}
