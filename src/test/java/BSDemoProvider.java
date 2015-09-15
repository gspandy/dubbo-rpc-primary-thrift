import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author <a href="mailto:gang.lvg@alibaba-inc.com">kimi</a>
 */
public class BSDemoProvider {

    public static void main(String[] args) throws Exception {
        System.setProperty("dubbo.application.logger", "log4j");
        LogManager.getRootLogger().setLevel(Level.INFO);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bs-demo-provider.xml");
        context.start();
        System.out.println("context started");
        System.in.read();
        context.close();
    }

}
