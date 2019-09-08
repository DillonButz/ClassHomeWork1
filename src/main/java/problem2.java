
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Djon Bon Junzi
 */
public class problem2 {
    public static void main(String[] args)
    {
        float caloriesPerCookie = 75F;
        Scanner makeNewScanner = new Scanner(System.in);
        
        System.out.println("Please enter the number of cookies you ate: ");
        float cookieInput = makeNewScanner.nextFloat();
        float totalCookieCalories = caloriesPerCookie * cookieInput; 
        
        System.out.println("Total calories for the cookies you ate is " + totalCookieCalories);
    }
}
