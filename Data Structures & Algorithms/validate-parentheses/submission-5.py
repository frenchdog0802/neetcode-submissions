class Solution:
    def isValid(self, s: str) -> bool:
        matcha = {"}":"{",")":"(","]":"["}
        result = []

        for word in s :
            if word in matcha:
                if result and result[-1] == matcha[word]:
                    result.pop()
                else :
                    return False
            else :
                result.append(word)

        if result:
            return False
        else :
            return True

        