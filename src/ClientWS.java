import ws.BanqueService;
import ws.BanqueWS;
import ws.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {

        BanqueService stubWS = new BanqueWS().getBanqueServicePort();
        System.out.println(stubWS.conversionEuroTeFR(200));
        Compte compte = stubWS.getCompte(2L) ;
        System.out.println(compte.getCode());
        System.out.println(compte.getSolde());
        List<Compte> listComptes  =  stubWS.listComptes();
        listComptes.forEach(c->{
            System.out.println("--------------");
            System.out.println(c.getCode());
            System.out.println(c.getSolde());
        });
    }
}
