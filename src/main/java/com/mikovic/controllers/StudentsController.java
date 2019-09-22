package com.mikovic.controllers;

import com.mikovic.models.Student;
import com.mikovic.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
public class StudentsController {
    private StudentsService studentsService;

    @Autowired
    public void setStudentsService(StudentsService studentsService) {
        this.studentsService = studentsService;
    }

    @RequestMapping("/showStudent")
    public String hello(Model uiModel, @ModelAttribute("student") Student student) {
        student = studentsService.getStudentById(10);
        uiModel.addAttribute("student", student);
        System.out.println(student.getFirstName() + " " + student.getLastName());
        return "students";
    }

    @RequestMapping(path = "/showStudentById", method = RequestMethod.GET)
    @ResponseBody
    public Student showStudentById(Model uiModel, @RequestParam int id) {
        Student student = studentsService.getStudentById(id);
        return student;
    }

    @RequestMapping(path = "/showStudentById/{sid}", method = RequestMethod.GET)
    @ResponseBody
    public Student showStudentById(@PathVariable("sid") int id) {
        Student student = studentsService.getStudentById(id);
        return student;
    }

    @RequestMapping(path = "/setStudentById", method = RequestMethod.POST)
    public void setStudent(@RequestBody Student student) {
        System.out.println(student.getFirstName() + " " + student.getLastName());
    }

    @RequestMapping("/showForm")
    public String showSimpleForm(Model uiModel) {
        Student student = new Student();
        uiModel.addAttribute("student", student);
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student student) {
        return "student-form-result";
    }


}

