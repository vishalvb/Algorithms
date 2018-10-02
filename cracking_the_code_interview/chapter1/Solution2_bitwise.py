

Time Complexity
Time: O(N). N = number of char in string as we visit each char once only
Space: O(N). In worst case we need to store all the char in a string. 



class UniqueCharInString():
    
    def __init__(self, string):
        self.char_set = set()
        self.s = string
        
    def isUnique(self):
        
        
        #[for ch in self.s]
        # if not self.s:
        #     return False
        # for ch in self.s:
        #     if ch in self.char_set:
        #         return False
        #     else:
        #         self.char_set.add(ch)
        if not self.s:
            return False
        checker = 0
        for ch in self.s:
            value = ord(ch) - ord('a')
            if (checker & (1 << value)) > 0:
                return False
            checker = checker | (1 << value)
        
        
        return True

if __name__ == '__main__':
    strings = ['abc','abbc','cc','','cfdsa']
    for string in strings:
        print(UniqueCharInString(string).isUnique())
    
