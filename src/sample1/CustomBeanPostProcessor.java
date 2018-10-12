package sample1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        System.out.println("⑧ 초기화 후의 Bean에 대한 처리를 실행 - postProcessAfterInitialization()");
        return bean;
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        System.out.println("⑤ 초기화 전의 Bean에 대한 처리를 실행 - postProcessBeforeInitialization()");
        return bean;
    }

}
