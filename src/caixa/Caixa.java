package caixa;

import java.util.Scanner;

public class Caixa {

    Scanner input = new Scanner(System.in);

    double credito;
    double debito;
    double saldo;

    public Caixa() {
        this.credito = credito;
        this.debito = debito;
        this.saldo = 1000.00;
    }

    public void inicioPrograma(){
        System.out.println(" -----Bem vindo ao Programa CAIXA-CATALISA-----");
        System.out.println("Voce inicia com valor total de: " +saldo);
    }

    public void insereValor(){
        System.out.println("Digite o valor a ser creditado: ");
        credito = input.nextDouble();
        saldo += credito;

        System.out.println("Seu novo saldo é: " +saldo);
    }
    public void retiraValor(){
        System.out.println("Digite o valor a ser debitado: ");
        debito = input.nextDouble();
        saldo -= debito;

        System.out.println("Seu novo saldo é: " +saldo);
    }

}
