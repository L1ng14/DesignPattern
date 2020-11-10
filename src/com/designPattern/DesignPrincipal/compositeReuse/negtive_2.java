package com.designPattern.DesignPrincipal.compositeReuse;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class negtive_2 {

    static class MySet extends HashSet{
        private int count = 0;

        public int getCount() {
            return count;
        }

        @Override
        public boolean add(Object o) {
            count++;
            return super.add(o);
        }

        @Override
        public boolean addAll(Collection c) {
            boolean modified = false;
            for (Object e : c)
                if (add(e))
                    modified = true;
            return modified;
        }
    }

    public static void main(String[] args) {
        MySet mySet = new MySet();
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
