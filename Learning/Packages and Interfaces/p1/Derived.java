package p1;

public class Derived extends Protection {
	Derived(){
		System.out.println("Construct of the sub class");
		System.out.println("n= "+n);
		//allowed only for class
		//System.out.println("n_pri= "+n_pri);
		System.out.println("n_pro= "+n_pro);
		System.out.println("n_pu= "+n_pu);
	}
}
