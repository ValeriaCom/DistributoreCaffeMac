package distributorecaffèmac;

public class AutomaDistributoreCaffè implements State {

    private State stato;

    public AutomaDistributoreCaffè() {
        stato = new StatoIniziale();

    }

    @Override
    public void next(Event e) {
        System.out.println("Siamo nello stato " + stato);
        System.out.println("Ricevuto evento " + e);
        stato.next(e);
        System.out.println("Siamo passati nello stato " + stato);

    }

    private class StatoIniziale implements State {

        @Override
        public void next(Event e) {
            if (e instanceof AttesaCaffè) {
                stato = new StatoIniziale();
            } else {
                System.out.println("Errore!!");
            }
        }
    }

    private class StatoAttesa implements State {

        @Override
        public void next(Event e) {
            if (e instanceof ErogazioneCaffè) {
                stato = new StatoAttesa();
            } else {
                System.out.println("Errore!!");
            }
        }

    }

    private class RitiroCaffè implements State {

        @Override
        public void next(Event e) {
            if (e instanceof CaffèPronto) {
                stato = new RitiroCaffè();
            } else {
                System.out.println("Errore!!");
            }
        }

    }

}
