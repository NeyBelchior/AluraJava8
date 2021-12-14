import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaString {
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

		/*
		 * for(String p : palavras) { System.out.println(p); }
		 */
		// Eu não posso dar new numa interface pois falta o complemento, aqui foi criado
		// uma classe anonima para implementar o método, e eu posso usar o new só se eu
		// fornecer as informações do complemento
		// a classes anonimas servem para a gente não ter que criar uma classe muito
		// simples que implementa algo trivial
		// Usamos quando implementamos interfarces muito curtas com 1 ou poucos metodos
		// e em especial quando não vamos reaproveitar esse código
		/*
		 * Consumer<String> consumidor = new Consumer<String>() {
		 * 
		 * @Override public void accept(String t) { System.out.println(t);
		 * 
		 * }
		 */

		// Default metodo é aquele metodo que agora dentro de uma interface tem
		// implementação, foi uma forma e adicionar outros metodos dentro de interfaces
		// maes sem quebrar o código
		// o forEach na interface Iterable. Como Iterable é mãe de Collection, temos
		// acesso a esse método na nossa lista.
		// ---------------------------------------------------------------------------

		// Nesse caso como temos uma interface que só tem um método que está sendo
		// implementado eu posso usar lambdas
		/*
		 * palavras.forEach(new Consumer<String>() {
		 * 
		 * @Override public void accept(String s) { System.out.println(s);
		 * 
		 * };
		 */
		palavras.forEach(s -> System.out.println(s));

	}
}
