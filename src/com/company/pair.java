package com.company;

public class pair<X, Y> {

    X x;
    Y y;

    pair(X x, Y y){
        this.x = x;
        this.y = y;
    }

    void getSolution(){
        System.out.println(x + " and " + y);
    }
}
