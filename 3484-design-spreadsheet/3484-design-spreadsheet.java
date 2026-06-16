class Spreadsheet {
    int arr[][];

    public Spreadsheet(int rows) {
        arr=new int[rows][26];
    }
    
    public void setCell(String cell, int value) {
        int col=cell.charAt(0)-'A';
        int row=Integer.parseInt(cell.substring(1,cell.length()))-1;
        arr[row][col]=value;

    }
    
    public void resetCell(String cell) {
        int col=cell.charAt(0)-'A';
        int row=Integer.parseInt(cell.substring(1,cell.length()))-1;
        arr[row][col]=0;
    }
    
    public int getValue(String formula) {
        String str=formula.substring(1,formula.length());
        String s[]=str.split("\\+");
        String first=s[0];
        String sec=s[1];
        int num1=0;
        int num2=0;
        if(Character.isLetter(first.charAt(0))){
            int c=first.charAt(0)-'A';
            int r=Integer.parseInt(first.substring(1,first.length()))-1;
            num1=arr[r][c];
        }else{
            num1=Integer.parseInt(first);
        }
        if(Character.isLetter(sec.charAt(0))){
            int c1=sec.charAt(0)-'A';
            int r1=Integer.parseInt(sec.substring(1,sec.length()))-1;
            num2=arr[r1][c1];
        }else{
            num2=Integer.parseInt(sec);
        }
        return num1+num2;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */