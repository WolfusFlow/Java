package figuer.com;

import java.io.*;
import java.util.*;

public class figuer {
	public static void main(String args[]) throws IOException{		
		int x1,x2,x3,x4,y1,y2,y3,y4;		
		int num=4; //default
		
		 Point p = new Point();
		    p.write();
		    
		try (Scanner scanner = new Scanner(new File("Coords.txt"))){
			ArrayList<Integer> coords = new ArrayList<Integer>();
			while (scanner.hasNextInt())
		    {
		        coords.add(scanner.nextInt());		        
		    }			
			
			/*int size = coords.size();
			 * //int coordinates[][]= {};
			int a[][]=new int[4][4];
	        System.out.println(a);*/
			
			x1=coords.get(0);
			y1=coords.get(1);
			x2=coords.get(2);
			y2=coords.get(3);
			x3=coords.get(4);
			y3=coords.get(5);
			x4=coords.get(6);
			y4=coords.get(7);
			
			/*i forget why i needed it here but let it stay just in case
			 * probably it's because i wanted to create atomic reactor when
			 * i needed a simple battery
			double form = Math.abs((x1 * (y2 - y3) +
					x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);				
			System.out.println(form);*/
						
			 	//vertex
				if ((p.dotx==2)&(p.doty==2)|(p.dotx==-2)&(p.doty==-2)|
						(p.dotx==-2)&(p.doty==-2)|(p.dotx==-2)&(p.doty==2)) {
				num = 3;}else 
				//sides
				if ((p.dotx<2)&(p.dotx>-2)&(p.doty==-2)) {
					num=2;}
				if ((p.dotx<2)&(p.dotx>-2)&(p.doty==2)) {
					num=2;}
				if ((p.doty<2)&(p.doty>-2)&(p.dotx==2)) {
					num=2;}
				if ((p.doty<2)&(p.doty>-2)&(p.dotx==-2)) {
					num=2;}	else 
				//inside
				if ((p.dotx<2)&(p.dotx>-2)&(p.doty<2)&(p.doty>-2)) {
					num=1;}					
			//System.out.println(coords); if you want to display arr			
			//Rectangle bounds = new Rectangle() awt no needed			
		}catch (FileNotFoundException e)
		{
		    e.printStackTrace();
		}	   
		
	    switch (num) {
		case 1:
			System.out.println("Dot is inside.");
			break;	
		case 2:
			System.out.println("Dot is on side.");
			break;
		case 3:
			System.out.println("Dot is vertex of rectangle.");
			break;
		case 4:
			System.out.println("Dot is outside.");
			break;
		}			
	}
}
class Point{
	float dotx,doty;
	void write(){
	Scanner wr = new Scanner(System.in);
	System.out.println("Vvedite coordinaty x");
	dotx = wr.nextFloat();
	System.out.println("Vvedite coordinaty y");
	doty = wr.nextFloat();}			
}
/*no time for doing it throw other class implement later mb
class figuerCoords {
	float x1,x2,x3,x4,y1,y2,y3,y4;	
	figuerCoords(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4){
		this.x1 = x1;this.x2 = x2;this.x3 = x3;this.x4 = x4;
		this.y1 = y1;this.y2 = y2;this.y3 = y3;this.y4 = y4;
	}		
	float form(){
		return (float)Math.abs((x1 * (y2 - y3) + 
		        x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
		}
}*/