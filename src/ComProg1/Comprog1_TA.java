package ComProg1;

import java.util.Scanner;

/**
 *BTW THIS IS JUST A DUPLICATE FROM THE HELLO WORLD ONE FOR PROPER NAME SUBMISSION
 * @author Abiel Ojedrehve (it's me! ya boyyy soloing and hoping mercy from sirrr... Abiel Ojedrehve is my pc name, coach)
 */
public class Comprog1_TA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("=========Payroll Calculator=========");
        
        //Inputs//
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        System.out.print("Enter your 6-digit Employee ID: ");
        input.nextLine();
        
        System.out.print("Hours worked: ");
        double hoursWorked = input.nextDouble();
        
        System.out.print("Hourly rate: ");
        double hourlyRate = input.nextDouble();
        
        //Income Variables//
        double stdWeeklyHours = 40.0;
        double overtimeCoefficient = 1.25;
        
        double regularPay = stdWeeklyHours * hourlyRate;
        double overtimePayRate = overtimeCoefficient * hourlyRate;
        double overtimeHours = hoursWorked - stdWeeklyHours;
        double overtimePay = overtimeHours * overtimePayRate;
        double grossPay = regularPay + overtimePay;
        

        ///Calculate Deductions///
        
        //Deductions Factors//
        double philhealth = 0.025;
        double sss = 0.1;
        double pagibig = 0.02;
        
        //Deduction Values//
        double philhealthDeduc = grossPay * philhealth;
        double sssDeduc = grossPay * sss;
        double pagibigDeduc = grossPay * pagibig;
        double deducTotal = philhealthDeduc + sssDeduc + pagibigDeduc;
        
        //Calculate Net Pay
        double netpay = grossPay - deducTotal;
        
        //Earnings Statement (yippeeee)//
        System.out.println("----Payment Details---- ");
        System.out.println("Good Day" + name);
        System.out.println("Gross Salary: " + grossPay);
        System.out.println("Deductions: ");
        System.out.println("PhilHealth: " + philhealthDeduc);
        System.out.println("SSS: " + sssDeduc);
        System.out.println("Pag-Ibig: " + pagibigDeduc);
        System.out.println("Total Deduction: " + deducTotal);
        System.out.println("Net Salary: " + netpay);
        
        if (hoursWorked > 40.0) {
            System.out.println("Great Job " + name + "! We look forward for your extensive hard work.");
        }    
            else {
            System.out.println("Good Job " + name + ", We look forward for your continued hard work.");
        }
        }
    }
