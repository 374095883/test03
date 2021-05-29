import com.lyc.dao.UserMapper;
import com.lyc.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserMapperTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //底层主要应用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(5);
//        mapper.updateUser(new User(5, "hi", "456456"));
//
//        int user = mapper.addUser(new User(5, "哈哈", "123123"));

//        List<User> users = mapper.getUser();
//        for (User user : users) {
//            System.out.println(user);
//
//        }
//        User userByID = mapper.getUserByID(1);
//        System.out.println(userByID);
//        sqlSession.close();1
    }
}
