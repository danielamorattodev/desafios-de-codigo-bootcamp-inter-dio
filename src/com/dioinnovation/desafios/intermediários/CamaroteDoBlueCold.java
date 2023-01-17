/*
Desafio: No show da famosa banda Blue Cold Ice Cubes o vocalista, Antônio Queda, escolheu todas as pessoas que estavam na posição impar da fila para entrarem no camarote.
Ele fez isso em diversos shows e as pessoas foram a loucura para competirem por essas posições. Você resolveu criar um programa para saber,
de acordo com o número de pessoas na fila, quantas entrariam no camarote.

Entrada: A entrada será o tamanho da fila que aguardava para ver o show.

Saída: A saída deve ser o número de pessoas que foram colocadas no camarote. (sem as aspas)

Exemplo: Entrada = 100 ; Saída = "50 pessoas no camarote" / Entrada = 40; Saída = "20 pessoas no camarote";
 */

package com.dioinnovation.desafios.intermediários;

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.


import java.util.Scanner;

public class CamaroteDoBlueCold {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Array ");
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;

        for (int i = 0; i <= tamanhoDaFila; i++) {
            if (i % 2 != 0)
                pessoasNoCamarote++;
        }
        System.out.println(pessoasNoCamarote + " pessoas no camarote");
    }

}






