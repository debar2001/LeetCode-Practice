class Solution:
    def isPossible(self, target: List[int]) -> bool:
        target=[-i for i in target]
        heapq.heapify(target)
        while True:
            top=heapq.heappop(target)
            s=sum(target)
            if top==-1 or s==-1:return True
            if top>=s or s==0 or top%s==0:return False
            heapq.heappush(target,top%s) 