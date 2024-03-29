import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ExemploCrusos {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		cursos.forEach(c ->System.out.println(c.getNome()));
		
		cursos.stream()
		.filter(c -> c.getAlunos()>=100)
		//.forEach(c -> System.out.println(c.getNome()));
		.map(Curso::getAlunos)
		.forEach(System.out::println);
		
	int sum =	cursos.stream()
		.filter(c -> c.getAlunos()>=100)
		.mapToInt(Curso::getAlunos)
		.sum();
	
	System.out.println(sum);
	cursos.stream()
	   .filter(c -> c.getAlunos() > 50)
	   .forEach(x -> System.out.println(x));
		
	}
}
