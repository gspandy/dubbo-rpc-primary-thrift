

import org.apache.thrift.TException;

public class BSImpl implements bs.Iface {

    @Override
    public rsp_t search(req_t request) throws TException {
        String name = request.getName();
        int age = request.getAge();
        String msg = name + "|" + age;
        rsp_t response = new rsp_t();
        response.setSvr_name(msg);
        return response;
    }

}
