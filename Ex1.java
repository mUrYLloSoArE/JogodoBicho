import java.util.Random;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random aleatorio=new Random();

        int numAleatorio=aleatorio.nextInt(10+1);

        if(numAleatorio==0) {
            numAleatorio=1;
        }

        int opcao=0;
        int numero = 0;
        int soma=0;
        int acertos=0;
        int erros=0;

        do {

            System.out.println(" Digite as opções para começar o jogo ");
            System.out.println(" 0 - para sair do jogo e ver os seu pontos ");
            System.out.println(" 1- - Modo facil ");
            System.out.println(" 2- - Modo médio ");
            System.out.println(" 3- - Modo Dificil");
            opcao=sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Digite o número de 1 a 10 e ganhe pontos ");
                    numero=sc.nextInt();
                    if(numero != numAleatorio ) {
                        System.out.println("Você errou! ");
                        erros++;
                    }
                    if(numero == numAleatorio-1 || numero == numAleatorio+1) {
                        System.out.println("Você chegou perto do número ganhou 5 pontos ");
                        soma+=5;
                        erros++;
                    }
                    if(numero == numAleatorio) {
                        System.out.println("Você acertou o número ganhou 10 pontos ");
                        soma+=10;
                        acertos++;
                    }
                    if(numero < 1 || numero > 10) {
                        System.out.println("Intervalos de números inválidos! ");
                        return;
                    }
                    break;

                case 2:
                    aleatorio.nextInt(100+1);
                    System.out.println("Digite o número de 20 a 100 e ganhe pontos ");
                    numero=sc.nextInt();
                    if(numero != numAleatorio ) {
                        System.out.println("Você errou! ");
                        erros++;
                    }
                    if(numero == numAleatorio-1 || numero == numAleatorio+1) {
                        System.out.println("Você chegou perto do número ganhou 10 pontos ");
                        soma+=10;
                        erros++;
                    }
                    if(numero == numAleatorio) {
                        System.out.println("Você acertou o número ganhou 20 pontos ");
                        soma+=20;
                        acertos++;
                    }
                    if(numero < 20 || numero > 100) {
                        System.out.println("Intervalos de números inválidos! ");
                        return;
                    }
                    break;

                case 3:
                    aleatorio.nextInt(10000+1);
                    System.out.println("Digite o número de 1000 a 10000 e ganhe pontos ");
                    numero=sc.nextInt();
                    if(numero != numAleatorio ) {
                        System.out.println("Você errou! ");
                        erros++;
                    }
                    if(numero == numAleatorio-1 || numero == numAleatorio+1) {
                        System.out.println("Você chegou perto do número ganhou 20 pontos ");
                        soma+=20;
                        erros++;
                    }
                    if(numero == numAleatorio) {
                        System.out.println("Você acertou o número ganhou 40 pontos ");
                        soma+=40;
                        acertos++;
                    }
                    if(numero < 1000 || numero > 10000) {
                        System.out.println("Intervalos de números inválidos! ");
                        return;
                    }
                    break;

                case 0:
                    System.out.println("Programa encerrado! ");
                    System.out.println("Total de acertos -> " + acertos);
                    System.out.println("Total de erros -> " + erros);
                    System.out.println("Total de pontos -> " + soma);
                    break;

                default:
                    System.out.println("Opção inválida digite novamente! ");
                    break;
            }

        } while (opcao !=0);

        sc.close();
    }

}