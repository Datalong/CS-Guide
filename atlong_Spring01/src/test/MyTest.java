package test;

import service.IUserService;
import service.impl.UserServiceimpl;

/**
 * @Auther: Datalong
 * @Date: 2021/5/22 - 05 -22 -16:37
 * @Dscription: test
 * @version: 1.0
 *
 * IOC代码实现
 * 最low的方式：倒入jar包-配置xml 基于ioc的spring
 */
public class MyTest {

    public static void main(String[] args) {
        IUserService service=new UserServiceimpl();

        service.getUser();
    }
}
