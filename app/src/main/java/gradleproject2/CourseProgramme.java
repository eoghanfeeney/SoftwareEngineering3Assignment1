package gradleproject2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Eoghan
 */
import java.util.ArrayList;
import org.joda.time.DateTime;

public class CourseProgramme {
    public String courseName;
    public ArrayList<String> studentsEnrolled = new ArrayList<String>();
    public ArrayList<String> assossiatedModules = new ArrayList<String>();
    public DateTime startDate; 
    public DateTime endDate; 
    
    public CourseProgramme(String courseName, DateTime startDate, DateTime endDate)
    {
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<String> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(ArrayList<String> studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }

    public ArrayList<String> getAssossiatedModules() {
        return assossiatedModules;
    }

    public void setAssossiatedModules(ArrayList<String> assossiatedModules) {
        this.assossiatedModules = assossiatedModules;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
    
    
}

