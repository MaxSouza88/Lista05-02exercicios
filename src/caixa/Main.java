package caixa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Caixa caixa = new Caixa();

        boolean repetirOperacao = true;

     caixa.inicioPrograma();

     while (repetirOperacao){

        System.out.println(" 1 - Para depositar ");
        System.out.println(" 2 - Para sacar");
        int opcaoUsuario = input.nextInt();

         if ((opcaoUsuario<=0)||(opcaoUsuario>=3)) {
             System.out.println("Digite uma opção válida");
             System.out.println("Sistema sendo finalizado . . . . ");
             repetirOperacao = false;
         }
         else if (opcaoUsuario==1){
            caixa.insereValor();
        } else if (opcaoUsuario == 2) {
            caixa.retiraValor();
        }

     }

    }

}

