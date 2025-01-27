class MyStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public MyStack() {
        q1=new Linkedlist<>();
        q2=new Linkedlist<>();
  
        
    }
    
    public void push(int x) {
        
    }
    
    public int pop() {
        //poll all elements from q1 and push to q2
        //but the last element in q1
        // copy q2 back to q1

        while (!isEmpty){
            
        }




    }
    
    public int top() {
        
    }
    
    public boolean empty() {
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */