package mvc.service.impl;

import mvc.model.Student;
import mvc.repository.IStudentRepository;
import mvc.repository.impl.StudentRepository;
import mvc.service.IStudentService;

public class StudentService implements IStudentService {
    private IStudentRepository studentRepository = new StudentRepository();
    @Override
    public Student[] findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public void add(Student student) {
        studentRepository.add(student);
    }

    @Override
    public void delete(int id) {
        studentRepository.delete(id);
    }
}
