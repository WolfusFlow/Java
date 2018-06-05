package p2;

public class Protection2 extends p1.Protection{
	Protection2(){
	System.out.println("Construct extended from other package");
	//allowed only for current class or package
	//System.out.println("n= "+n);
	//allowed only for class
	//System.out.println("n_pri= "+n_pri);
	System.out.println("n_pro= "+n_pro);
	System.out.println("n_pu= "+n_pu);
	}
}
