# your task is to complete this function
# Function should return an integer value

'''
class node:
    def __init__(self):
        self.data = None
        self.next = None
'''

class Solution:
    def binaryToDecimal(self,n):
        return int(n,2)
    def decimalValue(self, head):
        MOD=10**9+7
        # Code here
        s=''
        while head:
            s+=str(head.data)
            head=head.next
        
        return self.binaryToDecimal(s)%MOD
