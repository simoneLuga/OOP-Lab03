package oop.lab03.bank;

public final class TestSimpleBankAccount {

    private TestSimpleBankAccount() { }

    public static void main(final String[] args) {
        /*
         * 1) Creare l' AccountHolder relativo a Mario Rossi con id 1 2) Creare
         * l' AccountHolder relativo a Luigi Bianchi con id 2 3) Creare i due
         * SimpleBankAccount corrispondenti 4) Effettuare una serie di depositi e
         * prelievi 5) Stampare a video l'ammontare dei due conti e verificare
         * la correttezza del risultato 6) Provare a prelevare fornendo un idUsr
         * sbagliato 7) Controllare nuovamente l'ammontare
         */
    	SimpleBankAccount maRo =  new SimpleBankAccount(1,10);
    	SimpleBankAccount luBi =  new SimpleBankAccount(2,10);
    	maRo.deposit(1, 200);
    	luBi.depositFromATM(2, 30);
    	maRo.withdraw(1, 23);
    	luBi.withdrawFromATM(22, 13);
    }
}
