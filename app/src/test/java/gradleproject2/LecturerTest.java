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
class LecturerTest{
    @Test void lecturerHasAUsername(){
        Lecturer classUnderTest = new Lecturer("Mark", 47, 101);
        assertEquals("Mark47", classUnderTest.getUsername());
    }
}