package modelo;

import java.util.Random;

public class Dado {

	private int cara;
	private int testAleatorio[] = { 0, 0, 0, 0, 0, 0, 0 };
	
	public Dado() {

	}

	public int getCara() {
		return cara;
	}

	public void setCara(int cara) {
		this.cara = cara;
	}

	public int lanzarDado() {
		Random random = new Random();
		cara = random.nextInt(6) + 1;
		return cara;
	}
	public void realizarTest(int numerotiradas){
		Random random1 = new Random();
		for(int i=0;i<numerotiradas;i++){
			cara = random1.nextInt(6) + 1;
			switch(cara){
			case 1:
				testAleatorio[1]++;
				break;
			case 2:
				testAleatorio[2]++;
				break;
			case 3:
				testAleatorio[3]++;
				break;
			case 4:
				testAleatorio[4]++;
				break;
			case 5:
				testAleatorio[5]++;
				break;
			case 6:
				testAleatorio[6]++;
				break;
			default:
				;
			}
		}
		for(byte i=1;i<=6;i++){
		System.out.println("Cara "+i+" Ha salido: "+testAleatorio[i]+" Veces");
		
		}
	}

	public int[] getTestAleatorio() {
		return testAleatorio;
	}

	public void setTestAleatorio(int[] testAleatorio) {
		this.testAleatorio = testAleatorio;
	}
}
