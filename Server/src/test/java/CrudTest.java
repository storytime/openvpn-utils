import entity.ClientDisconnect;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;
import utils.SessionFactorySingleton;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNull;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * User: Bogdan
 * Date: 4/14/13
 * Time: 9:19 PM
 */
public class CrudTest {
    private Session session;
    private Transaction tx;
    private ClientDisconnect cd;

    @Before
    public void init() {
        session = SessionFactorySingleton.getInstance().openSession();
        tx = session.beginTransaction();
        cd = new ClientDisconnect();
        cd.setCommonName("test");
    }

    @Test
    public void sessionTest() {
        assertNotNull(session);
    }

    @Test
    public void TransactionTest() {
        assertNotNull(tx);
    }

    @Test
    public void ClientDisconnect() {
        assertNotNull(cd);
    }

    @Test
    public void persistenceTest() {
        session.save(cd);
        session.flush();
        tx.commit();

        ClientDisconnect clientDisconnectTest = (ClientDisconnect) session.load(ClientDisconnect.class, cd.getId());
        assertEquals(cd.getId().toString(), clientDisconnectTest.getId().toString());
        assertEquals (cd.getCommonName(), clientDisconnectTest.getCommonName());

        session.delete(cd);
    }
}
