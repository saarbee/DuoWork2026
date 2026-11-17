package part2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StudentReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	        System.out.print("Enter department file name: ");
	        String csFileName = input.next();
	        System.out.print("Enter course file name: ");
	        String courseFileName = input.next();
         try {
	        Scanner cs = new Scanner(new File(csFileName));          
	        Scanner course = new Scanner(new File(courseFileName));  
	        PrintWriter report = new PrintWriter("report.txt");      
            
	        String FirstName="",LastName="";
	        int csId=0;
	        int courseId=0,Grade1=0,Grade2=0;
	        
	        boolean readCs=true;
	        boolean readCourse=true;
	        
	        while(true) {
	        	if(readCs) {
	        		if(!cs.hasNext())
	        			break;
	        		FirstName=cs.next();
	        		LastName=cs.next();
	        		csId=cs.nextInt();
	        	}
	        	
	        	if(readCourse) {
	        		if(!course.hasNext())
	        			break;
	        		courseId=course.nextInt();
	        		Grade1=course.nextInt();
	        		Grade2=course.nextInt();
	        	}
	        	if(csId==courseId) {
	        		int avg=(Grade1+Grade2)/2;
	        		report.println(csId+" "+FirstName+" "+LastName+" "+avg);
	        		readCs=true;
	        		readCourse=true;
	        	}else if(csId<courseId) {
	        		readCs=true;
	        		readCourse=false;
	        	}else {
	        		readCs=false;
	        		readCourse=true;
	        	}
	        }
	        
	        cs.close();
            course.close();
            report.close();
            System.out.println("report.txt created");
	        
         }catch(FileNotFoundException e) {
        	 System.out.println("Error: file not found");
         }
	
	}
}


