package p1;

public class SamePackage {
	SamePackage(){
		Protection p = new Protection();
		System.out.println("Construct of the same package");
		System.out.println("n= "+p.n);
		//allowed only in class
		//System.out.println("n_pri= "+p.n_pri);
		System.out.println("n_pro= "+p.n_pro);
		System.out.println("n_pu= "+p.n_pu);
	}
}
