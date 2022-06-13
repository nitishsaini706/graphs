void bridge(int n , aj list)
{
    int vis [] = new int[n+1];
    int time[] = new int[n+1];
    int low[] = new int[n+1];
    int timer=0;
    for(int i=1;i<=n;i++)
    {
        if(vis[i] == 0)
        {
            dfs(i,-1,vis,time,low,aj,timer);
        }
    }
}

void dfs(int node,int parent,int[] vis,time ,low,aj ,timer)
{
    vis[i] =1;
    timer++;
    low[i] = time[i] = timer++;
    for(int it:ajs.get(node))
    {
        if(vis[it]==0)
        {
            if(it == parent) continue;
            dfs(it,node,vis,tine,low,aj,timer);
            if(low[it] < low[node]) low[node] = low[it];
            // low[node]=Math.min(low[node],low[it]);
            if(low[it] > time[node]) system.print(bridge it,node);
        }

        // if node is already visited that means it's ajs has been visited
        // so we just update it's low time
        else
        {

            low[node] = Math.min(low[node],time[it]);
        }
    }
}