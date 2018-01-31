import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.Assert.*;

/**
 * @author 徐晓俊(xuxiaojun02 @ corp.netease.com)
 */
public class HelloWorldTest {

    @Autowired
    HelloWorld helloWorld;
    @Test
    public void print() {
        helloWorld.print();
    }
}