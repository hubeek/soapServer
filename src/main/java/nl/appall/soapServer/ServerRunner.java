package nl.appall.soapServer;
import javax.xml.ws.Endpoint;

public class ServerRunner {

    public static void main(String[] args) {
        // Initialize database with test data
//        initDatabaseWithTestData();
//
        // Start the SOAP web service
        Endpoint.publish("http://localhost:8080/messageService", new MessageServiceImpl());
        System.out.println("Service running at http://localhost:8080/messageService");
        System.out.println("Type [CTRL]+[C] to quit!");
    }

    private static void initDatabaseWithTestData() {
        MessageServiceImpl service = new MessageServiceImpl();

        // Create a new message object and save it to the database
        String testContent = "This is a test message!";
        Message testMessage = service.saveMessage(testContent);
        if (testMessage != null) {
            System.out.println("Test message saved successfully: " + testMessage.getContent());
        } else {
            System.out.println("Failed to save test message.");
        }
    }
}
