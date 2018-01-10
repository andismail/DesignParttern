import com.jthan.design.adapter.Adapter;
import com.jthan.design.adapter.TargetInterface;

/**
 * @author Jthan
 * @since 18/1/10
 */
public class AdaptorTest {

    public static void main(String[] args) {
        TargetInterface target = new Adapter();
        target.method1();
        target.method2();
    }
}
