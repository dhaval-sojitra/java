// 9.
// 1
// 01
// 010
// 1010
// 10101
public class Nine {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.err.print(a);
                if (a == 1) {
                    a = 0;
                } else {
                    a = 1;
                }
            }
            System.err.println();
        }
    }
}
