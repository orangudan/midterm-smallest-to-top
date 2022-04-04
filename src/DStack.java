public class DStack {
    ListNode head;


    public boolean isEmpty() {
        return head == null;
    }


    public void push(double d) {
        ListNode oldHead = head;
        head = new ListNode(d);
        head.next = oldHead;
    }


    public double pop() {
        double returnValue = head.val;
        head = head.next;
        return returnValue;
    }


    public double peek() {
        return head.val;
    }

    @Override
    public String toString() {
        String returnVal = "{";
        
        ListNode currentNode = head;

        while (currentNode != null) {
            returnVal += currentNode.val;
            if (currentNode.next != null) {
                returnVal += ", ";
            }

            currentNode = currentNode.next;
        }

        returnVal += "}";

        return returnVal;
    }

    
    
}
