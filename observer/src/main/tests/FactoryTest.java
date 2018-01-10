import com.jthan.design.factory.statics.AbstractShapeFactory;
import com.jthan.design.factory.statics.ShapeEnum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Jthan on 17/12/22.
 */
public class FactoryTest {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);


        AbstractShapeFactory shape = AbstractShapeFactory.getShape(ShapeEnum.CIRCULAR);

        shape.draw();
        shape.erase();

        Key k1 = new Key();
        Key k2 = new Key();
        Key k3 = new Key();
        System.out.println(k1.hashCode() == k2.hashCode());

        Map<Key, String> map1 = new HashMap<>(2);
        map1.put(k1, "k1");
        map1.put(k2, "k1");
        map1.put(k3, "k1");
        System.out.println(map1.size());

        Map<String, String> map = new HashMap<>(3);
        map.put("40", "A1");
        map.put("27", "A2");
        map.put("53", "A3");
        System.out.println(map.size());

        System.out.println(tableSizeFor(1));
        System.out.println(tableSizeFor(10));
        System.out.println(tableSizeFor(15));
        System.out.println(tableSizeFor(8));
        System.out.println(tableSizeFor(5));

        Integer a = 100;
        Integer b = 500;
        System.out.println(a);
        System.out.println(b);
        Integers ins = Integers.newIntegers(a, b);
        exchange(ins);
        System.out.println(ins.a);
        System.out.println(ins.b);

        int x = 20;
        System.out.println(Integer.toBinaryString(x));//2
        System.out.println(Integer.toHexString(x));//16
        System.out.println(Integer.toOctalString(x));//8
        System.out.println(Integer.parseInt("10100", 2));

        Integer y = 8143;
        System.out.println(y.byteValue());


    }

    static final int MAXIMUM_CAPACITY = 1 << 30;

    //计算map的阀值
    static int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    static void exchange(Integer a, Integer b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }

    static void exchange(Integers ins) {
        Integer a = ins.a;
        Integer b = ins.b;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        ins.a = a;
        ins.b = b;
    }

    static class Integers {
        public Integer a;
        public Integer b;

        public static Integers newIntegers(Integer a, Integer b) {
            return new Integers(a, b);
        }

        public Integers(Integer a, Integer b) {
            this.a = a;
            this.b = b;
        }

    }

    static class Key {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Key key = (Key) o;

            return !(name != null ? !name.equals(key.name) : key.name != null);

        }

        @Override
        public int hashCode() {
            return 100;
        }
    }
}
