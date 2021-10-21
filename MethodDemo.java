public class MethodDemo {
String name , course , technology ;
 
    public MethodDemo(String name, String course) {
    super();
    this.name = name;
    this.course = course;
}
    public MethodDemo(String name, String course, String technology) {
        super();
        this.name = name;
        this.course = course;
        this.technology = technology;
    }
void show() {
    System.out.println(name +"   "+course +"  "+ technology);
}
    public static void main(String[] args) {
        MethodDemo d1 = new MethodDemo("Simplilearn", "Java");
        MethodDemo d2 = new MethodDemo("Simplilearn ", "J2EE", "Java");
        d1.show();d2.show();
        
    }
    
}