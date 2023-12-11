package atividade11_3;

import java.util.Scanner;

public class Lista01Ex01 {

    public static void main(String[] args) {
        int vetorInteiros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        Scanner leia = new Scanner(System.in);
        int numero;

        System.out.println("Digite o número que você deseja encontrar: ");
        numero = leia.nextInt();
        
        boolean encontrado = false;

        for(int i = 0; i < vetorInteiros.length; i++){
            if(vetorInteiros[i] == numero){
                System.out.println("O número " + numero + " está localizado na posição: " + i);
                encontrado = true;
                break;
            }
        }

        if(!encontrado){
            System.out.println("O número " + numero + " não foi encontrado!");
        }
        leia.close();
    }
}
