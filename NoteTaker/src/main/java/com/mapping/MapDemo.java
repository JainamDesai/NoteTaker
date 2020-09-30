package com.mapping;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import helper.FactoryClas;

public class MapDemo {
	
	public static void main(String args[]){
		
		  
		Session s = FactoryClas.getSessionFactory().openSession();
		Question q = new Question();
		q.setQuestion_id(12);
		q.setQuestion("what is java");
		Question q2 = new Question();
		q2.setQuestion("what is php");
		q2.setQuestion_id(15);
		List<Answer> li = new ArrayList();
		List<Question> liq = new ArrayList();
	   liq.add(q2);
	   liq.add(q);
		Answer a = new Answer();
		a.setAnswer("java is oops");
		a.setAnswer_id(17);
		a.setQ(liq);
		Answer a2 = new Answer();
		a2.setAnswer("php is oops");
		a2.setAnswer_id(18);
		a2.setQ(liq);
		li.add(a);
		li.add(a2);	
		q.setAns(li);
		Transaction tc = s.beginTransaction();
		s.save(q);
		s.save(q2);
		s.save(a);
		s.save(a2);
		tc.commit();
		Question qdata = s.get(Question.class,12);
		System.out.println(qdata.getAns());
		s.close();
		
		
	}
	
	

}
