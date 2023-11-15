package week_10.assignments;

public class Queue_10_10 {
    private int[] elements;
    private int size;

    public static final int CAPACITY = 8;

    public Queue_10_10() {
        this(CAPACITY);
    }

    public Queue_10_10(int capacity) {
        this.elements = new int[capacity];

    }

    public int[] getElements() {
        return elements;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return CAPACITY;
    }

    public void enque(int v) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = v;
    }

    public int deque() {
        int number = elements[0];
        for (int i = 0; i < getSize() - 1; i++) {
            elements[i] = elements[i + 1];

        }
        size--;
        return number;
    }

    public boolean empty() {
        return size == 0;
    }


}
