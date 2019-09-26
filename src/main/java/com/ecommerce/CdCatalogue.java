package com.ecommerce;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CdCatalogue {

    private static LinkedList<Cd> allCd = null;
    public CdCatalogue() {
        this.allCd = new LinkedList<Cd>();
    }

    public void populateCdCatologue()
    {
        Cd cd1 = new CdFree("IntelliJ", "Cd on IntelliJ");
        Cd cd2 = new CdPaid("Windows 10", "Windows 10 CD",  5);
        Cd cd3 = new CdCorporate("Linux", "Ubuntu", 10, 50);


        allCd = (LinkedList<Cd>) createCourse(cd1, allCd);
        allCd = (LinkedList<Cd>) createCourse(cd2, allCd);
        allCd = (LinkedList<Cd>) createCourse(cd3, allCd);

    }

    public double getPrice()
    {
        double cost = 0;
        if(!allCd.isEmpty())
        {
            for(Cd c: allCd)
            {
                cost += c.getPrice();
            }
        }
        return cost;
    }

    static void printVal()
    {
        System.out.println("List of all Cds: ");

        if(!allCd.isEmpty())
        {
            for(Cd c: allCd)
            {
                System.out.println(c.toString() +" $"+ c.getPrice());
            }
        }
    }

    // method to create new course
    public List<Cd> createCourse(Cd cd, LinkedList<Cd> cds) {

        cds.add(cd);
        return cds;
    }

    // method to delete courses
    public void deleteCourse(String deleteval) {

        List<Cd> deleteCourses = new ArrayList<>();
        deleteCourses = search( deleteval);

        for(Cd c :deleteCourses)
        {
            allCd.remove(c);
        }

    }

    // method to search through all courses
    public List<Cd> search( String searchVal) {


        List<Cd> courseFound = new ArrayList<>();

        if(!(allCd.size() ==0) || !(searchVal ==null)) {

            for (Cd cd : allCd) {

                if (cd.getDesc().contains(searchVal) || cd.getName().contains(searchVal)) {
                    courseFound.add(cd);
                }

            }
        }

        return courseFound;
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
