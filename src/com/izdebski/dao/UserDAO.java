package com.izdebski.dao;

import com.izdebski.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAO {
    private static List<User> list = null;
    static{
        list=new ArrayList<>();
        list.add(new User("Robert", 30, "rt.cs@gmail.com", "Poland"));
        list.add(new User("Martin", 40, "martin.cs@gmail.com", "US"));
        list.add(new User("Luther", 30, "sean.cs@gmail.com", "Canada"));
    }
    public List<User>getUserList(){
        return list;
    }
    public void addUser(User user){
        list.add(user);
    }
}