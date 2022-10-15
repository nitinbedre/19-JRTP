package com.example.group.artifact.repository;

import org.springframework.stereotype.Repository;
import com.example.group.artifact.domain.Student;
import org.springframework.data.jpa.repository.*;

@Repository
public interface StudentRepository extends JpaRepository<Student, String>, JpaSpecificationExecutor<Student> {

}
