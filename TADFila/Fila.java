package TADFila;

public class Fila {
    private Object[] elementos;
    private int capacidade;
    private int primeiro;
    private int ultimo;
    private int tamanho;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
        this.primeiro = 0;
        this.ultimo = -1;
    }

    public boolean isEmpty() {
        return this.tamanho == 0;
    }

    public int size() {
        return tamanho;
    }

    public void enqueue(Object elemento) {
        if (tamanho == capacidade) {
            resize();
        }
        ultimo = (ultimo + 1) % capacidade;
        elementos[ultimo] = elemento;
        tamanho++;
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        Object elemento = elementos[primeiro];
        primeiro = (primeiro + 1) % capacidade;
        tamanho--;
        return elemento;
    }

    public void resize() {
        int novaCapacidade = capacidade * 2;
        Object[] novoElementos = new Object[novaCapacidade];

        for (int i = 0; i < tamanho; i++) {
            novoElementos[i] = elementos[(primeiro + i) % capacidade];
        }

        elementos = novoElementos;
        capacidade = novaCapacidade;
        primeiro = 0;
        ultimo = tamanho - 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < tamanho; i++) {
            sb.append(elementos[(primeiro + i) % capacidade]);
            if (i < tamanho - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
