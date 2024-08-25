import java.util.Random;

public class NossoVetor {
    static int cont = 0;
    // atributo encapsulado, vetor de inteiros
    private int[] dados;
    // construtores com sobrecarga

    public NossoVetor(int capacidade) {
        dados = new int[capacidade];
        cont++;
    }

    public NossoVetor() {
        this(10);
    }

    public int[] getDados() {
        return dados;
    }

    public void setPosicao(int pos, int valor) {
        dados[pos] = valor;
    }

    public void somaUmVetor(NossoVetor aux) {
        for (int i = 0; i < this.dados.length; i++)
            this.dados[i] += aux.dados[i];
    }

    public static NossoVetor somaDoisVetores(NossoVetor vA, NossoVetor vB) {
        NossoVetor vResult = new NossoVetor(vA.dados.length);
        for (int i = 0; i < vA.dados.length; i++)
            vResult.dados[i] = vA.dados[i] + vB.dados[i];
        return vResult;
    }

    public void preencheVetor() {
        Random r = new Random();
        for (int i = 0; i < dados.length; i++) {
            dados[i] = r.nextInt(dados.length * 10);
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < dados.length; i++) {
            s += dados[i] + " ";
        }
        return s;
    }

    public void bubblesort() {
        for (int i = 1; i < dados.length; i++) {
            for (int j = 0; j < dados.length - i; j++) {
                if (dados[j] > dados[j + 1]) {
                    int aux = dados[j];
                    dados[j] = dados[j + 1];
                    dados[j + 1] = aux;
                }
            }
        }
    }
}