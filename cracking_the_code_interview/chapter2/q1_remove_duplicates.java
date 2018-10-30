
Time: O(n^2), for each of the element of the list, we are iterating over the rest of the list after that element,
so it's n.(n-1) + (n-1)*(n-2) + ... + 1.1 = c.n^2(dominates) 
Space: O(1)


class GfG
{
    Node removeDuplicates(Node head)
    {
         Node current = head;
         while(current != null){
            Node runner = current;
            while(runner.next != null){
                if (current.data == runner.next.data){
                    runner.next = runner.next.next;
                }
                else{
                    runner = runner.next;
                }
            }
            current = current.next;
         }
         return head;
    }
}
