/*
Desafio: Sua tia Gertrudes é uma leitora assídua. E ela gostaria de ter um aplicativo que dissesse para ela, de acordo com o número de páginas de um livro, quanto tempo ela levaria para ler lendo apenas 3 páginas por dia. Como você está aprendendo Java, você se disponibilizou para ajudá-la com esse desenvolvimento.

Entrada: A entrada será o número de páginas de um determinado livro

Saída: A saída deverá ser quanto tempo ela vai levar para ler esse livro

Exemplo: Entrada = 30 / Saída = "10 dias"; Entrada = 15 / Saída = "5 dias";
 */

package com.dioinnovation.desafios;
// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.Scanner;
public class LeituraDeGertrudes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Paginas: ");
        int paginas = leitor.nextInt();
        int paginasLidas = 3;

        int dias = paginas / paginasLidas;
        System.out.println(dias + " dias");

        // TODO: Crie a condição necessária para que Getrudes saiba em quanto tempo terminará seus livros

    }
}
