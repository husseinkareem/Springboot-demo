package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;

public class Database{
    private static Database single_instance = null;
private List<Friends> friendList = new ArrayList<>();


   public List<Friends> getFriends(){
        return this.friendList;
    }

    public void addFriend(Friends friend){
        this.friendList.add(friend);
    }

    private Database() {
        // Exists only to defeat instantiation.
    }

    public static Database getInstance() {
        if (single_instance == null)
            single_instance = new Database();

        return single_instance;
    }
}