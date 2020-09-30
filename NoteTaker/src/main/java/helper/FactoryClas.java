package helper;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.entity.Note;
import com.mapping.Answer;
import com.mapping.Question;

public class FactoryClas {
	
	public static SessionFactory factory;
	
	public static SessionFactory getSessionFactory(){
			
		 Configuration configuration=new Configuration().configure("hibernate.cfg.xml");   
	     StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
	      serviceRegistryBuilder.applySettings(configuration.getProperties());
	      ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
	      factory  =  configuration.addAnnotatedClass(Question.class).addAnnotatedClass(Answer.class).buildSessionFactory(serviceRegistry);
	      return factory;
	}
	public static void closeFactory(){
		factory.close();
		
	}

}
