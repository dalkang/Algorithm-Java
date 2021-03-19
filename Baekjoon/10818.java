import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		int[] arr = new int[tc];
		
		for (int i = 0; i < tc; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();

		Arrays.sort(arr);
		
		System.out.println(String.format("%d %d", arr[0], arr[tc - 1]));
		
	}

}
