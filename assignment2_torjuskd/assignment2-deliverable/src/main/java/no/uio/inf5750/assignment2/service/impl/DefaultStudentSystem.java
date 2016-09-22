package no.uio.inf5750.assignment2.service.impl;

import no.uio.inf5750.assignment2.model.Course;
import no.uio.inf5750.assignment2.model.Student;
import no.uio.inf5750.assignment2.service.StudentSystem;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collection;

public class DefaultStudentSystem implements StudentSystem{
    static Logger logger = Logger.getLogger(DefaultStudentSystem.class);
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    /**
     * Adds a course.
     *
     * @param courseCode the course code of the course to add.
     * @param name the name of the course to add.
     * @return the generated id of the added course.
     */
    public int addCourse(String courseCode, String name){
        throw new NotImplementedException();
    }

    /**
     * Updates a course.
     *
     * @param courseId the id of the course to update.
     * @param courseCode the course code to update.
     * @param name the name to update.
     */
    public void updateCourse(int courseId, String courseCode, String name){
        throw new NotImplementedException();
    }

    /**
     * Returns a course.
     *
     * @param courseId the id of the course to return.
     * @return the course or null if it doesn't exist.
     */
    public Course getCourse(int courseId){
        throw new NotImplementedException();
    }

    /**
     * Returns a course with a specific course code.
     *
     * @param courseCode the course code of the course to return.
     * @return the course code or null if it doesn't exist.
     */
    public Course getCourseByCourseCode(String courseCode){
        throw new NotImplementedException();
    }

    /**
     * Returns a course with a specific name.
     *
     * @param name the name of the course that needs to be found
     * @return the course code or null if it doesn't exist.
     */
    public Course getCourseByName(String name){
        throw new NotImplementedException();
    }

    /**
     * Returns all courses.
     *
     * @return all courses or an empty Collection if no course exists.
     */
    public Collection<Course> getAllCourses(){
        throw new NotImplementedException();
    }

    /**
     * Removes all references to the course from degrees and students and
     * deletes the course.
     *
     * @param courseId the id of the course to delete.
     */
    public void delCourse(int courseId){
        throw new NotImplementedException();
    }

    /**
     * Adds an attendant to a course and a course to a student.
     *
     * @param courseId the id of the course.
     * @param studentId the id of the student.
     */
    public void addAttendantToCourse(int courseId, int studentId){
        throw new NotImplementedException();
    }

    /**
     * Removes an attendant from a course and a course from a student.
     *
     * @param courseId the id of the course.
     * @param studentId the id of the student.
     */
    public void removeAttendantFromCourse(int courseId, int studentId){
        throw new NotImplementedException();
    }



    /**
     * Adds a student.
     *
     * @param name the name of the student to add.
     * @return the generated id of the added student.
     */
    public int addStudent(String name){
        throw new NotImplementedException();
    }

    /**
     * Updates a student.
     *
     * @param studentId the id of the student to update.
     * @param name the name to update.
     */
    public void updateStudent(int studentId, String name){
        throw new NotImplementedException();
    }

    /**
     * Returns a student.
     *
     * @param studentId the id of the student to return.
     * @return the student or null if it doesn't exist.
     */
    public Student getStudent(int studentId){
        throw new NotImplementedException();
    }

    /**
     * Returns a student with a specific name.
     *
     * @param name the name of the student to return.
     * @return the student or null if it doesn't exist.
     */
    public Student getStudentByName(String name){
        throw new NotImplementedException();
    }

    /**
     * Returns all students.
     *
     * @return all students or an empty Collection if no student exists.
     */
    public Collection<Student> getAllStudents(){
        throw new NotImplementedException();
    }

    /**
     * Removes all references to the student from courses and deletes the
     * student.
     *
     * @param studentId the id of the student to delete.
     */
    public void delStudent(int studentId){
        throw new NotImplementedException();
    }

}