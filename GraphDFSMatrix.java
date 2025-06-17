public class GraphDFSMatrix
{
    private int[][] matrix;
    private boolean[] visited;
    public GraphDFSMatrix(int size)
    {
        matrix=new int[size][size];
        visited=new boolean[size]; 
    }
    public void addEdge( int i,int j)
    {
        matrix[i][j]=1;
        matrix[j][i]=1;
    }
    public void dfs(int node)
    {
        visited[node]=true;
        System.out.print((char) (node+'B')+" ");
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[node][i]==1&&!visited[i])
            {
                dfs(i);
            }
        }
    }
    public static void main(String[] args)
    {
        GraphDFSMatrix graph=new GraphDFSMatrix(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        System.out.println("DFS Traversal starting from vertex B:");
        graph.dfs(0);
    }
}