package questions;

public class EncontraElementoSobrando {

    public int encontrar(int[] a, int[] b) {
        
        // Tempo de Execução: 4n
        // Uso de Memória: K + |w|
        int[] maior, menor;

        if (a.length > b.length) {
            maior = a;
            menor = b;
        } else {
            maior = b;
            menor = a;
        }

        int intMaior = maior[0];
        for (int i : maior)
            if (i > intMaior)
            intMaior = i;
        
        int intMenor = maior[0];
        for (int i : maior)
            if (i < intMenor)
                intMenor = i;

        boolean[] h = new boolean[intMaior-intMenor+2];

        for (int i : menor) {
            h[i-intMenor] = true;
        }

        for (int i : maior) {
            if (!h[i-intMenor])
                return i;
        }
        return -1;
    }
}

