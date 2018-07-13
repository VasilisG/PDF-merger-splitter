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
import org.apache.pdfbox.pdmodel.PDPage;

/**
 *
 * @author Vasilis
 */
public class DocSplitter {
    
    //Attributes    
    private ArrayList<DocPart> docParts;
    private ArrayList<PDDocument> splitDocuments;
    
    //Constructor
    public DocSplitter(ArrayList<DocPart> docs){
        docParts = docs;
        splitDocuments = new ArrayList<PDDocument>();
    }
    
    public void setDocParts(ArrayList<DocPart> docParts){
        this.docParts = docParts;
    }
    
    public ArrayList<DocPart> getDocParts(){
        return docParts;
    }
    
    public int getNewDocumentCount(){
        return splitDocuments.size();
    }
    
    public void createNewDocuments(){
                
        for(DocPart docPart : docParts){
            PDDocument document = new PDDocument();
            addPagesToNewDocument(docPart, document);
            splitDocuments.add(document); 
        }
    }
        
    public void saveNewDocuments(String path){
        
        createNewDocuments();
        
        for(int i=0; i<splitDocuments.size(); i++){
            PDDocument tempDocument;
            try {
                tempDocument = splitDocuments.get(i);
                tempDocument.save(path + Constants.SLASH + docParts.get(i).getFilename() + Constants.FILE_EXTENSION);
                tempDocument.close();
                
            } catch (IOException ex) {
                Logger.getLogger(DocSplitter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private void addPagesToNewDocument(DocPart docPart, PDDocument destDocument){
        
        PDDocument doc = docPart.getSourceDocument();
        
        for(int i=docPart.getStartPage()-1; i<=docPart.getEndPage()-1; i++){
            destDocument.addPage(doc.getPage(i));
        }
    }
    
    public void printDocParts(){
        for(DocPart docPart: docParts){
            System.out.println(docPart);
        }
    }
}
