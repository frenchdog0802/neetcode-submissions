class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }

        for (int[] edge : edges){
            list.get(edge[0]).add(edge[1]);
            list.get(edge[1]).add(edge[0]);
        }

        Set<Integer> visited = new HashSet<>();
        Integer result =0;
        for (int i=0;i<list.size();i++){
            if(!visited.contains(i)){
                dfs(i , list , visited);
                result++;
            }
        }
        return result;
    }

    public void dfs(int node , List<List<Integer>> list , Set<Integer> visitedSet){
        visitedSet.add(node);
        List<Integer> children = list.get(node);
        for (int i=0;i<children.size();i++){
            if(!visitedSet.contains(children.get(i))){
                dfs(children.get(i) , list ,visitedSet );
            }
        }
    }
}
