class Solution {

    public boolean validPath(
        int n,
        int[][] edges,
        int source,
        int destination
    ) {

        // Step 1: Build adjacency list
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        // Step 2: Create visited array
        boolean[] visited = new boolean[n+1];

        // Step 3: Create queue
        Queue<Integer> queue = new LinkedList<>();

        // Step 4: Start from source
        queue.offer(source);
        visited[source] = true;

        // Step 5: BFS
        while (!queue.isEmpty()) {

            int node = queue.poll();

            // Destination found
            if (node == destination) {
                return true;
            }

            // Explore neighbors
            for (int neighbor : adj.get(node)) {

                if (!visited[neighbor]) {

                    visited[neighbor] = true;

                    queue.offer(neighbor);
                }
            }
        }

        return false;
    }
}