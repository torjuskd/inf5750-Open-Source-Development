package no.uio.inf5750.assignment2.dao.hibernate;

import no.uio.inf5750.assignment2.dao.StudentDAO;
import no.uio.inf5750.assignment2.model.Student;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collection;

public class HibernateStudentDAO implements StudentDAO
{
    static Logger logger = Logger.getLogger(HibernateCourseDAO.class);
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    /**
     * Persists a student. An unique id is generated if the object is persisted
     * for the first time, and which is both set in the given student object and
     * returned.
     *
     * @param student the student to add for persistence.
     * @return the id of the student.
     */
    public int saveStudent( Student student ){
        throw new NotImplementedException();
    }

    /**
     * Returns a student.
     *
     * @param id the id of the student to return.
     * @return the student or null if it doesn't exist.
     */
    public Student getStudent( int id ){
        throw new NotImplementedException();
    }

    /**
     * Returns a student with a specific name.
     *
     * @param name the name of the student to return.
     * @return the student or null if it doesn't exist.
     */
    public Student getStudentByName( String name ){
        throw new NotImplementedException();
    }

    /**
     * Returns all students.
     *
     * @return all students.
     */
    public Collection<Student> getAllStudents(){
        throw new NotImplementedException();
    }

    /**
     * Deletes a student.
     *
     * @param student the student to delete.
     */
    public void delStudent( Student student ){
        throw new NotImplementedException();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}