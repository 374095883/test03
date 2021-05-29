import com.lyc.dao.StudentMapper;
import com.lyc.dao.TeacherMapper;
import com.lyc.pojo.Student;
import com.lyc.pojo.Teacher;
import com.lyc.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {

    @Test
    public void testSutdent() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudent();
        for (Student student1 : studentList) {
            System.out.println(student1);
        }
        sqlSession.close();
    }
    @Test
    public void testSutdent2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudent2();
        for (Student student1 : studentList) {
            System.out.println(student1);
        }
        sqlSession.close();
    }
}
