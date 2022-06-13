public array topo(int v , int aj)
{
    int top[] = new int[v];
    int indeg[] = new indeg[];
    for(int i=0;i<n;i++)
    {
        for(int it: aj.get(i))
        {
            indeg[it]++;
        }
    }

    Queue<Integer> q = new LinkedList<>();
    for(int i=0;i<=n;i++)
    {
        if(indeg[i] ==0)
        {
            q.offer(inged[i]);
        }
    }

    int ind=0;
    while(!q.isEmpty())
    {
        int node = q.poll();
        top[ind++]=node;
        for(int it:aj.get(node))
        {
            indeg[it]--;
            if(indeg[it] ==0)
            {
                q.offer(it);
            }
        }
    }
}