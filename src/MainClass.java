import java.util.Random;
import java.util.Scanner;

public class MainClass {


	String Op[]  = {"+","-","/","*"};
	Scanner sc = new Scanner(System.in);

	public static void main (String []args){
		int A[]  = new int[6];
		for ( int i = 0;i<A.length; i++){
			A[i] = i+1;
		}
		System.out.println(multiply(A));
	}

	public static long add(int []A){

		Random rn = new Random();

		int num = rn.nextInt(10) +3;


		int Anum [] = A;

		int result = Anum[0];

		for ( int i = 1;i<Anum.length; i++){
			result+= Anum[i];
		}


		return result;
	}

	public static long subtract(int []A){

		Random rn = new Random();


		int Anum [] = A;
		int result = Anum[0];
		for ( int i = 1;i<Anum.length; i++){
			result -= Anum[i];
		}


		return result;
	}

	public static long multiply(int []A){

		Random rn = new Random();

		int num = rn.nextInt(10) +3;


		int Anum [] = A;
		int result = Anum[0];
		for ( int i = 1;i<Anum.length; i++){
			result *= Anum[i];
		}


		return result;
	}
	public static long divide(int []A){

		Random rn = new Random();

		int num = rn.nextInt(10) +3;


		int Anum [] = A;
		int result = Anum[0];
		
		if ( Anum[0] == 0){
			System.out.print("Division by 0 not possible!");
		}
		else{
			for ( int i = 1;i<Anum.length; i++){
				result/= Anum[i];
			}

		}

		return result;
	}

}
