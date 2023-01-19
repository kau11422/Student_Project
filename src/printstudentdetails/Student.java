/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printstudentdetails;

/** student entity has that some real world exist  model class model student data raw sata attributes property name
 *model class student class - raw data for students
 * @author hp variables in class are priovate
 */
public class Student {
    //encapsulation princip;le - private var,  and then getters and setters
    private String name;
    private int sid;
       // public int sid = 54;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the sid
     */
    public int getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(int sid) {
        this.sid = sid;
    }

}
