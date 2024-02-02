package Test;

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

    public void removeAll(LinkIntList l2) {
        Node11 curr1 = first;
        Node11 curr2 = l2.first;
        while (curr1 != null && curr2 != null) {

            if (curr1.val == curr2.val) {
                if (curr1 == first) {
                    first = curr1.next;
                    curr1.next.previous = null;
                }
                else {
                    curr1.previous.next = curr1.next;
                }
                curr1 = curr1.next;
            }
            else {
                if (curr1.val > curr2.val) {
                    curr2 = curr2.next;
                }
                else {
                    curr1 = curr1.next;
                }
            }
        }
    }

    public static void main(String[] args) {
        LinkIntList linkedIntList1 = new LinkIntList();
        LinkIntList linkedIntList2 = new LinkIntList();
        linkedIntList1.add(1);
        linkedIntList1.add(3);
        linkedIntList1.add(3);
        linkedIntList1.add(3);
        linkedIntList1.add(3);
        linkedIntList1.add(5);
        linkedIntList1.add(7);
        linkedIntList2.add(1);
        linkedIntList2.add(1);
        linkedIntList2.add(1);
        linkedIntList2.add(1);
        linkedIntList2.add(2);
        linkedIntList2.add(3);
        linkedIntList2.add(4);
        linkedIntList2.add(5);

        linkedIntList1.removeAll(linkedIntList2);
        linkedIntList1.print();
        linkedIntList2.print();
    }
}