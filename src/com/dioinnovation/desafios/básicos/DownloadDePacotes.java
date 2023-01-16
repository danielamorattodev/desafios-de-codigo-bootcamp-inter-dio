/*
Desafio: Você foi contratado para criar um gerenciador de pacotes. Porém, o que restou para você fazer foi o contador de porcentagem de download dos pacotes. Mas como o espaço para essa informação ficou pequeno, a empresa optou por fazer uma escala de 10 – 1. Então a escala será 1 = 10%, 2 = 20%, 3 = 30% e etc.
Para cada 10% de download, o programa deve printar, em sequência e sem espaços, uma barra “/”.

Entrada: A entrada será um número que representará a porcentagem

Saída: A saída serão as barras sem espaços entre elas.

Exemplo: Entrada = 1 / Saída = /; Entrada = 5 ; Saída = /////;
*/

package com.dioinnovation.desafios.básicos;

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.Scanner;

public class DownloadDePacotes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("tamanho ");
        int tamanho = leitor.nextInt();
        String download = "/";
        String downloadFinal = "";

        for(int i = 0; i < tamanho; i++){
            downloadFinal += download;
        }
        System.out.println(downloadFinal);

        /* Outra solução seria usando o StringBuilder junto do append para instanciar a contagem da barra:

        System.out.println("tamanho ");

        int tamanho = leitor.nextInt();
        String download = "/";
        StringBuilder downloadFinal = new StringBuilder();

        for(int i = 0; i < tamanho; i++){
          downloadFinal.append(download);
        }
        System.out.println(downloadFinal);
         */

        // TODO: Crie a condição necessária para que, de acordo com o tamanho, seja printado no console barras representando o download

    }

}
