import com.yaoyao.Application;
import com.yaoyao.Dict;
import com.yaoyao.DictMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * ClassName: DictMapperTest
 * Description:
 * Date: 2020年03月25日
 *
 * @author yaoyao
 * @version 1.0.0
 * @since 1.8
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class DictMapperTest {
    @Autowired
    private DictMapper dictMapper;

    @Test
    public void testInsertDict() {
        Dict dict = new Dict();
        dict.setCode("user_type");
        dict.setValue(3L);
        dict.setMsg("用户类型");
        int i = dictMapper.insertDict(dict);
        System.out.println("i:" + i);
    }
}
