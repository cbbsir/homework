package com.homwork;

import com.dao.GoodsDao;
import com.dao.GoodsDaoImpl;
import com.domain.Goods;

import java.util.ArrayList;
import java.util.List;

public class testDao {
    public static void main(String[] args) {
        GoodsDao goodsDao = new GoodsDaoImpl();

        //测试新增
        int res = goodsDao.add(new Goods(4,"欧兰亚",29.9));
        int res1 = goodsDao.add(new Goods(5,"欧皇",9999));

        //测试查询
        List<Goods> list = goodsDao.list();
        for (Goods good:list){
            System.out.println(good);
        }


    }
}
