void topo(int n,aj)
{
    int vis[]= new vis[n];
    Stack<Integer> st = new Stack();
    for(int i=0;i<n;i++)
    {
        if(vis[i] == 0)
        {
            dfs(i,vis,aj,st);
        }
    }

    int dis[] = new int[n];
    dis[0]=0;
    for(int i=1;i<=n;i++)
    {
        dis[i]=Integer.MAX_VALUE;
    }

    while(!st.isEmpty())
    {
        int node = st.pop();
        if(dis[node] != Integer.MAX_VALUE)
        {
            for(int i:aj.get(node))
            {
                if(dis[node] + it.getW() < dis[it.getV])
                {
                    dis[it.getv] = dis{node} + it.getw();
                }
            }
        }
    }
}

void dfs(int node,vis,aj,st)
{
    vis[i]=1;
    for(int it:aj.get(node))
    {
        if(vis[i]==0)
        {
            dfs(i,vis,aj,st);
        }
    }
    st.push(node);
}