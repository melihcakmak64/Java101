import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int mat,fizik,kimya,turkce,tarih,muzik;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Matematik notunuz :");
		mat=scanner.nextInt();
		
		System.out.print("Fizik notunuz :");
		fizik=scanner.nextInt();

		System.out.print("Kimya notunuz :");
		kimya=scanner.nextInt();
		
		System.out.print("T�rk�e notunuz :");
		turkce=scanner.nextInt();
		
		System.out.print("Tarih notunuz :");
		tarih=scanner.nextInt();
		
		System.out.print("M�zik notunuz :");
		muzik=scanner.nextInt();
		
		double ortalama=(mat+fizik+kimya+turkce+tarih+muzik)/6.0;
		
		
	
		String msg = ortalama > 60 ? "S�n�f� Ge�ti" : "S�n�fta Kald�";
 System.out.println(msg);

	}

}
