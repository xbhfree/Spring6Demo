# Spring6
## 最低要求
jdk17
## 基础知识
### spring framework
* 特点
  * 非侵入式：试用sf框架开发时，对程序本身结构影响非常小。对领域模块可以做到零污染
  * 控制反转
  * 面向切面编程
  * 容器：spring ioc是一个容器，包含管理组件对象的生命周期，屏蔽了组件创建过程的大量细节，降低门槛，提高开发效率
  * 组件化：简单组件配置成一个复杂应用，可以使用xml和java注解组合这些对象
  * 一站式：ioc和aop可以整合各种框架和第三方库
* 组成
  * Spring Aop
    * `spring-aop`：面向切面编程的应用模块，整合`ASM`，`CGLib`，`JDK Proxy`
    * `spring-aspects`：集合`AspectJ`，`aop`应用框架
    * `spring-instrument`：动态`Class Loading`模块
  * Spring Data Access
    * `spring-jdbc`：`spring`对`jdbc`的封装，用以简化`jdbc`操作
    * `spring-orm`：`java对象`与`数据库`的映射框架
    * `spring-oxm`：`java对象`与`xml文件`的映射框架
    * `spring-jms`：`Spring`对`Java Message Service`（Java消息服务）的封装，用于服务之间通信
    * `spring-tx`：spring jdbc`事务`管理
  * Spring Web
    * `spring-web`：最基础的web支持，建立于`spring-context`之上，通过`servlet`和`listener`来初始化ioc容器
    * `spring-webmvc`：实现web mvc
    * `spring-webscoket`：与前端的全双工通信协议
    * `spring-webflux`：spring5.0支持，取代传统的java servlet，`非阻塞式`Reactive Web框架，异步，非阻塞，事件驱动的服务
  * Spring Message
    * `spring-messaging`：spring4.0提供，为spring集成一些基础的报文传送服务
  * Spring Test
    * `spring-text`：集成测试支持，主要对junit的封装

### 核心
#### bean
* 作用域：
  * singleton：默认，bean对象始终为单例，创建于Ioc容器初始化时
  * prototype：bean在Ioc容器中有多个实例，创建于获取bean时
* WebApplicationContext环境下额外作用域
  * request 在一个请求范围内有效
  * session 在一个会话范围内有效

* bean的生命周期
  * 具体的生命周期过程：
    1. bean对象创建（调用无参构造） 
    2. 给bean对象设置属性
    3. bean的后置处理（初始化之前）
    4. bean对象初始化（需要在配置bean时制定初始化方法）
    5. bean的后置处理器（初始化之后）
    6. bean对象就绪
    7. bean对象销毁
    8. Ioc容器关闭
* 自动注入方式
  1. byType
  2. byName
#### Ioc
##### 反射
* 概念：java反射机制是在运行状态中，对于任意一个类，都能够知道这个类的属性和方法；对于任意一个对象，都能够调用他的任意方法和属性；这种动态获取信息以及调用对象方法的功能称为java语言的反射机制。
* 简述：反射机制是指的是程序在运行时能够获取自身的信息
* 原理：要想解剖一个类，必须获取该类的Class对象，而剖析一个类或用反射解决具体的问题就是使用相关API
  1.  java.lang.Class
  2. java.lang.reflect
  * Class对象是反射的根源
##### 基础概念

* `Inverse of Control` 控制反转
  * Spring通过IoC容器管理所有java对象的实例化和初始化，控制对象与对象之间的依赖关系
  * IoC管理的对象称为Spring Bean，它与直接new出来的java对象没有任何区别
* 把创建对象的过程交给Spring进行管理
* 如何创建对象？
  1. 加载bean.xml文件
  2. 对xml文件进行解析
  3. 获取xml文件bean标签属性值id和属性class值
  4. 使用反射根据全路径创建对象
  5. ![img.png](img.png)![]
* 控制反转，反转的是什么？
  1. 创建对象的权力
  2. 对象与对象之间依赖关系的维护权
* 控制反转如何实现？
  * DI（Dependency Injection）:依赖注入

#####  引入外部属性文件

* 步骤：
  1. 引入数据库相关依赖
  2. 创建外部属性文件，properties格式，定义数据信息：用户名，密码，地址等
  3. 创建spring配置文件，引入context命名空间，引入属性文件，使用表达式完成注入

##### DI
* 定义：Spring创建对象的过程中，将对象属性通过配置进行注入
* 实现方式：
    * set注入
    * 构造注入
      * 根据name注入
      * 根据index注入，0为开始
* 特殊值处理
  * 字面量赋值：int a = 10;  10就是字面量  使用value给bean的属性赋值时，Spring会把value属性看作字面量
  * null：```
    <constructor-arg index="0">
    <null></null>
    </constructor-arg>```
  * xml实体：value中特殊符号转义，如`< `需要转义为`&lt`, `>` 需要转义为`&gt`,转义字符用`;`分割
  * CDATA节：解决特殊符号```<value><![CDATA[ a > b]]></value>```
* 特殊类型注入
  * 对象类型属性注入
    * 一对多
    * 一对一
* BeanFactory结构：
  * ![img_1.png](img_1.png)
* 获取bean的三种方式
  * 根据bean.xml中的类id
  * 根据类的属性，类.class
    * `注意`：根据类型获取bean时，要求ioc中指定类型的bean只有一个
  * 根据id和属性
* @autowired的6种注入方式
  1. 属性注入
  2. set注入
  3. 构造注入
  4. 形参注入，在构造方法内的参数前加上autowired注解
  5. 构造省略注解注入，在只有一个构造方法的情况下，可以省去autowired注解
  6. autowired+qualifier根据参数名注入
* @resource注解注入
  * 默认根据名称注入byName，未指定名称时，使用属性作为名称，通过名称无法匹配则根据类型byType装配
  * 只有2种注入方式
    * 属性注入
    * set注入
  * jdk8-jdk11不同引入依赖，其余版本需要引入
  * ```pom
    <dependency>
       <groupId>jakarta.annotation</groupId>
       <artifactId>jakarta.annotation-api</artifactId>
       <version>2.1.1</version>
    </dependency>
    

##### 注解

* 实现过程：

  1. 配置xml comtext 配置扫描位置
  2. 类上写@Component等注解用于扫描

* 高级写法

  * 排除 ：

    1. ```java
       <!--根据注解排除-->
       <context:component-scan base-package="com">
       <context:exclude-filter type="annotation" expression="org.springframework.stereotype.Component"/>
           </context:component-scan>

    2. ```java
       <!--根据指定类排除-->   
       <context:component-scan base-package="com">
               <context:exclude-filter type="assignable" expression="com.dhy.Factory.main"/>
           </context:component-scan>
       ```

#### Aop
* `Aspect Oriented Programming` 面向切面编程
* 封装多个类的公共行为，将与业务无关的公共调用逻辑封装起来
* 优点
  * 减少重复代码
  * 降低模块间的耦合度
* 应用
  * 日志
  * 事务
  * 权限