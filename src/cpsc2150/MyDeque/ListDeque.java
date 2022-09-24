public class ListDeque implements IDeque{
    // this time store the deque in a list
    // myQ.get(0) is the front of the deque
    private List<Double> myQ;
    // complete the class
    public ListDeque {
        // Creating a new list
        List<Double> myQ = new LinkedList();

    }

    /** Adds x to the end of the deque
     *
     * @param x     double to be added to the end of the deque
     * @pre x!= NULL && queue.length() != 100
     * @post x is at end of deque
     */
    public void enqueue(Double x) {

        myQ.addLast(x);

    }

    /** removes and returns the double at the front of the deque
     *
     * @return double at front of deque
     * @pre deque != NULL and first value in deque is a double
     * @post enqueue = first double in deque and deque = #deque
     */
    public Double dequeue() {

        myQ.removeFirst();

        return myQ.getFirst();
    }

    /** Adds x to the front of the deque
     *
     * @param x     double to be added to the front of the deque
     * @pre x != NULL && queue.length() != 100
     * @post x is at beginning of deque
     */
    public void inject(Double x) {

        myQ.addFirst(x);

     }

    /**removes and returns the double at the end of the deque
     *
     * @return double at end of deque
     * @pre deque != NULL and last value in deque is a double
     * @post inject = last double in deque and deque = #deque
     */
    public Double removeLast() {

        myQ.removeLast();

        return myQ.getLast();
    }

    /**returns the number of doubles in the deque
     *
     * @return number of doubles in deque
     * @pre deque != null
     * @post length = size of deque and deque = deque
     */
    public int length() {

        return myQ.size();
     }

    /**clears the entire deque
     *
     * @pre deque != NULL
     * @post deque = NULL
     */
    public void clear() {

      myQ.clear();
    }
}
