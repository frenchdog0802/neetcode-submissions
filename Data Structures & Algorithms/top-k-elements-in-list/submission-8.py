class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        res = defaultdict()
        
        for n in nums :
            if n in res:
                res[n]+= 1
            else:
                res[n]=1
        
    
        a = list(res.values())
        sorted_a = sorted(a) 
        b = sorted_a[::-1]
        result = []
        for i in range(k):
            keys = [k for k, v in res.items() if v == b[i]]
            print(keys)
            result +=keys

        return list(set(result))

