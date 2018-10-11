# Python program to print level order traversal using Queue 

# A node structure 
class Node: 
	# A utility function to create a new node 
	def __init__(self ,key): 
		self.data = key 
		self.left = None
		self.right = None

# Iterative Method to print the height of binary tree 
def printLevelOrder(root): 
    if root is None:
        return
    
    q = []
    q.append(root)
    
    while len(q) > 0:
        node = q.pop()
        print(node.data),
        if node.left is not None:
            q.append(node.left)
        if node.right is not None:
            q.append(node.right)
        
    
#Driver Program to test above function 
root = Node(1) 
root.left = Node(3) 
#root.right = Node(2) 
root.left.left = Node(4) 
root.left.right = Node(5) 

print "Level Order Traversal of binary tree is -"
printLevelOrder(root) 
#This code is contributed by Nikhil Kumar Singh(nickzuck_007) 
