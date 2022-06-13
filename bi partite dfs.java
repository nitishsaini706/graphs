// it will be a single componenent 


public boolean dfs(int node,aj list , color[])
{
    color[node] = 1;
    
        for(int it : aj.get(cur))
        {
            
            if(color[it] == -1)
            {
                if(!dfs(it,list,color[]) return false;
            }   
            else if(color[it] == color[node]) return false;     
        }
    
    

    return true;
}
public boolean bipar(int v , aj list)
{
    int color [] = new color[v+1];
    for(int i=0;i<=v;i++)
    {
        color[i]=-1;
    }

    for(int i=0;i<=v;i++)
    {
        if(bfs(i,ajlist,color) ==  false) return false;
    }

    return true;
}