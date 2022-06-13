
public boolean dfs(int node,int parent,vis[],aj list aj)
{
    vis[node]=true;
    for(int it:aj.get(node))
    {
        if(vis[it] == false)
        {
            // this is to return true if lower calls return true and we dont need to visit 
            // other nodes which are left
            if(dfs(it,node,vis,aj) == true) true;
        }

            // it means we encountered a node which was alreadt visited and was not parent 

            //eg 1 | 2,3 
            //   2 |1,3 
            //   3 | 1,3   we are passing ( 1,-1) next call (2,1) as we can see in aj list of 1 2,3 are 
            // ivisted but when we are in 2's call we see 3 is not parent and is already visited coz 2's parent is 
            // 1 thus we return true; as we only enter this area if false
        else if(it != parent) return true;
        
    }
    return false;
}

//driver code
public boolean isCycle(int v , ajs list aj)
{
    boolean vis[] = new boolean[v+1];
    Arrays.fill(vis,false);

    for(int i=1;i<n;i++)
    {
        if(vis[i]==false)
        {
            if(dfs(i,-1,v[],aj) ==  true) return true;
        }
    }
    return false;
}