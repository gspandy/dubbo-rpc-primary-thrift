import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

public class BSClient {

    public static void main(String[] args) throws TException {
        TTransport transport = new TSocket("10.1.15.100", 5258);
        //        TTransport transport = new TSocket("localhost", 8080);
        transport.open();

        TProtocol protocol = new TBinaryProtocol(transport);
        bs.Client client = new bs.Client(protocol);

        req_t request = new req_t();
        request.setName("name");
        for (int i = 0; i < 10; i++) {
            request.setAge(i);

            try {
                rsp_t response = client.search(request);

                System.out.println(response.getSvr_name());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

        transport.close();
    }
}
