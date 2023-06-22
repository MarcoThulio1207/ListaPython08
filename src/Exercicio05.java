import javax.naming.ldap.ManageReferralControl;

public class Exercicio05 {
    public static void main(String[] args) {
       ContaCorrente c1 = new ContaCorrente(5864,"Marco",1970);
       c1.alterarnome("Thulio");
       c1.deposito(195);
       c1.realizarSaque(50);

    }
}