import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class PrintTest{
	public static void main(String[] args) {
	int max = 100;
	int min = 1;
		Random rn = new Random();
	for(int i =1; i < 5; i++)
	{

		int randomNum = rn.nextInt((max - min) + 1) + min;
		System.out.println((randomNum));		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(randomNum);
        Collections.sort(list, Collections.reverseOrder());
	   //  System.out.println(list);
	     Set<Integer> set = new LinkedHashSet<Integer>(list);
	     System.out.println(set);
		
	}
}}