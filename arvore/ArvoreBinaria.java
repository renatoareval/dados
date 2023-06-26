
public class ArvoreBinaria {

    public int valor;
    public ArvoreBinaria esquerda; 
    public ArvoreBinaria direita;

 
    public ArvoreBinaria(int valor, ArvoreBinaria direita, ArvoreBinaria esquerda) {
        this.valor = valor;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    // atravessar
    public void atravessar() {

        if (esquerda != null) {
            esquerda.atravessar(); //recursivo
        }
        System.out.println(this.valor);

        if (direita != null) {
            direita.atravessar();
        }

    }

  
    public void adicionar(int NovoValor) {
        if(valor > NovoValor) {
			if(esquerda == null) esquerda = new ArvoreBinaria(NovoValor, null, null);
			else esquerda.adicionar(NovoValor);
		} else if(valor < NovoValor) {
			if(direita == null) direita = new ArvoreBinaria(NovoValor, null, null);
			else direita.adicionar(NovoValor);
		}

    }

    public void buscar(ArvoreBinaria arvoreBuscada, int valorBuscado) {
        if (arvoreBuscada == null) {
            System.out.println("A árvore está vazia");
        }

        if (arvoreBuscada != null) { //verificar se a árvore que estou procurando o elemento não é vazia
            if (valorBuscado == arvoreBuscada.valor) { // o valor buscado está na raiz
                System.out.println("Valor encontrado");
            }
            // se o valor buscado for menor que a raiz, percorer a árvore à esquerda até encontrar
            else if (valorBuscado < arvoreBuscada.valor) { 
                buscar(arvoreBuscada.esquerda, valorBuscado);
            }
            // se o valor buscado for maior que a raiz, percorer a árvore à direita até encontrar
            else if (valorBuscado > arvoreBuscada.valor) { 
                buscar(arvoreBuscada.direita, valorBuscado);
            }
        
        } else {
            System.out.println("Valor não encontrado");
        }
    }

    public static void main(String[] args) {
        ArvoreBinaria arvore1 = new ArvoreBinaria(12, null, null);

        arvore1.adicionar(9);
        arvore1.adicionar(8);
        arvore1.adicionar(11);
        arvore1.adicionar(7);

        arvore1.atravessar();


    }
}