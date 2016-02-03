import com.jthan.design.decorate.coffeebar.coffee.Coffee;
import com.jthan.design.decorate.coffeebar.coffee.Decaf;
import com.jthan.design.decorate.coffeebar.decorate.Decorate;
import com.jthan.design.decorate.coffeebar.decorate.Milk;
import com.jthan.design.decorate.coffeebar.decorate.Soy;

/**
 * Created by Administrator on 2016/2/3.
 */
public class DecorateTest {

    public static void main(String[] args) {
        Coffee decaf = new Decaf();
        Decorate decorate = new Milk(decaf);
        decorate = new Soy(decorate);
        System.out.println(decorate.getDescription());
        System.out.println(decorate.cost());
    }
}
