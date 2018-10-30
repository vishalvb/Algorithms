

Time: O(n), n = number of nodes in the linkedlist. In the worst case if n = 1, which means we want to get the last node
then, we need to iterated over the linkedlist completely. 
Space: O(1), We are using constant space. We are using 2 pointers which is irrespective of size. 


class GfG
{
    int getNthFromLast(Node head, int n)
    {
	// Your code here	
	Node p1 = head;
	Node p2 =  head;
	for(int i = 0; i < n; ++i){
	    if (p1 == null){
	        return -1;
	    }
	    p1 = p1.next;
	}
	while(p1 != null){
	    p1 = p1.next;
	    p2 = p2.next;
	}
	return p2.data;
    }
}
	