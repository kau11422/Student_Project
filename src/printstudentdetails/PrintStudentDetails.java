/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstudentdetails;

/**
 *store and print student details user interative class main class main method
 * view class - user interative class interation
 * @author hp
 */
public class PrintStudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // 3 student details store and print 
    
   Student[] list = new Student[3];
   
       Student s1 = new Student(); // object s1 created    object name constructor
    Student s2 = new Student(); 
Student s3 = new Student(); 
   s1.setName("peter");
   s1.setSid(12);
   s2.setName("ter");
   s2.setSid(13);
   s3.setName("pter");
   s3.setSid(122);
   // store object in array - array of objects
   list[0] = s1;
      list[1] = s2;
   list[2] = s3;

      for(int i=0; i<list.length; i++)
      {
          System.out.println(list[i].getName() + " " + list[i].getSid());
      }
}
}
