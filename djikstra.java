//undirected with weights

class Node implements Comparator<Node>
{
    int v,weight;

    Node(int v,int w)
    {
        v=v;
        weight = w;
    }

    public int getv(){return v;}
    public int getW(){return weight;}

    @Override
    public int compare(Node n1,Node n2)
    {
        if(n1.weight < n2.weight) return -1;
        else if(n1.weight > n2.weight) return 1;
        return 0;
    }
}

void shotest path(int n,aj,int source)
{
    int dis[] = new int[n=1];
    for(int i0;i<=n;i++) 
    {
        dis[i]=Integer.MAX_VALUE;
    }
    dis[s]=0;

    PriorityQueue<NOde> q = new PriorityQueue<Node>(N,new Node())
    q.add(new Node(s,0));
    while(q.size()>0)
    {
        Node n = q.poll();
        for(int it:aj.get(n.getv()))
        {
            if(dis[it.getv()] > dis{node.getv()} + it.getw())
            {
                dis[it.getv()] = dis{node.getv()} + it.getw();
                p.offer(new Node(it.getv(),dis[it.getv()]));
            }
        }
    }
}