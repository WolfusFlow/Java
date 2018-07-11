package numSequence.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.math.*;

import javax.swing.event.InternalFrameListener;

public class numSequence {
public static void main(String args[]) {
		
	int max,min,med,aver=0;
	int per=90;
	
		try (Scanner scanner = new Scanner(new File("Nums.txt")))
		{
		    ArrayList<Integer> numbers = new ArrayList<>();
		    while (scanner.hasNextInt())
		    {
		        numbers.add(scanner.nextInt());		        
		    }
		    max = Collections.max(numbers);
	        min = Collections.min(numbers);
	        OptionalDouble average = numbers.stream().mapToInt(val -> val).average();
	        med = (numbers.get(numbers.size()/2) + numbers.get(numbers.size()/2 - 1))/2;	        		      
	        //String str = average.toString(); not working can't remember how don't display optionalDouble in output
	        double Percent = Math.ceil(((double)90 / (double)100) * (double)numbers.size())-1;
	        
	       	        
		    //show collection System.out.println(numbers);
	        System.out.println("90 percentile - "+Percent);
	        System.out.println("median - " +med);
	        System.out.println("average - " +average);
		    System.out.println("max - " +max);
		    System.out.println("min - " +min);		    		    
		}
		catch (FileNotFoundException e)
		{
		    e.printStackTrace();
		}		
	}
}