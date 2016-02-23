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
import java.util.List;

/**
 * This is the broadcast list class which captures information of a broadcast
 * list
 */
public class BroadcastList
{
	private String nickname;
	private List<String> members;

    /**
     * Constructs a new instance of this class. nickname cannot be null or
     * empty. members cannot be null.
     *
     * @param nickname the nickname of the broadcast list
     * @param members the list of nicknames of all members of this list
     * @throws WhatsAppRuntimeException throw a new instance of this with
     * CANT_BE_EMPTY_OR_NULL message if the validation of nickname or members
     * fails
     *
     */
    public BroadcastList(String nickname, List<String> members) throws WhatsAppRuntimeException
    {
    	if (nickname.equals(null) || members.equals(null))
    	{
    		throw new WhatsAppRuntimeException(Config.CANT_BE_EMPTY_OR_NULL);
    	}
    	
    	
    	this.nickname = nickname;
    	this.members = members;
    	
    }

    /**
     * A getter of the nickname
     *
     * @return the nickname of the broadcast list
     */
    public String getNickname()
    {
        return this.nickname;
    }

    /**
     * A setter of the nickname of this broadcast list
     *
     * @param nickname the nickname of this broadcast list
     */
    public void setNickname(String nickname)
    {
    	this.nickname = nickname;
    }

    /**
     * A getter of the list of members of this broadcast list
     *
     * @return the list of members of this broadcast list
     */
    public List<String> getMembers()
    {
        return members;
    }

    /**
     * A setter of the list of members of this broadcast list
     *
     * @param members the list of members of this broadcast list
     */
    public void setMembers(List<String> members)
    {
    	this.members = members;
    }

}
