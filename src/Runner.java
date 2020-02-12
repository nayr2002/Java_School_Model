public class Runner {
    public static void main (String[] args){
        School bhs = new School("Berkeley High");

        Teacher teacher1 = new Teacher("Teacher1", "Math");
        Section math =  new Section("Math", teacher1);

        Teacher teacher2 = new Teacher("Teacher2", "Biology");
        Section biology = new Section("Biology", teacher2);

        Teacher albinson = new Teacher( "Albinson", "Computer Science");
        Section compSci = new Section("Computer Science", albinson);

        Student me = new Student("Me", 11);
        Student friend1 = new Student("Friend1", 11);
        Student friend2 = new Student("Friend2", 5);
        Student friend3 = new Student("Friend3", 6);
        Student friend4 = new Student("Friend4", 7);
        Student friend5 = new Student("Friend5", 4);

        bhs.addSection(math);
        bhs.addSection(biology);
        bhs.addSection(compSci);

        math.addStudent(me);
        math.addStudent(friend3);
        teacher1.addSection(math);
        me.addSection(math);
        friend3.addSection(math);

        biology.addStudent(friend1);
        biology.addStudent(friend4);
        teacher2.addSection(biology);
        friend1.addSection(biology);
        friend4.addSection(biology);

        compSci.addStudent(friend2);
        compSci.addStudent(friend5);
        albinson.addSection(compSci);
        friend2.addSection(compSci);
        friend5.addSection(compSci);

        System.out.println(bhs.toString());
        System.out.println(math.toString());
        System.out.println(biology.toString());
        System.out.println(compSci.toString());
        System.out.println(teacher1.toString());
        System.out.println(teacher2.toString());
        System.out.println(albinson.toString());
        System.out.println(me.toString());
        System.out.println(friend1.toString());
        System.out.println(friend2.toString());
        System.out.println(friend3.toString());
        System.out.println(friend4.toString());
        System.out.println(friend5.toString());
    }
}
