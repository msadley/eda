package questions;

public class Main {
    public static void main(String[] args) {
        FindExtraElement es = new FindExtraElement();

        int[] arrayWithExtra = { -1, -5, -2, -3 };
        int[] arrayBase = { -1, -2, -3 };

        System.out.println(es.find(arrayBase, arrayWithExtra));

        // System.out.println(es.search(arrayWithExtra, 2, 0, arrayWithExtra.length-1));
    }
}