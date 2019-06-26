import com.masivian.TreeRestApplication;
import com.masivian.model.Tree;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.masivian.service.TreeService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TreeRestApplication.class)
public class TreeServiceTest {


    @Test
    public void createTree() {
        int[] tree = {5,3,8,6,9,1,4,10};

        TreeService treeService = new TreeService();

        Tree treeNodes = treeService.createTree(tree);

        Assert.assertNotNull(treeNodes);
    }

    @Test
    public void getLowestCommonAncestor() {

        TreeService treeService = new TreeService();

        int[] tree = {5,3,8,6,9,1,4,10};

        Integer treeNodes = treeService.getlowestCommonAncestor(tree, 6,10);

        System.out.println(treeNodes);

        Assert.assertEquals(treeNodes, new Integer(8));
    }



}

