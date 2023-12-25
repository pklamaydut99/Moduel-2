package mvc.Controller;

import mvc.model.Student;
import mvc.service.IStudentService;
import mvc.service.impl.StudentService;

public class StudentController {
    private IStudentService studentService = new StudentService();
    public Student[] getAll(){
        return studentService.findAll();
    }
    public void add(Student student){
        studentService.add(student);
    }
    public String delete(int id){
        Student student = studentService.findById(id);
        if (student!= null){
            studentService.delete(id);
            return "Xoá thành công";
        }else {
            return "Id không tồn tại";
        }
    }
}
