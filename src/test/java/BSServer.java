import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportException;

public class BSServer {

    public static void main(String[] args) throws TTransportException {
        BSImpl bsImpl = new BSImpl();
        bs.Processor<bs.Iface> processor = new bs.Processor<bs.Iface>(bsImpl);

        TServerTransport serverTransport = new TServerSocket(8080);
        TServer server = new TSimpleServer(new TServer.Args(serverTransport).processor(processor));

        server.serve();
    }
}
