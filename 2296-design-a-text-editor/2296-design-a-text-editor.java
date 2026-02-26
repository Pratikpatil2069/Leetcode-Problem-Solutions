class TextEditor {
    StringBuilder sb;
    int cursor;
    public TextEditor() {
        sb=new StringBuilder();
        cursor=0;
    }
    
    public void addText(String text) {
        sb.insert(cursor,text);
        cursor+=text.length();
    }
    
    public int deleteText(int k) {
        String str=sb.substring(0,cursor);
        int min=Math.min(k,str.length());
        if(min==k){
            int startInd=str.length()-k;
            sb.delete(startInd,cursor);
           cursor=cursor-min;
        }else{
            sb.delete(0,cursor);   
            cursor=cursor-min;
        }
        return min;
    }
    
    public String cursorLeft(int k) {
        cursor=Math.max(0,cursor-k);
        int startInd= Math.max(0, cursor - 10);
        return  sb.substring(startInd,cursor);
       
    }
    
    public String cursorRight(int k) {
       cursor=Math.min(sb.length(),cursor+k);
       int startInd=Math.max(0,cursor-10);
       return sb.substring(startInd,cursor);    
       
      
    }
}

/**
 * Your TextEditor object will be instantiated and called as such:
 * TextEditor obj = new TextEditor();
 * obj.addText(text);
 * int param_2 = obj.deleteText(k);
 * String param_3 = obj.cursorLeft(k);
 * String param_4 = obj.cursorRight(k);
 */