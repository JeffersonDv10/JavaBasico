package Tema5;

import java.security.cert.CollectionCertStoreParameters;
import java.util.List;

public class Main {

    static CocheCRUD cocheCRUD = new CocheCRUDImpl();

    public static void main(String[] args) {

        Coche coches = new Coche();

        Coche coche1 = new Coche("Toyota","KMZ",2022);
        Coche coche2 = new Coche("Toyota","KMZ",2022);
        Coche coche3 = new Coche("Toyota","KMZ",2022);

        cocheCRUD.save(coche1);
        cocheCRUD.save(coche2);
        cocheCRUD.save(coche3);

        List<Coche> cocheList = cocheCRUD.findAll();
        System.out.println(cocheList);


    }
}
