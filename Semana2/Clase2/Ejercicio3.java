
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Ejercicio3
{
    public static void  main (String[] args )
    // java Ejercicio3 (C or D) (valor desp) (Entrada) (salida)

    {
        String palabra="";
        String  nuevaPalabra="";  
        int desplazamiento=0;
        char selec;
        Path archEntrada;
        Path archSalida;          
        String dictionary="abcdefghijklmnñopqrstuvwxyz";
        try 
        {
            if (args.length!=4)
            {
                throw new IllegalArgumentException("Ingrese direccion del archivo");
            }
        }
        catch (IllegalArgumentException e) 
        {
            System.out.println(e.getMessage());
            return;  
        }
        selec =args[0].charAt(0);
        desplazamiento=Integer.parseInt(args[1]);
        archEntrada=Paths.get(args[2]);
        archSalida=Paths.get(args[3]);   
        switch(selec)
        {
            case 'c':
            case 'C':                        
            palabra=leer(archEntrada);
            nuevaPalabra=codificar(palabra, nuevaPalabra, dictionary, desplazamiento);
            escribir(archSalida, nuevaPalabra);
            break;                   
            case 'd':
            case 'D':
            palabra=leer(archEntrada);
            nuevaPalabra=decodificar(palabra, nuevaPalabra, dictionary, desplazamiento);
            escribir(archSalida, nuevaPalabra);        
                 
            break;
        }


    }
    public static String leer (Path archivoEntrada)
    {
       try 
       {
            String lin[]= Files.readAllLines(archivoEntrada).toArray(new String[0]);
            return String.join(" ", lin);
       } catch (Exception e) 
       {
            e.printStackTrace(); 
            return null; 
       }
            
    }
    public static void escribir (Path archivoSalida, String nuevaPalabra)
    {
       try 
       {     
         if (Files.exists(archivoSalida)) 
         {
           Files.delete(archivoSalida);
         }
         Files.createFile(archivoSalida);
         Files.writeString(archivoSalida,nuevaPalabra);
         System.out.println("Escrito existosamente");
       } catch (Exception e) 
       {
            e.printStackTrace(); 
       }
            
    }
    public static String codificar (String palabra,String nuevaPalabra,String dictionary, int desplazamiento)
    {
        char chara,charaCodif; 
        int pos,posFinal;

        for(int i=0; i<palabra.length();i++)
            {
                chara = palabra.charAt(i);
                pos=dictionary.indexOf(chara);
                if ( pos != -1)
                {
                    posFinal=(pos+desplazamiento)% dictionary.length();
                    charaCodif=dictionary.charAt(posFinal);
                    nuevaPalabra += charaCodif;
                }
                else
                {
                    nuevaPalabra+=chara;
                }
            
            }
                
        return nuevaPalabra;    
    }       



    public static String decodificar(String palabra,String nuevaPalabra,  String dictionary, int desplazamiento)
    {
        char chara,charaCodif; 
        int pos,posFinal;

        for(int i=0; i<palabra.length();i++)
        {
                chara = palabra.charAt(i);
                pos=dictionary.indexOf(chara);
                if ( pos != -1)
                {
                    posFinal=(pos-desplazamiento+dictionary.length())% dictionary.length();
                    charaCodif=dictionary.charAt(posFinal);
                    nuevaPalabra += charaCodif;
                }               
                else
                {
                    nuevaPalabra+=chara;
                }
        }
        return nuevaPalabra;
    }
}
               
                   



