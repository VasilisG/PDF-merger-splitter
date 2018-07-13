/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdfmergersplitter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;

/**
 *
 * @author Vasilis
 */
public class DocMerger {
        
    //Attributes
    private ArrayList<DocPart> docParts;
    private PDDocument mergedDocument;
    private String filePath;
    
    //Constructor
    public DocMerger(ArrayList<DocPart> docParts, String filename){
        this.docParts = docParts;
        this.filePath = filename;
        mergedDocument = new PDDocument();
    }
    
    public String getFilePath(){
        return filePath;
    }
    
    private void addPagesToDocument(DocPart docPart){
               
        for(int i=docPart.getStartPage(); i<docPart.getEndPage(); i++){
            mergedDocument.addPage(docPart.getSourceDocument().getPage(i));
        }
    }

    private void createMergedDocument(){
        
        for(DocPart docPart : docParts){
            addPagesToDocument(docPart);
        }
    }
    
    public void saveMergedDocument(){
        
        createMergedDocument();
        
        try {
            mergedDocument.save(filePath);
            mergedDocument.close();
        } catch (IOException ex) {
            Logger.getLogger(DocMerger.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void printDocParts(){
        for(DocPart docPart : docParts){
            System.out.println(docPart);
        }
    }
}
