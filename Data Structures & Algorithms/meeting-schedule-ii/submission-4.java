/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if(intervals.isEmpty()){
            return 0;
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        Collections.sort(intervals , (a,b)->(a.start)-(b.start));
        Interval current = intervals.get(0); 
        minHeap.offer(current.end);
        for (int i=1;i<intervals.size();i++){
            Interval next = intervals.get(i);
            int lastEnd = minHeap.peek();
            if(!minHeap.isEmpty() && next.start >= lastEnd){
                minHeap.poll();
            } 
            minHeap.offer(next.end);
            current = next;
        }
        return minHeap.size();
    }
}
