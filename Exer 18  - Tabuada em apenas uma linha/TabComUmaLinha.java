import java.util.Scanner;public class TabComUmaLinha { public static void main(String args[]) { Scanner in = new Scanner(System.in);System.out.print("Digite um número para calcular: ");int a = in.nextInt();System.out.println("A tabuada de "+ a + " é: ");for (int i = 0; i <= 10; i++){System.out.println(a + " x " + i + " = " + (a*i));}}}
