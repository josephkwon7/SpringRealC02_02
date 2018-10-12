package sample1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageBeanImpl implements MessageBean, BeanNameAware,
        BeanFactoryAware, InitializingBean, DisposableBean {
    
    private String greeting;
    private String beanName;
    private BeanFactory beanFactory;
    
    public MessageBeanImpl() {
        System.out.println("① Bean의 생성자 실행");
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
        System.out.println("② Setter 메소드 실행 - setGreeting()");
    }

    public void sayHello() {
        System.out.println(greeting + beanName + "!");
    }

    public void setBeanName(String beanName) {
        System.out.println("③ Setter 메소드 실행 - setBeanName()");
        this.beanName = beanName;
        System.out.println(" -> " + beanName);
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("④ Setter 메소드 실행 - setBeanFactory()");
        this.beanFactory = beanFactory;
        System.out.println(" -> " + beanFactory.getClass());
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("⑥ Property 설정 완료 - afterPropertiesSet()");
    }

    public void destroy() throws Exception {
        System.out.println("종료 - destroy()");
    }
    
    public void init() {
        System.out.println("⑦ 초기화 메소드를 실행 - init()");
    }

}
