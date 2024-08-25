public class NossoVetorDinamico {

    int[] dados;
    int capacidade, ocupacao;

    public NossoVetorDinamico(int capacidade) {
        this.dados = new int[capacidade];
        this.capacidade = capacidade;
        this.ocupacao = 0;
    }

    public NossoVetorDinamico() {
        this(10);
    }

    public boolean estaCheio() {
        return ocupacao == capacidade;
    }

    public boolean estaVazio() {
        return ocupacao == 0;
    }

    private int[] realocar(int capacidade) {
        int[] temp = new int[capacidade];
        for (int i = 0; i < ocupacao; i++) {
            temp[i] = dados[i];
        }
        return temp;
    }

    public void add(int e) {
        if (estaCheio()) {
            dados = realocar(capacidade * 2);
            capacidade *= 2;
        }
        dados[ocupacao++] = e;
    }

    public int remove() {
        int e = dados[--ocupacao];
        if (ocupacao <= capacidade / 4) {

            dados = realocar(capacidade / 2);
            capacidade /= 2;
        }
        return e;
    }
}