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
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ////////////////////
//
//			N/A
//
//////////////////// STUDENTS WHO GET HELP FROM OTHER THAN THEIR PARTNER //////
//                   must fully acknowledge and credit those sources of help.
//                   Instructors and TAs do not have to be credited here,
//                   but tutors, roommates, relatives, strangers, etc do.
//
// Persons:          Identify persons by name, relationship to you, and email.
//                   Describe in detail the the ideas and help they provided.
//
// Online sources:   avoid web searches to solve your problems, but if you do
//                   search, be sure to include Web URLs and description of 
//                   of any information you find.
//////////////////////////// 80 columns wide //////////////////////////////////
/**
 * A simple exception class for functional issues that can arise from various operations
 *
 * @author jmishra
 */
public class WhatsAppException extends Exception
{

    /**
     * Construct a new instance of this exception with a custom message
     *
     * @param message the custom message to be wrapped around by this exception
     */
    public WhatsAppException(String message)
    {
        super(message);
    }
}
