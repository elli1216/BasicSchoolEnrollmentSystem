/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EnrollmentSystem;

/**
 *
 * @author elli
 */
public class Course {
    private String courseID;
    private String courseName;
    
    public Course(String courseID, String courseName){
        this.courseID = courseID;
        this.courseName = courseName;
    }
    public String getCourseID(){
        return courseID;
    }
    public void setCourseID(String courseID){
        this.courseID = courseID;
    }
    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
}
