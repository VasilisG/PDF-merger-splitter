package pdfmergersplitter;

import java.io.File;
import org.apache.pdfbox.pdmodel.PDDocument;
/**
 *
 * @author Vasilis
 */
public class DocPart {
    
    //Properties
    private int startPage;
    private int endPage;
    private String filename;
    private File docFile;
    private PDDocument sourceDocument;
        
    //Constructor
    public DocPart(File docFile, PDDocument sourceDocument, int startPage, int endPage, String filename){
        this.docFile = docFile;
        this.sourceDocument = sourceDocument;
        this.startPage = startPage;
        this.endPage = endPage;
        this.filename = filename;
    }
    
    //Methods
    public File getDocFile(){
        return docFile;
    }
    
    public PDDocument getSourceDocument(){
        return sourceDocument;
    }
    
    public int getStartPage(){
        return startPage;
    }
    
    public int getEndPage(){
        return endPage;
    }
    
    public String getFilename(){
        return filename;
    }
    
    public void setStartPage(int startPage){
        this.startPage = startPage;
    }
    
    public void setEndPage(int endPage){
        this.endPage = endPage;
    }
    
    public void setFilename(String filename){
        this.filename = filename;
    }
    
    public void setDocFile(File docFile){
        this.docFile = docFile;
    }
    
    public void setSourceDocument(PDDocument sourceDocument){
        this.sourceDocument = sourceDocument;
    }
        
    public String toString(){
        
        String result = Constants.EMPTY_STRING;
        result += Constants.DOC_PART_FILENAME + filename + Constants.TAB;
        //result += StringConstants.DOC_PART_START_PAGE + startPage + StringConstants.TAB;
        //result += StringConstants.DOC_PART_END_PAGE + endPage + StringConstants.TAB;
        
        return result;
    }
}
