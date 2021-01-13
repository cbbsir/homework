package com.homwork;

import com.domain.Goods;
import com.service.GoodsService;
import com.service.GoodsServiceImpl;

import java.util.List;

public class testService {

    public static void main(String[] args) {
        GoodsService goodsService = new GoodsServiceImpl();

        //测试删除
/*
        int res3 = goodsService.delete(6);
*/
        //测试修改
        int res2 = goodsService.update(4,new Goods(4,"蓝翔",9999));



        //测试新增
/*
        int res1 = goodsService.add(new Goods(6,"欧兰亚",29.9));
*/

        //测试查询
        List<Goods> list = goodsService.list();
        for (Goods good:list){
            System.out.println(good);
        }


    }
}
