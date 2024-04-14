import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface MessageService {
    @WebMethod
    Message getMessage(Long id);
    @WebMethod
    Message saveMessage(String content);
    @WebMethod
    void updateMessage(Long id, String content);
    @WebMethod
    void deleteMessage(Long id);
}
