class SinglyLinkedList
{
    
    ListNode head;// Head node to hold the list
    
    //Given a ListNode , print all the elements it holds
    public void display(ListNode head)
    {
        if(head ==null)
        {
            return;
        }
        ListNode current=head;
        //loop each element till end of the list
        // last node points to null
        while(current!=null)
        {
            // print current element's data
            System.out.print(current.data+" -->");
            current = current.next;
        }
         System.out.print(current);// here current will be null
    }
    // it contains a static inner class ListNode
    static class ListNode
    {
        int data;
        ListNode next;
        
        ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static void main()
    {
        // 10 --> 8 --> 1 --> 11 --> null
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(11);
        // Attach them together to form a list
        head.next=second;//10-->8
        second.next=third;//10-->8 --> 1
        third.next=fourth;//10-->8 --> 1 --> 11-->null
        SinglyLinkedList singlyLinkedList=new SinglyLinkedList();
        singlyLinkedList.display(head);
        
    }
}