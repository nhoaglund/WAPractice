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
import java.util.Date;

/**
 * This is the message class which captures information of a message Every
 * logical message will result in at least two Message objects. One always goes
 * to the message list of the sender user. The others, depending on whether the
 * message was sent to a single user or a broadcast, will go to the message
 * lists of the target user(s). For a one to one message (non broadcast
 * messages), fromNickname and toNickname assume appropriate values.
 * broadcastNickname is null for such cases. For broadcast messages, the sender
 * Message object has a null for toNickname. Instead the broadcastNickname is
 * populated. However, on the receivers' (people who belong to the broadcast
 * list), the toNickname is their own nicknames. They have no idea it came
 * through a broadcast. Hence, broadcastNickname is null for the Message objects
 * that go to the receivers' message lists. fromNickname always assumes the
 * sender's nickname. read is true for the sender's Message object. It's always
 * false in the beginning, for the receivers' Message object until they read the
 * message.
 *
 * @author jmishra
 */
public class Message
{
    private String fromNickname;
    private String toNickname;
    private String broadcastNickname;
    private Date sentTime;
    private String message;
    private boolean read;
    
    /**
     * A constructor to instantiate this class. fromNickname and message cannot
     * be null or empty. toNickname must be null, if broadcastNockname is
     * provided. Alternatively, broadcastNickname must be null if toNickname is
     * provided. sentTime cannot be null. For any of the above mentioned
     * validation issues, you must throw a WhatsAppRuntimeException with the
     * CANT_BE_EMPTY_OR_NULL message
     *
     * @param fromNickname the nickname of the user sending the message
     * @param toNickname the nickname of the user to whom the message is being
     * sent. This must be null if the message is being broadcast to a broadcast
     * list
     * @param broadcastNickname the nickname of the broadcast list to which this
     * message is being sent. This must be null if the message is being sent to
     * a single user
     * @param sentTime the instant of time at which the message was sent
     * @param message the message string that is being communicated from the
     * sender to the receiver(s)
     * @param read whether the receiver has read this message
     * @throws WhatsAppRuntimeException read the description of this constructor
     * for the conditions failing which you may throw this exception
     */
    public Message(String fromNickname, String toNickname, String broadcastNickname,
            Date sentTime, String message, boolean read) throws WhatsAppRuntimeException
    {
    	
    		if (fromNickname.equals(null) || fromNickname.isEmpty()
    				|| message.equals(null) || message.isEmpty() || sentTime.equals(null))
    		{
    			throw new WhatsAppRuntimeException(Config.CANT_BE_EMPTY_OR_NULL);
    		}
    		if (broadcastNickname == null && toNickname == null)
    		{
    			throw new WhatsAppRuntimeException(Config.CANT_BE_EMPTY_OR_NULL);
    		}
    		if (broadcastNickname != null && toNickname != null)
    		{
    			throw new WhatsAppRuntimeException(Config.CANT_BE_EMPTY_OR_NULL);
    		}
    		//TODO


    		this.fromNickname = fromNickname;
    		this.toNickname = toNickname;
    		this.broadcastNickname = broadcastNickname;
    		this.sentTime = sentTime;
    		this.message = message;
    		this.read = read;
    		
    }

    /**
     * A getter for the fromNickname
     *
     * @return the fromNickname of this message
     */
    public String getFromNickname()
    {
        
        return this.fromNickname;
    }

    /**
     * A setter for the fromNickname
     *
     * @param fromNickname the fromNickname of this message
     */
    public void setFromNickname(String fromNickname)
    {
    	this.fromNickname = fromNickname;
    }

    /**
     * A getter for the toNickname
     *
     * @return the toNickname of this message
     */
    public String getToNickname()
    {
        return this.toNickname;
    }

    /**
     * A setter for the toNickname
     *
     * @param toNickname the toNickname of this message
     */
    public void setToNickname(String toNickname)
    {
    	this.toNickname = toNickname;
    }

    /**
     * A getter for the broadcastNickname
     *
     * @return the broadcastNickname of this message
     */
    public String getBroadcastNickname()
    {
        return this.broadcastNickname;
    }

    /**
     * A setter for the broadcastNickname
     *
     * @param broadcastNickname the broadcastNickname of this message
     */
    public void setBroadcastNickname(String broadcastNickname)
    {
        this.broadcastNickname = broadcastNickname;
    }

    /**
     * A getter for the time at which this message was sent
     *
     * @return the Date object which captures the time at which this message was
     * sent
     */
    public Date getSentTime()
    {
        return this.sentTime;
    }

    /**
     * A setter for the time at which this message was sent
     *
     * @param sentTime the Date object which captures the time at which this
     * message was sent
     */
    public void setSentTime(Date sentTime)
    {
    	this.sentTime = sentTime;
    }

    /**
     * A getter for the message string
     *
     * @return the message string
     */
    public String getMessage()
    {
        return this.message;
    }

    /**
     * A setter for the message string
     *
     * @param message the message string
     */
    public void setMessage(String message)
    {
    	this.message = message;
    }

    /**
     * A getter for the read flag which indicates whether the message has been
     * read
     *
     * @return the read flag
     */
    public boolean isRead()
    {
        return read;
    }

    /**
     * A setter for the read flag which indicates whether the message has been
     * read
     *
     * @param read the read flag
     */
    public void setRead(boolean read)
    {
    	this.read = read;
    }

}
