public class FullStackException extends IllegalStateException {
 
    public FullStackException() {
        System.out.println("The Stack is full, you cannot add anything to it.");
    }
}