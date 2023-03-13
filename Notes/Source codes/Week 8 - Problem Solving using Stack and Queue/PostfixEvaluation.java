/**
   A class  to evaluate a postfix expression.
   Adapted from code by author below

   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 4.0
*/
public class PostfixEvaluation 
{
    public static void main(String[] args) 
    {
        System.out.println("Testing PostfixEvaluation:\n");
        System.out.println("2 3 + 4 * 5 - : "   + evaluatePostfix("2 3 + 4 * 5 -") + "\n");
        System.out.println("2 3 * 4 2 - / 5 6 * + : "   + PostfixEvaluation.evaluatePostfix("2 3 * 4 2 - / 5 6 * +") + "\n");
        System.out.println("2 4 - 3 ^ 5 + : "   + PostfixEvaluation.evaluatePostfix("2 4 - 3 ^ 5 +") + "\n");        
        System.out.println("\n\nDone.");
        
         System.out.println("Testing postfixtoInfix:\n");
        System.out.println("2 3 + 4 * 5 - : "   + postfixToInfix("2 3 + 4 * 5 -") + "\n");
        System.out.println("2 3 * 4 2 - / 5 6 * + : "   + postfixToInfix("2 3 * 4 2 - / 5 6 * +") + "\n");
        System.out.println("2 4 - 3 ^ 5 + : "   + postfixToInfix("2 4 - 3 ^ 5 +") + "\n");        
        System.out.println("\n\nDone.");
    }  // end main
    
   /** Evaluates a postfix expression.
       @param postfix  a string that is a valid postfix expression.
       @return  the value of the postfix expression. */
   public static double evaluatePostfix(String postfix)
   {
      GenericStack<Double> valueStack = new GenericStack<>();
      String[] tokens = postfix.split(" ");
   
      for (String token: tokens) 
      {       
         if(isNumeric(token))
         {
            valueStack.push(new Double(token));
         }
         else if (token.equals("+") || token.equals("-") || token.equals("*")
                 || token.equals("/") || token.equals("^"))
         {
               Double operandTwo = valueStack.pop();
               Double operandOne = valueStack.pop();
               Double result = compute(operandOne, operandTwo, token);
               valueStack.push(result);
         }
//         else {
//             System.out.println("Invalid token");
//             return -999;
//         }
      } // end for
      
      return (valueStack.peek());
   } // end evaluatePostfix  
   
      /** Evaluates a postfix expression.
       @param postfix  a string that is a valid postfix expression.
       @return  the value of the postfix expression. */
   public static String postfixToInfix(String postfix)
   {
      GenericStack<String> valueStack = new GenericStack<>();
      String[] tokens = postfix.split(" ");
   
      for (String token: tokens) 
      {       
         if(isNumeric(token))
         {
            valueStack.push(token);
         }
         else if (token.equals("+") || token.equals("-") || token.equals("*")
                 || token.equals("/") || token.equals("^"))
         {
               String operandTwo = valueStack.pop();
               String operandOne = valueStack.pop();
               String result = "(" + operandOne + " " + token + " " + operandTwo + ")";
               valueStack.push(result);
         }
//         else {
//             System.out.println("Invalid token");
//             return -999;
//         }
      } // end for
      
      return (valueStack.peek());
   } // end postfixToInfix  
   
   public static boolean isNumeric(String str)
   { 
        try 
        { 
            double d = Double.parseDouble(str); 
        } 
        catch(NumberFormatException nfe) 
        { 
            return false; 
        } 
        return true; 
    } 

   private static Double compute(Double operandOne, Double operandTwo, String operator)
   {
      double result;
      
      switch (operator)
      {
         case "+": 
            result = operandOne + operandTwo;
            break;
            
         case "-": 
            result = operandOne - operandTwo;
            break;

         case "*":
            result = operandOne * operandTwo;
             break;

         case "/": 
            result = operandOne / operandTwo;
            break;

         case "^": 
            result = Math.pow(operandOne, operandTwo);
            break;
            
         default:    // Unexpected character
            result = 0;
            break;
      } // end switch

      return result;
   } // end compute
   
} // end PostfixEvaluation
  

//Testing PostfixEvaluation:
//
//2 3 + 4 * 5 - : 15.0
//
//2 3 * 4 2 - / 5 6 * + : 33.0
//
//2 4 - 3 ^ 5 + : -3.0
