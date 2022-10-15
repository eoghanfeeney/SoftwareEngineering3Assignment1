/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradleproject2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Eoghan
 */
class StudentTest{
    @Test void studentHasAUsername(){
        Student classUnderTest = new Student("Pablo", 10, 972);
        assertEquals("Pablo10", classUnderTest.getUsername());
    }
}

