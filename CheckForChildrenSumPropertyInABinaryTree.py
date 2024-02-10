#User function Template for python3

'''
# Node Class:
class Node:
    def init(self,val):
        self.data = val
        self.left = None
        self.right = None
'''

class Solution:
    #Function to check whether all nodes of a tree have the value 
    #equal to the sum of their child nodes.
    def isSumProperty(self, root):
        # code here
        if root:
            if not root.left and not root.right:
                return 1
            s = root.left.data if root.left else 0
            s+= root.right.data if root.right else 0
            
            if s!=root.data:
                return 0
            if self.isSumProperty(root.left) and self.isSumProperty(root.right):
                return 1
            else:
                return 0
            return 1
