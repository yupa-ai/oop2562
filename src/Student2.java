public class Student2 {

    protected String studenId;
    protected String studentNume;
    protected String Faculty;
    protected String major;

    public void enrollmant() {
        System.out.println("enrollmant");
    }

    public void payment() {
        System.out.println("payment");
    }

    public void addCourse() {
        System.out.println("addCourse");
    }
    public void showData(){
        System.out.println("ID :"+studenId);
        
        
    }
    public void dropCourse(){
        System.out.println("dropCourse");
        
        
    }

    public static void main(String[] args) {
        Student2 yupa = new Student2();
        System.out.println("Object = "+yupa);
        yupa.studenId = "614234009";
        yupa.studentNume = "yupa";
        yupa.major = "CS";
        yupa.Faculty = "Science and Technoloqy";
        
     

        System.out.println("Object = "+yupa);
        yupa.studenId = "614234009";
        yupa.studentNume = "yupa";
        yupa.major = "CS";
        yupa.Faculty = "Science and Technoloqy";
        yupa.showData();
        yupa.enrollmant();
        yupa.dropCourse();
        
        
        yupa.studenId = "614234009";
        yupa.studentNume = "yupa";
        yupa.major = "CS";
        yupa.Faculty = "Science and Technoloqy";
        System.out.println("Object = "+yupa);
        yupa.showData();
        
        
        //instanciate Object
        GraduateStudent too = new GraduateStudent();
        too.StudyLevl = "Year2";
        too.thesisAdviser = "Dr.Bean";
        too.thesisRxamination();
        too.oralRxamination ();

    }}

