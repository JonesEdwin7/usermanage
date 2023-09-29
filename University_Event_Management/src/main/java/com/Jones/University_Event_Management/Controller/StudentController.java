package com.Jones.University_Event_Management.Controller;

import com.Jones.University_Event_Management.Model.DepartmentType;
import com.Jones.University_Event_Management.Model.Student;
import com.Jones.University_Event_Management.Service.Student_Service;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class StudentController {

    @Autowired
    Student_Service studentService;

    @PostMapping("student")
    public String addStudent(@RequestBody @Valid Student student){
        return studentService.addStudent(student);
    }

    @PutMapping("student/{studentId}/{departmentType}")
    public String updateStudentDepartment(@PathVariable Long studentId, @PathVariable DepartmentType departmentType){
        return studentService.updateStudentDepartment(studentId,departmentType);
    }

    @DeleteMapping("student/{studentId}")
    public String deleteStudent(@PathVariable Long studentId){
        return studentService.deleteStudentById(studentId);
    }

    @GetMapping("students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("student/{studentId}")
    public Student getStudentById(@PathVariable Long studentId){
        return studentService.getStudentById(studentId);
    }
}
