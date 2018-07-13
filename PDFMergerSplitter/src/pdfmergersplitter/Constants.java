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
public class Constants {
    
    //Text of every action in program.
    public static final String APP_TITLE = "PDF merger/splitter";
    
    public static final String FILE_FILTER = "Default file filter";
    public static final String PDF_FILTER_EXTENSION = "pdf";
    
    public static final String FILE_EXTENSION = ".pdf";
    public static final String SLASH = "\\";
    public static final String SPACE = " ";
    public static final String TAB = "      ";
    public static final String FULL_STOP = ". ";
    public static final String EMPTY_STRING = "";
    
    public static final String ERROR_TITLE = "Error";
    public static final String INFO_TITLE = "Info";
    public static final String WARNING_TITLE = "Warning";
    
    public static final String SOURCE_FILE_ERROR_MESSAGE = "You did not define the source file to be splitted.";
    public static final String EMPTY_LIST_ERROR_MESSAGE = "There are no document parts in the list.";
    public static final String NO_ITEM_SELECTED_ERROR_MESSAGE = "No item selected from list.";
    public static final String INVALID_TEXT_FIELD_VALUE_MESSAGE = "Invalid value in input field.";
    public static final String INVALID_START_AND_END_PAGE_INDICES_MESSAGE = "Invalid start and end page indices.";
    public static final String NO_DOCUMENT_WAS_DEFINED_YET_MESSAGE = "You need to specify the PDF document first.";
    public static final String ERROR_LOADING_DOCUMENT_MESSAGE = "Could not load PDF document.";
    public static final String FILE_ERROR_MESSAGE = "File error. Could not load PDF file.";
    public static final String INVALID_FILENAME_MESSAGE = "Invalid file name. Name contains invalid characters. Please provide a valid file name.";
    
    public static final String DOCUMENT_SAVED_AT = "Document saved at: ";
    public static final String NEW_PDF_DOCUMENTS_WERE_CREATED_AT = " new PDF documents were created at ";
    public static final String ALL_DOC_PARTS_REMOVED_FROM_LIST = "All doc parts removed from list.";
    public static final String DOC_PART_ADDED_TO_LIST = "Doc part added to list.";
    public static final String DOC_PART_EDITED = "Doc part successfully edited.";
    public static final String DOC_PART_DELETED_FROM_LIST = "Doc part deleted from list.";
    public static final String DOC_PART_FILENAME = "Filename:  ";
    public static final String DOC_PART_START_PAGE = "Start page:  ";
    public static final String DOC_PART_END_PAGE = "End page:  ";
    
    public static final char[] ILLEGAL_CHARACTERS = { '/', '\n', '\r', '\t', '\0', '\f', '`', '?', '*', '\\', '<', '>', '|', '\"', ':' };
    
    
     //Message box constants.
    public static final int ERROR_MESSAGE = 0;
    public static final int INFO_MESSAGE = 1;
    public static final int WARNING_MESSAGE = 2;
    
    
}
