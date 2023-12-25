package mvc.repository;

import mvc.model.Student;

public interface IStudentRepository {
   Student[] findAll();
    Student findById(int id);
    void add(Student student);
    void delete(int id);
}
