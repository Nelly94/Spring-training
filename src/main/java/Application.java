import com.application.Guitarist;
import com.application.IMusician;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Application {


    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-context.xml");

        Scanner sc = new Scanner(System.in);
        System.out.println("Who should play? pianist/guitarist: ");
        if("pianist".equals(sc.nextLine()) || "guitarist".equals(sc.nextLine())) {
            IMusician musician = (IMusician) context.getBean(sc.nextLine());
            musician.play();
        }else{
            System.out.println("Wrong musician...");
        }
    }
}
