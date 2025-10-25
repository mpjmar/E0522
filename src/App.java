public class App {
    public static void main(String[] args) throws Exception {
        
		System.out.println("Números primos entre 2 y 100: ");
		for (int i = 2; i <= 100; i++) {
			boolean esPrimo = true;
			int j = 2;
			while (j < i && esPrimo)
			{
				if (i % j == 0 && i != 2)
					esPrimo = false;
				j++;
			}
			if (esPrimo)
				System.out.print(i + " ");
		}
    }
}
