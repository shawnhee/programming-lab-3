//Author's name: Shawn Song-Yang Hee
//Matric Number: 227845
//Lab No: 3
package courseTotalMark;
import java.util.Scanner;

public class totalMarks_CCS3100 {
	public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in); 
	//Matric Number
	System.out.print("Please enter your matric number: "); //Prompt user to enter matric number
	int matricNo = userInput.nextInt(); //User input matric number
	//Assessment1
	System.out.print("Please enter your mark for assessment 1: "); //Prompt user to enter assessment 1 mark
	double assessmentOne = userInput.nextDouble(); //User input assessment 1 mark over 100%
	double convertAssmtOne = (assessmentOne/100)*15; //System converts assessment 1 mark over 100% to weightage 15%
	String convertAssmtOne_TwoDP = String.format("%.2f",convertAssmtOne); //System limits converted value to 2 decimal places
	//Assessment2
	System.out.print("Please enter your mark for assessment 2: "); //Prompt user to enter assessment 2 mark
	double assessmentTwo = userInput.nextDouble();	//User input assessment 2 mark over 100%
	double convertAssmtTwo = (assessmentTwo/100)*20; //System converts assessment 1 mark over 100% to weightage 20%
	String convertAssmtTwo_TwoDP = String.format("%.2f",convertAssmtTwo); //System limits converted value to 2 decimal places
	//Lab Assignment
	System.out.print("Please enter your mark for Lab assignment: "); //Prompt user to enter Lab Assignment mark
	double assignmentLab = userInput.nextDouble(); //User input lab assignment mark over 100%
	double convertAssgnLab = (assignmentLab/100)*35; //System converts lab assignment mark over 100% to weightage 35%	
	String convertAssgnLab_TwoDP = String.format("%.2f",convertAssgnLab); //System limits converted value to 2 decimal places
	//Final Exam
	System.out.print("Please enter your mark for final exam: "); //Prompt user to enter final exam mark
	double finalExam = userInput.nextDouble(); //User input final exam mark over 100%
	double convertFinalExam = (finalExam/100)*30; //System converts lab assignment mark over 100% to weightage 30%
	String convertFinalExam_TwoDP = String.format("%.2f",convertFinalExam); //System limits converted value to 2 decimal places
	//Calculate Overall Numeric Average
	double finalValue = convertAssmtOne+convertAssmtTwo+convertAssgnLab+convertFinalExam; //System calculates total mark for course CCS3100
	String finalValue_TwoDP = String.format("%.2f",finalValue); //System limits converted value to 2 decimal places
	//Display output "Your total mark for CCS3100 (*show calculation in two decimal places*) is (*output total mark in two decimal places*)"
	System.out.println("\nYour total mark for CCS3100 ("+convertAssmtOne_TwoDP+"+"+convertAssmtTwo_TwoDP+"+"+convertAssgnLab_TwoDP+"+"+convertFinalExam_TwoDP+") is: "+finalValue_TwoDP);
	}
}
