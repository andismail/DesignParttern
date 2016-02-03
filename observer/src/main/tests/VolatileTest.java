/**
 * Created by Administrator on 2016/2/3.
 */
public class VolatileTest {

    public volatile static int count = 0;

    public static void inc() {

        //这里延迟1毫秒，使得结果明显
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
        }

        count++;
    }

    public static void main(String[] args) throws InterruptedException {

        //同时启动1000个线程，去进行i++计算，看看实际结果

        for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread(VolatileTest::inc);
            thread.start();
            //thread.join();
            //System.out.println(VolatileTest.count);
        }

        new Thread().sleep(1000);
        //这里每次运行的值都有可能不同,可能为1000
        System.out.println("运行结果:Counter.count=" + VolatileTest.count);
    }
}