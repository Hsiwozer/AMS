package com.tjf.java.Bean;

public class Employee {
    private int id;     // 编号
    private String name;        // 姓名
    private String sex;     // 性别
    private int birth;      // 出生年月
    private int age;        // 年龄
    private String department;      // 部门
    private String title;       // 职称
    private int wage;       // 工资
    private String phone;       // 电话

    public Employee() {
    }

    public Employee(String name, String sex, int birth, int age, String department, String title, int wage, String phone) {
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.age = age;
        this.department = department;
        this.title = title;
        this.wage = wage;
        this.phone = phone;
    }

    public Employee(int id, String name, String sex, int birth, int age, String department, String title, int wage, String phone) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.age = age;
        this.department = department;
        this.title = title;
        this.wage = wage;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "职工信息{" +
                "编号：" + id +
                ", 姓名：'" + name + '\'' +
                ", 性别：'" + sex + '\'' +
                ", 出生年月：" + birth +
                ", 年龄：" + age +
                ", 所在部门：'" + department + '\'' +
                ", 职称：'" + title + '\'' +
                ", 工资：¥" + wage +
                ", 联系方式：'" + phone + '\'' +
                '}';
    }
}
