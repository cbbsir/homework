package com.service;

import com.dao.GoodsDao;
import com.dao.GoodsDaoImpl;
import com.domain.Goods;

import java.util.List;

public class GoodsServiceImpl implements GoodsService{
    GoodsDao goodDao = new GoodsDaoImpl();

    //查询
    @Override
    public List<Goods> list() {
        return goodDao.list();
    }

    //新增
    @Override
    public int add(Goods goods) {
        return goodDao.add(goods);
    }

    //修改
    @Override
    public int update(int id, Goods good) {
        return goodDao.update(id,good);
    }


    //删除
    @Override
    public int delete(int id) {
        return goodDao.delete(id);
    }
}
