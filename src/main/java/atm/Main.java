package atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        DataSourceDB dataSourceDB = new DataSourceDB();
//        DataSourceFile dataSourceFile = new DataSourceFile("customers.txt");
//        Bank bank = new Bank("My Bank", dataSourceDB);
//        ATM atm = new ATM(bank);

//        ApplicationContext context = new AnnotationConfigApplicationContext(ATMConfig.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        AtmUI atmUI = context.getBean(AtmUI.class);

//        AtmUI atmUI = new AtmUI(atm);
        atmUI.run();
    }
}
