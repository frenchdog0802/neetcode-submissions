# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:

        def isSameSturct(tree1, tree2):
            if tree1 is None and tree2 is None:
                return True
            elif tree1 is None and tree2 is not None or tree1 is not None and tree2 is None: 
                return False

            print(tree1.val)
            print(tree2.val)

            if tree1.val != tree2.val:
                return False

            left = isSameSturct(tree1.left,tree2.left)
            right = isSameSturct(tree1.right,tree2.right)

            return left and right

        return isSameSturct(p,q)
            
        