package no.uio.inf5750.assignment2.dao.hibernate;

import java.util.List;
import java.util.List;

import no.uio.inf5750.assignment1.model.Message;
import no.uio.inf5750.assignment2.model.Course;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class HibernateCourseDao implements CourseDao{
    static Logger logger = Logger.getLogger(HibernateCourseDao.class);
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    public int saveCourse(Course course){
        return (Integer) sessionFactory.getCurrentSession().save(course);
    }
    
}