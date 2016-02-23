///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Title:            Program One
// Files:            (list of source files)
// Semester:         Lecture-3 Spring 2016
//
// Author:           Hoaglund, Nathaniel
// Email:            hoaglund@wisc.edu
// CS Login:         hoaglund
// Lecturer's Name:  Skrentny, Jim
// Lab Section:      N/A
//////////////////////////// 80 columns wide //////////////////////////////////
/**
 * A simple exception class for validation errors like null or empty values
 */
public class WhatsAppRuntimeException extends Exception
{

    /**
     * Construct an instance of this exception with a custom message
     *
     * @param message the custom message to be wrapped around by this exception
     */
    public WhatsAppRuntimeException(String message)
    {
        super(message);
    }

    /**
     * Construct an instance of this exception without any message
     */
    public WhatsAppRuntimeException()
    {
        super();
    }
}
