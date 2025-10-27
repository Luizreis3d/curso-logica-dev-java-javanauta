package modulo03_estruturasRepetitivas;

public class aula02_doWhile {
    public static void main(String[] args) {
        int contador = 0;

//        while(contador<=5) {
//            System.out.println("contador: " + contador );
//            contador++;
//        }

        do {
            System.out.println("Contador do while " + contador);
            contador++;
        }while (contador<5);
    }
}
