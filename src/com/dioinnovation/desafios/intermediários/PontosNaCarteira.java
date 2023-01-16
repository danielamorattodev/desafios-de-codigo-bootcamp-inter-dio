/*Desafio: A prefeitura da cidade B, inspirada por uma cidade A, decidiu implementar um sistema de câmeras que iria verificar se os carros estão acima de 80km/h.
Porém, eles queriam também anotar a placa dos carros no banco de dados para que, a partir de 3 multas, os motoristas perdessem pontos diretamente na carteira de habilitação.
Para isso, contrataram você para realizar esse programa, logo que você fez um trabalho tão bom para a cidade A.

Lembrando que toda vez que um carro é pego pela câmera e está acima da velocidade permitida automaticamente já é contabilizado uma multa para ele.

Entrada: A entrada será a velocidade que o veículo está e quantas multas ele já recebeu. Se ele estiver acima da velocidade, deve ser somado mais uma multa.

Saida: A saída deverá ser quantas multas o motorista já tem e se ele irá receber pontuação na carteira de habilitação.

Exemplo: Entrada = 85/ 1; Saída = "1 multa. Nao levou pontos na carteira" ; Entrada: 95 /2; Saída = 3 multas. Levou pontos na carteira".

*/


package com.dioinnovation.desafios.intermediários;
// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.Scanner;

public class PontosNaCarteira {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Velocidade");
        int velocidade = leitor.nextInt();
        int multas = leitor.nextInt();

       if (velocidade > 80){
           multas++;
       }
        System.out.println(multas >= 3 ? multas + " multas. Levou pontos na carteira" : multas + " multas. Não levou pontos na carteira");


    }
}
