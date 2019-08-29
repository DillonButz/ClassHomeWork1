/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Djon Bon Junzi
 */
import java.util.Scanner;
public class problem1 {
    public static void main(String[] args)
    {
        float stateSalesTax = 0.04F;
        float countySalesTax = 0.02F;
        Scanner makeNewScanner = new Scanner(System.in);
        
        System.out.println("Enter ammount of purchase");   
        float ammountOfPurchase = makeNewScanner.nextFloat();
        float totalStateSalesTax = ammountOfPurchase * stateSalesTax;
        float totalCountySalesTax = ammountOfPurchase * countySalesTax;
        float totalSalesTax = totalStateSalesTax + totalCountySalesTax;
        float endingAmmount = ammountOfPurchase + totalSalesTax;
        
        System.out.println("Ammount of purchase: "+ ammountOfPurchase);   
        System.out.println("Total State sales tax: "+ totalStateSalesTax);
        System.out.println("Total County sales tax: "+ totalCountySalesTax);
        System.out.println("Total Sales Tax: "+ totalSalesTax);
        System.out.println("Total cost of Purchase and sales tax: "+ endingAmmount);   
    }
}
