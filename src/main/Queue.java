package main;//By Ledón

class Queue implements TAD_Queue {
    private Node head = null, tail = null;

    public Queue() {
        head = null;
        tail = null;
    }

    public Object enqueue(Object x) {
        if (x == null) {
            return null;
        }
        try { //para casos de memória insuficiente
            if(Runtime.getRuntime().freeMemory() < x.toString().length() + 1024) return null;
            Node novo = new Node();
            novo.setValue(x);
            novo.setNext(null);
            if (tail == null) {
                head = novo;
                tail = novo;
            } else {
                tail.setNext(novo);
                tail = novo;
            }
            return x;
        } catch (Exception ex) {
            return null;
        }
    }

    public Object dequeue() {
        if (head == null) {
            return null;
        }
        Object value = head.getValue();
        Node temp = head; //opcional
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        temp.setNext(null);
        temp = null; //opcional
        return value;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public Object peek() { //retorna o objeto no início da fila
        if (head == null) {
            return null;
        } else {
            return head.getValue();
        }
    }

    //Retorna o conteúdo da Fila Dinâmica (utilities.Queue)
    public String toString() { //retorna o conteúdo da fila dinâmica
        if (!isEmpty()) {
            String saida = "f: [ \n";
            Node aux = head;
            while (aux != null) { // o ponteiro aux percorre a lista
                saida += "  " + aux.getValue().toString();
                aux = aux.getNext();
                if (aux != null) {
                    saida += "\n";
                }
            }
            return (saida + "\n]");
        } else {
            return ("f: [ ]"); // fila vazia
        }
    }

}
