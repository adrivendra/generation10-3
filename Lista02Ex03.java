package atividade11_3;

import java.util.Scanner;

public class Lista02Ex03 {

	public static void main(String[] args) {
		int matrizInt[][] = new int[3][3];
		Scanner leia = new Scanner(System.in);
		int somaPrincipal = 0, somaSecundaria = 0;
		
		
		for(int i=0;i<matrizInt.length;i++){
			for(int j=0;j<matrizInt.length;j++){
				System.out.println("Digite um valor para a posição [" + i + "] [" + j + "]: ");
				matrizInt[i][j] = leia.nextInt();
			}
		}
		leia.close();
		somaPrincipal = matrizInt[0][0] + matrizInt[1][1]+ matrizInt[2][2];
		somaSecundaria = matrizInt[0][2]+ matrizInt[1][1]+ matrizInt[2][0];
		
		System.out.println("Elementos da Diagonal Principal: "+matrizInt[0][0]+" "+ matrizInt[1][1]+ " "+matrizInt[2][2]);
		System.out.println("Elementos da Diagonal Secundária: "+matrizInt[0][2]+" "+ matrizInt[1][1]+" "+ matrizInt[2][0]);
		System.out.println("Soma dos Elementos da Diagonal Principal: "+ somaPrincipal);
		System.out.println("Soma dos Elementos da Diagonal Secundária: "+ somaSecundaria);
		
		
		
	}

}
