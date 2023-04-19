package com.xiaoshu.controller;

import com.xiaoshu.entity.Student;
import com.xiaoshu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author shaohui
 * @date 2023/4/17
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService service;

    @RequestMapping("/studentIndex")
    public String findStudent(Model model){
        List<Student> students = service.findStudent();
        model.addAttribute("students",students);
        return "student";
    }
}
