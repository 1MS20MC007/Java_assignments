package com.valtech.assignment;
import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;



public class PasswordStrengthCheckerTest {
	 @Test
	    public void checkdigit() {
	        PasswordStrengthChecker lwr=new PasswordStrengthChecker();
	            assertEquals(false, lwr.checkdigit("452555"));
	            
	            }
	
	@Test
    public void uppertest() {
    PasswordStrengthChecker upr=new PasswordStrengthChecker();
    assertEquals(true, upr.checkupper("ABCDEFGH"));
   }



   @Test
    public void testchecklower() {
        PasswordStrengthChecker lwr=new PasswordStrengthChecker();
            assertEquals(true, lwr.checklower("abcdefgh"));
            
            }
//   @Test
//   public void checkspecialchar() {
//       PasswordStrengthChecker lwr=new PasswordStrengthChecker();
//           assertEquals(false, lwr.checkspecialchar("@#$%%%"));
//           
//           }
   
  }
		
   
        