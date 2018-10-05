
Complexity:

Time: O(max(s))// assumption that length of both the string is equal
Space: O(s)// since we using map to store char in string s and at max if all the char are different then we need
at max O(s) space

def permutation(s, t):
    if len(s) != len(t):
        return False
    map = {}
    
    for ch in s:
        if ch in map:
            map[ch] = map[ch] + 1
        else: 
            map[ch] = 1
        
    for ch in t:
        map[ch] = map[ch] - 1
        if map[ch] < 0:
            return False
    return True

        
res = []
for _ in range(int(input())):
    try:
        str1 = input().strip()
        str2 = input().strip()
        if permutation(str1, str2):
            res.append('YES')
        else:
            res.append('NO')
    except:
        res.append('NO')
print(*res, sep='\n')