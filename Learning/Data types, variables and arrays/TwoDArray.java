
class TwoDArray{
   public static void main(String args[]){

     int twoD[][] = new int [4][5];
     int i,j,k = 0;

     for (i=0; i<4; i++)
       for (j=0; j<5; j++){
         twoD[i][j]=k;
         k++;
       }
     for (i=0; i<4; i++){
       for (j=0; j<5; j++)
        System.out.print(twoD[i][j]+" ");
        System.out.println();
       }
   }
}


/*
int twoD[][]=new int[4][];
twoD[0]=new int[5];
twoD[1]=new int[5];
twoD[2]=new int[5];
twoD[3]=new int[5];
*/
