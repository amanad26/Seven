package com.seven.seven.Models;

public class ExploreVideoModel {

    String count , name ;

    public ExploreVideoModel(String count, String name) {
        this.count = count;
        this.name = name;
    }


    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
