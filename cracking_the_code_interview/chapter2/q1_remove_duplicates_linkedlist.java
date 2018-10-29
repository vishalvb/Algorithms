
Time: O(n), n = number of nodes in linkedlist
Space: O(n), using hashset to store all the unique nodes. At max it would be n, when all the nodes are unique. 


class GfG
{
    Node removeDuplicates(Node head)
    {
         HashSet<Integer> set = new HashSet<>();
         Node prev = null;
         Node current = head;
         while(current != null){
             if(set.add(current.data)){
                 prev = current;
                 current = current.next;
             }
             else{
                 prev.next = current.next;
                 current = current.next;
             }
         }
         return head;
    }
}