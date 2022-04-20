package com.example.faculdade.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.faculdade.Domain.Curso;
import com.example.faculdade.Repository.CursoRepository;

@Service
public class CursoService {
	
	 @Autowired
	 private CursoRepository repo;

	 public List<Curso> listAll(){
		return repo.findAll();
	}

	 public void salvar(Curso curso){
		repo.save(curso);
	}

	 public Curso buscar(long id){
		return repo.findById(id).get();
	}

	 public void deletar(long id){
		repo.deleteById(id);
	}
}
