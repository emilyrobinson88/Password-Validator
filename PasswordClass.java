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
public class PasswordClass 
{
    String word;
    String newString;
    String backwards;
    boolean lower;
    boolean upper;
    boolean valid=false;
    boolean symbol = false;
    boolean number = false;
    
    public void setWord(){
        word =  JOptionPane.showInputDialog("Enter the word");
    }
    public void validPassword()
    {
        int i;
        for(i=0; i< word.length(); i++)
        {
            if((word.charAt(i)>=33&&word.charAt(i)<=126))
            {
                valid = true;
            }  
        }
    }
    public void checkLower()
    {
        int i;
        lower=false;
        for(i=0; i< word.length(); i++)
        {
            if(word.charAt(i)>='a'&&word.charAt(i)<='z')
            {
                lower = true;
            }  
        }   
    }
    public void checkUpper()
    {
        int i;
        upper=false;
        for(i=0; i< word.length(); i++)
        {
            if(word.charAt(i)>='A'&&word.charAt(i)<='Z')
            {
                upper = true;
            }
               
        }   
    }
     public void checkNumber()
    {
        int i;
        number=false;
        for(i=0; i< word.length(); i++)
        {
            if(word.charAt(i)>=48&&word.charAt(i)<=57)
            {
                number = true;
            }
               
        }   
    }
    public void checkSymbol()
    {
        int i;
        symbol=false;
        for(i=0; i< word.length(); i++)
        {
            if((word.charAt(i)>=33&&word.charAt(i)<=42)||(word.charAt(i)>=58&&word.charAt(i)<=64)||
                    (word.charAt(i)>=91&&word.charAt(i)<=96)||(word.charAt(i)>=123&&word.charAt(i)<=126))
            {
                symbol = true;
            }
               
        }   
    }
}
