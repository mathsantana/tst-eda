import java.util.Arrays;
import java.util.Scanner;

class ParticionaEstavel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = getArrayInteiros(scan);
		particionaEstavel(array);
		System.out.println(Arrays.toString(array));
		scan.close();

	}

	private static void particionaEstavel(int[] array) {
		int pivot = array[0];
		int indexUltimoMenor = 0;

		for (int j = array.length - 1; j >= 0; j--) {
			if (array[j] <= pivot) {
				swap(array, indexUltimoMenor, j);
			}
		}

		int i = array.length - 1;
		while (i >= 0 && array[i - 1] > array[i]) {
			swap(array, i, i - 1);
			i--;
		}

	}

	private static void swap(int[] array, int i, int j) {
		int aux = array[j];
		array[j] = array[i];
		array[i] = aux;
	}

	private static int[] getArrayInteiros(Scanner scan) {
		String[] entrada = scan.nextLine().split(" ");
		int[] array = new int[entrada.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(entrada[i]);
		}
		return array;
	}

}
