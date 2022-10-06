/* Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe. */

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle;
		rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width:");
		rectangle.width = sc.nextDouble();
		
		System.out.println("Enter rectangle height:");
		rectangle.height = sc.nextDouble();
		
		double areaRectangle = rectangle.area();
		double perimeterRectangle = rectangle.perimeter();
		double diagonalRectangle = rectangle.diagonal();
		
		System.out.printf("AREA = %.2f\n", areaRectangle);
		System.out.printf("PERIMETER = %.2f\n", perimeterRectangle);
		System.out.printf("DIAGONAL = %.2f\n", diagonalRectangle);
		
		sc.close();
	}

}
