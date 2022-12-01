package devoir05;
/**
 * 
 * @author yangduo
 *
 */
public class E421 extends Exception{
	
    public E421(TroisDes tire, String nom) {
        super("Il y a 421 dans l'ordre et le nom du lanceur est : " + nom + " et les trois chiffres sont  : " + tire);
    }
    
    public E421(String nom, TroisDes tire) {
        super("Il y a 421 dans le désordre et le nom du lanceur est : "+ nom + " et les trois chiffres sont : " + tire);
    }

}
