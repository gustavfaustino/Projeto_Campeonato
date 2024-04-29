package main;//By Ledón

public interface TAD_Queue {  // tipo abstrato de dado que descreve a Fila        
    //Verifica se a utilities.Queue está vazia

    public boolean isEmpty();

    //Verifica se a utilities.Queue está cheia
    //public boolean isFull();
    //Insere um elemento na fila
    public Object enqueue(Object x);

    //Remove um elemento do início da fila
    public Object dequeue();

    //Retorna o objeto que está no início da fila (o primeiro da fila), sem eliminar.
    public Object peek();

    //Retorna o conteúdo (todos os elementos) da utilities.Queue
    public String toString();
}
