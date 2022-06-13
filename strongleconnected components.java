void kosraju(n , aj)
{
    Stack<Integer> st = new Stack();
    for(int i=0;i<=n;i++)
    {
        if(vis[i]==0)
        {
            dfs(i,aj,vis,st);
        }
    }

    list<list<Integer>> tranpose = new ArrayList<>();

    for(int i=0;i<=n;i++)
    {
        tranpose.add(new ArrayList<>);
    }

    for(int i=0;i<=n;i++)
    {
        vis[i]=0;
        for(int it:aj.get(i))
        {
            tranpose.get(it).add(i);
        }
    }

    while(!st.isEmpty())
    {
        int node= st.pop();
        if(vis[node] == 0)
        {
            system.out.print("SCC :");
            revdfs(node,tranpose,vis);
            system.out.println();
        }
    }
}

void dfs(node, aj,vis,st)
{
    vis[node]=1;
    if(int i:aj.get(node))
    {
        if(vis[i]==0)
        {
            dfs(i,vis,aj,st);
        }
    }
    st.push(node);
}

void revdfs(node ,tranpose,vis)
{
    vis[node]=1;
    System.out.print(node+ " ");
    for(int it:tranpose.get(node))
    {
        if(vis[it]==0)
        {
            revdfs(it,tranpose,vis)
        }
    }
}