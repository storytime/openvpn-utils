package service;

import entity.Client;
import entity.ClientDisconnectEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.SessionFactorySingleton;

/**
 * User: Bogdan
 * Date: 4/15/13
 * Time: 8:21 PM
 */
public class ClientDisconnectService { // implements ClientService {

    public static Session session = null;
    public static Transaction tx = null;

    public Client getClient() {
        return new ClientDisconnectEntity();
    }

    public static void save(Client client) {
        try {
            session = SessionFactorySingleton.getInstance().openSession();
            tx = session.beginTransaction();
            session.save(client);
            session.flush();
            tx.commit();

        } catch (Exception ex) {
            //rollback
            ex.printStackTrace();
            tx.rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
