package atividade11_3;

import java.util.Scanner;

public class Lista02Ex04 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float matrizNotas[][] = new float[10][4];

        for (int i = 0; i < matrizNotas.length; i++) {
            for (int j = 0; j < matrizNotas[i].length; j++) {
                System.out.println("Digite a nota do " + (i + 1) + "º aluno no " + (j + 1) + "º Bimestre: ");
                matrizNotas[i][j] = leia.nextFloat();
            }
        }

        for (int j = 0; j < matrizNotas[0].length; j++) {
            float soma = 0;
            for (int i = 0; i < matrizNotas.length; i++) {
                soma += matrizNotas[i][j];
            }
            float media = soma / matrizNotas.length;
            System.out.printf("A média dos alunos no %dº Bimestre foi: %.1f%n", (j + 1), media);
        }

        leia.close();
    }
}

