package programasyArchivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.List;

public class Ejercicio2a 
{
    public static void main(String[] args)throws  IOException
    {
    	// en el terminal java:
    	// java -cp src programasyArchivos.Ejercicio2a numeros.txt S  
    	// java -cp src programasyArchivos.Ejercicio2a numeros.txt m
    	// numeros.txt se encuentra en la carpeta resources
        Path arch;
        int total=1;

        int num=0;
        List<String> lin;
        char op;

        try 
        {
            if (args.length!=2)
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
        op=args[1].charAt(0);
        lin= Files.readAllLines(arch);
        for (String lines : lin)
        {
            String numList[]=lines.split(" ");
        
            for (String lineas : numList)
            {
                num=Integer.parseInt(lineas);    
                switch (op)
                {
                    case 'S':
                    case 's':
                    total+=num;
                    break;
                    case 'M':
                    case 'm':
                    total*=num;
                }
                
            }
        }
        switch (op)
                {
                    case 'S':
                    case 's':
                    System.out.println("La suma de numeros es: "+(total-1));
                    break;
                    case 'M':
                    case 'm':
                    System.out.println("La producto de numeros es: "+(total));
                }       
       


    }

}
