public class Student {

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

    public static void main(String [] args) {
        Student yupa = new Student();
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
    }

    void dropCourse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}//end class

