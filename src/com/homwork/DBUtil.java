package com.homwork;


import java.sql.*;

public class DBUtil {

    Connection conn = null;
    ResultSet res = null;
    PreparedStatement pre = null;

    //获取连接
    public void getConn(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wufang","root","root");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }


    //关闭连接
    public void closeAll(){
        try{
            if (res!=null){
                res.close();
            }
            if (pre!=null){
                pre.close();
            }
            if (conn!=null){
                conn.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }



    //查询
    public ResultSet query(String sql,Object obj[]){
        try {
            getConn();
            pre = conn.prepareStatement(sql);
            for (int i=0;i<obj.length;i++){
                pre.setObject(i+1,obj[i]);

            }
            res = pre.executeQuery();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return res;

    }


    //增删改公共方法
    public int excuteUpdate(String sql,Object obj[]){
        int result = 0;
        try {
            getConn();
            pre = conn.prepareStatement(sql);
            for (int i=0;i< obj.length;i++){
                pre.setObject(i+1,obj[i]);
            }
            result = pre.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }
        return result;


    }


}
