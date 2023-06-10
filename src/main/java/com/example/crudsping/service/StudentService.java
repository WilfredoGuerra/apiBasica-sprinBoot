package com.example.crudsping.service;

import com.example.crudsping.entity.Student;
import com.example.crudsping.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

//    Traer todos los estudiantes
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
// traer un estudiante
    public Optional<Student> getStudent(Long id){
        return studentRepository.findById(id);
    }
// Guardar o actualizar estudiante
    public void saveOrUpdate(Student student){
        studentRepository.save(student);
    }

//    Borrar estudiante
    public void delete(Long id){
        studentRepository.deleteById(id);
    }
}
