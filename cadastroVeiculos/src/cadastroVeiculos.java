import java.util.Scanner;

public class cadastroVeiculos {
    public static void main(String[] args) {
        carro[] carros = new carro[50];
        Scanner cadastro = new Scanner(System.in);
        int quantidade = 0;
        do {
            System.out.println("Quantos carros deseja cadastrar(máximo 50)?");
            quantidade = cadastro.nextInt();
            if (quantidade > 50 || quantidade < 1) {
                System.out.println("ATENÇÃO, deve-se cadastrar ao menos 1 carro, podemos registrar até 50!");
            }
        } while (quantidade > 50 || quantidade < 1);
        cadastro.nextLine();

        for (int nomeacao = 0; nomeacao < quantidade; nomeacao++){
            System.out.print("Digite o nome do carro " + (nomeacao + 1) + " : ");
            String nome = cadastro.nextLine();
            System.out.print("Digite o preço do carro " + (nomeacao + 1) + (" : "));
            double preco = cadastro.nextDouble();
            cadastro.nextLine();
            carros[nomeacao] = new carro(nome, preco);
        }

        double soma = 0;

        System.out.println("CARROS CADASTRADOS");
        for (int leitura = 0; leitura < quantidade; leitura++){
            System.out.println(carros[leitura].getNome());
            soma += carros[leitura].getPreco();
        }

        System.out.println("CARROS CADASTRADOS: " + quantidade);
        System.out.println("A SOMA DOS PREÇOS É " + soma);




    }
}