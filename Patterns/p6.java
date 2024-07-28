// 1 $ $ $ $
// 2 2 $ $ $
// 3 3 3 $ $
// 4 4 4 4 $
// 5 5 5 5 5
public class p6 {
    public static void main(String[] args) {
        int num =5;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            for(int k=i+1;k<=num;k++){
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}
