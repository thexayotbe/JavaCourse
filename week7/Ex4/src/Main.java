// Define a generic Stack class
public class Stack<T> {

    // The stack will store elements of type T (Generic type)
    private List<T> stack;

    // Constructor to initialize the stack
    public Stack() {
        stack = new ArrayList<>();
    }

    // Method to push an element onto the stack
    public void push(T element) {
        stack.add(element);
    }

    // Method to pop an element from the stack
    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty.");
        }
        return stack.remove(stack.size() - 1);  // Removes the last element (LIFO)
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Method to get the size of the stack (optional)
    public int size() {
        return stack.size();
    }
}
