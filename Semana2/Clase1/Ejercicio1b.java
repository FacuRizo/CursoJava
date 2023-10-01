import java.util.Arrays;

import java.util.Scanner;

public class Ejercicio1b

{
    public static void  main (String[] args )
    {
        int a;
        int b;
        int c;
        int pri=0;
        int seg=0;
        int ter=0;
        int vec[]=new int[3];
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.println(" Ingrese Numero 1");
		a= input.nextInt();
        System.out.println(" Ingrese Numero 2");
		b= input.nextInt();
        System.out.println(" Ingrese Numero 3");
		c= input.nextInt();
       /*  vec[0]=num1;
        vec[1]=num2;
        vec[2]=num3;*/
        System.out.println("¿Ascendente o Descendente?");		
        System.out.println("a:Ascendente");			
        System.out.println("b:Descendente");	
		ch= input.next().charAt(0);        
		input.close();

       // Se podria usar Arrays.sort(vec);
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
        switch (ch)
        {

            case 'a':
            vec[0]=pri;
            vec[1]=seg;
            vec[2]=ter;
            System.out.println(Arrays.toString(vec));	
            break;

            case 'b':
            vec[0]=ter;
            vec[1]=seg;
            vec[2]=pri;
            System.out.println(Arrays.toString(vec));
            break;

        
        }
        
		
    }
}