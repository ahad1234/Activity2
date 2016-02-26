import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class ActivityTest {

	@Test
public void testAdd(){
	
	Random rn = new Random();
	
	int first [] = new int [6];
	MainClass mc = new MainClass();
	
	for (int i = 0;i<first.length;i++){
		first[i] = i+1;
		System.out.print(first[i]);
	}
	
	assertEquals(21, mc.add(first));
}
	@Test
public void testSub(){
	
	Random rn = new Random();
	
	int lim = rn.nextInt(15) + 4;
	int first [] = new int [6];
	MainClass mc = new MainClass();
	
	for (int i = 0;i<first.length;i++){
		first[i] = i+1;
	}
	
	assertEquals(-19, mc.subtract(first));
}
	
	@Test
public void testDiv(){
	
	Random rn = new Random();
	
	int lim = rn.nextInt(15) + 4;
	int first [] = new int [6];
	MainClass mc = new MainClass();
	
	for (int i = 0;i<first.length;i++){
		first[i] = i;
	}
	
	assertEquals(0, mc.divide(first));
}
	@Test
public void testMul(){
	
	Random rn = new Random();
	
	int lim = rn.nextInt(15) + 4;
	int first [] = new int [6];
	MainClass mc = new MainClass();
	
	for (int i = 0;i<first.length;i++){
		first[i] = i+1;;
	}
	
	assertEquals(720, mc.multiply(first));
}
	
}
