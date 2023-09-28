import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio1C 
{
    public static void  main (String[] args )
    {
        
        Scanner input = new Scanner(System.in);
        int c;
        int num;
        int total;
        int vec[];
        System.out.println(" Ingrese Cantidad de numeros para la lista");
        c=input.nextInt();
        vec=new int[c];
        for (int i=0; i<c; i++)
        {
            System.out.println(i+" numero ");
            num=input.nextInt();
            vec[i]=num;
        }
        System.out.println(" Ingrese numero a comparar");
        c=input.nextInt();
        total=0;
        input.close();
        for( int i=0; i< vec.length; i++)
        {
            if (vec[i]>c)
            {
                total+=vec[i];
            }

        }
        System.out.println("Total: " + total);



    }
}
