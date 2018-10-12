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
        System.out.println("�� Bean�� ������ ����");
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
        System.out.println("�� Setter �޼ҵ� ���� - setGreeting()");
    }

    public void sayHello() {
        System.out.println(greeting + beanName + "!");
    }

    public void setBeanName(String beanName) {
        System.out.println("�� Setter �޼ҵ� ���� - setBeanName()");
        this.beanName = beanName;
        System.out.println(" -> " + beanName);
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("�� Setter �޼ҵ� ���� - setBeanFactory()");
        this.beanFactory = beanFactory;
        System.out.println(" -> " + beanFactory.getClass());
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("�� Property ���� �Ϸ� - afterPropertiesSet()");
    }

    public void destroy() throws Exception {
        System.out.println("���� - destroy()");
    }
    
    public void init() {
        System.out.println("�� �ʱ�ȭ �޼ҵ带 ���� - init()");
    }

}
