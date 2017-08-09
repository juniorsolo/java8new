package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.management.openmbean.OpenDataException;

public class ExemploCursos {

	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java8", 113));
		cursos.add(new Curso("C", 55));
		
		
		//cursos.sort(Comparator.comparing(a -> a.getAlunos()));
		cursos.sort(Comparator.comparing(Curso::getAlunos ));
		
		//cursos.stream().filter( c -> c.getAlunos() >= 100).forEach(c -> System.out.println(c.getNome()));
		
		//cursos.stream().filter(c -> c.getAlunos() >= 100).map(c -> c.getAlunos()).forEach(total -> System.out.println(total));
		//cursos.stream().filter(c -> c.getAlunos() >= 100).map(Curso::getAlunos ).forEach( System.out::println);
		
		//cursos.stream().filter(c -> c.getAlunos() >50).forEach(c -> System.out.println(c.getNome()));
		
		Optional<Curso> optionalCurso = cursos.stream().filter(c -> c.getAlunos() >= 100).findAny();
		
		//optionalCurso.ifPresent(c -> System.out.println(c.getNome()));
		
		//Curso curso = optionalCurso.orElse(null);
		
		Map<String, Integer> map = cursos.stream().filter(c -> c.getAlunos() >= 100).collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos() ) );
		
		cursos.stream().filter(c -> c.getAlunos() >= 100).collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos() )).
		forEach((nome,alunos) -> System.out.println(nome + " tem " + alunos + " alunos..." )) ;
		
		cursos = cursos.stream().filter(c -> c.getAlunos() >= 100).collect(Collectors.toList());
		
		
		
		cursos.forEach(c -> System.out.println(c.getNome()));
		
	}

}
