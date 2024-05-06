// 5.
//    *
//   ** 
//  *** 
// ****    
public class Five {
   public static void main(String[] args) {
      for(int i=4;i>=1;i--)
      {
         for(int j=1;j<=4;j++)
         {
            if(j>=i)
            {
               System.err.print("*");
            }
            else
            {
               System.err.print(" ");
            }
         }
         System.err.println();
      }
   }   
}
