package com.example.demo.controller;

import java.util.List;

import com.example.demo.models.Database;
import com.example.demo.models.Friends;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FriendsController{

    @RequestMapping("/friend")
    public Friends getFriend(){
        return new Friends(1, "Havrevägen", "Husse", "0735761050"); 
    }
    @RequestMapping("/friends")
    public List<Friends> getFriends(){
        Database d = Database.getInstance();
        return d.getFriends(); 
    }
    @PostMapping("/friend/add")
    public String addFriend(@RequestBody Friends f){
        Database d = Database.getInstance();
        d.addFriend(f);
        return "Added";
    }
}