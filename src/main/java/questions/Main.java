package questions;

public class Main {
    public static void main(String[] args) {
        EncontraElementoSobrando es=  new EncontraElementoSobrando();

        int[] arrayComExtra = { -1, -5, -2, -3 };
        int[] arrayBase = { -1, -2, -3 };

        System.out.println(es.encontrar(arrayBase, arrayComExtra));

        // System.out.println(es.buscar(arrayComExtra, 2, 0, arrayComExtra.length-1));
    }
}
