    /**
      Colorado State University - ITS-320 Basic Programming
      Program 3 - Java application to calculate the total order
      retail amounts for a selection of products and
      quantities purchased. This program is the application
      described by Exercise 5.17 on p. 194 of D&D's 9th Edition.
      Programmed by: karofos; instructor: Dr. Anwar Ahmad
      Date: April 3, 2015
   */
  
  import java.text.NumberFormat; // class for numeric formatting
  import java.util.Locale;      // class for country-specific information
  import javax.swing.*;
  
  public class ProgramJ3
  {
     public static void main (String[] args)
     {
        double product1 = 0, product2 = 0, product3 = 0;
        double product4 = 0, product5 = 0;
        
        String inputString;
        
        int productId = 1;
        
        //ask product number util flag value entered
        
        while (productId != -1)
           {
              //determine product chosen
              inputString = JOptionPane.showInputDialog("Enter product Number (1-5) or -1 to Quit:");
              productId = Integer.parseInt(inputString);
              
              //terminate application if input -1
              if (productId == -1)
                 {
                    System.exit(0);
                 } 
              
              System.out.println(productId);
              if (productId >= 1 && productId <=5)
              
                 //number sold of item
                 {
                    inputString = JOptionPane.showInputDialog ("Enter quantity or -1 to Quit:");
                    int quantity1 = Integer.parseInt(inputString);
                    
                       // terminate application if input -1
                      if (quantity1 == -1)
                 {
                    System.exit(0);
                 } 
  
                    //Calculate the total for the item by the price times the quantity sold
                    switch (productId)
                       {
                          case 1:
                          product1 = quantity1 * 2.98;
                          break;
                          
                          case 2:
                          product2 = quantity1 * 4.50;
                          break;
                          
                          case 3:
                          product3 = quantity1 * 9.98;
                          break;
                          
                          case 4:
                          product4 = quantity1 * 4.49;
                          break;
                          
                          case 5:
                          product5 = quantity1 * 6.87;
                          break;
                       }
                  }
                  
                  else if (productId != -1)
                    {
                       JOptionPane.showMessageDialog (null, "Product number must be between 1 and 5 or -1 to Quit", 
                       "Input Error", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    //create decimal format with two digits to the right of decimal point
              NumberFormat moneyFormat =
                 NumberFormat.getCurrencyInstance(Locale.US);
              
              //create subtotal message
              String output = "";
              if (product1 > 0)
                 {
                   output += "Product 1: " + moneyFormat.format (product1) + "\n";
                 }   
              
              if (product2 > 0)
                 {
                    output += "Product 2: " + moneyFormat.format (product2) + "\n";
                 }
             
             if (product3 > 0)
                {
                   output += "Product 3: " + moneyFormat.format (product3) + "\n";
                }
             
             if (product4 > 0)
                {
                   output += "Product 4: " + moneyFormat.format (product4) + "\n";
                }
                
             if (product5 > 0)
                {
                   output += "Product 5: " + moneyFormat.format (product5) + "\n";
                }
                
                JTextArea outputArea = new JTextArea (6, 20);
                outputArea.setText(output);
                
                //show results
                JOptionPane.showMessageDialog(null, outputArea, "Subtotals", JOptionPane.INFORMATION_MESSAGE);
            }
       System.exit(0);
       }
 }
