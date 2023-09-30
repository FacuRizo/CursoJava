import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1b 
{
    public static void main(String[] args) 
    {
        int a;
        int b;
        int c;
        int pri=0;
        int seg=0;
        int ter=0;
        char orden;
        Scanner input = new Scanner(System.in);
        int vectOrd[]= new int [3];
        System.out.println("Ingrese numero 1:"); 
        a=input.nextInt();
        System.out.println("Ingrese numero 2:");
        b=input.nextInt(); 
        System.out.println("Ingrese numero 3:");  
        c=input.nextInt();
        System.out.println("Ingrese 'a' para orden ascendente o 'd' para descendente:");  
        orden=input.next().charAt(0);
        input.close();
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

        switch(orden)
        {
            case 'A':
            case 'a':

            vectOrd[0]=pri;
            vectOrd[1]=seg;
            vectOrd[2]=ter;

            System.out.println(Arrays.toString(vectOrd));
                
            break;
            case 'D':
            case 'd':

            vectOrd[2]=pri;
            vectOrd[1]=seg;
            vectOrd[0]=ter;

            System.out.println(Arrays.toString(vectOrd));
            break;
        }
        
    }
}
