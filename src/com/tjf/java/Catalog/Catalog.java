package com.tjf.java.Catalog;

public class Catalog {
    // 主目录
    public void mainCatalog(){
        System.out.println("******欢迎来到档案管理系统******");
        System.out.println("\t\t1. 职工信息录入");
        System.out.println("\t\t2. 职工信息查询");
        System.out.println("\t\t3. 职工信息修改");
        System.out.println("\t\t4. 职工信息删除");
        System.out.println("\t\t5. 职工信息排序");
        System.out.println("\t\t6. 修改密码");
        System.out.println("\t\t7. 退出系统");
        System.out.println("******************************");
    }

    // 信息录入模块目录
    public void addModuleCatalog(){
        System.out.println("******欢迎来到职工信息录入模块******");
        System.out.println("\t\t1. 开始录入");
        System.out.println("\t\t2. 返回上一级");
        System.out.println("\t\t3. 退出系统");
        System.out.println("*********************************");
    }

    // 信息查询模块目录
    public void searchModuleCatalog(){
        System.out.println("******欢迎来到职工信息查询模块******");
        System.out.println("\t\t1. 按职工编号查询信息");
        System.out.println("\t\t2. 按职工姓名查询信息");
        System.out.println("\t\t3. 按所在部门查询信息");
        System.out.println("\t\t4. 按职工职称查询信息");
        System.out.println("\t\t5. 按工资级别查询信息");
        System.out.println("\t\t6. 返回上一级");
        System.out.println("\t\t7. 退出系统");
        System.out.println("*********************************");
    }

    // 信息修改模块目录
    public void modifyModuleCatalog(){
        System.out.println("******欢迎来到职工信息修改模块******");
        System.out.println("\t\t1. 开始修改");
        System.out.println("\t\t2. 返回上一级");
        System.out.println("\t\t3. 退出系统");
        System.out.println("*********************************");
    }

    // 信息删除模块目录
    public void deleteModuleCatalog(){
        System.out.println("******欢迎来到职工信息删除模块******");
        System.out.println("\t\t1. 开始删除");
        System.out.println("\t\t2. 返回上一级");
        System.out.println("\t\t3. 退出系统");
        System.out.println("*********************************");
    }

    // 信息排序模块目录
    public void sortModuleCatalog(){
        System.out.println("******欢迎来到职工信息排序模块******");
        System.out.println("\t\t1. 按职工编号排序信息");
        System.out.println("\t\t2. 按职工年龄排序信息");
        System.out.println("\t\t3. 按职工工资排序信息");
        System.out.println("\t\t4. 返回上一级");
        System.out.println("\t\t5. 退出系统");
        System.out.println("*********************************");
    }

    public void login(){
        System.out.println("******用户登录******");
        System.out.println("\t\t1. 登录系统");
        System.out.println("\t\t2. 退出系统");
        System.out.println("*********************************");
    }
}
