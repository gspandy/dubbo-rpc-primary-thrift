package tutorial;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.protocol.AbstractInvoker;


public class PrimaryThriftInvoker<T> extends AbstractInvoker<T>{

    public PrimaryThriftInvoker(Class<T> type, URL url) {
        super(type, url);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected Result doInvoke(Invocation invocation) throws Throwable {
        // TODO Auto-generated method stub
        return null;
    }

}
