package Tickets;

class Node11 {
    int val;
    Node11 next;
    Node11 previous;

    public Node11(int val) {
        this.val = val;
    }
}

class LinkIntList {
    private Node11 first;

    public void add (Integer val) {
        Node11 listNode = new Node11(val);
        Node11 last = first;
        if (first == null) {
            first = listNode;
        }
        else {
            while (last.next != null) {
                last = last.next;
            }
            last.next = listNode;
            listNode.previous = last;
        }
    }
    public void print() {
        Node11 last = first;
        while (last != null) {
            System.out.print(last.val + " ");
            last = last.next;
        }
        System.out.println();
    }

    public void firstLast() {
        if (first != null && first.next != null) {
            Node11 curr = first;

            while (curr.next != null) {
                curr = curr.next;
            }
            Node11 temp = first;
            curr.previous.next = temp;
            temp.previous = curr.previous;
            curr.previous = null;
            first = curr;
            curr.next = temp.next;
            curr.next.previous = curr;
            temp.next = null;
        }
    }


    public static void main(String[] args) {
        LinkIntList linkedIntList = new LinkIntList();
        linkedIntList.add(18);
        linkedIntList.add(4);
        linkedIntList.add(27);
        linkedIntList.add(9);
        linkedIntList.add(54);
        linkedIntList.add(5);
        linkedIntList.add(63);

        linkedIntList.print();
        linkedIntList.firstLast();
        linkedIntList.print();
    }
}