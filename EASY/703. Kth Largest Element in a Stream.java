public class 703. Kth Largest Element in a Stream {

    QUESTION LINK: -

    https://leetcode.com/problems/kth-largest-element-in-a-stream/description/?envType=daily-question&envId=2024-08-12

import java.util.PriorityQueue;

}

SOLTUION :-

class KthLargest {
    private static int k;
    private PriorityQueue<Integer> heap;

public KthLargest(int k, int[] nums) {
    this.k = k;
    heap = new PriorityQueue<>();

    for(int num: nums){
        heap.offer(num);
    }
    while(heap.size() > k)
    {
        heap.poll();
    }
}

public int add(int val) {
    heap.offer(val);
    if(heap.size() > k)
    {
        heap.poll();
    }
    return heap.peek();
}
}


// PYTHON SOLUTION: -

class KthLargest:
    def __init__(self, k: int, nums: List[int]):
        self.min_heap = []
        self.k = k

        for num in nums:
            self.add(num)

    def add(self, val: int) -> int:
        # Add to our min_heap if we haven't processed k elements yet
        # or if val is greater than the top element (the k-th largest)
        if len(self.min_heap) < self.k or self.min_heap[0] < val:
            heapq.heappush(self.min_heap, val)
            if len(self.min_heap) > self.k:
                heapq.heappop(self.min_heap)
        return self.min_heap[0]
