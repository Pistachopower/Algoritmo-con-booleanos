package temaUno;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		//creo variable entera 
		int num;

		//llamo al escanner y le pongo un nombre sc
		Scanner sc= new Scanner(System.in);

		//pido n�mero por pantalla
		System.out.println("ingrese el n�mero: ");

		//almaceno el n�mero recogido por el sc en la variable num
		num= sc.nextInt();

		//result recoge el n�mero y hace la operaci�n de m�dulo de 2
		int result= num%2;

		//el operador l�gico boolean eval�a si result es igual a 0 
		boolean par= result==0;

		//boolean par = (num%2)==0;

		//muestra el resultado par mediante un true o false
		System.out.println("Resultado es: "+ par);
		
		sc.close();
		
	}

}
