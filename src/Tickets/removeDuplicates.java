package Tickets;


class Node {
    int val;
    Node next;
    Node previous;

    public Node(int val) {
        this.val = val;
    }
}

class LinkedIntegerList {
    private Node first;

    public void add (Integer val) {
        Node listNode = new Node(val);
        Node last = first;
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
        Node last = first;
        while (last != null) {
            System.out.print(last.val + " ");
            last = last.next;
        }
        System.out.println();
    }

    public void removeDuplicates() {
        Node i = first;
        Node j;
        while (i != null){
            j = i.next;
            Integer target = i.val;
            while (j != null) {
                if (j.val == target && j.next == null) {
                    j.previous.next = null;
                }
                else if (j.val == target) {
                    j.previous.next = j.next;
                    j.next.previous = j.previous;
                }
                j = j.next;
            }
            i = i.next;
        }
    }


    public static void main(String[] args) {
        //14, 8, 14, 12, 1, 14, 11, 8, 8, 10, 4, 9, 1, 2, 5, 2, 4, 12, 12
        LinkedIntegerList linkedIntList = new LinkedIntegerList();

        linkedIntList.add(14);
        linkedIntList.add(8);
        linkedIntList.add(14);
        linkedIntList.add(12);
        linkedIntList.add(1);
        linkedIntList.add(14);
        linkedIntList.add(11);
        linkedIntList.add(8);
        linkedIntList.add(8);
        linkedIntList.add(10);
        linkedIntList.add(4);
        linkedIntList.add(9);
        linkedIntList.add(1);
        linkedIntList.add(2);
        linkedIntList.add(5);
        linkedIntList.add(2);
        linkedIntList.add(4);
        linkedIntList.add(12);
        linkedIntList.add(12);

        linkedIntList.print();
        linkedIntList.removeDuplicates();
        linkedIntList.print();
    }
}