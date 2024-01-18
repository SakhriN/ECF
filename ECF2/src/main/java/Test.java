import dao.DepartementDAOImpl;
import model.*;

import org.hibernate.*;
import org.hibernate.boot.*;
import org.hibernate.boot.registry.*;

import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        DepartementDAOImpl departementDAO = new DepartementDAOImpl();
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        Scanner scan = new Scanner(System.in);
        Session session = null;
        Transaction tx = null;
        Departement departement = new Departement("Blap");
        int number = 2;
//        CreateDepartement(departementDAO,departement,tx,session,sessionFactory);
        ReadAllDepartement(departementDAO, tx, session, sessionFactory);
        System.out.println("Departement numéro 2 : ");
        ReadOneDepartement(departementDAO,number,tx,session,sessionFactory);
        System.out.println("Maintenant on va supprimer le département 2 :");
        DeleteDepartement(departementDAO,number,tx,session,sessionFactory);
        System.out.println("Vérifions si le 2eme est la :");
        ReadAllDepartement(departementDAO, tx, session, sessionFactory);
    }

    public static void CreateDepartement(DepartementDAOImpl departementDAO, Departement departement,
                                         Transaction tx,
                                         Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        departementDAO.Create(departement, tx, session, sessionFactory);
        session.close();
    }

    public static Departement ReadOneDepartement(DepartementDAOImpl departementDAO, int id,
                                          Transaction tx,
                                          Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        Departement departement = departementDAO.ReadOne(id, tx, session, sessionFactory);
        System.out.println(departement);
        session.close();
        return departement;
    }

    public static void ReadAllDepartement(DepartementDAOImpl departementDAO,
                                          Transaction tx,
                                          Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        departementDAO.ReadAll(tx, session, sessionFactory);
        session.close();
    }

//    public static void UpdateDepartement(DepartementDAOImpl departementDAO, Departement departement,
//                                         Transaction tx,
//                                         Session session, SessionFactory sessionFactory) {
//        session = sessionFactory.openSession();
//        departementDAO.Update(departement, tx, session, sessionFactory);
//        session.close();
//    }

    public static void DeleteDepartement(DepartementDAOImpl departementDAO, int id,
                                         Transaction tx,
                                         Session session, SessionFactory sessionFactory) {
        session = sessionFactory.openSession();
        departementDAO.Delete(id, tx, session, sessionFactory);
        session.close();
    }
}
