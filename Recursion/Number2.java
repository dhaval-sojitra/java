class NUmber2{
    static void count(int i){
        if(i>5){
            return;
        }
        System.out.println(i);
        count(i+1);
    }
    public static void main(String[] args) {
        int a=1;
        count(a);
    }
}
