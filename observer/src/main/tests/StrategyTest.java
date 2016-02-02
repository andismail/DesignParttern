import com.jthan.design.strategy.behavior.duck.BlackHeadDuck;
import com.jthan.design.strategy.behavior.duck.ParentDuck;
import com.jthan.design.strategy.behavior.duck.RedHeadDuck;
import com.jthan.design.strategy.behavior.duck.ToyDuck;
import com.jthan.design.strategy.behavior.group.NoFly;
import com.jthan.design.strategy.behavior.group.NoQuack;

/**
 * Created by Administrator on 2016/2/2.
 */
public class StrategyTest {
    public static void main(String[] args) {
        ParentDuck redDuck = new RedHeadDuck();
        redDuck.setFly(new NoFly());
        redDuck.setQuack(new NoQuack());
        ParentDuck balDuck = new BlackHeadDuck();
        ParentDuck toyDuck = new ToyDuck();

        redDuck.display();
        balDuck.display();
        toyDuck.display();
    }
}
