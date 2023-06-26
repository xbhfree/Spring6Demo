import com.spring6.User;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

public class ReflexTest {
    @Test
    public void testReflexUser() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        Class<?> aClass = Class.forName("com.spring6.User");
        //Declared 公开宣布的
        User user = (User)aClass.getDeclaredConstructor().newInstance();
        System.out.println(user);
    }
}
