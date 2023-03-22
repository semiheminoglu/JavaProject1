public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Semih Eminoğlu", 21, 200704015);
        Student student2 = new Student("Mustafa Katırcı", 20, 200704001);

        System.out.println("Student 1:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Student ID: " + student1.getStudentId());

        System.out.println("Student 2:");
        System.out.println("Name: " + student2.getName());
        System.out.println("Age: " + student2.getAge());
        System.out.println("Student ID: " + student2.getStudentId());
    }
}


