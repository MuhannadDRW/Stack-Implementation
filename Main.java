

public class Main {
    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        System.out.println("Is Empty: "+ s.isEmpty());
        s.push("Ahmad");
        s.push("Mohammad");
        s.push("Mahmod");
        s.show();

        System.out.println("Peek " + s.peek());

        s.push("Muhannad");
        s.show();

        System.out.println("Size: " +s.size());
        System.out.println("Pop: " + s.pop());

        s.show();

        System.out.println("Size: " +s.size());
        System.out.println("Is Empty: "+ s.isEmpty());
    }
}