package jardinagem;

import java.util.Scanner;

public class Jardinagem {

    Scanner input = new Scanner(System.in);

    String nomeJardim;
    double qtdMetros;
    double qtdPlantas;
    double qtdMetrosGrama;
    double kilosAdubo;
    double valorAdubo;
    double valorMetroGrama;
    double valorConteGrama;
    double qtdGramasAdubo;

    public Jardinagem() {
        this.nomeJardim = nomeJardim;
        this.qtdMetros = qtdMetros;
        this.qtdPlantas = qtdPlantas;
        this.qtdMetrosGrama = qtdMetrosGrama;
        this.kilosAdubo = kilosAdubo;
        this.valorAdubo = valorAdubo;
        this.valorMetroGrama = valorMetroGrama;
        this.valorConteGrama = valorConteGrama;
        this.qtdGramasAdubo = qtdGramasAdubo;
    }

    public void jardimInicial(){

        System.out.println("Informar o nome do Jardim");
        nomeJardim = input.next();

        System.out.println("Favor informar preço do Adubo");
        valorAdubo = input.nextDouble();

        System.out.println("Favor informar preço do metro grama cortada");
        valorMetroGrama = input.nextDouble();

        System.out.println("Favor informar quantos metros grama para cortar" );
        qtdMetrosGrama = input.nextDouble();

        System.out.println(nomeJardim);
    }

    public void usarAdubo(){
        System.out.println("Informe a quantidade de metros de grama adubada: ");
        qtdMetros = input.nextDouble();

        if(qtdMetros >= 2){
            qtdGramasAdubo = (qtdMetros * 0.5) * 100;
        }else
            qtdGramasAdubo = (qtdMetros * 0.05) * 10;
        System.out.println("Quantidade de grama " +qtdMetros);
        System.out.println("Foi utilizado " +qtdGramasAdubo+ " gramas de adubo");
    }

    public void calculoAdubo(){
        double precoAdubo = qtdGramasAdubo * valorAdubo;
        System.out.println("O valor do adubo utilizado é : " +precoAdubo);
    }

    public void precoCorteGrama(){
        valorConteGrama = qtdMetrosGrama * valorMetroGrama;
        System.out.println("O valor do corte de grama é: " +valorConteGrama);
    }

}
