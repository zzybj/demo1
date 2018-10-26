package test;

public class MyList<T> {

    private Node<T> first;
    private Node<T> last;

    public MyList() {
        first = last = null;
    }

    public static class Node<T>{
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    public void addFirst(T point){
        first = new Node<T>(point);
        if(last==null){
            last = first;
        }
    }

    public void addLast(T point){
        last = new Node<T>(point);
        first.next = last;
    }

    public void add(T point){
        addLast(point);
    }

    public void remove(T point){

    }

    public void show(){

    }

    public boolean isEmpty(){
        return false;
    }

    public T get(int index){
        return null;
    }

}
