package edu.kis.vh.nursery.list;

/**
 * Reprezentuje listę jednokierunkową przechowującą liczby całkowite.
 * Umożliwia operacje typowe dla stosu: push, pop, top, sprawdzenie pustej listy.
 */
public class IntLinkedList {

    /**
     * Stała oznaczająca pustą listę lub brak wartości.
     */
    public static final int LIST_EMPTY = -1;

    private Node last;
    private int i;

    /**
     * Dodaje nowy element na koniec listy.
     * @param i wartość do dodania
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Sprawdza, czy lista jest pusta.
     * @return true jeśli lista jest pusta, false w przeciwnym razie
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Sprawdza, czy lista jest pełna.
     * W tej implementacji zawsze zwraca false.
     * @return false
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Zwraca wartość ostatniego elementu listy bez jego usuwania.
     * @return wartość ostatniego elementu lub LIST_EMPTY jeśli lista jest pusta
     */
    public int top() {
        if (isEmpty())
            return LIST_EMPTY;
        return last.getValue();
    }

    /**
     * Usuwa i zwraca ostatni element listy.
     * @return wartość usuniętego elementu lub LIST_EMPTY jeśli lista jest pusta
     */
    public int pop() {
        if (isEmpty())
            return LIST_EMPTY;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    /**
     * Zwraca wartość pola i.
     * @return wartość pola i
     */
    public int getI() {
        return i;
    }
}
