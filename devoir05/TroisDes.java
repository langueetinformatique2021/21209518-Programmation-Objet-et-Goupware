package devoir05;
/**
 * 
 * @author yangduo
 *
 */
public class TroisDes {
	
	private int d1,d2,d3;
	
	public TroisDes(int d1, int d2, int d3) {
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
	}
	
	public int getD1() {
		return this.d1;
	}
	public int getD2() {
		return this.d2;
	}
	public int getD3() {
		return this.d3;
	}
	
	public void afficher() {
		System.out.println("Les trois valeurs sont : "+this.d1+" et "+this.d2+" et "+this.d3);
		
	}
	
}
