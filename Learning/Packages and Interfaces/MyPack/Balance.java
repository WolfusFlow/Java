package MyPack;

public class Balance {
	String str; double bal;
	public Balance(String str, double bal) {
		this.str=str;this.bal=bal;
	}
	public void show() {
		if (bal<0)System.out.println("-->");
		System.out.println(str+": $"+bal);
	}

}
