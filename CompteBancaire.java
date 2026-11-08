
public class CompteBancaire {

    String numero;
    String titulaire;
    double solde;

    public CompteBancaire(String numero, String titulaire, double solde) {
        this.numero = numero;
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public CompteBancaire(String numero, String titulaire) {
        this(numero, titulaire, 0);
    }

    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
        }
    }

    public boolean retirer(double montant) {
        if (montant > 0 && solde >= montant) {
            solde -= montant;
            return true;
        }
        return false;
    }

    public void virerVers(CompteBancaire c, double montant) {
        if (retirer(montant) == true) {
            c.deposer(montant);
        }
    }


    public void afficher() {
        System.out.println("Numero : " + numero);
        System.out.println("Titulaire : " + titulaire);
        System.out.println("Solde : " + solde + " DH");
    }
}
