// 15 7 6 2 1
// 14 8 5 3
// 23 9 4
// 12 10 
// 11

class pattern {
    public static void main(String[] args) {
        String str1 = "",str2 = "",str3 = "",str4 = "",str5 = "";
        int a= 1,b=6;
        for (int i = 15; i >= 1; i--) {
            switch (a) {
                case 1:
                    str1 = str1+" "+Integer.toString(i);
                    break;
                case 2:
                    str2 = str2+" "+Integer.toString(i);
                    break;
                case 3:
                    str3 = str3+" "+Integer.toString(i);
                    break;
                case 4:
                    str4 = str4+" "+Integer.toString(i);
                    break;
                case 5:
                    str5 = str5+" "+Integer.toString(i);
                    break;
                default:                
                    break;
            }
            a++;
            if (a==b) {
                a=1;
                b-=1;
            }
            
        }
        System.err.println(str1);
        System.err.println(str2);
        System.err.println(str3);
        System.err.println(str4);
        System.err.println(str5);
    }
}