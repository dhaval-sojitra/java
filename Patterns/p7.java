// X 0 0 0 0
// X X 0 0 0
// X X X 0 0
// X X X X 0
// X X X X X
public class p7 {
    public static void main(String[] args) {
        int num=5;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("X ");
            }
            for(int k=i+1;k<=num;k++){
                System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
