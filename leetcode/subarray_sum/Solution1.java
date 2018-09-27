Time complexity of method 2 looks more than O(n), but if we take a closer look at the program, 
then we can figure out the time complexity is O(n). 
We can prove it by counting the number of operations performed on every element of arr[] in worst case. 
There are at most 2 operations performed on every element: 
(a) the element is added to the curr_sum (b) the element is subtracted from curr_sum. 
So the upper bound on number of operations is 2n which is O(n).


class SubarraySum
{
    /* Returns true if the there is a subarray of arr[] with sum equal to
       'sum' otherwise returns false.  Also, prints the result */
    int subArraySum(int arr[], int n, int sum) 
    {
        int curr_sum = arr[0], start = 0, i;
 
        // Pick a starting point
        for (i = 1; i <= n; i++) 
        {
            // If curr_sum exceeds the sum, then remove the starting elements
            while (curr_sum > sum && start < i-1)
            {
                curr_sum = curr_sum - arr[start];
                start++;
            }
             
            // If curr_sum becomes equal to sum, then return true
            if (curr_sum == sum) 
            {
                int p = i-1;
                System.out.println("Sum found between indexes " + start
                        + " and " + p);
                return 1;
            }
             
            // Add this element to curr_sum
            if (i < n)
            curr_sum = curr_sum + arr[i];
             
        }
 
        System.out.println("No subarray found");
        return 0;
    }
 
    public static void main(String[] args) 
    {
        SubarraySum arraysum = new SubarraySum();
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
        int n = arr.length;
        int sum = 23;
        arraysum.subArraySum(arr, n, sum);
    }
}
 