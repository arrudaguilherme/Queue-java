package queue;


class Node<T> {
    private T info;
    private Node<T>next;
    private Node<T>prev;
    
    Node(T info){
        this.info=info;
    }
    
    void setInfo(T info){
        this.info=info;
    }    
    
    T getInfo(){
        return this.info;
    }
    
    void setNext(Node <T> n){
        this.next=n;
    } 
    
    Node<T>getNext(){
        return this.next;
    }
    void setPrev(Node <T> p){
        this.prev=p;
    }
    
    Node<T>getPrev(){
        return this.prev;
    }
    
        
}
