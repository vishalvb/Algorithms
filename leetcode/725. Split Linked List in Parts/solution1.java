

Time: O(N+k), where NN is the number of nodes in the given list. 
If k is large, it could still require creating many new empty lists.
Space: O(k), we are initializing the final array with k elements. 


class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] parts = new ListNode[k];
        int length = 0;
        for(ListNode node = root; node != null; node = node.next){
            ++length;
        }
        int partSize = length/k;
        int remainder = length % k;
        ListNode node = root;
        for(int i = 0; i < k && node != null ; ++i,--remainder){
            parts[i] = node;
            ListNode prev = node;
            for (int j = 0 ; j < partSize + (remainder >0 ? 1 : 0); ++j){
                prev = node;
                node = node.next;
            }
            prev.next = null;
        }
        return parts;
    }
}