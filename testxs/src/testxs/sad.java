package testxs;

public class sad 

{
	public static void main(String[] args) {
	
		char letras[] = {'a','b','c','d'};
		int numeros[] = new int[]{1,37,16};
		for(int i=0;i<numeros.length;i++)
		{if (numeros[i] < 30) 
		{System.out.println(letras[i+1]);} 
		else {System.out.println(numeros[i]);}}
		}
}
