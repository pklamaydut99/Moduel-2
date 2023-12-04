package access_modifier_static_method_static_property.bai2;

public class Student {
    private String name;
    private String classes;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }
    public Student(){
        name = "nguyen";
        classes = "C08";
    }

}
