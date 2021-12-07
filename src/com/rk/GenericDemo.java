/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rk;

import java.util.*;

public class GenericDemo {

    public static void main(String[] args) {

        // non generic
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(12);
        list.add("jakarta");
        list.add("surabaya");
        list.add(new Date());

        System.out.println("--non generic--");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        // generic
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(2);
        list2.add(3);
        list2.add(5);
        list2.add("bandung"); // --> ini akan error kompilasi

        System.out.println("--non generic--");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }

    }
}
