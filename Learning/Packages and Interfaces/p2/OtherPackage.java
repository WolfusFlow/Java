package p2;

class OtherPackage {
	OtherPackage(){
		p1.Protection p = new p1.Protection();
		System.out.println("Construct from other package");
		////allowed only for current class or package
		//System.out.println("n= "+n);
		//allowed only for class
		//System.out.println("n_pri= "+n_pri);
		//allowed only for class, subclass or same package
		//System.out.println("n_pro= "+n_pro);
		System.out.println("n_pu= "+p.n_pu);
	}

}
