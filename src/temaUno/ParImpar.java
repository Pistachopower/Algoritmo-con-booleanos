package temaUno;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		//creo variable entera 
		int num;

		//llamo al escanner y le pongo un nombre sc
		Scanner sc= new Scanner(System.in);

		//pido número por pantalla
		System.out.println("ingrese el número: ");

		//almaceno el número recogido por el sc en la variable num
		num= sc.nextInt();

		//result recoge el número y hace la operación de módulo de 2
		int result= num%2;

		//el operador lógico boolean evalúa si result es igual a 0 
		boolean par= result==0;

		//boolean par = (num%2)==0;

		//muestra el resultado par mediante un true o false
		System.out.println("Resultado es: "+ par);
		
		sc.close();
		
	}

}
