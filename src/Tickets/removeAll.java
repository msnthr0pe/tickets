package Tickets;

class ListNode {
    int val;
    ListNode next;
    ListNode previous;

    public ListNode(int val) {
        this.val = val;
    }
}

class LinkedIntList {
    private ListNode first;

    public void add (Integer val) {
        ListNode listNode = new ListNode(val);
        ListNode last = first;
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
        ListNode last = first;
        while (last != null) {
            System.out.print(last.val + " ");
            last = last.next;
        }
        System.out.println();
    }

    public void removeAll(LinkedIntList l2) {
        ListNode curr1 = first;
        ListNode curr2 = l2.first;
        while (curr1 != null && curr2 != null) {

            if (curr1.val == curr2.val) {
                if (curr1 == first) {
                    first = curr1.next;
                    curr1.next.previous = null;
                }
                else {
                    curr1.previous.next = curr1.next;
                    curr1.next.previous = curr1.previous;
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
        LinkedIntList linkedIntList1 = new LinkedIntList();
        LinkedIntList linkedIntList2 = new LinkedIntList();
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

        linkedIntList1.print();
        linkedIntList2.print();
        linkedIntList1.removeAll(linkedIntList2);
        linkedIntList1.print();
    }
}