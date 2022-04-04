public class App {
    public static void main(String[] args) throws Exception {
        DStack list = new DStack();
        list.push(1);
        list.push(7);
        list.push(9);
        list.push(3);
        System.out.println(list);
        moveSmallestToTop(list);
        System.out.println(list);
    }

    /**
     * Moves the smallest element in the given stack to the top of the stack
     * @param stack
     */
    public static void moveSmallestToTop(DStack stack) {
        if (stack.head == null) {
            return;
        }
        
        ListNode currentNode = stack.head;

        //Find smallest value
        ListNode smallestNode = stack.head;
        while (currentNode != null) {
            if (currentNode.val < smallestNode.val) {
                smallestNode = currentNode;
            }

            currentNode = currentNode.next;
        }

        currentNode = stack.head;
        DStack tempStack = new DStack();
        while (currentNode != null) {
            if (stack.peek() == smallestNode.val) {
                stack.pop();
            } else {
                tempStack.push(stack.pop());
            }
            currentNode = currentNode.next;
        }

        currentNode = tempStack.head;
        while (currentNode != null) {
            stack.push(tempStack.pop());
            currentNode = currentNode.next;
        }

        stack.push(smallestNode.val);
        return;
    }
}
