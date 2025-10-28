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
    }
}
