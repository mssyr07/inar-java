package week_10.assignments;

public class StackOfIntegers_10_05 {
    private int[] elements;
    private int size;

    public static final int CAPACITY = 16;

    public StackOfIntegers_10_05() {
        this(CAPACITY);
    }

    public StackOfIntegers_10_05(int capacity) {
        elements = new int[capacity];
    }

    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    public int pop() {
        return elements[--size];
    }

    public int peek() {
        return elements[size - 1];

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

}
