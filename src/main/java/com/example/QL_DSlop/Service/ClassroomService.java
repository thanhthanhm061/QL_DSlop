package com.example.QL_DSlop.Service;
import com.example.QL_DSlop.Repository.ClassroomRepository;
import com.example.QL_DSlop.models.Classroom;
import  org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ClassroomService {
    @Autowired
    private ClassroomRepository classroomRepository;

    public  List<Classroom> getAllClassrooms(){
        return classroomRepository.findAll();
    }
    public  Classroom createClassroom(Classroom classroom) {
        return  classroomRepository.save(classroom);
    }
    public  Classroom getClassroomById(Long id) {
        return classroomRepository.findById(id).orElse(null);
    }
    public void deleteClassroom(Long id){
        classroomRepository.deleteById(id);
    }
}
