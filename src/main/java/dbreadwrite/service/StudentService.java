package dbreadwrite.service;

import dbreadwrite.common.MasterSlaveEnable;
import dbreadwrite.dao.StudentDao;
import dbreadwrite.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lin on 18-4-17.
 */
@MasterSlaveEnable
@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public int insertStudent(Student student) {
        return studentDao.insertStudent(student);
    }

    public List<Student> getAllStudent() {
        return studentDao.queryAllStudent();
    }

    public List<Student> getAllStudentReadOnly() {
        return studentDao.queryAllStudentReadOnly();
    }

}
