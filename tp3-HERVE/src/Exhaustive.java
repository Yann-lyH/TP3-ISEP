
public class Exhaustive {

	public static int exhaust(int [] liste, int v) {

		for (int i = 0; i < liste.length; i++) {
			if (liste[i] == v) {
				System.out.println("l'indice du 1er �l�ment du tableau �gal � l'entier est: " +  i);
				return (i);
				} else {
					System.out.println("l'entier recherch� n'est pas pr�sent dans la " + i + "i�me case");
					
				}
			}
		return 0;
		}
// il faut autant d'it�rations que d'�l�ments dans le tableau pour trouver v.
// si v est au d�but, il faut une it�ration.
//si v est � la fin, il faut tab.length it�rations.
// en moyenne il faut (tab.length/n) it�rations pour un tableau � n valeurs.
		
		
	
    
	
	

public static void main(String[] args) {
	int [] liste = CreateTab.tableau();
	exhaust(liste, 5);
}



	

}
