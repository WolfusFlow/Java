
class ForVars{
  public static void main(String args[]){

    /*for ( ; ; ){
       //..                 infinite cicle
     }*/

     int i;
     boolean done=false;
     i=0;
     for( ; !done; ){
       System.out.println("i equal to "+i);
       if(i==10) done=true;
       i++;
     }
   }
}
