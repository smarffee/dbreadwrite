package dbreadwrite;

import dbreadwrite.model.Student;
import dbreadwrite.service.StudentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Created by lin on 18-4-17.
 */
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DBReadWriteConfig.class);

        StudentService studentService = context.getBean(StudentService.class);

        List<Student> studentList;

        studentList = studentService.getAllStudent();

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("主库 : " + studentList);

        System.out.println();

        studentList = studentService.getAllStudentReadOnly();

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("从库 : " + studentList);

        System.out.println();

    }

}
