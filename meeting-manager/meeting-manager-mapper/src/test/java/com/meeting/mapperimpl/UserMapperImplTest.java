package com.meeting.mapperimpl;


import com.meeting.mapper.UserMapper;
import com.meeting.pojo.User;

/**
 * User: FlowingFire
 * Date: 2017/9/30 0030
 * Time: 11:17
 * Description:
 */

 /**
 * test an example of the UserMapperImpl,
 * check whether the class could work correctly or not
 */
 
public class UserMapperImplTest {
    UserMapper userMapper =new UserMapperImpl();
    @org.junit.Test
    public void addUser() throws Exception {

        User user = new User();
        user.setUsername("nnnn");
        userMapper.addUser(user);//add a user with name "nnnn"
    }

    @org.junit.Test
    public void findUser() throws Exception {
        User user = new User();
        user.setUsername("nnnn");
        User userByUserName = userMapper.findUserByUserName(user.geterId());//find a user with name
        System.out.println(userByUserName);
    }



}
