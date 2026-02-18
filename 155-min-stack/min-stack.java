class MinStack {

    Stack<Integer> st;
    Stack<Integer> minstack;
    public MinStack() 
    {
        st = new Stack<>();
        minstack = new Stack<>();
    }
    
    public void push(int val) 
    {
       st.push(val);
       if(minstack.isEmpty() || val <= minstack.peek())
       {
           minstack.push(val);
       }    
    }
    
    public void pop() 
    {
        int remove = st.pop();
        if(remove == minstack.peek())
        {
            minstack.pop();
        }
    }
    
    public int top() 
    {
       if(st.isEmpty())
       {
        return 0;
       }    
       else
       {
           return st.peek();
       }
    }
    
    public int getMin() 
    {
        if(st.isEmpty())
        {
            return 0;
        }    
        else
        {
            return minstack.peek();
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */