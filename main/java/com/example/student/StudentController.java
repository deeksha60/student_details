package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")

public class StudentController {
    @Autowired
    StudentService service;
//    in the list we need to pass the datatype but we have 2 type of data type so we are passing the model(name of the class created) which will check the datatypes in model
//    List<Model> arr = new ArrayList<>();

//    create user
    @PostMapping ("/new")
    public String createStudent(@RequestBody Model m){
        return service.createStudent(m);
    }

//    fetch all users
    @GetMapping ("/fetchAll")
    public List<Model> getAllStudents(){
        return service.getAllStudents();
    }

//    fetch by id
    @GetMapping("/fetch{id}")
    public Model getUserById(@PathVariable int id){
        return service.getUserById(id);
    }

//    delete by id
    @GetMapping("/delete{id}")
    public String deleteById(@PathVariable int id){

        return service.deleteById(id);
    }
}
