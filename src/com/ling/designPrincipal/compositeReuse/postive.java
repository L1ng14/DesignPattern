package com.ling.designPrincipal.compositeReuse;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class postive {
    
    class MySet{
        private HashSet hashSet;

        private int count = 0;

        public int getCount() {
            return count;
        }

        public boolean add(Object o) {
            count++;
            return hashSet.add(o);
        }

        public boolean addAll(Collection c) {
            count += c.size();
            return hashSet.addAll(c);
        }
    }

    public static void main(String[] args) {
        negtive_2.MySet mySet = new negtive_2.MySet();
        mySet.add("111111");
        mySet.add("22222222222222");
        mySet.add("2333");


        Set hashSet = new HashSet();
        hashSet.add("集合+11111");
        hashSet.add("集合+22222222");
        hashSet.add("集合+233333");

        mySet.addAll(hashSet);

        System.out.println(mySet.getCount());
    }
}
