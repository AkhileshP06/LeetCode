import java.util.*;

class CustomStack {
    private int[] stack;
    private int[] inc;
    private int top;

    // Constructor to initialize stack and increment array
    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        inc = new int[maxSize];
        top = -1;
    }
    
    // Push method to add element to stack if not full
    public void push(int x) {
        if (top < stack.length - 1) {
            top++;
            stack[top] = x;
        }
    }
    
    // Pop method to return top element and handle increments
    public int pop() {
        if (top == -1) {
            return -1;
        }
        int res = stack[top] + inc[top]; // Apply the increment lazily
        if (top > 0) {
            inc[top - 1] += inc[top]; // Propagate the increment to the next element down
        }
        inc[top] = 0; // Reset the increment for the current top element
        top--;
        return res;
    }
    
    // Increment method to add value to the bottom k elements
    public void increment(int k, int val) {
        int limit = Math.min(k - 1, top); // Limit to stack size
        if (limit >= 0) {
            inc[limit] += val; // Add increment value to the k-th position from bottom
        }
    }
}
