package modulo02_estruturasCondicionais;

public class aula04_operadorTernario {
    public static void main(String[] args) {

        boolean temDinheiro = true;
        boolean temCartao = false;

        String mensagem = (temDinheiro) ? "Pede um ifood" : "Não pede nada";
        System.out.println(mensagem);
    }
}
