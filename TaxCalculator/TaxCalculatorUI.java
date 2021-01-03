
package tax;

import java.util.Scanner;

public class TaxCalculatorUI {
    
    tax object[] =new tax[2];
    
    public static void main(String[] args) {
    
        TaxCalculatorUI ok = new TaxCalculatorUI();
        ok.btnCalculateActionPerformed();
        }

private void btnCalculateActionPerformed(){
    
    Scanner scan= new Scanner(System.in);
    Scanner scan2= new Scanner(System.in);
    System.out.print("Name: ");
    String name=scan2.nextLine();
    System.out.print("ID number: ");
    int id=scan.nextInt();
    System.out.print("Status (single/married): ");
    String status = scan2.nextLine();
    System.out.print("Income: RM ");
    double taxableIncome= scan.nextDouble();
    tax aik= new tax(taxableIncome,status);
    System.out.print("Deductions: RM ");
    double d = scan.nextDouble();
    aik.setDeductions(d);
    aik.calculateTax();
    System.out.println(name.toUpperCase()+" ("+id+")");
    System.out.printf("Taxable Income: RM%.2f\n",aik.getTaxableIncome());
    double totaltax = aik.calculateTax();
    System.out.printf("Tax Amount: RM%.2f",totaltax);
       }

  
}