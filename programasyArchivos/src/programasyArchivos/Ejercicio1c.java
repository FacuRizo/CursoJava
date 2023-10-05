package programasyArchivos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1c 
{
    public static void main(String[] args) 
    {      
        int a=0;
        int b=0;
        int c=0;
        int vectOrd[]= new int [3];
        char orden;
        Scanner input = new Scanner(System.in);
        if (args.length == 4) 
        {              
             a= Integer.parseInt(args[0]);
             b= Integer.parseInt(args[1]);
             c= Integer.parseInt(args[2]);
             orden= args[3].charAt(0);
             vectOrd=ordenamiento(a, b, c, vectOrd);
             seleccion(orden, vectOrd);       

        }
        else if (args.length == 0)
        {
            
            System.out.println("Ingrese numero 1:"); 
            a=input.nextInt();
            System.out.println("Ingrese numero 2:");
            b=input.nextInt(); 
            System.out.println("Ingrese numero 3:");  
            c=input.nextInt();
            System.out.println("Ingrese 'a' para orden ascendente o 'd' para descendente:");  
            orden=input.next().charAt(0);
            input.close();
            vectOrd=ordenamiento(a, b, c, vectOrd);
            seleccion(orden, vectOrd);

        }
        try {
            if (args.length != 4) 
            {
                throw new IllegalArgumentException("Ingrese 3 numeros luego una letra 'A' para ascendente o 'D' para descendente");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
    }
   

    public static void menu2 (int a , int b , int c , int[] vectOrd,char orden, Scanner input)
    {          
        System.out.println("Ingrese numero 1:"); 
        a=input.nextInt();
        System.out.println("Ingrese numero 2:");
        b=input.nextInt(); 
        System.out.println("Ingrese numero 3:");  
        c=input.nextInt();
        System.out.println("Ingrese 'a' para orden ascendente o 'd' para descendente:");  
        orden=input.next().charAt(0);
        input.close();
        vectOrd=ordenamiento(a, b, c, vectOrd);
        seleccion(orden, vectOrd);
       

    }

    public static void seleccion (final char orden , int[] vectOrd)
    {
      switch(orden)
        {
            case 'A':
            case 'a':
            System.out.println(Arrays.toString(vectOrd));                
            break;
            case 'D':
            case 'd':
            vectOrd= invertir(vectOrd);
            System.out.println(Arrays.toString(vectOrd));
            break;
        }
        
    }

    public static  int[] invertir(int[] vectOrd)
    {
        for (int i=0; i<=vectOrd.length-1;i++)
        {
          int n= vectOrd[0];
          vectOrd[0]=vectOrd[2];
          vectOrd[2]=n;
        }
        return vectOrd;
    }

    public static  int[] ordenamiento (int a , int b , int c , int[] vectOrd)
    {
      int pri=0;
      int seg=0;
      int ter=0;
      if (a<=b)
        {
            pri=a;
            if (b<=c)
            {                       
                seg=b;
                ter=c;                           
            }
            else if (c<b)
            {
                seg=c;
                ter=b; 
            }

        }
     else if (b<a)
        {
            
            pri=b;
            if (a<=c)
            {                       
                seg=a;
                ter=c;                   
            }
            else if (c<a)
            {
                seg=c;
                ter=a; 
            }

        }
        else if (c<a)
        {
            pri=c;
            if (a<=b)
            {
                seg=b;
                ter=c;                           
            }
            else if (c<b)
            {        
                seg=c;
                ter=b; 
            }

        }

        vectOrd[0]=pri;
        vectOrd[1]=seg;
        vectOrd[2]=ter;


        return vectOrd;
    }
}
