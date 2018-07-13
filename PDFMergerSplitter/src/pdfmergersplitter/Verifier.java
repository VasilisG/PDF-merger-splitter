/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdfmergersplitter;

/**
 *
 * @author Vasilis
 */
public class Verifier {
    
     //Method that verifies if given input is numeric.
    public static boolean verifyNumericInput(String input){
        
        if(input.equals(Constants.EMPTY_STRING)) return false;
        
        for(char ch: input.toCharArray()){
            if(!Character.isDigit(ch)){
                return false;
            }
        }
        return true;
    }
    
    //Method that verifies if given filename input is valid.
    public static boolean verifyFilenameInput(String filename){
        
        if(filename.equals(Constants.EMPTY_STRING)) return false;
                
        for(char ch : filename.toCharArray()){
            for(char illegalChar : Constants.ILLEGAL_CHARACTERS){
                if(ch == illegalChar){
                    return false;
                }
            }
        }
        return true; 
    }
    
    //Method that checks if given start and end page number indices are valid.
    public static boolean arePageIndicesValid(int startPage, int endPage, int documentPages){
        if(startPage < 1 || startPage > documentPages) return false;
        else if(endPage < 1 || endPage > documentPages) return false;
        else if(startPage > endPage) return false;
        else return true;
    }   
}
