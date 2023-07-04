package PY2017_2.Q2;

public interface StackInterface<E> {
    /**
     * Returns the number of element in this stack
     * @return the number of element in this stack
     */
    public int size();

    /**
     * Returns the top element in this stack
     * @return the top element in this stack
     */
    public E peek();

    /**
     * Returns and removes the top element in this stack
     * @return the top element in this stack
     */
    public E pop();

    /**
     * Adds a new element to the top of this stack
     * @param e
     */
    public void push(E e);

    /**
     * Returns true if the stack is empty, false otherwise.
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty();
}