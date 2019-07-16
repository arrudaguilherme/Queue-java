package pilha;

class Node<T>{
    Node<T> info;
    Node<T>next;

    Node(T info){
        this.info=info;
    }
    void setInfo(T info){
        this.info=info;
    }
    void setNext(Node<T>next){
        this.next=next;
    }
    T getInfo(){
        return this.info();
    }
    Node<T> getNext(){
        return this.next();
    }
}