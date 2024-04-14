class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){this.val = val;}
    ListNode(int val, ListNode next){
        this.val= val;
        this.next = next;
    }
}
class NewlyLinkedList {
    ListNode head;
    ListNode tail;

    public void add(int val){
        ListNode newNode = new ListNode(val,head);
        head = newNode;
    }
    public void push(int val, int... values) {
        ListNode newNode = new ListNode(val,null);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        for (int value : values) {
            ListNode newNodeArgs = new ListNode(value,null);
            tail.next = newNodeArgs;
            tail = newNodeArgs;
        }
    }
    public void pop(){
        if (head==null)return;
        ListNode currentNode = head;
        head = head.next;
    }

    public void dq(){
        if (head==null||head.next==null)return;
        ListNode currentNode = head;
        ListNode prev = null;
        while(currentNode.next != null){
            prev = currentNode;
            currentNode= currentNode.next;
        }
        prev.next = null;
        tail = prev;

    }
    public void sortList() {
        if (head == null || head.next == null) {
            return;
        }

        ListNode sortedHead = null; // Initialize the head of the sorted list
        ListNode current = head;
        // 542,2,442,500
        while (current != null) {
            ListNode next = current.next; // Store the next node to avoid losing it
            // Insert current node into the sorted list
            sortedHead = insertIntoSorted(sortedHead, current);

            current = next; // Move to the next node in the original list

        }

        head = sortedHead; // Update the head of the original list
    }

    // Helper method to insert a node into a sorted list
    private ListNode insertIntoSorted(ListNode sortedHead, ListNode newNode) {
        if (sortedHead == null || newNode.val <= sortedHead.val) {
          //542,2,442,500
            // Insert newNode at the beginning of the sorted list
            newNode.next = sortedHead;

            return newNode;
        }

        ListNode current = sortedHead;
        while (current.next != null && current.next.val < newNode.val) {
            current = current.next;
        }

        // Insert newNode after current
        newNode.next = current.next;
        current.next = newNode;

        return sortedHead;
    }

    public void printList(){
        if (head == null) return;
        ListNode node = head;
        while(node != null){
            System.out.print(node.val+"->");
            node = node.next;
        }
        System.out.println();
    }

    public int size(){
        int count =0;
        ListNode current = head;
        while(current !=null){
            count++;
            current = current.next;
        }
        return count;
    }

}

public class MergeTwoSortedList {
    public NewlyLinkedList mergeTwoLists(NewlyLinkedList list1, NewlyLinkedList list2) {
        NewlyLinkedList mergedList = new NewlyLinkedList();
        ListNode l1 = list1.head;
        ListNode l2 = list2.head;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                mergedList.push(l1.val);
                l1 = l1.next;
            } else {
                mergedList.push(l2.val);
                l2 = l2.next;
            }
        }

        while (l1 != null) {
            mergedList.push(l1.val);
            l1 = l1.next;
        }

        while(l2!=null)  {
            mergedList.push(l2.val);
            l2 = l2.next;
        }

        return mergedList;
    }
}

class Test{
    public static void main(String[] args) {
        MergeTwoSortedList solution = new MergeTwoSortedList();
        NewlyLinkedList list1 = new NewlyLinkedList();
        NewlyLinkedList list2 = new NewlyLinkedList();
        NewlyLinkedList mergedList;
        list1.push(2,4,1);
        list2.push(3,1,4);
        System.out.println("Before sorting");
        list1.printList();
        list2.printList();
        list1.sortList();
        list2.sortList();
        System.out.println("After sorting");
        list1.printList();
        list2.printList();
        mergedList = solution.mergeTwoLists(list1,list2);
        mergedList.printList();
//        Solution see = new Solution();
//        ListNode chk;
//        ListNode l1 = new ListNode(1);
//        l1.next= new ListNode(2);
//        l1.next.next = new ListNode(3);
//
//        ListNode l2 = new ListNode(1);
//        l2.next = new ListNode(3);
//        l2.next.next =new ListNode(4);
//        chk = see.mergeTwoLists(l1,l2);
//
//        while(chk!=null){
//            System.out.print(chk.val+"->");
//            chk = chk.next;
//        }

    }
}
//class Solution {
//public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//    ListNode dummy = new ListNode(-1);
//    ListNode current = dummy;
//
//    while(list1 != null && list2 != null){
//        if(list1.val < list2.val){
//            current.next = list1;
//            list1 = list1.next;
//        }
//        else{
//            current.next = list2;
//            list2 = list2.next;
//        }
//        current = current.next;
//    }
//    if (list1 != null) {
//        current.next = list1;
//    } else {
//        current.next = list2;
//    }
//
//    return dummy.next;
//
//}
//}
