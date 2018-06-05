
class Array{
  public static void main(String args[]){

   int month_days[];    //int month_days[]={2, 3, 41, 12, 123, 123, 424};
   month_days = new int[12];
   month_days[0] = 31;
   month_days[1] = 28;
   month_days[2] = 31;
   month_days[3] = 30;
   month_days[4] = 31;
   month_days[5] = 30;
   month_days[6] = 31;
   month_days[7] = 30;
   month_days[8] = 31;
   month_days[9] = 30;
   month_days[10] = 31;
   month_days[11] = 30;

   int sum=0;
   int g=0;
for (int i=0; i<12; i++){
int m=month_days[g];
   g++;
   System.out.println("Array" + m);
   sum=sum+1;
   System.out.println("sum " + sum);
  }
 }
}
