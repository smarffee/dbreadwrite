package dbreadwrite.dao;

import dbreadwrite.dao.mapper.StudentMapper;
import dbreadwrite.model.Student;
import dbreadwrite.model.StudentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lin on 18-4-17.
 */
@Repository
public class StudentDao {

    @Autowired
    private StudentMapper studentMapper;

    public int insertStudent(Student student) {
        return studentMapper.insert(student);
    }

    public List<Student> queryAllStudent() {
        return studentMapper.selectByExample(new StudentExample());
    }

    public List<Student> queryAllStudentReadOnly() {
        return studentMapper.selectByExample(new StudentExample());
    }



}
