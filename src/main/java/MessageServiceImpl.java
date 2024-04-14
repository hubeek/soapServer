import javax.jws.WebService;
import org.hibernate.Session;
import org.hibernate.Transaction;

@WebService(endpointInterface = "MessageService")
public class MessageServiceImpl implements MessageService {
    @Override
    public Message getMessage(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Message message = session.get(Message.class, id);
        session.close();
        return message;
    }

    @Override
    public Message saveMessage(String content) {
        Session session = HibernateUtil.getSession
