package com.tjf.java.Method;

import com.tjf.java.Bean.Employee;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sort {
    public void sort(ArrayList list, String str) {
        Employee[] emp = new Employee[list.size()];
        for (int i = 0; i < list.size(); i++) {
            emp[i] = (Employee) list.get(i);
        }

        Comparator<Employee> comp = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (str.equals("wage")) {
                    if (e1.getWage() < e2.getWage()) {
                        return 1;
                    } else if (e1.getWage() > e2.getWage()) {
                        return -1;
                    }
                }
                if (str.equals("age")) {
                    if (e1.getAge() < e2.getAge()) {
                        return 1;
                    } else if (e1.getAge() > e2.getAge()) {
                        return -1;
                    }
                }
                return 0;
            }
        };
        for (int i = 0; i < emp.length; i++) {
            Arrays.sort(emp, comp);
        }
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i]);
        }
    }
}
