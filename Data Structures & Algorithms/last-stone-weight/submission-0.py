class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        heap=[]

        for stone in stones:
            heapq.heappush(heap, -stone)

        while len(heap) > 1 : 
            large1=-heapq.heappop(heap)
            large2=-heapq.heappop(heap)
            new_num = large1-large2
            
            heapq.heappush(heap, -new_num)


        return -heap[0]