package com.xiaoshu.service;

import com.xiaoshu.dao.StudentMapper;
import com.xiaoshu.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shaohui
 * @date 2023/4/17
 */
@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public List<Student> findStudent(){
        return studentMapper.selectAll();
    }
}
