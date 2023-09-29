import java.util.Scanner;

public class Ejercicio2 
{
    public static void  main (String[] args )
    {
        String palabra;
        String nuevaPalabra="";
        char chara;
        char charaCodif;
        char selec;
        //String pal[]= palabra;
        int desplazamiento;
        int pos;
        int posFinal;
        String dictionary="abcdefghijklmnñopqrstuvwxyz";

        Scanner input = new Scanner(System.in);
		System.out.println("Ingrese palabra:");
	  
		palabra= input.nextLine();
        System.out.println("Ingrese Desplazamiento:");
        desplazamiento = input.nextInt();
        System.out.println("Seleccione");
        System.out.println("a:Codificar");
        System.out.println("b:Decodificar");
		selec= input.next().charAt(0);
        input.close();
        switch(selec)
        {
            case 'a':
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
            System.out.println("Palabra original: " + palabra);
            System.out.println("Palabra codificada " + nuevaPalabra);   

            break;           

            
            case 'b':

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
            System.out.println("Palabra original: " + palabra);
            System.out.println("Palabra codificada " + nuevaPalabra);      
            break;
        }


    }
}

