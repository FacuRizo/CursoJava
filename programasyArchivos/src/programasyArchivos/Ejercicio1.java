package programasyArchivos;

import java.util.Arrays;

public class Ejercicio1 
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
        int vectOrd[]= new int [3];
        if (args.length != 4) 
        {
            System.out.println("Ingrese 3 numeros luego una letra 'A' para ascendente o 'D' para descendente");
            return;
        }
        a= Integer.parseInt(args[0]);
        b= Integer.parseInt(args[1]);
        c= Integer.parseInt(args[2]);
        orden= args[3].charAt(0);
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
