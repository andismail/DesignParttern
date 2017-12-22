import com.jthan.design.factory.statics.AbstractShapeFactory;
import com.jthan.design.factory.statics.ShapeEnum;

/**
 * @author Jthan on 17/12/22.
 */
public class FactoryTest {

    public static void main(String[] args) {
        AbstractShapeFactory shape = AbstractShapeFactory.getShape(ShapeEnum.CIRCULAR);

        shape.draw();
        shape.erase();
    }
}
