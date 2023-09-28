import java.util.Arrays;

import java.util.Scanner;

public class Ejercicio1B 

{
    public static void  main (String[] args )
    {
        int num1;
        int num2;
        int num3;
        /*int pri;
        int seg;
        int ter;*/
        int vec[]=new int[3];
        int vec2[]=new int[3];
        char c;
        Scanner input = new Scanner(System.in);
        System.out.println(" Ingrese Numero 1");
		num1= input.nextInt();
        System.out.println(" Ingrese Numero 2");
		num2= input.nextInt();
        System.out.println(" Ingrese Numero 3");
		num3= input.nextInt();
        vec[0]=num1;
        vec[1]=num2;
        vec[2]=num3;
        System.out.println("¿Ascendente o Descendente?");		
        System.out.println("a:Ascendente");			
        System.out.println("b:Descendente");	
		c= input.next().charAt(0);        
		input.close();
        Arrays.sort(vec);
        switch (c)
        {

            case 'a':
            System.out.println(Arrays.toString(vec));	
            break;

            case 'b':
            vec2[0]=vec[2];
            vec2[1]=vec[1];
            vec2[2]=vec[0];
            System.out.println(Arrays.toString(vec2));
            break;

        
        }
        
		
    }
}
/*
             if (num1<=num2)
             {
                if (num2<=num3)
                {
                    pri=num1;
                    seg=num2;
                    ter=num3;
                }
                 else if ( num3<=num1)
                {
                    pri=num3;
                    seg=num1;
                    ter=num2;
                }
                else if  (num3>num1)
                {
                   pri=num1;
                   if (num2<num3)
                   {
                     seg=num2;
                     ter=num3;

                   }
                   else
                   {
                    seg=num3;
                    ter=num2;
                   }
                }
             }
             else if (num2<=num3)
             {
                pri=num2;
             }
             else if (num2<=num3)


 */