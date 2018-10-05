Time Complexity
Time: O(N). N = number of char in string as we visit each char once only
Space: O(N). In worst case we need to store all the char in a string. 

class UniqueCharInString():
    
    def __init__(self, string):
        self.char_set = set()
        self.s = string
        
    def isUnique(self):
        if not self.s:
            return False
        for ch in self.s:
            if ch in self.char_set:
                return False
            else:
                self.char_set.add(ch)
        
        return True

if __name__ == '__main__':
    a = UniqueCharInString('abc')
    print(a.isUnique())
    b = UniqueCharInString('abcc')
    print(b.isUnique())
    c = UniqueCharInString('')
    print(c.isUnique())
    
