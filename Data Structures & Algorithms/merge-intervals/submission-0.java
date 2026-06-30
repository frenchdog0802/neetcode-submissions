class Solution {
    public int[][] merge(int[][] intervals) {

        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[] current = intervals[0];
        for (int i=1;i<intervals.length;i++){
            int[] next = intervals[i];
            int nextStart = next[0];
            int nextEnd = next[1];
            int currentStart = current[0];
            int currentEnd = current[1];
            if(currentEnd>=nextStart){
                // combine
                current[1] = Math.max(currentEnd , nextEnd);
            } else {
                list.add(current);
                current= next;
            }
        }
        list.add(current);
        return list.toArray(new int[0][]);
    }
}
