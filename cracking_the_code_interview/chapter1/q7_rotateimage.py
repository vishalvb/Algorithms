
to flip the matrix upside down and then zip to transpose it. 
It assigns the result back into A, so it's "in-place" in a sense and the OJ accepts it as such, though some people might not.

class Solution(object):
    def rotate(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: void Do not return anything, modify matrix in-place instead.
        """
        matrix[:] = zip(*matrix[::-1])