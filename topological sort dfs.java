void sort(int n,aj)
{
    int vis[] = new int[n];
    Stack<Integer> st = new stack();

    for(int i=0;i<n;i++)
    {
        if(vis[i]==0)
        {
            dfs(i,aj,vis,st);
        }
    }
}

void dfs(int node,aj,vis,st)
{
    vis[node]=1;
    for(int it:aj.get(node))
    {
        if(vis[i]==0)
        {
            dfs(i,aj,vis,st);
        }
    }

    st.push(node);
}