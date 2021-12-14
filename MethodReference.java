import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReference {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();

		palavras.add("Alura online");
		palavras.add("Editora casa do codigo");
		palavras.add("caelum");

		palavras.sort((s1, s2) -> {
			if (s1.length() < s2.length())
				return -1;
			if (s1.length() > s2.length())
				return 1;

			return 0;
		});

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		palavras.forEach(s -> System.out.println(s));
		
		
		
		//Forma utilizada
		palavras.sort(Comparator.comparing(s -> s.length()));
		//Method reference
		
		palavras.sort(Comparator.comparing(String::length));
						
		
		
		
		// forma itermediaria
		Comparator<String> comparadorResumido = Comparator.comparing(s -> s.length());
		palavras.sort(comparadorResumido);
		
		
		// Quebrando em função                                 //method reference
		Function<String, Integer> funcao = s -> s.length();  Function<String, Integer> funcaoReference = String::length;
		Comparator<String> comparador = Comparator.comparing(funcao);
		palavras.sort(comparador);

	

		// Sem lambds ficaria (classe anônima)
		Function<String, Integer> funcaoSemLambda = new Function<String, Integer>() {

			@Override
			public Integer apply(String s) {
				return s.length();
			}
		};
		
		Comparator<String> comparadorSemLambida = Comparator.comparing(funcaoSemLambda);
		palavras.sort(comparadorSemLambida);

		;
		
		System.out.println(palavras);
		Consumer<String> Impressor =System.out::println;
		palavras.forEach(Impressor);
		
		palavras.forEach(System.out::println);

	}
}
