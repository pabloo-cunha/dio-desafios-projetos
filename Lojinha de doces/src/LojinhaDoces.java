import java.util.Scanner;
/*
Uma lojinha de doces tem muitos clientes por ser ao lado de uma escola.
Para aumentar as vendas o dono resolveu colocar uma máquina onde os clientes,
principalmente as crianças que estão muito acostumadas com a tecnologia,
poderiam colocar suas moedas e receber dois doces aleatórios.
Cada 1 real irá render 2 doces aleatórios.
*/
public class LojinhaDoces {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int doce = leitor.nextInt();
        int quantidadeDoces = doce*2;

        System.out.println("O cliente obteve " + quantidadeDoces + " doces");


    }
}