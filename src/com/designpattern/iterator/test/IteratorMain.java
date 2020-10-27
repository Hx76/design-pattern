package com.designpattern.iterator.test;

import com.designpattern.iterator.Iterator;
import com.designpattern.iterator.impl.NameRepository;

/**
 * 迭代器模式
 */
public class IteratorMain {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iterator = nameRepository.getIterator();iterator.hasNext();){
            String name = (String) iterator.next();
            System.out.println(name);
        }
    }
}
