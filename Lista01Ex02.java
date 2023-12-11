package atividade11_3;

import java.util.Scanner;

public class Lista01Ex02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vetorInt[] = new int[10];
		int tamanho = 10, soma = 0;
		float media;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + " número: ");
			vetorInt[i] = leia.nextInt();		
		}
	
        System.out.print("Elementos nos índices ímpares: ");
        for (int i = 1; i < tamanho; i += 2) {
            System.out.print(vetorInt[i] + " ");
        }
        System.out.println();

        System.out.print("Elementos pares: ");
        for (int num : vetorInt) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        for (int num : vetorInt) {
            soma += num;
        }

        media = (float) soma / tamanho;


        System.out.println("Soma: " + soma);
        System.out.printf("Média: %.2f", media);

        leia.close();
		
	}
}
