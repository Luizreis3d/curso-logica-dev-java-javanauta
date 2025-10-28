package modulo03_estruturasRepetitivas;

import java.util.Map;
import java.util.TreeMap;

public class aula07_estudoTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Double> notasDosAlunos = new TreeMap<>();
        notasDosAlunos.put("Alice", 10.5);
        notasDosAlunos.put("Mateus", 8.0);
        notasDosAlunos.put("Maria", 9.9);

        for(String nome : notasDosAlunos.keySet()){
            double nota = notasDosAlunos.get(nome);
            System.out.println(nome + " : " + nota);
        }

        for(Map.Entry<String, Double> nota : notasDosAlunos.entrySet()){
            String nome = nota.getKey();
            double valorNota = nota.getValue();
            System.out.println(nome + " : " + valorNota);
        }

        System.out.println("Primeira chave: " + notasDosAlunos.firstKey());
        System.out.println("Última chave: " + notasDosAlunos.lastKey());
    }
}
