package lambdas;

public class testAnnonyme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ecriture java 7
//		Mapper mapper = new Mapper() {
//			public Personne map(CompteCourant compte) {
//				return new Personne(compte.getSolde());
//			}
//		};
		
		// ecriture java 8
		Mapper mapper = compte -> new Personne(compte.getSolde());
		
		CompteCourant compte = new CompteCourant();
		compte.setSolde(100);
		
		Personne personne = mapper.map(compte);
		System.out.println(personne.getSolde());
	}

}
