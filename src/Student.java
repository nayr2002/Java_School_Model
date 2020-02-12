public class Student extends Person {
    private Section[] sections = new Section[10];
    private int grade;
    private int sectionCount = 0;

    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Section[] getSections() {
        return sections;
    }

    public void addSection(Section s){
        sections[sectionCount] = s;
        sectionCount++;
    }

    public String toString(){
        String sectionArr = "";
        for(int i = 0; i < sectionCount; i++){
            if(i+1 != sectionCount){
                sectionArr += sections[i].getName() + "(" + sections[i].getTeacher().getName() + "), ";
            } else {
                sectionArr += sections[i].getName() + "(" + sections[i].getTeacher().getName() + ").";
            }
        }

        return super.getName() + " is in " + this.grade + "th grade and is enrolled in the following sections: " + sectionArr;
    }
}
