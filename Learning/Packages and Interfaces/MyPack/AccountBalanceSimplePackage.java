package MyPack;

class Balance1{
	String name;
	double bal;
	
	Balance1(String str, double bal){
		name = str; this.bal=bal;
	}
	void show() {
		if (bal<0)
			System.out.println("--> ");		
		System.out.println(name+": $ "+ bal);
	}
}
public class AccountBalanceSimplePackage {
	public static void main(String args[]) {
		
		Balance1 current[]=new Balance1[3]; //we create 3 links for Balance object
		//Also i can Balance[] b = new Balance[] {new Balance("str", double), new Balance(...};
		
		//we initialize all this links
		current[0]=new Balance1("K.J Fielding",123.23);
		current[1]=new Balance1("Will Tell",157.02);
		current[2]=new Balance1("Tom Jackson", -12.33);
		
		for(int i=0; i<3; i++) current[i].show();
	}
}
