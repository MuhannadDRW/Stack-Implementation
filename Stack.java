import java.util.ArrayList;

public class Stack<T>{

    private ArrayList<T> stack = new ArrayList<>();
    private int top = 0;

    public void push(T data){
        stack.add(top, data);
        top++;
    }

    public void show(){
        for (T t : stack) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public T pop(){
        top--;
        T data = stack.get(top);
        stack.remove(top);
        return data;
    }

    public T peek(){
        return stack.get(top - 1);
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return top == 0;
    }
}
