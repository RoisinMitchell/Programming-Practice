class MyLinkedList {

    Node head;

    public MyLinkedList() {
        this.head = null;
    }

    public int get(int index) {
        Node node = retrieveNodeAtIndex(index);
        
        if(node != null){
            return node.getValue();
        }else{
            // If the node doesnt exist return -1
            return -1;
        }
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.setNext(head);
        this.head = newNode;
    }

    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
            return;
        }

        Node currentNode = head;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(new Node(val));
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }
        
        // Retrieve the node just before passed index
        Node previousNode = retrieveNodeAtIndex(index - 1);
        if (previousNode != null) {
            Node newNode = new Node(val);
            newNode.setNext(previousNode.getNext());
            previousNode.setNext(newNode);
        }
    }

    public void deleteAtIndex(int index) {
        if (index == 0 && head != null) {
            head = head.getNext();
            return;
        }

        Node previousNode = retrieveNodeAtIndex(index - 1);
        if (previousNode != null && previousNode.getNext() != null) {
            // Setting the previousNodes next value to the node that sits after the one being deleted
            previousNode.setNext(previousNode.getNext().getNext());
        }
    }

    private Node retrieveNodeAtIndex(int index) {
        Node currentNode = head;
        for (int i = 0; i < index && currentNode != null; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    private class Node {
        int value;
        Node next = null;

        Node(int x) {
            this.value = x;
        }

        public void setNext(Node nextNode) {
            this.next = nextNode;
        }

        public Node getNext() {
            return this.next;
        }

        public int getValue() {
            return this.value;
        }
    }
}