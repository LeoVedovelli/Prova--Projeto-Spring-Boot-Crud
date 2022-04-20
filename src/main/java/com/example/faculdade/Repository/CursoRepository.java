package com.example.faculdade.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.faculdade.Domain.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

}
