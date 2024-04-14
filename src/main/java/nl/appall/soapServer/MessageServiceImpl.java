package nl.appall.soapServer;
import javax.jws.WebService;
import org.hibernate.Session;
import org.hibernate.Transaction;
import nl.appall.soapServer.Message;

@WebService(endpointInterface = "nl.appall.soapServer.MessageService")
public class MessageServiceImpl implements MessageService {

    @Override
    public Message getMessage(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            return session.get(Message.class, id);
        } finally {
            session.close();
        }
    }

    @Override
    public Message saveMessage(String content) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Message message = new Message();
        message.setContent(content);
        try {
            tx = session.beginTransaction();
            session.save(message);
            tx.commit();
            return message;
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }

    @Override
    public void updateMessage(Long id, String content) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Message message = session.get(Message.class, id);
            if (message != null) {
                message.setContent(content);
                session.update(message);
                tx.commit();
            }
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public void deleteMessage(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Message message = session.get(Message.class, id);
            if (message != null) {
                session.delete(message);
                tx.commit();
            }
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
