package yishen.design.patterns.action.observer.demo;

/**
 * <pre>
 * 。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class ConcreteObserverTwo implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("ConcreteObserverTwo is notified. message.content: " + message.getContent());
    }
}
