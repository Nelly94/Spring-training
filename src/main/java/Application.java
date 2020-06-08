import com.application.AppConfig;
import com.application.Guitarist;
import com.application.IMusician;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Application {


    public static void main(String[] args){

        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-context.xml");
        AnnotationConfigApplicationContext conf = new AnnotationConfigApplicationContext(AppConfig.class);

        Scanner sc = new Scanner(System.in);
        System.out.println("Who should play? pianist/guitarist: ");
        String choice = sc.nextLine();
        if("pianist".equals(choice) || "guitarist".equals(choice)) {
            IMusician musician = (IMusician) conf.getBean(choice);
            musician.play();
        }else{
            System.out.println("Wrong musician...");
        }
    }
}
