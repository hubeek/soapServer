package nl.appall.soapServer;

import javax.xml.ws.Endpoint;

public class ServerApplication {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/messageService", new MessageServiceImpl());
        System.out.println("Service running at http://localhost:8080/messageService");
        System.out.println("Type [CTRL]+[C] to quit!");
        Message m = new Message();
        m.setContent("first message.");

    }
}
