package Tema5;


public  class CocheCRUDImpl implements CocheCRUD{


// En este ejercicio se trabajo con parametros, con el tipo de dato String. Tambien se podria retornar void.
    String delete = "Eliminar";
    String save = "Guardar";
    String findAll = " FindAll";

    @Override
    public String toString() {
        return "CocheCRUDImpl { " +
                "delete='" + delete + '\'' +
                ", save='" + save + '\'' +
                ", findAll='" + findAll + '\'' +
                '}';
    }

    @Override
    public String save() {
        return save;

    }

    @Override
    public String findAll() {
        return findAll;

    }

    @Override
    public String delete() {
        return delete;

    }
}
