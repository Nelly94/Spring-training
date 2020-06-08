import com.application.Guitarist;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {


    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-context.xml");

        Guitarist guitarist = (Guitarist) context.getBean("guitarist");
        guitarist.play();
    }
}
