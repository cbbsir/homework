package com.homwork;

import com.domain.Goods;
import com.service.GoodsService;
import com.service.GoodsServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("***商品管理***");
        List<Goods> list = new ArrayList<Goods>();

        GoodsService goodsService = new GoodsServiceImpl();

        int menu=0;
        while(menu!=5){
            System.out.println("1.查看列表 2.新增 3.修改 4.删除 5.退出");
            Scanner input = new Scanner(System.in);
            System.out.println("请输入菜单编号：");
            menu = input.nextInt();
            switch (menu){
                case 1:
                    //真实 -查询数据列表
                    list = goodsService.list();
                    System.out.println("\t编号\t\t名称\t\t价格");
                    for (Goods goods : list) {
                        System.out.println(String.format("\t%s\t\t%s\t\t%s",
                                goods.getGoodid(),goods.getName(),goods.getPrice()));
                    }
                    break;
                case 2:
                    System.out.println("输入编号：");
                    int gid=input.nextInt();
                    System.out.println("输入名称：");
                    String gname = input.next();
                    System.out.println("输入价格：");
                    double price = input.nextDouble();
                    Goods good = new Goods(gid, gname, price);
                    //真实 -商品新增
                    goodsService.add(good);
                    break;
                case 3:
                    System.out.println("输入编号：");
                    int id1=input.nextInt();
                    System.out.println("输入新名称：");
                    String name = input.next();
                    System.out.println("输入新价格：");
                    double price1 = input.nextDouble();
                    Goods good1 = new Goods(id1, name, price1);
                    //真实 -商品修改
                    goodsService.update(id1,good1);
                    break;
                case 4:
                    System.out.println("输入编号：");
                    int id2=input.nextInt();
                    //真实 -商品删除
                    goodsService.delete(id2);
                    break;
                case 5:
                    System.out.println("谢谢使用");
                    menu=5;
                    break;
                default:
                    System.out.println("菜单错误");
                    break;
            }

        }

    }
}
