package Pattern;

 class halfPyramidNumber {
           public static void main(String[] args) {
            /*
            ==============
             1
             12
             123
             1234
             12345
             =============
             */
            int r=5;

            for(int i=1;i<=r;i++){
                for(int j=1;j<=r-i;j++){
                 System.out.print(j + " ");
                }
            
                System.out.println();
            }

           }    
}
