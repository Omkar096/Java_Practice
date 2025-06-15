package Pattern;

class halfPyramidDe {
    public static void main(String[] args) {
        
        /*
        ==========
               * 
             * * 
           * * * 
         * * * * 
         =========
         */
        int r=4;

        //outer
        for(int i=1;i<=r;i++){
                for(int j=1;j<=r-i;j++){
                     System.out.print(" ");
                //space print
            }
             //star print
             for(int j=1;j<=i;j++){
                    System.out.print("*");
        } 
        
        System.out.println();

        }
       

    }
}
