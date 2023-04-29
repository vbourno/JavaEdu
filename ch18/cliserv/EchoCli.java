package gr.aueb.cf.ch18.cliserv;

/**
 * The main method acts as a client. Gets an instanco of
 * the echo server, send a request to the server by passing
 * a message(calling the echo method) and gets back a response.
 *
 * @author vbour
 * @version 0.1
 */
public class EchoCli {

    public static void main(String[] args) {
        EchoServ serv = new EchoServ();
        String request = "Hello Coding Factory";
        String response;

        System.out.println("Request: " + request);
        response = serv.echo(request);
        System.out.println(response);
    }
}
