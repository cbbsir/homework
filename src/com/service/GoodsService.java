package com.service;

import com.domain.Goods;

import java.util.List;

public interface GoodsService {
    //查询
    public List<Goods> list();

    //新增
    public int add(Goods goods);

    //修改
    public int update(int id,Goods good);

    //删除
    public int delete(int id);
}
