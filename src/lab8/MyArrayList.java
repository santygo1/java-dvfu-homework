package lab8;

import java.util.NoSuchElementException;

/**
 * @author Danil on 28.11.2022
 * @project DVFUHomework
 */
public class MyArrayList<T extends Comparable<T>> {
    private static final int CAPACITY = 10; // max capacity of the array
    private final Object[] array;

    MyArrayList() {
        array = new Object[CAPACITY];
    }

    /**
     * Adding new element in the array
     *
     * @param elem element for adding
     * @throws OutOfArrayBoundsException if trying to add element in full array
     */
    public void addLast(T elem) throws OutOfArrayBoundsException {
        int addedElemIndex = getLastElementIndex() + 1;
        if (isIndexInBounds(addedElemIndex))
            array[addedElemIndex] = elem;
        else
            throw new OutOfArrayBoundsException("Array is full, you can't add this elem");
    }

    /**
     * Removing last elem from array if it exists
     *
     * @throws OutOfArrayBoundsException if trying to delete from empty array
     */
    public void removeLast() throws OutOfArrayBoundsException {
        if (isEmpty()) throw new OutOfArrayBoundsException("You can't nothing from this array, it's empty.");

        int removeElemIndex = getLastElementIndex();
        array[removeElemIndex] = null;
    }

    /**
     * Getting index of the last array's element
     *
     * @return {@code -1} - if nothing element is in the array, {@code index of the last elem} - otherwise
     */
    private int getLastElementIndex() {
        if (isEmpty()) return -1;

        int currentElementIndex = 0;

        while (isIndexInBounds(currentElementIndex + 1) && array[currentElementIndex + 1] != null) {
            currentElementIndex++;
        }

        return currentElementIndex;
    }

    /**
     * Checking array for empty state
     *
     * @return {@code true} - if array is empty, {@code false} - otherwise
     */
    public boolean isEmpty() {
        return array[0] == null;
    }

    /**
     * Checking the index for belonging to its boundaries
     */
    private boolean isIndexInBounds(int index) {
        return (0 <= index) && (index < CAPACITY);
    }

    @Override
    public String toString() {
        StringBuilder arrayStringBuilder = new StringBuilder();
        arrayStringBuilder.append('[');

        int currentElemIndex = 0;
        while (isIndexInBounds(currentElemIndex) && array[currentElemIndex] != null) {
            arrayStringBuilder.append(array[currentElemIndex]);

            if (isIndexInBounds(currentElemIndex + 1) && array[currentElemIndex + 1] != null)
                arrayStringBuilder.append(',');

            currentElemIndex++;
        }

        arrayStringBuilder.append(']');

        return arrayStringBuilder.toString();
    }

    /**
     * Getting element from array by index
     *
     * @param index element's index
     * @return element from array by index
     * @throws OutOfArrayBoundsException if the index is out of bounds of array
     * @throws NoSuchElementException    if element doesn't exist.
     */
    public T get(int index) throws OutOfArrayBoundsException, NoSuchElementException {
        if (!isIndexInBounds(index)) throw new OutOfArrayBoundsException("This index is out of bounds of the array.");
        if (array[index] == null) throw new NoSuchElementException("Element by this index isn't exists.");

        @SuppressWarnings("uncheked")
        T result = (T) array[index];

        return result;
    }

    public static class OutOfArrayBoundsException extends IndexOutOfBoundsException {
        /**
         * Default constructor
         */
        public OutOfArrayBoundsException() {
        }

        /**
         * Exception with message
         *
         * @param msg - message for printing in stack trace
         */
        public OutOfArrayBoundsException(String msg) {
            super(msg);
        }
    }
}
