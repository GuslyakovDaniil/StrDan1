class Node {
    public Minion data;
    public Node prev;
    public Node next;

    public Node(Minion data) {
        this.data = data;
    }

    public Minion getData() {
        return data;
    }

    public void setData(Minion data) {
        this.data = data;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
