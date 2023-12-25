package mvc.service;

import mvc.model.Student;

public interface IStudentService {
    Student[] findAll();
    Student findById(int id);
    void add(Student student);
    void delete(int id);
}

