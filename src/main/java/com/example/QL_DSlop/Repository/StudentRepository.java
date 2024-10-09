package com.example.QL_DSlop.Repository;
import com.example.QL_DSlop.models.Studen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Studen, Long> {
}