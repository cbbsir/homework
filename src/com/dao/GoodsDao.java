package com.dao;

import com.domain.Goods;

import java.util.List;

public interface GoodsDao{

    //查询
    public List<Goods> list();


    //新增
    public int add(Goods good);

    //修改
    public int update(int id,Goods good);

    //删除
    public int delete(int id);
}
