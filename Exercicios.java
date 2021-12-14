
public class Exercicios {
	public static void main(String[] args) {
		//rescrever utilizando lambda
		new Thread(new Runnable() {

		    @Override
		    public void run() {
		        System.out.println("Executando um Runnable");
		    }

		}).start();
		
	new Thread(()-> System.out.println("Executando um Runnable")).start();
		
	}

}
