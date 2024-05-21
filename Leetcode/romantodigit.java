// problem no : 13
class Solution {
    public void romanToInt(String s) {
        String[][] roman = {{"I","1"},{"V","5"},{"X","10"},{"L","50"},{"C","100"},{"D","500"},{"M","10"}};
        String val = "";
        System.err.println(val);
        for(int j=0;j<s.length();j++)
        {
            char c = s.charAt(j);
            for(int i=0;i<roman.length;i++)
            {
                String x = Character.toString(c);
                String d = roman[i][0];
                if(x.equals(d))
                {
                    val = val+roman[i][1];
                    break;
                }
            }
        }
        System.err.println(val);
    }
}
public class romantodigit {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.romanToInt("LVIII");
    }    
}
