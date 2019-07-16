package queue;
import queue.Node;

public class Fila<T> {
    private Node<T>first;
    private Node<T>last;
    
    public boolean isEmpty(){
        if(this.first==null){
            return true;
        }else{
        return false;
        }    
    }
    
    public boolean isFull(){
    return false;
    }
    public void enqueue(T valor){
        Node<T> aux=new Node(valor);
        if(this.isEmpty()==true){
            this.first=aux;
            this.last=aux;
        }else{
            this.last.setNext(aux);
            aux.setPrev(this.last);
            this.last=aux;
        }    
        
    }
    
    public T dequeue(){
        Node<T>aux=this.first;
        this.first=this.first.getNext();
        this.first.setPrev(null);
        if(this.isEmpty()==true){
            this.last=null;
        }
        return aux.getInfo();
    }
    
    public T head(){
        Node<T> aux=this.first;
        return aux.getInfo();
    }
    
    
}
