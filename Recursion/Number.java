class Number{
    public static void count(int i){
        if(i==0){
            return;
        }
        System.out.println(i);
        count(i-1);        
    }

    static public void main(String[] args) {
        int a=5;
        count(a);
    }
}