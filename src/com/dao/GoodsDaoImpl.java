package com.dao;

import com.domain.Goods;
import com.homwork.DBUtil;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GoodsDaoImpl implements GoodsDao{

    DBUtil util = new DBUtil();



    @Override
    public List<Goods> list() {
        List<Goods> list = new ArrayList<>();
        Object obj[] = {};
        String sql = "select * from goods";
        ResultSet res = util.query(sql,obj);
        try{
            while (res.next()){
                Goods good = new Goods();
                good.setGoodid(res.getInt("goodid"));
                good.setName(res.getString("name"));
                good.setPrice(res.getDouble("price"));
                list.add(good);

            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            util.closeAll();
        }


        return list;
    }

    @Override
    public int add(Goods good) {
        int result = 0;
        String sql = "insert into goods(goodid,name,price) values(?,?,?)";
        Object obj[] = {good.getGoodid(),good.getName(),good.getPrice()};
        try {
            result = util.excuteUpdate(sql,obj);
            System.out.println("新增条数："+result);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            util.closeAll();
        }

        return result;
    }

    @Override
    public int update(int id,Goods good) {
        int res = 0;
        String sql = "update goods set name=?,price=? where goodid=?";
        Object obj[] = {good.getName(),good.getPrice(),id};
        try{
            res = util.excuteUpdate(sql,obj);
            System.out.println(res);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            util.closeAll();

        }


        return res;
    }

    @Override
    public int delete(int id) {
        int res =0;
        String sql = "delete from goods where goodid=?";
        Object obj[] = {id};
        try{
            res = util.excuteUpdate(sql,obj);
            System.out.println("删除条数:"+res);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            util.closeAll();
        }

        return res;
    }
}
