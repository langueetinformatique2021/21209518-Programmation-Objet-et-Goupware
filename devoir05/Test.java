package devoir05;

public class Test {
	public static void main(String[] args) throws E421{
		
		LancerDes ld = new LancerDes("test",1);
		TroisDes tire = ld.lancerDes();
		ld.getNom();
		tire.afficher();

	}
}
