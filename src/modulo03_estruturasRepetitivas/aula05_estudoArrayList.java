package modulo03_estruturasRepetitivas;

import java.util.ArrayList;
import java.util.List;

public class aula05_estudoArrayList {
    public static void main(String[] args) {
        List<String> listaDeCompras = new ArrayList<>();
        listaDeCompras.add("Mamão");
        listaDeCompras.add("Sabão em pó");
        listaDeCompras.add("Macarrão");

        listaDeCompras.add(1, "Banana");

        for (String item : listaDeCompras){
            System.out.println(item);
        }

        String item = listaDeCompras.get(3);
        System.out.println("Na posição três eu tenho: " + item);

//      listaDeCompras.remove(3)
        boolean eVazia = listaDeCompras.isEmpty();
        int tamanho = listaDeCompras.size();
        boolean contem = listaDeCompras.contains("Arroz");
        System.out.println("A lista está vazia? " + eVazia + ", Qual o tamanho da lista? "
                + tamanho + ", A lista contem o item arroz? " + contem);

//        listaDeCompras.clear();
//        System.out.println("A lista está vazia? " + listaDeCompras.isEmpty());

        listaDeCompras.forEach(produto -> System.out.println(produto));
    }
}
