# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        self.res = True
        
        def calculateHight(root):
            
            if root is None:
                return 0
            left = calculateHight(root.left)
            right = calculateHight(root.right)

            if right-left >= 2 or left-right>=2:
                self.res  = False

            return 1 + max(left,right)

        calculateHight(root)

        return self.res

        