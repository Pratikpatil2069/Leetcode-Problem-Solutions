class BrowserHistory {
    class ListNode{
        String data;
        ListNode next;
        ListNode prev;
        ListNode(String data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    ListNode curr;

    public BrowserHistory(String homepage) {
        curr=new ListNode(homepage);
    }
    
    public void visit(String url) {
        ListNode newListNode =new ListNode(url);
        curr.next=newListNode;
        newListNode.prev=curr;
        curr=newListNode;
        
    }
    
    public String back(int steps) {
        while(steps>0){
            if(curr.prev!=null){
                curr=curr.prev;
                steps--;
            }else{
                return curr.data;
            }
           
        }
        return curr.data;
        
    }
    
    public String forward(int steps) {
        while(steps>0){
            if(curr.next!=null){
                curr=curr.next;
                steps--;
            }else{
                return curr.data;
            }
           
        }
        return curr.data;
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */