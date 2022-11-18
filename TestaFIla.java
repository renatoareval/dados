
public class TestaFIla {
    private ListaLIgada lista;

    public TestaFIla() {
        this.lista = new ListaLIgada();
    }

    public void enqueue(String novoValor) {
        this.lista.adiciona(novoValor);
    }

    public void dequeue() {
        if (size() == 0) {
            throw new IllegalArgumentException("lista vazia");
        }

        this.lista.remover(this.get());
    }

    public String get() { // pega o primeiro elemento para usar no método dequeue
        return this.lista.getPrimeiro().getValor();
    }

    public int size() {
        return this.lista.getTamanho();
    }

    public boolean isEmpty() {
        if (lista.getTamanho() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        TestaFIla fila = new TestaFIla();

        fila.dequeue();

    }
}
