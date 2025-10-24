package modulo02_estruturasCondicionais;

public class aula03_ifElse {
    public static void main(String[] args) {
//        int idade = 42;
//
//        if(idade >= 18) {
//            System.out.println("Você é maior de idade");
//        }
//        else {
//            System.out.println("Você é menor de idade");
//        }

//        boolean estaChovendo = true;
//
//        if (!estaChovendo) {
//            System.out.println("Vamos sair para passear");
//        }
//        else {
//            System.out.println("Vamos ficar em casa e pedir pizza");
//        }

//        boolean temDinheiro = true;
//        boolean temCartao = false;
//
//        if (temDinheiro && temCartao) {
//            System.out.println("Pede um ifood e um zé delivery");
//        }
//        else if (temDinheiro || temCartao) {
//            System.out.println("Pede um ifood");
//        }
//        else {
//            System.out.println("Não pede nada");
//        }

        int idade = 17;
        int idadeMinimaParaVotar = 18;

        if (idade >= idadeMinimaParaVotar) {
            // Condição (17 >= 18) é FALSA
            System.out.println("Você pode votar!");
        } else {
            // Este bloco é executado
            System.out.println("Você ainda não pode votar.");
        }
        // Saída: Você ainda não pode votar.

    }
}
