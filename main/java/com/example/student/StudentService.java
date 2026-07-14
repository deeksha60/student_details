package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentService {
@Autowired
StudentRepository repo;
//    List<Model> arr = new ArrayList<>();

    //    create user
    public String createStudent( Model m){
        repo.save(m);
        return "user added successfully";
    }

    //    fetch all users
    public List<Model> getAllStudents(){
        return repo.findAll();
    }

    //    fetch by id
    public Model getUserById(int id){
        return repo.findById(id).orElse(null);
    }

    //    delete by id
    public String deleteById( int id){
        repo.deleteById(id);
        return "user deleted successfully";
    }
}
