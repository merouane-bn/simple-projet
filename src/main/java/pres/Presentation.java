package pres;

import dao.DaoImpl;
import ext.DaoImpl2;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        DaoImpl2 dao=new DaoImpl2(); //instanciation statique
        MetierImpl metier=new MetierImpl();
        metier.setDao(dao); //injection des dépendances
        System.out.println("Resultats "+metier.calcul());
    }

}
