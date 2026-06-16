class Solution:
    def isPalindrome(self, s: str) -> bool:
        result = True        
        s = re.sub(r'[^a-zA-Z0-9]','',s).lower()
        right = 0
        left = len(s) -1


        while(right < left):
            if s[right] != s[left] :
                result = False
                break

            right+=1
            left-=1
        
        return result
        
        