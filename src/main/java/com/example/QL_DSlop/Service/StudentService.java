package com.example.QL_DSlop.Service;
import com.example.QL_DSlop.Repository.StudentRepository;
import com.example.QL_DSlop.models.Studen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service

public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Studen> getAllStudents() {
       return studentRepository.findAll();
   }
    public Studen createStudent(Studen student) {
        return studentRepository.save(student);
   }
    public void deleteStudent(Long id) {
    studentRepository.deleteById(id);
  }

}


