import com.swarmcn.user.api.mapper.RoleMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Ming on 2016/5/2.
 */
public class TestMybatis extends AbstractServiceTests{

    @Autowired
    RoleMapper roleMapper;

    @Test
    public void test_(){
        System.out.println(roleMapper.selectAll().size());
    }
}
