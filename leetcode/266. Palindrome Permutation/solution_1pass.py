
Complexity

Time: O(N): we are traversing the string only once. we keep track of frequency of each char. if frquency % 2 == 1, then
we increment the count else we decrement the count. at max we should only have 1 char with frequency of 1. 

Space: O(1), at max we are only storing 128 chars in the worst case for any string

def permuation_palindrome(string):
    map = dict()
    count = 0
    for s in string:
        if s in map:
            map[s] = map[s] + 1
        else:
            map[s] = 1
        if map[s] % 2 == 1:
            count = count + 1
        else:
            count = count - 1
    return count <=1
    

test = ['code','aab','carerac']
for string in test:
    print(permuation_palindrome(string))