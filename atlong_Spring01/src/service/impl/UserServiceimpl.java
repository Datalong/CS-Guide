package service.impl;

import dao.IUserDao;
import dao.impl.UserDaoimpl;
import service.IUserService;

/**
 * @Auther: Datalong
 * @Date: 2021/5/22 - 05 -22 -16:33
 * @Dscription: service.Impl
 * @version: 1.0
 */
public class UserServiceimpl implements IUserService {
    //调用数据访问层的方法去访问数据库
    IUserDao dao=new UserDaoimpl();

    @Override
    public void getUser() {
        dao.getUser();
    }
}
