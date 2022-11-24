package devoir04;
/**
 * calculer le périmètre et la surface d'un cercle
 * comparer les couleurs des deux cercles
 * @author yangduo
 *
 */
public class Cercle extends FigureGeometrique implements Comparable<Cercle>{
	
	private double rayon;
	
	public Cercle(String color,double r) {
		super(color);
		this.rayon = r ;
	}
	public double getRayon() {
		return rayon;
	}
	
	@Override
	public double calculerPerimetre() {
		return 2 * Math.PI * rayon;
	}
	@Override
	public double calculerSurface() {
		return Math.PI * rayon * rayon;
	}
	
	@Override
	public int compareTo(Cercle Cercle2) {
		return (int) (this.getRayon()-Cercle2.getRayon());
	}
	
	public void comparer(Cercle Cercle2) {
		String message,message2;
		
		if(this.compareTo(Cercle2)> 0){
			message = "Le premier cercle est plus grand que le deuxième cercle.";
		}else if(this.compareTo(Cercle2)== 0){
			message ="Les deux cercles sont pareils.";
		}else{
			message = "Le premier cercle est plus petit que le deuxième cercle.";
		}
		System.out.println(message);
		
		if ((this.getCouleur()).equals(Cercle2.getCouleur())) {
			message2 = "Les couleurs des deux cercles sont pareilles.";
		}else {
			message2 = "Les couleurs des deux cercles sont différentes.";
		}
		System.out.println(message2);
	}
	
	public void afficher() {
		
		System.out.println("Rayon : "+this.getRayon());
		System.out.println("Périmètre : "+this.calculerPerimetre());
		System.out.println("Surface : "+this.calculerSurface());
		System.out.println("Couleur : "+this.getCouleur());
	}
}
