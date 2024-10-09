package com.example.QL_DSlop.models;
import  jakarta.persistence.*;
import java.util.List;
@Entity

public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String name;
    private  String teacher;

    @OneToMany(mappedBy = "classroom", cascade = CascadeType.ALL)
    private List<Studen> studens;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public List<Studen> getStudens() {
        return studens;
    }

    public void setStudens(List<Studen> studens) {
        this.studens = studens;
    }
}
