package com.example.faculdade.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.faculdade.Domain.Curso;
import com.example.faculdade.Service.CursoService;

@Controller
public class CursoController {

	 @Autowired
	 private CursoService service;

	 @GetMapping("/")
	 public String visualizacaoPagina(Model model){
		List<Curso> listcurso = service.listAll();
		model.addAttribute("listcurso", listcurso);
		System.out.print("Get / ");
		return "Curso";
	}

	 @GetMapping("/adicionar")
	 public String adicionarCurso(Model model){
		List<Curso> listcurso = service.listAll();
		model.addAttribute("listcurso", listcurso);
		model.addAttribute("curso", new Curso());
		return "adicionar";
	}

	 @RequestMapping(value = "/save", method = RequestMethod.POST)
	 public String salvarCurso(@ModelAttribute("curso") Curso curso){
		service.salvar(curso);
		return "redirect:/";
	}

	 @RequestMapping("/edit/{id}")
	 public ModelAndView exibirAlteracao(@PathVariable(name="id") int id){
		ModelAndView mav = new ModelAndView("adicionar");
		Curso curso = service.buscar(id);
		mav.addObject("curso", curso);
		return mav;
	}

	 @RequestMapping("/delete/{id}")
	 public String deletarCurso(@PathVariable(name="id") int id){
		service.deletar(id);
		return "redirect:/";
	}
}
