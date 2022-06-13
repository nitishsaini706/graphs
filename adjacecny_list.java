import java.util.*;
import java.io.*;


class graph{
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
    public static void main(String args[])
    {
        graph g = new graph(3);

        g.edge(1,2);
        g.edge(2,3);

        g.print();

        
    }
}