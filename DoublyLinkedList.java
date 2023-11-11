class DoublyLinkedList {
    private Node head;
    private Node tail;

    public void add(Minion data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void delete(Minion data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    }
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                    if (tail != null) {
                        tail.next = null;
                    }
                }
                return;
            }
            current = current.next;
        }
    }

    public void edit(Minion oldData, Minion newData) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(oldData)) {
                current.data = newData;
                return;
            }
            current = current.next;
        }
        add(newData);
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public int countObjects() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void addAtIndex(int index, Minion data) {
        Node newNode = new Node(data);
        if (index < 0 || index > countObjects()) {
            System.out.println("Некорректный индекс для вставки.");
            return;
        }

        if (index == 0) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                if (current == null) {
                    System.out.println("Индекс выходит за пределы списка.");
                    return;
                }
                current = current.next;
            }

            if (current == null) {
                System.out.println("Индекс выходит за пределы списка.");
                return;
            }

            newNode.next = current.next;
            newNode.prev = current;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
        }
    }

    public void deleteByIndex(int index) {
        if (index < 1) {
            System.out.println("Некорректный номер элемента для удаления.");
            return;
        }

        Node current = head;
        for (int i = 1; i < index && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Некорректный номер элемента для удаления.");
            return;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
            if (head != null) {
                head.prev = null;
            }
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev;
            if (tail != null) {
                tail.next = null;
            }
        }
    }

    public void displayWithNumbers() {
        Node current = head;
        int index = 1;
        while (current != null) {
            System.out.println(index + ": " + current.data);
            current = current.next;
            index++;
        }
    }
}
