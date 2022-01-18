package HomeWork;

public class Student {
    int StudentId;
    String name;
    String surname;
    int course;
    double mathGrade;
    double economicsGrade;
    double foreignGrade;
}

class StudentTest {
    public static void main(String[] args) {
        Student st = new Student();


        st.StudentId = 5674564;
        st.name = "Ivo";
        st.surname = "Bobul";
        st.course = 3;

        st.mathGrade = 7.45;
        st.economicsGrade = 11.63;
        st.foreignGrade = 12;


        Student st2 = new Student();
        st2.StudentId = 456457;
        st2.name = "Babux";
        st2.surname = "Zinkewich";
        st2.course = 1;

        st2.mathGrade = 11.45;
        st2.economicsGrade = 6.63;
        st2.foreignGrade = 4;

        System.out.println("Student ID :" + st.StudentId);
        System.out.println("Name : " + st.name);
        System.out.println("Surname : " + st.surname);
        System.out.println("Course Nubmer : " + st.course);
        System.out.println("average mark : " +  (st.mathGrade + st.economicsGrade +  st.foreignGrade) / 3);

        System.out.println("");

        System.out.println("Student ID :" + st2.StudentId);
        System.out.println("Name : " + st2.name);
        System.out.println("Surname : " + st2.surname);
        System.out.println("Course Nubmer : " + st2.course);

        System.out.println("Average mark : " +  (st2.mathGrade + st2.economicsGrade +  st2.foreignGrade) / 3);


    }
}
