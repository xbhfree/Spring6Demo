import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LogTest {
    private Logger logger = LoggerFactory.getLogger(LogTest.class);
    /*
    * 测试手动写日志
    * */
    @Test
    public void testLog(){
        logger.info("执行调用成功了");
    }
}
