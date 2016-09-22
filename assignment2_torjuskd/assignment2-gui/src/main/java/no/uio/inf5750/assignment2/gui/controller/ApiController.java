package no.uio.inf5750.assignment2.gui.controller;
import java.util.Collection;
import org.apache.log4j.Logger;

import no.uio.inf5750.assignment2.model.Student;
import no.uio.inf5750.assignment2.model.Course;
import no.uio.inf5750.assignment2.service.StudentSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * implements web api interfaces at /api/student, /api/student/{student}/location, /api/course
 */
public class ApiController {
    /*
    @RequestMapping(value="/student/{user}", method = RequestMethod.GET)
    @ResponseBody
    public Student getStudentByUsername(@PathVariable String user,
                                        HttpServletRequest request,
                                        HttpServletResponse response) {

        Student student = studentService.getStudent(user);
        return student;
    }
    */
}
