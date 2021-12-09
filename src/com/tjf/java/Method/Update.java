package com.tjf.java.Method;

import com.tjf.java.JDBC.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Update {
    public void updateForEmployee(String sql, Object... args) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(conn, ps);
        }
    }
}
