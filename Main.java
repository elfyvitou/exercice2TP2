
public class Main {
    public static void main(String[] args) {

        CompteBancaire A = new CompteBancaire("MA-001", "Karim", 1000);
        CompteBancaire B = new CompteBancaire("MA-002", "Nadia");

        A.retirer(300);
        B.deposer(-50);
        A.virerVers(B, 500);
        B.retirer(1000);
        B.virerVers(A, 100);

        A.afficher();
        B.afficher();
    }
}
