package Tema5;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public  class CocheCRUDImpl implements CocheCRUD{


    List<Coche> coches = new ArrayList<>();


    @Override
    public void save(Coche coche) {
        coches.add(coche);

    }

    @Override
    public List<Coche> findAll() {
        return coches;
    }


    @Override
    public void delete(Coche coche) {

    }

}
