package tax;

import java.util.Scanner;

public class tax {

private double income, taxableIncome, deductions,taxAmount;
private static String status;
private final double RATE1=0.10;
private final double RATE2=0.20;
private final double RATE3=0.35;

public tax(double income, String status){
 //this.taxableIncome=taxableIncome;
 this.income=income;
 this.status=status;
}



public double calculateTax(){
   
   
   
    
    if (status.equals("single"))
    
    {
 taxableIncome = getTaxableIncome();
        if (taxableIncome>=0 && taxableIncome <=21000)
                taxAmount=taxableIncome*0.1;
            else if (taxableIncome>21000 && taxableIncome<=51000)
                taxAmount=taxableIncome*0.2;
            else if (taxableIncome>51000)
                taxAmount=taxableIncome*0.35;
            }
    else if (status.equals("married"))
            { taxableIncome = getTaxableIncome();
                if (taxableIncome<=35000)
                taxAmount=taxableIncome*0.1;
            else if (taxableIncome>35000 && taxableIncome<=86000)
                taxAmount=taxableIncome*0.2;
            else if (taxableIncome>86000)
                taxAmount=taxableIncome*0.35;
            }            
    return taxAmount;
    }

public double getTaxableIncome(){
   taxableIncome=income-deductions;
   return taxableIncome;
    }

public void setDeductions(double deductions){
    
    this.deductions=deductions;
    }

}



