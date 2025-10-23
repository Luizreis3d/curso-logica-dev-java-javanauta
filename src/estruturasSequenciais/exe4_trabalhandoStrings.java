package estruturasSequenciais;

public class exe4_trabalhandoStrings {
    public static void main(String[] args) {
        String nome = "Joana";
        String sobrenome = " da Silva";

        int tamanhoString = nome.length();
        boolean saoIguais = nome.equals(sobrenome);
        String nomeCompleto = nome.concat(sobrenome);

        System.out.println("Olá " + nome + " seu nome tem " +tamanhoString + " caracteres");
        System.out.println("Os nome são iguais: " + saoIguais);
        System.out.println("Nome completo: " + nomeCompleto);
    }
}
