class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count =0;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int[] current = intervals[0];
        for (int i=1;i<intervals.length;i++){
            int[] next = intervals[i];
            if(current[1] > next[0]){
                count++;
            } else {
                current=next;
            }
        }
        return count;
    }
}
