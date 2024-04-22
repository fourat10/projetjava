/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package best_cars;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class testdel {
    public static void main(String[] args) {
                    // Get today's date
            Date currentDate = new Date();

  
             String pattern = "yyyy-MM-dd";
            // Create a SimpleDateFormat object with the pattern
            SimpleDateFormat dateFormat2 = new SimpleDateFormat(pattern);

            // Format the current date to a string
            String today = dateFormat2.format(currentDate);
            System.out.println(today);
            
    }
}
