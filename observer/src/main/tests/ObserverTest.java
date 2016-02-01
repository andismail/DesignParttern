import com.jthan.design.observer.ConcreteObserver;
import com.jthan.design.observer.ConcreteSubject;
import com.jthan.design.observer.Observer;
import com.jthan.design.observer.Subject;

/**
 * Created by Administrator on 2016/2/1.
 */
public class ObserverTest {
    public static void main(String[] args) {
        ConcreteSubject subjectOne = new ConcreteSubject();
        Observer observerOne = new ConcreteObserver();
        Observer observerTwo = new ConcreteObserver();
        Observer observerThree = new ConcreteObserver();
        subjectOne.attach(observerOne);
        subjectOne.attach(observerTwo);
        subjectOne.attach(observerThree);
        subjectOne.change("ABC");
    }
}
