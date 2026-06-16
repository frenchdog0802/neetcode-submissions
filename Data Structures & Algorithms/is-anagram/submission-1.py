class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        if len(s) != len(t):
            return False
        
        # sort two strings
        sorted_s = sorted(s)
        sorted_t = sorted(t)
        result = True
        # for loop each string and compare each word 
        i = 0
        for str_s in sorted_s:
            if sorted_s[i] != sorted_t[i]:
                result = False
            i = i+1

                    
        # return reult 
        return result