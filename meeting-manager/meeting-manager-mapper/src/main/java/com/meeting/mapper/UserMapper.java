package com.meeting.mapper;

import com.meeting.pojo.User;

import java.util.List;

/**
 * User: FlowingFire
 * Date: 2017/9/30 0030
 * Time: 10:40
 * Description:
 */
 
/**
 * define the UserMapper interface, 
 * describe it's adding,query & delete operation
 */
public interface UserMapper {
    void addUser(User user);//add a user with a User example


    User findUser(User user);//find a user with a User example

    User findUserByUserName(String username);//find a user with name(string)

    List<User> findAll();//find all the user and exhibite them

    void deleteUserByUserName(String username);//delete a user with name(string)

}
