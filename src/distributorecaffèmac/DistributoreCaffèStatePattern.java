package distributorecaffèmac;

public class DistributoreCaffèStatePattern {
    
    public static void main(String[] args) {
        AutomaDistributoreCaffè a = new AutomaDistributoreCaffè();
        a.next(new AttesaCaffè());
        a.next(new ErogazioneCaffè());
        a.next(new CaffèPronto());
    }
    
}
