package modulo01_estruturasSequenciais;

public class exe3_operadoresAritmeticos {
    public static void main(String[] args) {
        double pao = 10.50;
        double queijo = 7.00;
        double acucar = 4.00;
        double desconto = 5.50;
        int totalDiasDoMes = 30;

        double valorTotal = pao + queijo + acucar;
        double valorTotalComDesconto = valorTotal - desconto;
        double valorTotalDivididoDaConta = valorTotalComDesconto /2;
        double valorTotalMensal = valorTotalComDesconto * totalDiasDoMes;

        System.out.println("Valor total = R$" + valorTotalMensal);
    }
}
