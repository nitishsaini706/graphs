import java.util.*;
import java.io.*;


class graph{
    // use linkedlist of aj[] instead;
    //LinkedList<Integer> adj[]
    public List<List<Integer>> l = new ArrayList<>();
    public int n;
    public graph(int n)
    {
        // int n =0;
        this.n = n;
        
        // int n=3;
        for(int i=0;i<=n;i++)
        {
            l.add(new ArrayList<>());
        }
    }

    public void edge(int u,int v)
    {
        l.get(u).add(v);
        // l.get(v).add(u);
    }
    public void print()
    {
        for(int i=1;i<=n;i++)
        {
            System.out.println(l.get(i).toString());
        }
    }

    public void dfs(int i,ajs list l , visited[] )
    {
        System.out.println(i+" ")
        visited[i]=true;
        for(int it : aj.get(node))
        {
            if(visisted[i]==false)
            {
                v[i]=true;
                dfs(it,l,visited[]);
            }
        }
    }

    public static void main(String args[])
    {
        int n=3;
        graph g = new graph(n);

        g.edge(1,2);
        g.edge(2,3);

        g.print();
    }
}