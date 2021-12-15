import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExemploCrusos2 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		cursos.forEach(c ->System.out.println(c.getNome()));
		
		
	   OptionalDouble media = cursos.stream()
		.filter(c -> c.getAlunos()>=100)
		.mapToInt(Curso::getAlunos)
		.average();
		
		
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
	//O optional surgiu no java 8 e nos ajuda a trabalhar com Null , tirando a necessidade daqueles inúmero ifs 	
Optional<Curso> optionalCurso =cursos.stream()
.filter(c ->c.getAlunos()>=1000)
.findAny();

System.out.println(sum);
cursos.stream().
filter(c ->c.getAlunos()>=100)
.findAny()
.ifPresent(c-> System.out.println(c.getNome()));

List<Curso> resultado = cursos.stream()
.filter(c ->c.getAlunos()>=100)
.collect(Collectors.toList());

cursos = cursos.stream()
.filter(c ->c.getAlunos()>=100)
.collect(Collectors.toList());

 Map<Object, Object> map = cursos.stream()
.filter(c ->c.getAlunos()>=100)
.collect(Collectors.toMap(c -> c.getNome(),c -> c.getAlunos()));
 
 System.out.println(map);
 
 cursos.stream()
.filter(c ->c.getAlunos()>=100)
.collect(Collectors.toMap(c -> c.getNome(),c -> c.getAlunos()))
.forEach((nome,alunos)->System.out.println(nome+" tem "+alunos +"alunos"));
	
	}
	

}
