import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author <a href="mailto:gang.lvg@alibaba-inc.com">kimi</a>
 */
public class BSDemoConsumer {

    public static void main(String[] args) throws Exception {
        System.setProperty("dubbo.application.logger", "log4j");
        LogManager.getRootLogger().setLevel(Level.INFO);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bs-demo-consumer.xml");
        context.start();
        bs.Iface demo = (bs.Iface) context.getBean("demoService");
        req_t request = new req_t();
        request.setName("name");
        for (int i = 0; i < 1000000; i++) {
            request.setAge(i);
            rsp_t response = demo.search(request);

            System.out.println(response.getSvr_name());
        }
        context.close();
    }

}
