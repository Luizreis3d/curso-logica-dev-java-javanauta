package modulo03_estruturasRepetitivas;

public class aula04_arrays {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 50, 1};
        String[] frutas;
        frutas = new String[]{"Maçã", "Morango", "Abacaxi"};

        double[] salarios = new double[5];
        salarios[3] = 500.00;
        salarios[1] = 200.00;
        salarios[0] = 150.00;
        salarios[2] = 25.00;
        salarios[4] = 100.00;

        for(int posicao = 0; posicao <salarios.length; posicao++){
            System.out.println(salarios[posicao]);
        }
    }
}
