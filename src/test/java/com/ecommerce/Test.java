package com.ecommerce;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CourseFreeTest {

    private static Course courseFree;

    @BeforeAll
    static void init(){
        courseFree = new CourseFree("java", "Java Course", "Java by Examples");
    }

    @Test
    void testCourseFreePrice(){

        assertEquals(0.0, courseFree.getPrice(), "Course Free price must be 0.0");
    }

    @Test
    void testCourseFreeGetId(){

        assertEquals("java", courseFree.getId(), "Course Free Id must be java");
    }

    @AfterAll
    static void cleanup()
    {
        courseFree = null;
    }
}
