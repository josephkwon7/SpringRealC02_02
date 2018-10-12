package sample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloApp2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext factory;
        factory = new FileSystemXmlApplicationContext("applicationContext2.xml");
        
        MessageBean bean = (MessageBean)factory.getBean("messageBean");
        bean.sayHello();
    }
}
