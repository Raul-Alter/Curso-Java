package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        //Offer e Add adicionam elementos a fila
        fila.add("Ana"); //Fila cheia -> Retorna False
        fila.offer("Bia"); //Fila cheia -> Retorna uma Exceção
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        //Peek e Element obtem o próximo elemnto da fila (sem remover)
        System.out.println(fila.peek()); //Fila vazia -> Retorna null
        System.out.println(fila.peek());
        System.out.println(fila.element()); //Fila vazia -> Lança uma exceção
        System.out.println(fila.element());

        //Poll e Remove removem itens da lista
        System.out.println(fila.poll()); //Fila vazia -> retorna null
        System.out.println(fila.remove()); //Fila vazia -> lança uma exceção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());

        //fila.size();
        //fila.clear();
        //fila.isEmpty();
        //fila.contains(...);
    }
}
