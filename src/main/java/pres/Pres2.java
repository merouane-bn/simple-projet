package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
       //DaoImp dao=new DaoImpl();
        Scanner scanner = new Scanner(new File("C:\\Users\\Dell\\IdeaProjects\\projet1\\config.txt"));
        String daoClassName= scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDao dao=(IDao) cDao.getConstructor().newInstance(); // new DaoImpl instanciation dynamique
        System.out.println(dao.getData());

        //MetierImpl metier =new MetierImpl();

        String metierClassName= scanner.nextLine();
        Class cMetier =Class.forName(metierClassName);
       // IMetier metier =(IMetier) cMetier.getConstructor().newInstance();
        // injection par constructor
        IMetier metier =(IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

        /* metier.setDao(dao); statique */
       // Method method=cMetier.getMethod("setDao", IDao.class);
       // method.invoke(metier, dao); //injection des dépendances dynamiques
        System.out.println("Resultat=>"+metier.calcul());

    }

}
