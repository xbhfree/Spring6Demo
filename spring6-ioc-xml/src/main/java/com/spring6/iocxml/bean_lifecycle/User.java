package com.spring6.iocxml.bean_lifecycle;

/**
 * 测试bean的生命周期
 * 具体的生命周期过程：
 *     、1. bean对象创建（调用无参构造）
 *     2. 给bean对象设置属性
 *     3. bean的后置处理（初始化之前）
 *     4. bean对象初始化（需要在配置bean时制定初始化方法）
 *     5. bean的后置处理器（初始化之后）
 *     6. bean对象就绪
 *     7. bean对象销毁
 *     8. Ioc容器关闭
 */
public class User {
    public User() {
        System.out.println("1. bean对象创建（调用无参构造） ");
    }

    private void initMethod(){
        System.out.println("4. bean对象初始化（需要在配置bean时制定初始化方法）");
    }

    private void destoryMethod(){
        System.out.println("7. bean对象销毁");
    }

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        System.out.println("2.给bean对象设置属性");
        this.username = username;
    }
}
