public class Teacher extends Person {
    private Section[] sections = new Section[10];
    private String subject;
    private int sectionCount = 0;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Section[] getSections() {
        return sections;
    }

    public void addSection(Section s){
        sections[sectionCount] =  s;
        sectionCount++;
    }

    public String toString(){
        String sectionArr = "";
        for(int i = 0; i < sectionCount; i++){
            if(i+1 != sectionCount){
                sectionArr += sections[i].getName() + "(" + sections[i].getCurrentSize() + "), ";
            } else {
                sectionArr += sections[i].getName() + "(" + sections[i].getCurrentSize() + ").";
            }
        }

        return super.getName() + " teaches the following sections: " + sectionArr;
    }

}
