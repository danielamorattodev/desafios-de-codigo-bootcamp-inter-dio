/*
Desafio: A prefeitura de uma cidade A instalou uma câmera para verificar quem estava acima da velocidade permitida na rodovia da entrada da cidade. Porém, ela é uma cidade extremamente movimentada e a prefeitura não deu conta de enviar as multas necessárias para quem ultrapassasse a velocidade permitida de 60km/h.
O seu papel será o de criar um programa que verifique os dados recebidos da câmera e envie uma mensagem dizendo se o motorista será multado ou não.

Entrada: A entrada vai ser a velocidade do motorista.

Saída: A saída será uma mensagem no console dizendo se o motorista foi multado ou não. (sem as aspas)

Exemplo: Entrada = 60 / Saída = "Não foi multado"; Entrada = 68 / Saída = "Foi multado".
 */

package com.dioinnovation.desafios.básicos;
// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.Scanner;
public class IndustriaDaMulta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Velocidade: ");
        int velocidadeAtual = leitor.nextInt();
        int limite = 60;

        if (velocidadeAtual > limite) {
            System.out.println("Foi multado");
        } else {
            System.out.println("Nao foi multado");
        }


        // TODO: Crie a condição necessária para verificar se o motorista, de acordo com a entrada, foi multado ou não.

    }
}
