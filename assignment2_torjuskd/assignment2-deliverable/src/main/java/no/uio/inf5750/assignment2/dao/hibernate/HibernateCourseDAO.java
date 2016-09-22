package no.uio.inf5750.assignment2.dao.hibernate;

import java.util.Collection;
import java.util.List;
import no.uio.inf5750.assignment2.model.Course;
import no.uio.inf5750.assignment2.dao.CourseDAO;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@Transactional
public class HibernateCourseDAO implements CourseDAO{
    static Logger logger = Logger.getLogger(HibernateCourseDAO.class);
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    public int saveCourse(Course course){
        return (Integer) sessionFactory.getCurrentSession().save(course);
    }
    public Course getCourse(int id){
        return (Course) sessionFactory.getCurrentSession().get(Course.class, id);
    }
    public Course getCourseByCourseCode(String courseCode){

        Session session = sessionFactory.openSession();

        Transaction tx = null;
        Course course = null;

        try {

            tx = session.beginTransaction();

            @SuppressWarnings("unchecked")

            // This is an HQL query, not an SQL query (HQL is based on SQL, but
            // is not 100% the same)

            List<Course> courses = session.createQuery("FROM Course WHERE courseCode like "+courseCode).list();

            if (!courses.isEmpty()) {

                course = courses.iterator().next();

            }
            tx.commit();

        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            logger.error("DB query failed", e);
        } finally {
            session.close();
        }
        return course;
    }

    public Course getCourseByName(String name){

        Session session = sessionFactory.openSession();

        Transaction tx = null;
        Course course = null;

        try {

            tx = session.beginTransaction();

            @SuppressWarnings("unchecked")

            // This is an HQL query, not an SQL query (HQL is based on SQL, but
            // is not 100% the same)

            List<Course> courses = session.createQuery("FROM Course WHERE name like "+name).list();

            if (!courses.isEmpty()) {

                course = courses.iterator().next();

            }
            tx.commit();

        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            logger.error("DB query failed", e);
        } finally {
            session.close();
        }
        return course;
    }

    public Collection<Course> getAllCourses(){
        throw new NotImplementedException();
        /*Session session = sessionFactory.openSession();

        Transaction tx = null;
        List<Course> courses = null;

        try {

            tx = session.beginTransaction();

            @SuppressWarnings("unchecked")

            // This is an HQL query, not an SQL query (HQL is based on SQL, but
            // is not 100% the same)

            List<Course> lookup = session.createQuery("FROM Course ORDER by id DESC").list();
            courses = (List<Course>) lookup;

            tx.commit();

        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            logger.error("DB query failed", e);
        } finally {
            session.close();
        }
        return courses;*/
    }

    public void delCourse(Course course){
        sessionFactory.getCurrentSession().remove(course);
    }
}