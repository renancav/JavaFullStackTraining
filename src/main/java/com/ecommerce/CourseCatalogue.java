package com.ecommerce;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CourseCatalogue {

   private static LinkedList<Course> allCourses = null;

    public CourseCatalogue() {
       this.allCourses = new LinkedList<Course>();
    }

    public void populateCourseCatologue()
    {
        Course course1 = new CourseFree("java8", "Java 8", "Learning Java 8");
        Course course2 = new CoursePaid("jsp", "JSP", "Java Server Pages", 500);
        Course course3 = new CourseCorporate("javacore", "Java Core", "Java Core for beginners", 500, 60);
        Course course4 = new CourseCorporate("python20", "Python 2.0", "Learning Python 2.0", 500, 20);
        Course course5 = new CoursePaid("abc", "ABC Programming", "Programming from A to Z", 40);

        allCourses = (LinkedList<Course>) createCourse(course1,  allCourses);
        allCourses = (LinkedList<Course>) createCourse(course2,  allCourses);
        allCourses = (LinkedList<Course>) createCourse(course3,  allCourses);
        allCourses = (LinkedList<Course>) createCourse(course4,  allCourses);
        allCourses = (LinkedList<Course>) createCourse(course5,  allCourses);
    }

    public double getPrice()
    {
        double cost = 0;
        if(!allCourses.isEmpty())
        {
            for(Course c: allCourses)
            {
                cost += c.getPrice();
            }
        }
        return cost;
    }
    public static void main(String[] args) {




        // provided code yesterday
        /*
        printArray(courseArray);
        System.out.println("===================================");
        sortArray(courseArray);
        System.out.println("===================================");
        printArray(courseArray);
         // previous array code
       /* Course[] courseArray = new Course[5];

        courseArray[0] = course1;
        courseArray[1] = course2;
        courseArray[2] = course3;
        courseArray[3] = course4;
        courseArray[4] = course5;
        */

    }


    static void printVal()
    {
        System.out.println("List of all Courses: ");
        if(!allCourses.isEmpty())
        {
            for(Course c: allCourses)
            {
                System.out.println(c.toString()+" $"+ c.getPrice());
            }
        }
    }

    // method to create new course
    public List<Course> createCourse(Course course, LinkedList<Course> courses) {

        courses.add(course);
        return courses;
    }

    // method to delete courses
    public void deleteCourse(String deleteval) {

        List<Course> deleteCourses = new ArrayList<>();
        deleteCourses = search( deleteval);

        for(Course c :deleteCourses)
        {
            allCourses.remove(c);
        }

    }

    // method to search through all courses
    public List<Course> search( String searchVal) {

        List<Course> courseFound = new ArrayList<Course>();

        if(!(allCourses.size() ==0) || !(searchVal ==null)) {

            for (Course course : allCourses) {

                if (course.getId().contains(searchVal) || course.getDesc().contains(searchVal) || course.getName().contains(searchVal)) {
                    courseFound.add(course);
                }

            }
        }

        return courseFound;
    }

    public void sortArray(Course[] cArray) {
        System.out.println("Sorting Course Array");

        //printArray(cArray);

        // Sorting Algorithm
        int n = cArray.length;

        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++) {

                String a = cArray[j].getName();
                String b = cArray[j + 1].getName();

                int compare = a.compareTo(b);
                if (compare > 0) {
                    //System.out.println("a: " + a + "\t>\t" + "b: " + b + "Need to Switch");
                    Course tempCourse = cArray[j];
                    cArray[j] = cArray[j + 1];
                    cArray[j + 1] = tempCourse;
                }
            }

        // printArrayName(cArray);

    }

    public void printArrayName(Course[] courseArr) {
        for (int i = 0; i < courseArr.length; i++) {
            // System.out.println("id: " + courseArr[i].getId() + "\nName: " + courseArr[i].getName() + "\nDesc: " + courseArr[i].getDesc() + "\n");
            System.out.println("Name: " + courseArr[i].getName());
        }
    }

    public void printArray(Course[] courseArr) {
        for (int i = 0; i < courseArr.length; i++) {
            System.out.println("id: " + courseArr[i].getId() + "\nName: " + courseArr[i].getName() + "\nDesc: " + courseArr[i].getDesc() + "\n");
        }
    }




}
