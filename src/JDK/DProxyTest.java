package JDK;

public class DProxyTest {

    public static void main(String[] args) {


        DynamicProxy dynamicProxy = new DynamicProxy(new HumanImpl());
        Human human = dynamicProxy.getProxy();
        human.eat();
    }
}
