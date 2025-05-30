package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_SIZE = 12;
    public static final int INIT_VAL = -1;
    public static final int DEFAULT_RETURN_VALUE = -1;

    private final int[] numbers = new int[MAX_SIZE];

    public int getTotal() {
        return total;
    }

    private int total = INIT_VAL;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == INIT_VAL;
    }

    public boolean isFull() {
        return total == MAX_SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return numbers[total--];
    }

}
