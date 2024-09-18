import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tipoInvestimento = new ArrayList<String>();

        System.out.println("Que tipo de investimento vc desja Fazer");
        System.out.println("1 para Acao - 2 para Renda-Fixa - 3 para Fundo de Investimento");
        String opcao = sc.nextLine();

        String nomeInvestimento;
        double taxaDeRetorno = 0;
        System.out.println("Digite o valo a ser Investito");
        double valorDoinvestimento = sc.nextDouble();
        sc.nextLine();

        switch (opcao) {
            case "1":
                nomeInvestimento = "Acoes";
                taxaDeRetorno = 0.05;
                Acoes acoes = new Acoes(nomeInvestimento,valorDoinvestimento,taxaDeRetorno);
                acoes.calculaRendimento();
                break;
            case "2":
                nomeInvestimento = "Renda Fixa";
                taxaDeRetorno = 0.07;
                RendaFixa rendaFixa = new RendaFixa(nomeInvestimento,valorDoinvestimento,taxaDeRetorno);
                break;
            case "3":
                nomeInvestimento = "Fundo de Investimentos";
                taxaDeRetorno = 0.11;
                FundoDeInvestimentos fundoDeInvestimentos = new FundoDeInvestimentos(nomeInvestimento,valorDoinvestimento,taxaDeRetorno);
                break;
            default:
                System.out.println("Opção Invalida");

        }


    }
}