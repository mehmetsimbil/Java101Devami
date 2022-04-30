import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double tutar;
		double kdvOran = 0.18;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen tutarý girin:");
		tutar = scanner.nextDouble();
		double kdv = tutar * kdvOran;
		double kdvliTutar = tutar + kdv;
		System.out.println(kdvliTutar);
	}

}
