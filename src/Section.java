public class Section {
    private Teacher teacher;
    private Student[] students = new Student[50];
    private String name;
    private int currentSize = 0;

    public Section(String name, Teacher teacher) {
        this.teacher = teacher;
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudent(Student s){
        students[currentSize] = s;
        currentSize++;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        String nameArr = "";
        for(int i = 0; i < currentSize; i++){
            if(i+1 != currentSize){
                nameArr += students[i].getName() + ", ";
            } else {
                nameArr += students[i].getName() + ".";
            }
        }
        return this.name + " is taught by " + this.teacher.getName() + " and has " + this.currentSize + " students: " + nameArr;
    }
}
