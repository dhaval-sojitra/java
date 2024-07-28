// 1 2 3 4 5
// $ 2 3 4 5
// $ $ 3 4 5
// $ $ $ 4 5
// $ $ $ $ 5
public class p5 {
    public static void main(String[] args) {
        int s=0;
        for(int i=1;i<=5;i++){
            int d=0;
            for(int j=1;j<=s;j++){
                System.out.print("$ ");
                d++;
            }
            for(int k=d+1;k<=5;k++){
                System.out.print(k+" ");
            }
            s++;
            System.out.println();
        }
    }
}
