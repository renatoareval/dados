

public class TestaFIla {
    private  ListaLIgada lista;
 
     public TestaFIla(){
         this.lista = new ListaLIgada();
     }
 
     public void enqueue(String novoValor){
         this.lista.adiciona(novoValor);
     }
 
     public void dequeue(){
         this.lista.remover(this.get());
     }
 
     public String get(){ // pega o primeiro elemento para usar no método dequeue
         return this.lista.getPrimeiro().getValor();
     }

     public int size(){
        return this.lista.getTamanho();
     }

     public boolean isEmpty(){
        if(lista.getTamanho() == 0){
            return true;
        }else{
            return false;
        }
     } 

     public static void main(String[] args) {
        TestaFIla fila = new TestaFIla();


        fila.enqueue("1");
        fila.enqueue("2");
        fila.enqueue("3");
        fila.enqueue("4");
        fila.enqueue("5");

        System.out.println("Primeiro da fila " +fila.get());
        fila.dequeue();
        System.out.println("Novo primeiro da fila " +fila.get());
        System.out.println("Tamanho da fila " + fila.size());
        System.out.println(fila.isEmpty()) ;
    }
 }
 





   

