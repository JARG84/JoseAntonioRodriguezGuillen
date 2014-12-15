package controlador;

import java.util.Scanner;

import modelo.Dado;
public class Principal {

	public Principal() {}

	public static void main(String[] args) {
		Dado jugador1dado1=new Dado();
		Dado jugador1dado2=new Dado();
		Dado jugador2dado1=new Dado();
		Dado jugador2dado2=new Dado();
				
		jugador1dado1.lanzarDado();
		jugador1dado2.lanzarDado();
		jugador2dado1.lanzarDado();
		jugador2dado2.lanzarDado();
		
		System.out.println("Tirada jugador1: ( "+jugador1dado1.getCara()+","+jugador1dado2.getCara()+")");
		System.out.println("Tirada jugador2: ( "+jugador2dado1.getCara()+","+jugador2dado2.getCara()+")");
		int sumadadosjugador1=jugador1dado1.getCara()+jugador1dado2.getCara();
		int sumadadosjugador2=jugador2dado1.getCara()+jugador2dado2.getCara();
		
		if(sumadadosjugador1==sumadadosjugador2){
			System.out.println("Empate");
		}else if(sumadadosjugador2>sumadadosjugador1){
			System.out.println("Gana jugador 2");
		}else{
			System.out.println("Gana jugador 1");
		}
		Scanner teclado=new Scanner(System.in);
		int simulaciones;
		Dado test=new Dado();
		System.out.println("¿Cuantas tiradas quieres simular?");
		simulaciones=teclado.nextInt();
		test.realizarTest(simulaciones);
		
		System.out.println(test.getTestAleatorio());
		
	}

}
