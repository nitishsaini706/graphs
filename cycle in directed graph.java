public boolean bipar(int v , aj list)
{
    int vis [] = new vis[v];
    int dfsvis [] = new dfsvis[v];
    for(int i=0;i<v;i++)
    {
        if(vis[i] == 0) 
        {
            if(cycle(i,aj ,vis,dfsvis)) return true;
        }
    }

    

    return false;
}

public boolean cycle(int node , aj,vis,dfsvis)
{
    vis[node] = 1;
    dfsvis[node]=1;
    for(int it :aj.get(node))
    {
        if(vis[it] == 0)
        {
            if(cycle(it , aj,vis,dfsvis)) return true;
        }
        else if(dfsvis[it] == 1) return true;
        
    }
    dfsvis[node]=0;
    return false;
}