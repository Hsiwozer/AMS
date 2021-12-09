package com.tjf.java.Method;

import com.tjf.java.Bean.Employee;
import com.tjf.java.JDBC.JDBCUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

public class Query_List {
    public ArrayList<Employee> queryForEmployee(String sql, Object ...args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            for(int i = 0; i < args.length; i++){
                ps.setObject(i + 1, args[i]);
            }
            rs = ps.executeQuery();
            // 获取结果集的元数据
            ResultSetMetaData rsmd = rs.getMetaData();
            // 通过ResultSetMetaData获取结果集中的列数
            int columnCount = rsmd.getColumnCount();
            ArrayList<Employee> list = new ArrayList<Employee>();
            while(rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString("name");
                String sex = rs.getString("sex");
                int birth = rs.getInt(4);
                int age = rs.getInt(5);
                String department = rs.getString("department");
                String title = rs.getString("title");
                int wage = rs.getInt(8);
                String phone = rs. getString("phone");
                Employee employee = new Employee(id, name, sex, birth, age, department, title, wage, phone);
                list.add(employee);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(conn, ps, rs);
        }
        return null;
    }
}
