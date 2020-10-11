/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordchecker;
import javax.swing.JOptionPane;
/**
 *
 * @author robin
 */
public class PasswordChecker {

    /**
     * @param args the command line arguments
     */

    
    public void setWord(){
        
    }
    public static void main(String[] args) {
        PasswordClass  s = new PasswordClass();
        boolean len;
        s.setWord();
        s.validPassword();
        System.out.println("Valid"+s.valid);
        s.checkLower();
        System.out.println("Lower"+s.lower);
        s.checkUpper();
        System.out.println("Upper"+s.upper);
        s.checkSymbol();
        System.out.println("Symbol"+s.symbol);
        s.checkNumber();
        System.out.println("Number"+s.number);
        len = s.word.length()>=8;
        System.out.println("Length"+len);
        
    }
    
}
