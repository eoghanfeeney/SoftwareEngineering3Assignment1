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
    public ArrayList<Student> studentsEnrolled = new ArrayList<Student>();
    public ArrayList<Module> assossiatedModules = new ArrayList<Module>();
    public DateTime startDate; 
    public DateTime endDate; 
    
    public CourseProgramme(String courseName)
    {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(ArrayList<Student> studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
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

    public ArrayList<Module> getAssossiatedModules() {
        return assossiatedModules;
    }

    public void setAssossiatedModules(ArrayList<Module> assossiatedModules) {
        this.assossiatedModules = assossiatedModules;
    }
    

    @Override
    public String toString() {
        return "CourseProgramme{" + "courseName=" + courseName + ", assossiatedModules=" + assossiatedModules + '}';
    }

    
    
}

