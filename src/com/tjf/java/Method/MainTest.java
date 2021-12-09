package com.tjf.java.Method;

import com.tjf.java.Bean.Employee;
import com.tjf.java.Catalog.Catalog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            new Catalog().login();
            java.io.File file = new java.io.File("./login.txt");
            Scanner read = new Scanner(file);
            System.out.print("请输入您要执行的操作序号: ");
            int option = input.nextInt();
            if(option == 1){
                System.out.println("请输入登录密码:");
                String pwd = input.next();
                if(!pwd.equals(read.next())){
                    System.out.println("密码错误，请重新输入!");
                    new EnterToContinue().enterToContinue();
                    read.close();
                    continue;
                }else{
                    flag = true;
                    System.out.println("登录成功!");
                    read.close();
                    break;
                }
            }else if(option == 2){
                System.out.println("感谢使用本系统!");
                flag = false;
                read.close();
                break;
            }else{
                read.close();
                System.out.print("请输入正确的操作序号!\n");
                new EnterToContinue().enterToContinue();
            }
        }
        while (flag) {
            new Catalog().mainCatalog();
            System.out.print("请输入您要执行的操作序号: ");
            int option = input.nextInt();
            ArrayList<Employee> list = new ArrayList<Employee>();
            Employee employee = new Employee();
            switch (option) {
                case 1:
                    for (; ; ) {
                        new Catalog().addModuleCatalog();
                        System.out.print("请输入您要执行的操作序号: ");
                        option = input.nextInt();
                        if (option == 1) {
                            System.out.print("请输入职工姓名：");
                            String name = input.next();
                            System.out.print("请输入职工性别：");
                            String sex = input.next();
                            System.out.print("请输入职工出生年月：");
                            int birth = input.nextInt();
                            System.out.print("请输入职工年龄：");
                            int age = input.nextInt();
                            System.out.print("请输入职工所在部门：");
                            String department = input.next();
                            System.out.print("请输入职工职称：");
                            String title = input.next();
                            System.out.print("请输入职工工资：");
                            int wage = input.nextInt();
                            System.out.print("请输入职工电话：");
                            String phone = input.next();
                            employee = new Employee(name, sex, birth, age, department, title, wage, phone);
                            String sql = "insert into employee(name, sex, birth, age, department, title, wage, phone)values(?,?,?,?,?,?,?,?)";
                            new Update().updateForEmployee(sql, employee.getName(), employee.getSex(), employee.getBirth(), employee.getAge(), employee.getDepartment(), employee.getTitle(), employee.getWage(), employee.getPhone());
                            System.out.println("职工信息录入成功！");
                            new EnterToContinue().enterToContinue();
                        } else if (option == 2) {
                            break;
                        } else if (option == 3) {
                            System.out.println("感谢使用本系统!");
                            flag = false;
                            break;
                        } else {
                            System.out.print("请输入正确的操作序号!");
                            new EnterToContinue().enterToContinue();
                        }
                    }
                    break;
                case 2:
                    for (; ; ) {
                        new Catalog().searchModuleCatalog();
                        System.out.print("请输入您要执行的操作序号: ");
                        option = input.nextInt();
                        if (option == 1) {
                            System.out.print("请输入职工id: ");
                            int enter_id = input.nextInt();
                            String sql = "select * from employee where id = ?";
                            list = new Query_List().queryForEmployee(sql, enter_id);
                            if (list.isEmpty()) {
                                System.out.println("无该职工信息!");
                            } else {
                                for (int i = 0; i < list.size(); i++) {
                                    System.out.println(list.get(i));
                                }
                            }
                            new EnterToContinue().enterToContinue();
                        } else if (option == 2) {
                            System.out.print("请输入职工姓名: ");
                            String enter_name = input.next();
                            String sql = "select * from employee where name = ?";
                            list = new Query_List().queryForEmployee(sql, enter_name);
                            if (list.isEmpty()) {
                                System.out.println("无该职工信息!");
                            } else {
                                for (int i = 0; i < list.size(); i++) {
                                    System.out.println(list.get(i));
                                }
                            }
                            new EnterToContinue().enterToContinue();
                        } else if (option == 3) {
                            System.out.print("请输入职工部门: ");
                            String enter_department = input.next();
                            String sql = "select * from employee where department = ?";
                            list = new Query_List().queryForEmployee(sql, enter_department);
                            if (list.isEmpty()) {
                                System.out.println("无该职工信息!");
                            } else {
                                for (int i = 0; i < list.size(); i++) {
                                    System.out.println(list.get(i));
                                }
                            }
                            new EnterToContinue().enterToContinue();
                        } else if (option == 4) {
                            System.out.print("请输入职工职称: ");
                            String enter_title = input.next();
                            String sql = "select * from employee where title = ?";
                            list = new Query_List().queryForEmployee(sql, enter_title);
                            if (list.isEmpty()) {
                                System.out.println("无该职工信息!");
                            } else {
                                for (int i = 0; i < list.size(); i++) {
                                    System.out.println(list.get(i));
                                }
                            }
                            new EnterToContinue().enterToContinue();
                        } else if (option == 5) {
                            System.out.print("请输入职工工资: ");
                            int enter_wage = input.nextInt();
                            String sql = "select * from employee where wage = ?";
                            list = new Query_List().queryForEmployee(sql, enter_wage);
                            if (list.isEmpty()) {
                                System.out.println("无该职工信息!");
                            } else {
                                for (int i = 0; i < list.size(); i++) {
                                    System.out.println(list.get(i));
                                }
                            }
                            new EnterToContinue().enterToContinue();
                        } else if (option == 6) {
                            break;
                        } else if (option == 7) {
                            System.out.println("感谢使用本系统!");
                            flag = false;
                            break;
                        } else {
                            System.out.print("请输入正确的操作序号!");
                            new EnterToContinue().enterToContinue();
                        }
                    }
                    break;
                case 3:
                    for (; ; ) {
                        new Catalog().modifyModuleCatalog();
                        System.out.print("请输入您要执行的操作序号: ");
                        option = input.nextInt();
                        if (option == 1) {
                            String enter_name = null;
                            String enter_sex = null;
                            int enter_birth = 0;
                            int enter_age = 0;
                            String enter_department = null;
                            String enter_title = null;
                            int enter_wage = 0;
                            String enter_phone = null;
                            System.out.print("请输入要修改的职工的id: ");
                            int enter_id = input.nextInt();
                            String sql = "select * from employee where id = ?";
                            employee = new Query().queryForEmployee(sql, enter_id);
                            String isModify;
                            System.out.print("是否修改职工姓名(y/n): ");
                            isModify = input.next();
                            if (isModify.equals("y") || isModify.equals("Y")) {
                                System.out.print("请输入修改后的姓名: ");
                                enter_name = input.next();
                                employee.setName(enter_name);
                            } else {
                                enter_name = employee.getName();
                            }
                            System.out.print("是否修改职工性别(y/n): ");
                            isModify = input.next();
                            if (isModify.equals("y") || isModify.equals("Y")) {
                                System.out.print("请输入修改后的性别: ");
                                enter_sex = input.next();
                                employee.setSex(enter_sex);
                            } else {
                                enter_sex = employee.getSex();
                            }
                            System.out.print("是否修改职工出生年月(y/n): ");
                            isModify = input.next();
                            if (isModify.equals("y") || isModify.equals("Y")) {
                                System.out.print("请输入修改后的出生年月: ");
                                enter_birth = input.nextInt();
                                employee.setBirth(enter_birth);
                            } else {
                                enter_birth = employee.getBirth();
                            }
                            System.out.print("是否修改职工年龄(y/n): ");
                            isModify = input.next();
                            if (isModify.equals("y") || isModify.equals("Y")) {
                                System.out.print("请输入修改后的年龄: ");
                                enter_age = input.nextInt();
                                employee.setAge(enter_age);
                            } else {
                                enter_age = employee.getAge();
                            }
                            System.out.print("是否修改职工所在部门(y/n): ");
                            isModify = input.next();
                            if (isModify.equals("y") || isModify.equals("Y")) {
                                System.out.print("请输入修改后的所在部门: ");
                                enter_department = input.next();
                                employee.setDepartment(enter_department);
                            } else {
                                enter_department = employee.getDepartment();
                            }
                            System.out.print("是否修改职工职称(y/n): ");
                            isModify = input.next();
                            if (isModify.equals("y") || isModify.equals("Y")) {
                                System.out.print("请输入修改后的职称: ");
                                enter_title = input.next();
                                employee.setTitle(enter_title);
                            } else {
                                enter_title = employee.getTitle();
                            }
                            System.out.print("是否修改职工工资(y/n): ");
                            isModify = input.next();
                            if (isModify.equals("y") || isModify.equals("Y")) {
                                System.out.print("请输入修改后的工资: ");
                                enter_wage = input.nextInt();
                                employee.setWage(enter_wage);
                            } else {
                                enter_wage = employee.getWage();
                            }
                            System.out.print("是否修改职工电话(y/n): ");
                            isModify = input.next();
                            if (isModify.equals("y") || isModify.equals("Y")) {
                                System.out.print("请输入修改后的电话: ");
                                enter_phone = input.next();
                                employee.setPhone(enter_phone);
                            } else {
                                enter_phone = employee.getPhone();
                            }
                            sql = "update employee set name = ?, sex = ?, birth = ?, age = ?, department = ?, title = ?, wage = ?, phone = ? where id = ?";
                            new Update().updateForEmployee(sql, enter_name, enter_sex, enter_birth, enter_age, enter_department, enter_title, enter_wage, enter_phone, enter_id);
                            System.out.println("职工信息修改成功！");
                            System.out.println("修改后的职工信息为: ");
                            System.out.println(employee);
                            new EnterToContinue().enterToContinue();
                        } else if (option == 2) {
                            break;
                        } else if (option == 3) {
                            System.out.println("感谢使用本系统!");
                            flag = false;
                            break;
                        } else {
                            System.out.print("请输入正确的操作序号!");
                            new EnterToContinue().enterToContinue();
                        }
                    }
                    break;
                case 4:
                    for (; ; ) {
                        new Catalog().deleteModuleCatalog();
                        System.out.print("请输入您要执行的操作序号: ");
                        option = input.nextInt();
                        if (option == 1) {
                            System.out.print("请输入要删除的职工的id: ");
                            int enter_id = input.nextInt();
                            String sql = "delete from employee where id = ?";
                            new Update().updateForEmployee(sql, enter_id);
                            System.out.println("职工信息删除成功！");
                            new EnterToContinue().enterToContinue();
                        } else if (option == 2) {
                            break;
                        } else if (option == 3) {
                            System.out.println("感谢使用本系统!");
                            flag = false;
                            break;
                        } else {
                            System.out.print("请输入正确的操作序号!");
                            new EnterToContinue().enterToContinue();
                        }
                    }
                    break;
                case 5:
                    for (; ; ) {
                        new Catalog().sortModuleCatalog();
                        String sql = "select * from employee";
                        list = new Query_List().queryForEmployee(sql);

                        System.out.print("请输入您要执行的操作序号: ");
                        option = input.nextInt();
                        if (option == 1) {
                            if (list.isEmpty()) {
                                System.out.println("无职工信息!");
                            } else {
                                for (int i = 0; i < list.size(); i++) {
                                    System.out.println(list.get(i));
                                }
                            }
                            new EnterToContinue().enterToContinue();
                        } else if (option == 2) {
                            new Sort().sort(list, "age");
                            new EnterToContinue().enterToContinue();
                        } else if (option == 3) {
                            new Sort().sort(list, "wage");
                            new EnterToContinue().enterToContinue();
                        } else if (option == 4) {
                            break;
                        } else if (option == 5) {
                            System.out.println("感谢使用本系统!");
                            flag = false;
                            break;
                        } else {
                            System.out.print("请输入正确的操作序号!");
                            new EnterToContinue().enterToContinue();
                        }
                    }
                    break;
                case 6:
                    java.io.File file = new java.io.File("./login.txt");
                    Scanner read = new Scanner(file);
                    System.out.println("请输入旧密码:");
                    String old_pwd = input.next();
                    if(!old_pwd.equals(read.next())){
                        System.out.println("旧密码错误，密码修改失败!\n");
                        new EnterToContinue().enterToContinue();
                        read.close();
                        continue;
                    }else{
                        System.out.println("请输入新密码:");
                        String new_pwd = input.next();
                        java.io.PrintWriter write = new java.io.PrintWriter(file);
                        write.print(new_pwd);
                        System.out.println("密码修改成功!\n");
                        new EnterToContinue().enterToContinue();
                        write.close();
                        break;
                    }
                case 7:
                    System.out.println("感谢使用本系统!");
                    flag = false;
                    break;
                default:
                    System.out.println("请输入正确的操作序号!");
                    new EnterToContinue().enterToContinue();
                    break;
            }
        }
    }
}
