package tutorial;

import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.protocol.AbstractExporter;


public class PrimaryThriftExporter<T> extends AbstractExporter<T>{

    public PrimaryThriftExporter(Invoker<T> invoker) {
        super(invoker);
    }
    
    public void unexport(){
        
    }

}
