Complexity

Time: O(N)
Space: O(N)


class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        words = s.split(" ")
        reverse = ''
        for word in words:
            if len(word) > 0:
                if len(reverse) != 0:
                    reverse = ' ' + reverse
                reverse = word + reverse
        return reverse