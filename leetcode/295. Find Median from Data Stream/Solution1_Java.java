Time complexity: O(log(n))+O(1)≈O(log(n)).

Inserting a number takes O(log(n)) time for a standard multiset scheme. 4
Finding the mean takes constant O(1) time since the median elements are directly accessible from the two pointers.
Space complexity: O(n) linear space to hold input in container.


class MedianFinder {
    PriorityQueue<Integer> lowers, highers;
    /** initialize your data structure here. */
    public MedianFinder() {
        lowers = new PriorityQueue<>();
        highers = new PriorityQueue<>(Collections.reverseOrder());
        
    }
    
    public void addNum(int num) {
        highers.add(num);
        lowers.add(highers.poll());
        if(highers.size() < lowers.size()){
            highers.add(lowers.poll());
        }
            
        
    }
    
    public double findMedian() {
        double median = 0.0;
        if(highers.size() == lowers.size()){
            median = (highers.peek() + lowers.peek()) / 2.0;
        }
        else{
            median = highers.peek();
        }
        return median;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */