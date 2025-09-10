package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Tester {
    @Test
   public void testAddTask(){
       Manager manager = new Manager();
       manager.addTask("aiiit");

       assertEquals(1,manager.getTasks().size());
   }
}
