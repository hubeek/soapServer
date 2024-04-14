package nl.appall.soapServer;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MessageServiceTest {
    private Session session;

//    @BeforeEach
//    void setUp() {
//        createSessionDb();
//
//        cleanDb();
//    }
//
//    private void createSessionDb() {
//        // Open a session and start a transaction
//        session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//    }
//
//    private void cleanDb() {
//        // Clean up the database
//        session.createSQLQuery("DELETE FROM messages").executeUpdate();
//
//        // Commit transaction
//        session.getTransaction().commit();
//    }
//
//    @AfterEach
//    void tearDown() {
//        if (session != null) {
//            session.close();
//        }
////        createSessionDb();
////        cleanDb();
////        session.close();
//    }

//    @Test
//    public void testSaveMessage() {
//        // Open a new transaction for the test
//        session.beginTransaction();
//        try {
//            MessageServiceImpl service = new MessageServiceImpl();
//            String content = "Hello, world!";
//            Message message = service.saveMessage(content);
//            assertEquals(content, message.getContent(), "The message content should match the input");
//
//            // Commit transaction
//            session.getTransaction().commit();
//        } catch (Exception e) {
//            // Rollback in case of an exception
//            session.getTransaction().rollback();
//            throw e; // rethrow the exception to fail the test
//        }
//    }
}
