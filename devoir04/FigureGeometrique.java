package devoir04;
/**
 * création et gestion d'une figure géométrique
 * @author yangduo
 *
 */
public abstract class FigureGeometrique {
	
	protected String couleur = "noir";
	
	public FigureGeometrique(String color) {
		couleur = color;
	}
	public String getCouleur() {
    	return this.couleur;
    }
	public abstract double calculerPerimetre();
	public abstract double calculerSurface();
}
