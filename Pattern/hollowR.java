package Pattern;

public class hollowR {
    public static void main(String[] args) {
        /*
        =============
         * * * * *
         *       *
         *       *
         * * * * *
         ============
         */
         int r=4;
         int c=5;
  
         //outer
     for(int i=1;i<=r;i++){
            //inner
        for(int j=1;j<=c;j++){
            if(i==1 || j==1||i==r|| j==c){
                    System.out.print("*");
            }else{
                System.out.print(" ");
            }
              
        }
        System.out.println();

         }

    }
}
