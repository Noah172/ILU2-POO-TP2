package frontiere;

import controleur.ControlEmmenager;

public class BoundaryEmmenager {
	private ControlEmmenager controlEmmenager;

	public BoundaryEmmenager(ControlEmmenager controlEmmenager) {
		this.controlEmmenager = controlEmmenager;
	}

	public void emmenager(String nomVisiteur) {
		if (controlEmmenager.isHabitant(nomVisiteur)) {
			System.out.println(
					"Mais vous êtes déjà un habitant du village !");
		} else {
			StringBuilder question = new StringBuilder();
			question.append("Êtes-vous :\n");
			question.append("1 - un druide.\n");
			question.append("2 - un gaulois.\n");
			int choixUtilisateur = -1;
			do {
				choixUtilisateur = Clavier.entrerEntier(question.toString());
				switch (choixUtilisateur) {
				case 1:
					emmenagerDruide(nomVisiteur);
					break;

				case 2:
					//TODO a completer
					
					break;

				default:
					System.out
							.println("Vous devez choisir le chiffre 1 ou 2 !");
					break;
				}
			} while (choixUtilisateur != 1 && choixUtilisateur != 2);
		}
	}

	private void emmenagerDruide(String nomVisiteur) {
		System.out.println("Bienvenu druide"+nomVisiteur);
		StringBuilder question = new StringBuilder();
		question.append("Quelle est votre force?\n");	
		int forceDruide = Clavier.entrerEntier(question.toString());
		do {
			StringBuilder questionPotionMin = new StringBuilder();
			question.append("Quelle est la force de la potion la plus faible que vous produisez?\n");	
			int potionMin = Clavier.entrerEntier(question.toString());
			StringBuilder questionPotionMax = new StringBuilder();
			question.append("Quelle est la force de la potion la plus forte que vous produisez?\n");	
			int potionMax = Clavier.entrerEntier(question.toString());
			
		} while (effetPotionMax<effetPotionMin);
		
	}
}
