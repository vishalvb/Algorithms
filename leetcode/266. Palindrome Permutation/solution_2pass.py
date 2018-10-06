
Complexity

Time: O(N): we are traversing the string twice. in the first pass we create dictionary with frequency of each char
and in second we check how many frequency are 1. O(2N) = O(N)

Space: O(1), at max we are only storing 128 chars in the worst case for any string


from collections import Counter

def permuation_palindrome(string):
    
    map = Counter(string)
    count = 0
    for s in string:
        if map[s] % 2 == 1:
            count = count + 1
    return count <=1
    

test = ['code','aab','carerac']
for string in test:
    print(permuation_palindrome(string))