package org.ironschool;


public abstract class Admin {




    public static void enroll(Student student, Course course){
        student.setCourses(course); //add course to student courses (List<Course>)
        student.setEnrolled(true); //set isEnrolled to true
        course.setStudents(student); //add student to course students (List<Student>)
        course.setCourseRevenue(); //update course revenue by course price
    }
    //public static void assign(Teacher teacher, Course course){} //dani

    //public static void show(School school, String whatToShow){ //jordi
    // String findAll = whatToShow;
    // switch(findAll){
    //      case Student:
    //          sysout() School.getStudents()
    //      case Course:

    //      case Teacher:
    //schoolbaba.getStudents()

    //  }
    // }

    //public static void lookupStudent(id){ //marino
        // **search and return student with given id}
    //public static void lookupCourse(id){}
    //public static void lookupTeacher(id){}

    //public static showProfit(School school){ //estel
    // school.setSchoolRevenue();
    // school.setExpenses();
    // school.setProfit();
    // return school.getProfits}



//    private static String schoolName;
//
//    //SCHOOL
//    public static void createSchoolName(String schoolName) {
//        if(schoolName.trim().equals("")){
//            throw new IllegalArgumentException("The School Name cannot remain empty");
//        }
//        String[] words = schoolName.trim().split(" ");
//        StringBuilder modifiedString = new StringBuilder();
//        for (String word : words) {
//            modifiedString.append(word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase() + " ");
//        }
//        Admin.schoolName = modifiedString.toString().trim();
//
//    }
//    public static String getSchoolName() {
//        return schoolName;
//    }
}