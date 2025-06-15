package Pattern;

class invertedHalfPayramid {
    public static void main(String[] args) {
     
        /*
        ==================
        1 2 3 4 5 
        1 2 3 4
        1 2 3
        1 2
        1
        ==================
         */
         int r=5;

            for(int i=1;i<=r;i++){
                for(int j=1;j<=r-i+1;j++){
                 System.out.print(j+" ");
                }
                System.out.println();
            }
    }
}
