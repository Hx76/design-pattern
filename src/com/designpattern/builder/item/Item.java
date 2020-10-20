package com.designpattern.builder.item;

import com.designpattern.builder.pack.Packing;

public interface Item {
    //名称
    public String name();
    //包装
    public Packing packing();
    //价格
    public float price();
}
