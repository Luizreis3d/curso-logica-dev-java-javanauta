package modulo03_estruturasRepetitivas;

import java.util.HashMap;
import java.util.Map;

public class aula06_estudoHashMap {
    public static void main(String[] args) {
        HashMap<String, Double> notasDosAlunos = new HashMap<>();
        notasDosAlunos.put("Alice", 10.5);
        notasDosAlunos.put("Mateus", 8.0);
        notasDosAlunos.put("Maria", 9.9);

        for(String nome : notasDosAlunos.keySet()){
            double nota = notasDosAlunos.get(nome);
            System.out.println(nome + " : " + nota );
        }

        for(Map.Entry<String, Double> nota : notasDosAlunos.entrySet()){
            String nome = nota.getKey();
            double valorNota = nota.getValue();
            System.out.println(nome + " : " + nota);
        }

        double nota = notasDosAlunos.get("Alice");
        System.out.println("A nota da Alice é: " + nota);

    }
}
