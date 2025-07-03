package random;

public class BuscaBinaria {
    public int buscar(int[] v, int k, int ini, int fim) {
        if (ini <= fim) {
            int meio = (ini + fim) / 2;

            if (v[meio] == k)
                return meio;
            else if (k < v[meio])
                return buscar(v, k, ini, meio - 1);
            else
                return buscar(v, k, meio + 1, fim);
        }
        return -1;
    }
}
