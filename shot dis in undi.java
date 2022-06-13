void short(int n, aj)
{
    int dis[] = new int[n];
    dis[0]=0;
    for(int i=1;i<=n;i++)
    {
        dis[i]=INteger.MAX_VALUE;
    }
    Queue<INteger> q = new LinkedList<>();

    q.offer(dis[0]);
    while(!q.isEmpty())
    {
        int node = q.poll();
        for(int it:aj.get(node))
        {
            if(dis[node]+1 < dis[it])
            {
                dis[it] += dis[node]+1;
                q.offer(dis[it]);
            }
        }
    }
}