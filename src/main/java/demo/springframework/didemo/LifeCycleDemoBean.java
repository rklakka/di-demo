package demo.springframework.didemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean
		implements InitializingBean, DisposableBean, ApplicationContextAware, BeanFactoryAware, BeanNameAware {
	
	public LifeCycleDemoBean() {
		System.out.println("### I'm in the LifeCycleDemoBean constructor");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("### My Bean name is :: " + name);

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("### BeanFactory has been set.");

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("### Application Context has been set.");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("### The LifeCycleDemoBean has been terminated.");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("### The LifeCycleDemoBean has its properties set.");

	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("### The Post Construct annotated method is called.");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("### The Pre Destroy annotated method is called.");
	}
	
	public void beforeInit() {
		System.out.println("### Before Init - called by bean Post Processor");
	}
	
	public void afterInit() {
		System.out.println("### After Init - called by bean Post Processor");
	}

}
