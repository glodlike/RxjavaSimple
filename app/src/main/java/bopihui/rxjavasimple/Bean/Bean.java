package bopihui.rxjavasimple.Bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2017/8/2 0002.
 */

public class Bean {


    /**
     * return : 1
     * city_id : 22
     * city_name : 温州
     * shop_id : 1
     * shop_name : 总店（牛山店）
     * advs : [{"id":"140","name":"庄园主","img":"http://img.bphapp.com/public/attachment/201707/25/15/5976f36b5e81a.jpg?x-oss-process=image/quality,Q_80","type":"21","data":{"item_id":"248"},"ctl":"item"},{"id":"139","name":"贝维尔","img":"http://img.bphapp.com/public/attachment/201707/18/17/596dd8bf5ab57.jpg?x-oss-process=image/quality,Q_80","type":"21","data":{"item_id":"247"},"ctl":"item"},{"id":"129","name":"代驾卷","img":"http://img.bphapp.com/public/attachment/201706/10/17/593bb86c287b3.jpg?x-oss-process=image/quality,Q_80","type":"12","data":{"cate_id":"45"},"ctl":"list"},{"id":"123","name":"松鸡买一送一","img":"http://img.bphapp.com/public/attachment/201705/10/17/5912d9914afa8.jpg?x-oss-process=image/quality,Q_80","type":"21","data":{"item_id":"228"},"ctl":"item"},{"id":"122","name":"希罗买二送一","img":"http://img.bphapp.com/public/attachment/201705/12/10/59152367164d5.jpg?x-oss-process=image/quality,Q_80","type":"21","data":{"item_id":"227"},"ctl":"item"},{"id":"121","name":"海南椰汁","img":"http://img.bphapp.com/public/attachment/201704/28/09/59029f433d2b7.jpg?x-oss-process=image/quality,Q_80","type":"21","data":{"item_id":"226"},"ctl":"item"},{"id":"112","name":"阿尔寇","img":"http://img.bphapp.com/public/attachment/201704/05/17/58e4bf71b3699.jpg?x-oss-process=image/quality,Q_80","type":"21","data":{"item_id":"221"},"ctl":"item"},{"id":"82","name":"泰谷礼盒首顶","img":"http://img.bphapp.com/public/attachment/201708/01/17/5980467e8666d.jpg?x-oss-process=image/quality,Q_80","type":"21","data":{"item_id":"116"},"ctl":"item"}]
     * indexs : [{"id":"121","name":"秒杀","img":"http://img.bphapp.com/public/attachment/201704/13/10/58eede9f2e1eb.png?x-oss-process=image/quality,Q_80","icon_name":"","color":"#f16522","data":{"url":"http://www.bphapp.com/wap/index.php?ctl=yingxiao&act=miaosha"},"ctl":"url","type":"0"},{"id":"108","name":"啤酒","img":"http://img.bphapp.com/public/attachment/201612/15/10/5851f93d4dada.PNG?x-oss-process=image/quality,Q_80","icon_name":"","color":"","data":{"cate_id":"2"},"ctl":"list","type":"12"},{"id":"109","name":"红酒","img":"http://img.bphapp.com/public/attachment/201612/15/10/5851f98692a3f.PNG?x-oss-process=image/quality,Q_80","icon_name":"","color":"","data":{"cate_id":"1"},"ctl":"list","type":"12"},{"id":"110","name":"烈性啤酒","img":"http://img.bphapp.com/public/attachment/201612/15/10/5851f9acaa362.PNG?x-oss-process=image/quality,Q_80","icon_name":"","color":"","data":{"cate_id":"23"},"ctl":"list","type":"12"},{"id":"119","name":"洋酒","img":"http://img.bphapp.com/public/attachment/201612/15/10/5851f9639f38f.PNG?x-oss-process=image/quality,Q_80","icon_name":"","color":"","data":{"cate_id":"22"},"ctl":"list","type":"12"}]
     * adv_gundong : [{"id":"67","name":"滚动1","img":"http://img.bphapp.com/public/attachment/201702/17/14/58a69787bc5ff.jpg?x-oss-process=image/quality,Q_80","type":"12","data":{"cate_id":"27"},"ctl":"list"},{"id":"69","name":"滚动3","img":"http://img.bphapp.com/public/attachment/201702/17/14/58a697a5bde66.jpg?x-oss-process=image/quality,Q_80","type":"21","data":{"item_id":"140"},"ctl":"item"},{"id":"68","name":"滚动2","img":"http://img.bphapp.com/public/attachment/201702/17/14/58a697986347d.jpg?x-oss-process=image/quality,Q_80","type":"21","data":{"item_id":"75"},"ctl":"item"},{"id":"70","name":"滚动4","img":"http://img.bphapp.com/public/attachment/201702/20/11/58aa5c6076841.jpg?x-oss-process=image/quality,Q_80","type":"21","data":{"item_id":"116"},"ctl":"item"}]
     * adv_btn_img : []
     * adv_3_pic : []
     * adv_4 : [{"id":"131","name":"泰谷代金券","img":"http://img.bphapp.com/public/attachment/201706/10/17/593bc2e151e20.jpg?x-oss-process=image/quality,Q_80","type":"12","data":{"cate_id":"45"},"ctl":"list"},{"id":"108","name":"泰谷250瓶","img":"http://img.bphapp.com/public/attachment/201703/26/11/58d7319b48a79.jpg?x-oss-process=image/quality,Q_80","type":"12","data":{"cate_id":"27"},"ctl":"list"}]
     * adv_5 : [{"id":"77","name":"爆款上方2","img":"http://img.bphapp.com/public/attachment/201703/20/11/58cf4ad731b25.jpg?x-oss-process=image/quality,Q_80","type":"12","data":{"cate_id":"2"},"ctl":"list"},{"id":"64","name":"爆款上面1","img":"http://img.bphapp.com/public/attachment/201702/17/11/58a67119b1d96.jpg?x-oss-process=image/quality,Q_80","type":"21","data":{"item_id":"227"},"ctl":"item"}]
     * supplier_deal_list : [{"id":"79","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"泰谷啤酒（易拉罐）500ml*24罐","sub_name":"泰谷啤酒（易拉罐）500ml*24罐","brief":"原产国：西班牙 。 原料与辅料：水 、大麦麦芽 、玉米 、大麦 、啤酒花 。 酒精度 ：4.8%vol ，原麦汁浓度 ：10.7 P 。 贮藏条件：置于阴凉处 。 保质期：18个月 。\r\n","buy_count":"735","current_price":120,"origin_price":168,"icon":"http://img.bphapp.com/public/attachment/201701/03/14/586b3e9a5602a.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/14/586b3e9a5602a.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"75","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"泰谷啤酒（玻璃瓶）250ml*24瓶","sub_name":"泰谷啤酒（玻璃瓶）250ml*24瓶","brief":"原产国：葡萄牙 。 原料与辅料：水 、大麦麦芽 、玉米 、大麦 、啤酒花 。 酒精度 ：4.8%vol ，原麦汁浓度 ：10.7 P 。 贮藏条件：置于阴凉处 。 保质期：18个月 。\r\n","buy_count":"16800","current_price":120,"origin_price":168,"icon":"http://img.bphapp.com/public/attachment/201701/03/13/586b3ca1a00ea.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/13/586b3ca1a00ea.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"39","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"泰谷啤酒（易拉罐）330ml*24罐","sub_name":"泰谷啤酒（易拉罐）330ml*24罐","brief":"原产国：西班牙 。  原料与辅料：水 、大麦麦芽 、玉米 、大麦 、啤酒花 。  酒精度 ：4.8%vol ，原麦汁浓度 ：10.7 P 。  贮存条件：置于阴凉处  。保质期：18个月 。","buy_count":"671","current_price":108,"origin_price":144,"icon":"http://img.bphapp.com/public/attachment/201612/30/11/5865d01713a01.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201612/30/11/5865d01713a01.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"140","distance":0,"ypoint":28.017552,"xpoint":120.689504,"name":"泰谷小麦白啤","sub_name":"泰谷小麦白啤","brief":"净含量：500ml 。  原产国：德国。  原料与辅料：水 、小麦芽 、啤酒花提取物 、 酵母 。  酒精度 ：5.3%vol ，麦汁浓度 ：11.8 P 。  贮藏条件：阴凉干燥处保存 。本品特点：典型的酵母型小麦啤酒，含有酵母 ，酒液呈浑浊为正常现象 ，饮用前轻微摇匀口味最佳。","buy_count":"360","current_price":120,"origin_price":168,"icon":"http://img.bphapp.com/public/attachment/201701/10/17/5874a3e4c571d.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/10/17/5874a3e4c571d.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"178","distance":0,"ypoint":0,"xpoint":0,"name":"泰谷啤酒（易拉罐）250ml*24罐","sub_name":"泰谷啤酒（易拉罐）250ml*24罐","brief":"保质期至：2017年4月15.原产国：西班牙 。 原料与辅料：水 、大麦麦芽 、玉米 、大麦 、啤酒花 。 酒精度 ：4.8%vol ，原麦汁浓度 ：10.7 P 。 贮藏条件：置于阴凉处 。 保质期：18个月 。","buy_count":"523","current_price":96,"origin_price":120,"icon":"http://img.bphapp.com/public/attachment/201701/22/12/5884304f2a467.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/22/12/5884304f2a467.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"212","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"泰谷16度烈性啤酒 500ml * 24 罐","sub_name":"泰谷16度烈性啤酒","brief":"净含量：500ml 。  原产国：西班牙 。  原料与辅料：水 、大麦麦芽、玉米、大麦、啤酒花 。  酒精度 ：16 %vol ，麦汁浓度 ：26.7 P 。  贮藏条件：阴凉干燥处保存 。本品特点：本产品为 烈性啤酒 , 请君适量饮用 。","buy_count":"227","current_price":240,"origin_price":288,"icon":"http://img.bphapp.com/public/attachment/201703/04/11/58ba386c75dc4.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201703/04/11/58ba386c75dc4.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"76","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"希罗啤酒（玻璃瓶） 250ml*24瓶","sub_name":"希罗啤酒（玻璃瓶） 250ml*24瓶","brief":"原产国：葡萄牙 。 原料与辅料：水 、大麦麦芽 、玉米 、大麦 、啤酒花 。 酒精度 ：5.0%vol ，原麦汁浓度 ：10.7 P 。 贮藏条件：置于阴凉处 。 保质期：18个月 。\r\n","buy_count":"12165","current_price":120,"origin_price":144,"icon":"http://img.bphapp.com/public/attachment/201701/03/13/586b3d04d3d6a.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/13/586b3d04d3d6a.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"211","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"希罗啤酒（易拉罐）500ml *24罐","sub_name":"希罗啤酒（易拉罐）500ml","brief":"希罗啤酒原瓶原装进口 。原产国：西班牙 。 原料与辅料：水 、大麦麦芽 、玉米 、大麦 、啤酒花 。 酒精度 ：5.0%vol ，原麦汁浓度 ：10.7 P 。 贮藏条件：置于阴凉处 。 保质期：18个月 。","buy_count":"435","current_price":120,"origin_price":144,"icon":"http://img.bphapp.com/public/attachment/201703/04/11/58ba3713c5e7d.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201703/04/11/58ba3713c5e7d.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"40","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"阿尔寇啤酒 500ml*24罐","sub_name":"阿尔寇啤酒 500ml*24罐","brief":"原产国：西班牙 。  原料与辅料：水 、大麦芽 、玉米 、大麦 、啤酒花 。  酒精度 ：4.8%vol ，原麦汁浓度 ：10.7 P 。  贮藏方式：常温 、避光  。","buy_count":"168","current_price":120,"origin_price":140,"icon":"http://img.bphapp.com/public/attachment/201612/30/11/5865d08ea9d0d.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201612/30/11/5865d08ea9d0d.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"34","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"克伦堡1664 白啤酒 250ml*24瓶","sub_name":"克伦堡1664 白啤酒 250ml*24","brief":"原产国：法国 。  原料与辅料：水 、大麦麦芽 、小麦麦芽 、啤酒花酵母、焦糖色（普通法）、食用香精  。  酒精度 ：5.0%vol ，原麦汁浓度 ：11.8 P 。  贮藏条件：阴凉干燥处存放 ，冷藏后饮用更佳 。保质期：12个月 。","buy_count":"159","current_price":180,"origin_price":280,"icon":"http://img.bphapp.com/public/attachment/201612/30/10/5865c8660218c.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201612/30/10/5865c8660218c.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"214","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"克伦堡1664金标啤酒 250 ml * 24 瓶","sub_name":"克伦堡1664金标啤酒","brief":"净含量：250ml 。原产国：法国 。原料与辅料：水 、大麦麦芽 、啤酒花 、葡萄糖浆 、酵母  。  酒精度 ：6.1 %vol，原麦汁浓度 ：11.8 P 。  贮藏条件：阴凉、干燥、避光、通风贮存 ，冷藏后饮用更佳 。保质期：12个月 。","buy_count":"158","current_price":240,"origin_price":240,"icon":"http://img.bphapp.com/public/attachment/201703/04/11/58ba3a6fca2bd.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201703/04/11/58ba3a6fca2bd.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"215","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"克伦堡1664玫瑰啤酒 250ml * 24瓶","sub_name":"克伦堡1664玫瑰啤酒","brief":"净含量：250ml 。原产国：法国 。原料与辅料：水 、大麦麦芽 、啤酒花 、葡萄糖浆 、酵母  。  酒精度 ：6.1 %vol，原麦汁浓度 ：11.8 P 。  贮藏条件：阴凉、干燥、避光、通风贮存 ，冷藏后饮用更佳 。保质期：12个月 。","buy_count":"310","current_price":240,"origin_price":240,"icon":"http://img.bphapp.com/public/attachment/201703/04/11/58ba3aea747fc.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201703/04/11/58ba3aea747fc.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"200","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"凯罗拉330毫升*24瓶","sub_name":"科罗娜啤酒","brief":"净含量：355ml 。  原产国：墨西哥。  原料与辅料：水 、大麦麦芽 、玉米 、大米 、啤酒花 。  酒精度 ：4.5%vol ，原麦汁浓度 ：11.3 P 。  贮藏条件：阴凉干燥处存放 ，冷藏后饮用更佳 。","buy_count":"474","current_price":160,"origin_price":270,"icon":"http://img.bphapp.com/public/attachment/201702/18/16/58a80c03e64fb.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201702/18/16/58a80c03e64fb.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"31","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"卡罗娜  355ml*24瓶","sub_name":"卡罗娜  355ml*24瓶","brief":"净含量：355ml 。  原产国：墨西哥。  原料与辅料：水 、大麦麦芽 、玉米 、大米 、啤酒花 。  酒精度 ：4.5%vol ，原麦汁浓度 ：11.3 P 。  贮藏条件：阴凉干燥处存放 ，冷藏后饮用更佳 。","buy_count":"228","current_price":168,"origin_price":240,"icon":"http://img.bphapp.com/public/attachment/201612/30/10/5865c462aa92f.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201612/30/10/5865c462aa92f.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"71","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"唯德 年度啤酒 750ml","sub_name":"唯德 年度啤酒 750ml","brief":"","buy_count":"167","current_price":148,"origin_price":228,"icon":"http://img.bphapp.com/public/attachment/201701/03/13/586b3a7b48168.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/13/586b3a7b48168.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"69","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"唯德 小麦白啤 330mlX24瓶","sub_name":"唯德 小麦白啤 330mlX24瓶","brief":"原产国：德国 。  原料与辅料：水 、小麦麦芽 、大麦麦芽 、啤酒花、酵母 。  酒精度 ：5.2%vol ，麦汁浓度 ：12 P 。  贮藏条件：常温保存 ， 置于阴凉干燥处 。注：浑浊为正常现象，饮用前轻微摇匀口味最佳 。 日期不断更新中 ，质量保证 ，请放心购买 。\r\n                <\/div>\r\n\r\n","buy_count":"108","current_price":240,"origin_price":288,"icon":"http://img.bphapp.com/public/attachment/201701/03/13/586b397b9d8f4.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/13/586b397b9d8f4.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"67","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"唯德 精品皮尔森啤酒 330mlX24瓶","sub_name":"唯德 精品皮尔森啤酒 330mlX24瓶","brief":"原产国：德国 。  原料与辅料：水 、小麦麦芽 、大麦麦芽 、啤酒花 。  酒精度 ：4.8%vol ，麦汁浓度 ：11 P 。  贮藏条件：常温避光 。置于阴凉干燥处 。保质期：12个月 。日期不断更新中 ，质量保证 ，请放心购买 。\r\n","buy_count":"212","current_price":240,"origin_price":280,"icon":"http://img.bphapp.com/public/attachment/201701/03/11/586b1fc2cc843.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/11/586b1fc2cc843.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"13","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"唯德夜宴 小麦白啤酒 500ml*24罐","sub_name":"唯德夜宴 小麦白啤酒 500ml*24罐","brief":"原产国：德国 。 原料与辅料：水 、小麦麦芽 、大麦麦芽 、啤酒花 、酵母 。 酒精度 ：5.2%vol ，麦汁浓度 ：12 P 。 贮藏条件：常温保存 ， 置于阴凉干燥处 。注：浑浊为正常现象，饮用前轻微摇匀口感最佳 。","buy_count":"325","current_price":180,"origin_price":230,"icon":"http://img.bphapp.com/public/attachment/201612/15/11/585210dfadf20.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201612/15/11/585210dfadf20.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"21","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"唯德 红橙小麦白啤酒 330mlX24瓶","sub_name":"唯德 红橙小麦白啤酒 330mlX24瓶","brief":"原产国：德国 。  原料与辅料：小麦白啤酒（水 、小麦麦芽 、啤酒花  、酵母 ） 、红橙汁、阿斯巴甜（含苯丙氨酸）、抗坏血酸  。  酒精度 ：2.6 %vol ，原麦汁浓度 ：6.0 P 。  贮藏方式：常温 ，避光保存  。保质期：12个月 。","buy_count":"181","current_price":288,"origin_price":384,"icon":"http://img.bphapp.com/public/attachment/201612/15/13/58522e5fda8dc.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201612/15/13/58522e5fda8dc.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"78","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"奇盟白啤500mlX24罐","sub_name":"奇盟白啤500mlX24罐","brief":"原产国：德国 。 原料与辅料：水 、小麦麦芽  、大麦麦芽 、啤酒花、酵母 。 酒精度 ：5.4%vol ，原麦汁浓度 ：12.4 P 。 贮藏条件：常温 ，避光 。\r\n","buy_count":"345","current_price":120,"origin_price":180,"icon":"http://img.bphapp.com/public/attachment/201701/03/14/586b3de91527b.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/14/586b3de91527b.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"77","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"奇盟黑啤500mlX24罐","sub_name":"奇盟黑啤500mlX24罐","brief":"原产国：德国 。 原料与辅料：水 、大麦麦芽 、玉米 、大麦 、啤酒花、烘焙麦芽  。 酒精度 ：4.9%vol ，原麦汁浓度 ：11.5 P 。 贮藏条件：常温 ，避光 。\r\n","buy_count":"157","current_price":120,"origin_price":180,"icon":"http://img.bphapp.com/public/attachment/201701/03/13/586b3d96054a4.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/13/586b3d96054a4.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"74","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"奇盟小麦黑啤酒 5L桶装","sub_name":"奇盟小麦黑啤酒 5L桶装","brief":"原产国：德国 。  原料与辅料：水 、大麦芽 、小麦芽、啤酒花、酵母、烘培麦芽  。  酒精度 ：5.5 %vol ，原麦汁浓度 ：12.3 P 。  贮藏方式：常温 ， 避光  。","buy_count":"243","current_price":98,"origin_price":128,"icon":"http://img.bphapp.com/public/attachment/201701/17/15/587dc18f6e2d5.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/17/15/587dc18f6e2d5.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"73","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"奇盟黑啤 5L桶装","sub_name":"奇盟黑啤 5L桶装","brief":"原产国：德国 。 原料与辅料：水 、大麦麦芽 、玉米 、大麦 、啤酒花、烘焙麦芽 。 酒精度 ：4.9%vol ，原麦汁浓度 ：11.5 P 。 贮藏条件：常温 ，避光 。\r\n","buy_count":"169","current_price":98,"origin_price":128,"icon":"http://img.bphapp.com/public/attachment/201701/17/15/587dc1e000820.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/17/15/587dc1e000820.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"148","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"费尔德堡小麦啤330mlX24罐","sub_name":"费尔德堡小麦啤330mlX24罐","brief":"原产国：德国 。  原料与辅料：水 、小麦麦芽 、大麦麦芽 、啤酒花 、酵母 。  酒精度 ：5.0%vol ，麦汁浓度 ：11.3 P 。  贮藏条件：常温保存 ， 置于阴凉干燥处 。注：本酒含有丰富的酵母 ， 因此酒液呈浑浊状为正常现象 。","buy_count":"108","current_price":78,"origin_price":120,"icon":"http://img.bphapp.com/public/attachment/201701/11/09/58758bc9833c1.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/11/09/58758bc9833c1.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"89","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"费尔德堡小麦啤酒500mlX24罐","sub_name":"费尔德堡小麦啤酒500mlX24罐","brief":"原产国：德国 。  原料与辅料：水 、大麦芽 、小麦芽 、啤酒花 。  酒精度 ：5.0%vol ，原麦汁浓度 ：11.3 P 。  贮藏条件：常温避光保存 ，置于阴凉干燥处  。注：本酒含有丰富的酵母 ， 因此酒液呈浑浊状 。\r\n","buy_count":"317","current_price":96,"origin_price":180,"icon":"http://img.bphapp.com/public/attachment/201701/03/14/586b44fa5b748.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/14/586b44fa5b748.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"65","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"费尔德堡小麦白啤 5L桶装","sub_name":"费尔德堡小麦白啤 5L桶装","brief":"原产国：德国 。  原料与辅料：水 、小麦芽 、大麦芽 、啤酒花 、酵母 。  酒精度 ：5.0%vol ，麦汁浓度 ：11.3 P 。  贮藏条件：常温保存 ，置于阴凉干燥处  。","buy_count":"198","current_price":88,"origin_price":168,"icon":"http://img.bphapp.com/public/attachment/201701/17/15/587dc29653e39.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/17/15/587dc29653e39.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"44","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"费尔德堡 黑啤 5L桶装","sub_name":"费尔德堡 黑啤 5L桶装","brief":"原产国：德国 。  原料与辅料：水 、大麦芽 、啤酒花 。  酒精度 ：5.0%vol ，原麦汁浓度 ：11.2 P 。  贮藏条件：常温保存，置于阴凉处  。\r\n","buy_count":"154","current_price":78,"origin_price":129,"icon":"http://img.bphapp.com/public/attachment/201701/17/15/587dc393009cb.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/17/15/587dc393009cb.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"51","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"费尔德堡黑啤330mlX24罐","sub_name":"费尔德堡黑啤330mlX24罐","brief":"原产国：德国 。  原料与辅料：水 、大麦麦芽 、啤酒花  。  酒精度 ：5.0%vol ，麦汁浓度 ：11.2 P 。  贮藏条件：常温保存 ， 置于阴凉干燥处 。","buy_count":"307","current_price":78,"origin_price":120,"icon":"http://img.bphapp.com/public/attachment/201612/31/11/58672cafe5c09.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201612/31/11/58672cafe5c09.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"19","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"费尔德堡黑啤酒500mlX24罐","sub_name":"费尔德堡黑啤酒500mlX24罐","brief":"原产国：德国 。  原料与辅料：水 、大麦芽 、啤酒花 。  酒精度 ：5.0%vol ，原麦汁浓度 ：11.2 P 。  贮藏条件：常温保存 ，置于阴凉处  。","buy_count":"118","current_price":96,"origin_price":180,"icon":"http://img.bphapp.com/public/attachment/201612/15/13/58522cd5c593d.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201612/15/13/58522cd5c593d.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"18","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"费尔德皮尔森啤酒500mlX24罐","sub_name":"费尔德皮尔森啤酒500mlX24罐","brief":"原产国：德国 。  原料与辅料：水 、小麦芽、啤酒花 。  酒精度 ：4.9%vol ，原麦汁浓度 ：11.2 P 。  贮藏条件：常温避光保存 ，置于阴凉干燥处  。","buy_count":"262","current_price":96,"origin_price":180,"icon":"http://img.bphapp.com/public/attachment/201612/15/13/58522c43be1df.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201612/15/13/58522c43be1df.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"42","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"磨坊主 小麦啤酒 500ml*24罐 扑克牌 大王","sub_name":"磨坊主 小麦啤酒 500ml*24罐","brief":"原产国：德国 。  原料与辅料：水 、大麦芽 、啤酒花 。  酒精度 ：5.0%vol ，原麦汁浓度 ：11.3P 。  贮藏方式：阴凉干燥 、常温 、避光  。","buy_count":"99","current_price":108,"origin_price":180,"icon":"http://img.bphapp.com/public/attachment/201612/30/11/5865d1b1c4b10.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201612/30/11/5865d1b1c4b10.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"92","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"凯撒 黄啤酒 500mlX24罐","sub_name":"凯撒 黄啤酒 500mlX24罐","brief":"原产国：德国 。 原料与辅料：水 、大麦麦芽 、啤酒花 、酒花浸膏 。产品类型：淡色啤酒 。  酒精度 ：4.7%vol ，麦汁浓度 ：10.6 P 。 贮藏条件：请置于阴凉干燥处，8度 - 10度 饮用更佳 。\r\n","buy_count":"143","current_price":168,"origin_price":240,"icon":"http://img.bphapp.com/public/attachment/201701/03/14/586b46e3cf9f7.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/14/586b46e3cf9f7.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"87","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"凯撒 Kaiserdom 黑啤酒 500mlX24罐","sub_name":"凯撒 Kaiserdom 黑啤酒","brief":"原产国：德国 。  原料与辅料：水 、大麦麦芽 、啤酒花 、酒花浸膏   。产品类型：黑色啤酒 。  酒精度 ：4.7%vol ，麦汁浓度 ：11.4 P 。  贮藏条件：常温保存 ， 请阴凉干燥处保存 ， 8度~10度 饮用更佳 。","buy_count":"124","current_price":144,"origin_price":240,"icon":"http://img.bphapp.com/public/attachment/201701/03/14/586b43bde95cc.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/14/586b43bde95cc.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"86","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"凯撒 Kaiserdom白啤酒 500mlX24罐","sub_name":"凯撒 Kaiserdom白啤酒","brief":" 原产国：德国 。  原料与辅料：水 、大麦麦芽 、小麦麦芽 、啤酒花 、酒花浸膏 、酵母 。产品类型：淡色啤酒 。  酒精度 ：4.7%vol ，麦汁浓度 ：10.6 P 。  贮藏条件：阴凉干燥处保存 ，8 &#176;C~10 &#176; C 饮用更佳 。注：本品系上层发酵法酿制，未经过滤 ，含有水果的酯香，气泡饱满，入口略有酵母的酸味 。若酒体少量浑浊 ，底部少许沉淀 ，为保留的发酵酵母 ，并无品质问题 。\r\n","buy_count":"374","current_price":144,"origin_price":240,"icon":"http://img.bphapp.com/public/attachment/201701/03/14/586b42e523ec6.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/14/586b42e523ec6.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"85","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"凯撒 Kaiserdom 窖藏啤酒 500mlX24罐","sub_name":"凯撒 Kaiserdom 窖藏啤酒","brief":"原产国：德国 。  原料与辅料：水 、大麦麦芽 、啤酒花 、酒花浸膏 、酵母 。产品类型：浓色啤酒 。  酒精度 ：4.7%vol ，麦汁浓度 ：11.4 P 。  贮藏条件：阴凉干燥处保存 ，8 度 ~10 度 饮用更佳 。\r\n","buy_count":"127","current_price":216,"origin_price":288,"icon":"http://img.bphapp.com/public/attachment/201701/03/14/586b425902ea6.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/14/586b425902ea6.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"47","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"凯撒 Kaiserdom白啤 1L*12罐","sub_name":"凯撒 Kaiserdom白啤 1L*12","brief":"原产国：德国 。  原料与辅料：水 、大麦麦芽 、啤酒花 、酒花浸膏  。  酒精度 ：4.7%vol ，麦汁浓度 ：10.6 P 。  贮藏条件：请置于阴凉干燥处，8-10°C饮用更佳 。注：本品系上层发酵法酿制，未经过滤 ，含有水果的酯香，气泡饱满，入口略有酵母的酸味 。若酒体少量浑浊 ，底部少许沉淀 ，为保留的发酵酵母 ，并无品质问题 。","buy_count":"216","current_price":192,"origin_price":210,"icon":"http://img.bphapp.com/public/attachment/201701/17/15/587dc3facc653.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/17/15/587dc3facc653.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"179","distance":0,"ypoint":0,"xpoint":0,"name":"百威啤酒330ml *24罐","sub_name":"百威啤酒330ml *24罐","brief":"","buy_count":"325","current_price":110,"origin_price":120,"icon":"http://img.bphapp.com/public/attachment/201702/08/18/589aec28647ca.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201702/08/18/589aec28647ca.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"61","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"布德维啤酒（易拉罐） 500ml*24罐","sub_name":"布德维啤酒（易拉罐） 500ml*24罐","brief":"原产国：英国 。  原料与辅料：水 、大麦麦芽 、啤酒花、酵母 。  酒精度 ：4.8%vol ，原麦汁浓度 ：11.3 P 。  贮藏条件：阴凉干燥处存放 ，避免阳光直射 。保质期：11个月 。\r\n","buy_count":"187","current_price":110,"origin_price":144,"icon":"http://img.bphapp.com/public/attachment/201701/03/09/586b0004db72b.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/09/586b0004db72b.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"25","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"布德维啤酒 500ml*18罐","sub_name":"布德维啤酒 500ml*18罐","brief":"净含量：500ml 。  原产国：英国 。  原料与辅料：水 、大麦麦芽 、啤酒花 。  酒精度 ：4.8 %vol ，原麦汁浓度 ：11.3 P 。  贮藏条件：阴凉干燥处存放 ，避免阳光直射 。保质期：11个月 。","buy_count":"290","current_price":86,"origin_price":118,"icon":"http://img.bphapp.com/public/attachment/201612/29/17/5864d7a6aef8d.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201612/29/17/5864d7a6aef8d.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"204","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"Heineken 海尼根 啤酒 500ml *24罐","sub_name":"Heineken 海尼根啤酒","brief":"原装喜力啤酒500ml 。配料表： 水、麦芽、啤酒花、酵母。 产地： 英国 。储藏方法:：常温避光。 按啤酒颜色选： 黄啤酒 。酒精度：5.0 。麦汁浓度：11.4 P \r\n备注：新旧包装随机发货 ，新包装带螺旋纹 。\r\n\r\n","buy_count":"449","current_price":156,"origin_price":0,"icon":"http://img.bphapp.com/public/attachment/201703/04/12/58ba3ca6b6472.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201703/04/12/58ba3ca6b6472.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"177","distance":0,"ypoint":0,"xpoint":0,"name":"Heineken（铁金刚） 5L桶装","sub_name":"Heineken（铁金刚） 5L桶装","brief":"产品名称: Heineken/喜力。原产国：荷兰 。原料与辅料：水、大麦麦芽、啤酒花 。保质期: 240天 。啤酒麦汁浓度: 11.4P 。酒精度: 5%vol 。净含量: 5L 。贮藏方式：阴凉干燥处存放 ，冷藏后饮用更佳 。","buy_count":"212","current_price":129,"origin_price":168,"icon":"http://img.bphapp.com/public/attachment/201701/22/11/588423c1e34d6.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/22/11/588423c1e34d6.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"156","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"荷兰Heineken（玻璃瓶） 330ml*24瓶","sub_name":"荷兰Heineken（玻璃瓶）","brief":"品牌: Heineken/喜力。\r\n规格:330买ml * 24 瓶。\r\n原料与辅料：水 、麦芽、啤酒花。\r\n啤酒麦汁浓度: 11.2P。\r\n酒精浓度: 5%vol。\r\n贮藏方式：阴凉干燥处存放 ，冷藏后饮用更佳 。","buy_count":"207","current_price":144,"origin_price":168,"icon":"http://img.bphapp.com/public/attachment/201701/11/10/587599617fdae.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/11/10/587599617fdae.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"155","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"荷兰Heineken（玻璃瓶） 250ml*24瓶","sub_name":"荷兰Heineken（玻璃瓶）","brief":"品牌: Heineken/喜力。\r\n规格: 250ml * 24瓶。\r\n原料与辅料：水 、麦芽、啤酒花。\r\n啤酒麦汁浓度: 11.2P。\r\n酒精浓度: 5%vol。\r\n贮藏方式：阴凉干燥处存放 ，冷藏后饮用更佳 。","buy_count":"332","current_price":144,"origin_price":144,"icon":"http://img.bphapp.com/public/attachment/201702/18/17/58a80e2e9775e.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201702/18/17/58a80e2e9775e.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"154","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"西班牙Heineken（铝罐） 330ml*24罐","sub_name":"西班牙Heineken（铝罐） 330m","brief":"","buy_count":"235","current_price":132,"origin_price":150,"icon":"http://img.bphapp.com/public/attachment/201701/11/10/5875981a70881.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/11/10/5875981a70881.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"45","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"Heineken 250ml*24瓶","sub_name":"Heineken250ml*24瓶","brief":"品牌: Heineken/喜力。\r\n规格: 250ml*24瓶旋盖。\r\n原料与辅料：水 、麦芽、啤酒花。\r\n啤酒麦汁浓度: 11.2P。\r\n酒精浓度: 5%vol。\r\n贮藏方式：阴凉干燥处存放 ，冷藏后饮用更佳 。\r\n","buy_count":"126","current_price":132,"origin_price":150,"icon":"http://img.bphapp.com/public/attachment/201612/31/11/5867269785be9.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201612/31/11/5867269785be9.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"52","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"贝维尔啤酒  500ML*24罐","sub_name":"贝维尔啤酒  500ML*24罐","brief":" 原产国：荷兰 。  原料与辅料：水 、大麦麦芽 、啤酒花提取物 。  酒精度 ：5.0 %vol ，原麦汁浓度 ：11.4 P 。  贮藏方式：常温  、避光 。","buy_count":"256","current_price":132,"origin_price":192,"icon":"http://img.bphapp.com/public/attachment/201701/03/09/586afb6381eed.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/09/586afb6381eed.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"213","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"米歇尔啤酒 500ml * 24 罐","sub_name":"米歇尔啤酒","brief":"净含量：500ml 。  原产国：波兰。  原料与辅料：水 、大麦芽、大麦、啤酒花 、 啤酒花提取物 。  酒精度 ：4.5 %vol ，麦汁浓度 ：9.0 P 。  贮藏条件：阴凉干燥处 ，常温 ，避光保存 。","buy_count":"83","current_price":120,"origin_price":120,"icon":"http://img.bphapp.com/public/attachment/201703/04/11/58ba39544adcc.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201703/04/11/58ba39544adcc.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"158","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"松鸡啤酒（500ml*24罐）","sub_name":"松鸡啤酒（500ml*24罐）","brief":"原产国：波兰， 原料与辅料：水 、大麦芽 、大麦、啤酒花、啤酒花提取物 。  酒精度 ：4.0%vol ，原麦汁浓度 ：8.1P 。  贮藏方式：阴凉干燥 、常温 、避光  。","buy_count":"113","current_price":132,"origin_price":180,"icon":"http://img.bphapp.com/public/attachment/201701/11/10/58759e66c3ac2.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/11/10/58759e66c3ac2.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"27","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"白熊啤酒 330ml*24瓶","sub_name":"白熊啤酒 330ml*24瓶","brief":"净含量：330ml 。  原产国：比利时 。  原料与辅料：水 、小麦麦芽 、大麦麦芽  、酒啤花 、酵母 。  酒精度 ：4.7%vol ，麦汁浓度 ：11.6 P 。  贮藏条件：阴凉干燥处保存 ，请勿倒置  。保质期 ：1年 。","buy_count":"132","current_price":264,"origin_price":384,"icon":"http://img.bphapp.com/public/attachment/201612/30/10/5865c1f1174cb.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201612/30/10/5865c1f1174cb.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"145","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"塔克骑士小麦啤酒","sub_name":"塔克骑士小麦啤酒","brief":"净含量：500ml 。  原产国：德国。  原料与辅料：水 、大麦芽 、小麦芽 、啤酒花  、酵母 。  酒精度 ：5.0%vol ，麦汁浓度 ：11.3 P 。  贮藏条件：阴凉干燥处、常温、避光保存  。 本酒含有丰富的酵母，因此酒液呈浑浊状 。","buy_count":"167","current_price":120,"origin_price":180,"icon":"http://img.bphapp.com/public/attachment/201703/10/11/58c21d570db5f.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201703/10/11/58c21d570db5f.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"144","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"塔克骑士黑啤酒","sub_name":"塔克骑士黑啤酒","brief":"净含量：500ml 。  原产国：德国。  原料与辅料：水 、大麦芽 、啤酒花  。  酒精度 ：5.0%vol ，麦汁浓度 ：11.2 P 。  贮藏条件：阴凉干燥处、常温、避光保存  。","buy_count":"123","current_price":120,"origin_price":180,"icon":"http://img.bphapp.com/public/attachment/201703/10/11/58c21d966bc72.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201703/10/11/58c21d966bc72.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"90","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"特价 布兰克啤酒 330mlX24瓶","sub_name":"特价 布兰克啤酒 330mlX24瓶","brief":"特价 ！特价！特价！保质期至 17年9月 。原产国：德国 。  原料与辅料：水 、大麦麦芽 、啤酒花、酵母 。  酒精度 ：5.1%vol ，原麦汁浓度 ：12.5 P 。  贮藏条件：常温保存 ，置于阴凉干燥处存放 。\r\n","buy_count":"244","current_price":88,"origin_price":320,"icon":"http://img.bphapp.com/public/attachment/201701/03/14/586b457dde564.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/14/586b457dde564.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"2017-08-13 17:00:00","begin_time_format":"2017-07-09 17:00:47","begin_time":"1499562047","end_time":"1502586000","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"48","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"庄园主小麦白啤酒 500ml*18罐","sub_name":"庄园主小麦白啤酒 500ml*18罐","brief":"原产国：德国 。  原料与辅料：水 、小麦麦芽 、大麦麦芽 、啤酒花提取物 、酵母  。  酒精度 ：5.3%vol ，麦汁浓度 ：11.8 P 。  贮藏条件：常温保存 ， 置于阴凉干燥处 。注：浑浊为正常现象，饮用前轻微摇匀口感最佳  。\r\n","buy_count":"153","current_price":79,"origin_price":144,"icon":"http://img.bphapp.com/public/attachment/201612/31/11/5867287c4b28e.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201612/31/11/5867287c4b28e.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"64","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"罗斯福6号啤酒  300ml*24瓶","sub_name":"罗斯福6号啤酒  300ml*24瓶","brief":"","buy_count":"115","current_price":384,"origin_price":468,"icon":"http://img.bphapp.com/public/attachment/201701/03/11/586b1c0928214.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/11/586b1c0928214.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"63","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"罗斯福8号啤酒  300ml*24瓶","sub_name":"罗斯福8号啤酒  300ml*24瓶","brief":"原产国：比利时 。  原料与辅料：水 、大麦麦芽 、无麦芽谷物 、啤酒花、酵母、糖  。  酒精度 ：9.2%vol ，原麦汁浓度 ：20.8 P 。  贮藏条件：阴凉干燥处存放 ，冷藏后口感更佳 。保质期：5年 。\r\n","buy_count":"206","current_price":489,"origin_price":408,"icon":"http://img.bphapp.com/public/attachment/201701/03/09/586b059254b2f.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/09/586b059254b2f.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"62","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"罗斯福10号啤酒  300ml*24瓶","sub_name":"罗斯福10号啤酒  300ml*24瓶","brief":"原产国：比利时 。  原料与辅料：水 、大麦麦芽 、玉米 、啤酒花、酵母 。  酒精度 ：11.3 %vol ，原麦汁浓度 ：20.2 P 。  贮藏条件：阴凉干燥处存放 ，请勿倒置 。保质期：5年 。\r\n","buy_count":"56","current_price":480,"origin_price":569,"icon":"http://img.bphapp.com/public/attachment/201701/03/09/586b05258802b.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/09/586b05258802b.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"53","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"莱凯姆 白啤酒 500ml*20瓶","sub_name":"莱凯姆 白啤酒 500ml*20瓶","brief":"原产国：德国。  原料与辅料：水 、大麦麦芽 、小麦麦芽、啤酒花、酵母 。  酒精度 ：5.4%vol ，原麦汁浓度 ：12.5 P 。  贮藏条件：常温避光 、置于阴凉干燥处存放  。  保质期：12个月 ","buy_count":"337","current_price":210,"origin_price":260,"icon":"http://img.bphapp.com/public/attachment/201701/03/09/586afbf48b1a8.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/09/586afbf48b1a8.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"166","distance":0,"ypoint":0,"xpoint":0,"name":"皇家骑士16度（24瓶）","sub_name":"皇家骑士16度","brief":"","buy_count":"115","current_price":335,"origin_price":384,"icon":"http://img.bphapp.com/public/attachment/201701/14/15/5879cd228c5d6.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/14/15/5879cd228c5d6.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"203","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"浅象给劲樱桃啤酒 330ml*24瓶","sub_name":"浅象给劲樱桃啤酒","brief":"规格：330ml 。原产国：比利时 。  原料与辅料：水 、麦芽 、啤酒花 、酵母 。  酒精度 ：8.5%vol ，原麦汁浓度 ：18 P 。  贮藏条件：请存放在阴凉干燥处 ，冷藏后饮用更佳 。","buy_count":"86","current_price":360,"origin_price":420,"icon":"http://img.bphapp.com/public/attachment/201702/16/14/58a5472f33861.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201702/16/14/58a5472f33861.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"153","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"浅粉大象啤酒  330ML*24瓶","sub_name":"浅粉大象啤酒  330ML*24瓶","brief":"原产国：比利时 。  原料与辅料：水 、大麦麦芽 、啤酒花 、酵母 。  酒精度 ：8.5%vol ，原麦汁浓度 ：16.5 P 。  贮藏条件：请存放在阴凉干燥处 ，冷藏后饮用更佳 。","buy_count":"129","current_price":365,"origin_price":478,"icon":"http://img.bphapp.com/public/attachment/201701/11/09/5875910a7ef99.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/11/09/5875910a7ef99.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"54","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"深粉大象啤酒 330ML*24瓶","sub_name":"深粉大象啤酒 330ML*24瓶","brief":"原产国：比利时 。  原料与辅料：水 、大麦麦芽 、啤酒花 、酵母 。  酒精度 ：8.5%vol ，原麦汁浓度 ：16.3 P 。  贮藏条件：请存放在阴凉干燥处 ，冷藏后饮用更佳 。","buy_count":"97","current_price":365,"origin_price":468,"icon":"http://img.bphapp.com/public/attachment/201701/03/09/586afc5b3a9d4.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/09/586afc5b3a9d4.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"197","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"智美 蓝帽 啤酒 330ml*24瓶","sub_name":"智美 蓝帽 啤酒 330ml*24瓶","brief":"原产国：比利时 。  原料与辅料：水 、大麦麦芽 、小麦、白砂糖、啤酒花、酵母 。  酒精度 ：7.0%vol ，原麦汁浓度 ：15.5 P 。  贮藏条件：存放于阴凉干燥处，请勿倒置  。注：本产品为二次发酵啤酒 ，瓶内沉淀物为天然酵母 ，请放心饮用 。","buy_count":"125","current_price":456,"origin_price":528,"icon":"http://img.bphapp.com/public/attachment/201702/08/11/589a8ebaf3765.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201702/08/11/589a8ebaf3765.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"196","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"智美红帽 啤酒 330ml*24瓶","sub_name":"智美红帽 啤酒 330ml*24瓶","brief":"原产国：比利时 。  原料与辅料：水 、大麦麦芽 、小麦、白砂糖、啤酒花、酵母 。  酒精度 ：7.0%vol ，原麦汁浓度 ：15.5 P 。  贮藏条件：存放于阴凉干燥处，请勿倒置  。注：本产品为二次发酵啤酒 ，瓶内沉淀物为天然酵母 ，请放心饮用 。","buy_count":"93","current_price":360,"origin_price":528,"icon":"http://img.bphapp.com/public/attachment/201702/08/10/589a882842acc.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201702/08/10/589a882842acc.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"56","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"智美 白帽 啤酒 330ml*24瓶","sub_name":"智美 白帽 啤酒 330ml*24瓶","brief":"原产国：比利时 。  原料与辅料：水 、大麦麦芽 、小麦、白砂糖、啤酒花、酵母 。  酒精度 ：7.0%vol ，原麦汁浓度 ：15.5 P 。  贮藏条件：存放于阴凉干燥处，请勿倒置  。注：本产品为二次发酵啤酒 ，瓶内沉淀物为天然酵母 ，请放心饮用 。\r\n","buy_count":"158","current_price":408,"origin_price":528,"icon":"http://img.bphapp.com/public/attachment/201702/08/11/589a8ad8d7483.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201702/08/11/589a8ad8d7483.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"160","distance":0,"ypoint":0,"xpoint":0,"name":"比利时杜威啤酒 330ml*24瓶","sub_name":"比利时杜威啤酒","brief":"","buy_count":"127","current_price":432,"origin_price":0,"icon":"http://img.bphapp.com/public/attachment/201706/13/09/593f42fb6fe9b.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201706/13/09/593f42fb6fe9b.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"159","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"维鲁啤酒 330ml*20瓶","sub_name":"维鲁啤酒","brief":"","buy_count":"214","current_price":240,"origin_price":250,"icon":"http://img.bphapp.com/public/attachment/201702/08/11/589a9600cf7d9.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201702/08/11/589a9600cf7d9.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"151","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"教士纯麦白啤 500ml*20瓶","sub_name":"教士纯麦白啤 500ml*20瓶","brief":"原产国：德国 。  原料与辅料：水 、小麦麦芽 、大麦麦芽 、啤酒花 、酵母 。  酒精度 ：5.0%vol ，麦汁浓度 ：11.8 P 。  贮藏条件：阴凉干燥处存放 ，避免阳光直射 。  保质期：12个月","buy_count":"281","current_price":250,"origin_price":280,"icon":"http://img.bphapp.com/public/attachment/201701/11/09/58758e3ae516c.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/11/09/58758e3ae516c.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"58","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"教士纯麦黑啤 500ml*20瓶","sub_name":"教士纯麦黑啤 500ml*20瓶","brief":"原产国：德国 。 原料与辅料：水 、小麦麦芽 、大麦麦芽 、啤酒花、酵母 。  酒精度 ：5.0%vol ，麦汁浓度 ：11.8 P 。  贮藏条件：阴凉干燥处存放 ，避免阳光直射 。  保质期：12个月 。","buy_count":"125","current_price":250,"origin_price":280,"icon":"http://img.bphapp.com/public/attachment/201701/03/09/586afe287b297.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/09/586afe287b297.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"147","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"福佳白啤酒  330ml*24瓶","sub_name":"福佳白啤酒  330ml*24瓶","brief":"原产国：比利时 。  原料与辅料：水 、大麦麦芽 、小麦麦芽 、啤酒花、酵母、糖  。  酒精度 ：4.9 vol ，原麦汁浓度 ：11.7 P 。  贮藏条件：阴凉干燥处存放 ，冷藏后口感更佳 。保质期：12个月 。","buy_count":"260","current_price":152,"origin_price":192,"icon":"http://img.bphapp.com/public/attachment/201702/20/11/58aa630ce5504.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201702/20/11/58aa630ce5504.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"28","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"督威啤酒 330ml*24瓶","sub_name":"督威啤酒 330ml*24瓶","brief":"黄金艾尔啤酒   。根据传统配方，使用优质麦芽 和 啤酒花酿造的高品质啤酒  。 净含量：330ml 。  原产国：比利时 。  原料与辅料：水 、麦芽 、啤酒花 、白砂糖 、酵母 。  酒精度 ：8.5 %vol ，麦汁浓度 ：16.9 P 。  贮藏条件：阴凉干燥处保存 ，请勿倒置 。保质期 ：18个月 。","buy_count":"262","current_price":335,"origin_price":384,"icon":"http://img.bphapp.com/public/attachment/201612/30/10/5865c2902373f.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201612/30/10/5865c2902373f.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"0","deal_score":0,"buyin_app":0,"is_today":0},{"id":"26","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"科圣道双料啤酒 330ml*24瓶","sub_name":"科圣道双料啤酒 330ml*24瓶","brief":"净含量：330 ml 。  原产国：比利时 。  原料与辅料：水 、小麦芽 、大麦芽 、啤酒花 、酵母 。  酒精度 ：6.5%vol ，麦汁浓度 ：14.2 P 。  贮藏条件：阴凉干燥处保存 ，请勿倒置  。保质期： 3年 。","buy_count":"35","current_price":408,"origin_price":520,"icon":"http://img.bphapp.com/public/attachment/201612/29/17/5864d85977773.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201612/29/17/5864d85977773.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"30","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"格登大龙9000啤酒 330ml*24瓶","sub_name":"格登大龙9000啤酒 330ml*24瓶","brief":"净含量：330ml 。  原产国：比利时 。  原料与辅料：水 、大麦芽 、小麦 、啤酒花  、酵母 。  酒精度 ：10.5%vol ，麦汁浓度 ：22 P 。  贮藏条件： 存放阴凉处 ，避免日光直晒 ，请勿倒置 。保质期 ：2 年 。","buy_count":"119","current_price":444,"origin_price":528,"icon":"http://img.bphapp.com/public/attachment/201612/30/10/5865c3bceeb6e.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201612/30/10/5865c3bceeb6e.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"0","deal_score":0,"buyin_app":0,"is_today":0},{"id":"82","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"罗滕堡 黑啤酒 500*24罐","sub_name":"罗滕堡 黑啤酒 500*24罐","brief":"原产国：德国 。  原料与辅料：水 、大麦芽 、烘培麦芽 、啤酒花 。  酒精度 ：4.9vol ，原麦汁浓度 ：11.5 P 。  贮藏方式：常温 、避光  。\r\n","buy_count":"124","current_price":120,"origin_price":180,"icon":"http://img.bphapp.com/public/attachment/201701/03/14/586b3fda896f4.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/14/586b3fda896f4.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"81","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"罗滕堡 小麦啤酒 500ml*24罐","sub_name":"罗滕堡 小麦啤酒 500ml*24罐","brief":" 原产国：德国 。  原料与辅料：水 、大麦芽 、小麦芽 、啤酒花 、酵母  。  酒精度 ：5.4%vol ，原麦汁浓度 ：12.4 P 。  贮藏方式：常温 、避光  。\r\n","buy_count":"312","current_price":120,"origin_price":180,"icon":"http://img.bphapp.com/public/attachment/201701/03/14/586b3f84ae436.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/14/586b3f84ae436.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"108","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"橙色炸弹 烈性啤酒 8.5度 500ml*24罐","sub_name":"橙色炸弹 烈性啤酒 8.5度 500ml","brief":"原产国：德国 。  原料与辅料：水 、大麦芽 、葡萄糖 、啤酒花  。  酒精度 ：8.5%vol ，原麦汁浓度 ：15 P 。  贮藏条件：常温避光保存 ，置于阴凉干燥处  。\r\n","buy_count":"21","current_price":216,"origin_price":264,"icon":"http://img.bphapp.com/public/attachment/201701/03/16/586b5cdee3ac5.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/16/586b5cdee3ac5.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"104","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"少士博 57度烈性啤酒 200ml","sub_name":"少士博 57度烈性啤酒 200ml","brief":"原产国：德国 。 原料与辅料：水 、大麦芽 、小麦芽 、啤酒花 。 酒精度 ：57.5 %vol ，原麦汁浓度 ：121P 。 贮藏方式：常温  , 避光 。   4度 ~ 8度 为最佳品尝温度 。\r\n","buy_count":"6","current_price":1580,"origin_price":1980,"icon":"http://img.bphapp.com/public/attachment/201701/03/15/586b4d8128acf.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/15/586b4d8128acf.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"103","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"少士博 18度烈性黑啤酒 330ml","sub_name":"少士博 18度烈性黑啤酒 330ml","brief":"原产国：德国 。 原料与辅料：水 、大麦芽 、小麦芽 、啤酒花 。 酒精度 ：18%vol ，原麦汁浓度 ：36 P 。 贮藏方式：常温  , 避光 。\r\n","buy_count":"27","current_price":158,"origin_price":199,"icon":"http://img.bphapp.com/public/attachment/201701/03/14/586b4ba81c493.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/14/586b4ba81c493.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"102","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"少士博 20度烈性啤酒 330ml","sub_name":"少士博 20度烈性啤酒 330ml","brief":"原产国：德国 。 原料与辅料：水 、大麦芽 、小麦芽 、啤酒花 。 酒精度 ：20%vol ，原麦汁浓度 ：40 P 。 贮藏方式：常温 , 避光 。\r\n","buy_count":"28","current_price":298,"origin_price":380,"icon":"http://img.bphapp.com/public/attachment/201701/03/14/586b4b4f25d34.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/14/586b4b4f25d34.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"101","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"少士博 30烈性度啤酒 330ml","sub_name":"少士博 30烈性度啤酒 330ml","brief":"原产国：德国 。  原料与辅料：水 、大麦芽 、小麦芽 、啤酒花 。  酒精度 ：30%vol ，原麦汁浓度 ：48 P 。  贮藏方式：常温  , 避光  。\r\n","buy_count":"29","current_price":498,"origin_price":598,"icon":"http://img.bphapp.com/public/attachment/201701/03/14/586b4aafbf32a.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/14/586b4aafbf32a.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"100","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"少士博 57度烈性啤酒 330ml","sub_name":"少士博 57度烈性啤酒 330ml","brief":"","buy_count":"2","current_price":9999,"origin_price":9999,"icon":"http://img.bphapp.com/public/attachment/201701/03/14/586b4a48a615a.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/14/586b4a48a615a.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"99","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"少士博 57度烈性啤酒 40ml","sub_name":"少士博 57度烈性啤酒 40ml","brief":"原产国：德国 。  原料与辅料：水 、大麦芽 、小麦芽 、啤酒花 。  酒精度 ：57%vol ，原麦汁浓度 ：91 P 。  贮藏方式：常温避光  。\r\n","buy_count":"5","current_price":398,"origin_price":799,"icon":"http://img.bphapp.com/public/attachment/201701/03/14/586b49d3961f9.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/14/586b49d3961f9.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"98","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"少士博 43度烈性啤酒 200ml","sub_name":"少士博 43度烈性啤酒 200ml","brief":"","buy_count":"25","current_price":650,"origin_price":650,"icon":"http://img.bphapp.com/public/attachment/201701/03/14/586b49747e479.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/14/586b49747e479.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"97","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"少士博 41度烈性啤酒 200ml","sub_name":"少士博 41度烈性啤酒 200ml","brief":"","buy_count":"25","current_price":580,"origin_price":580,"icon":"http://img.bphapp.com/public/attachment/201701/03/14/586b492d62eb1.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/14/586b492d62eb1.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"96","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"少士博 34度烈性啤酒 200ml","sub_name":"少士博 34度烈性啤酒 200ml","brief":"","buy_count":"29","current_price":180,"origin_price":180,"icon":"http://img.bphapp.com/public/attachment/201701/03/14/586b48d1325ff.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/14/586b48d1325ff.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"95","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"少士博 13度烈性黑啤酒 330ml","sub_name":"少士博 13度烈性黑啤酒 330ml","brief":"原产国：德国 。  原料与辅料：水 、大麦芽 、小麦芽 、啤酒花 。  酒精度 ：13%vol ，原麦汁浓度 ：25 P 。  贮藏方式：常温避光  。\r\n","buy_count":"28","current_price":85,"origin_price":158,"icon":"http://img.bphapp.com/public/attachment/201701/03/14/586b483e03235.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/14/586b483e03235.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"94","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"巴伐利亚蜜啤 500ml","sub_name":"巴伐利亚蜜啤 500ml","brief":"原产国：德国 。  原料与辅料：巴伐利亚啤酒 、酒精 、糖 、水 、香草精 。  酒精度 ：25%vol ，原麦汁浓度 ：19.7 P 。  贮存条件：常温避光 。 开瓶前摇匀 ，浑浊属正常\r\n","buy_count":"115","current_price":199,"origin_price":328,"icon":"http://img.bphapp.com/public/attachment/201701/03/14/586b47de1cea5.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/14/586b47de1cea5.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"93","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"巴伐利亚蜜啤 200ml","sub_name":"巴伐利亚蜜啤 200ml","brief":"原产国：德国 。  原料与辅料：巴伐利亚啤酒 、酒精 、糖 、水 、香草精 。  酒精度 ：25%vol ，原麦汁浓度 ：19.7 P 。  贮存条件：常温避光 。 开瓶前摇匀 ，浑浊属正常 。\r\n","buy_count":"120","current_price":138,"origin_price":218,"icon":"http://img.bphapp.com/public/attachment/201701/03/14/586b477f892b4.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/14/586b477f892b4.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"152","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"巴伐利亚蜜啤 100ml","sub_name":"巴伐利亚蜜啤 100ml","brief":"原产国：德国 。 原料与辅料：巴伐利亚啤酒 、酒精 、香草精 。 酒精度 ：25%vol ，原麦汁浓度 ：19.7 P 。 贮存条件：常温避光 。 开瓶前摇匀 ，浑浊属正常 。","buy_count":"201","current_price":99,"origin_price":159,"icon":"http://img.bphapp.com/public/attachment/201701/11/09/5875905bda752.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/11/09/5875905bda752.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"195","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"林德曼系列啤酒 - 山莓 250ml","sub_name":"林德曼系列啤酒 - 山莓 250ml","brief":"原产国：比利时 。  原料与辅料：水 、麦芽 、啤酒花 、果糖 、白砂糖 、食用香精 、维生素C 。  酒精度 ：3.5%vol ，原麦汁浓度 ：14 P 。  贮藏方式：存放于阴凉干燥处 ， 请勿倒置  。保质期 ：2年 。","buy_count":"120","current_price":408,"origin_price":528,"icon":"http://img.bphapp.com/public/attachment/201702/08/10/589a874f35171.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201702/08/10/589a874f35171.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"194","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"林德曼系列啤酒 - 法柔 250ml","sub_name":"林德曼系列啤酒 - 法柔 250ml","brief":"原产国：比利时 。  原料与辅料：水 、麦芽 、啤酒花 、果糖 、白砂糖 、食用香精 、维生素C 。  酒精度 ：4.5%vol ，原麦汁浓度 ：14 P 。  贮藏方式：存放于阴凉干燥处 ， 请勿倒置  。保质期 ：2年 。","buy_count":"110","current_price":408,"origin_price":528,"icon":"http://img.bphapp.com/public/attachment/201702/08/10/589a861f5a770.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201702/08/10/589a861f5a770.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"193","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"林德曼系列啤酒 - 混酿 250ml","sub_name":"林德曼系列啤酒 - 混酿 250ml","brief":"原产国：比利时 。  原料与辅料：水 、麦芽 、啤酒花 、果糖 、白砂糖 、食用香精 、维生素C 。  酒精度 ：3.5%vol ，原麦汁浓度 ：14 P 。  贮藏方式：存放于阴凉干燥处 ， 请勿倒置  。保质期 ：2年 。","buy_count":"125","current_price":408,"origin_price":528,"icon":"http://img.bphapp.com/public/attachment/201702/08/10/589a8542854ec.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201702/08/10/589a8542854ec.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"192","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"林德曼系列啤酒 - 桃子 250ml","sub_name":"林德曼系列啤酒 - 桃子 250ml","brief":"原产国：比利时 。  原料与辅料：水 、麦芽 、啤酒花 、果糖 、白砂糖 、食用香精 、维生素C 。  酒精度 ：3.5%vol ，原麦汁浓度 ：14 P 。  贮藏方式：存放于阴凉干燥处 ， 请勿倒置  。保质期 ：2年 。","buy_count":"132","current_price":408,"origin_price":528,"icon":"http://img.bphapp.com/public/attachment/201702/08/10/589a83c1c9bab.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201702/08/10/589a83c1c9bab.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"191","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"林德曼系列啤酒 - 苹果 250ml","sub_name":"林德曼系列啤酒 - 苹果 250ml","brief":"原产国：比利时 。  原料与辅料：水 、麦芽 、啤酒花 、果糖 、白砂糖 、食用香精 、维生素C 。  酒精度 ：3.5%vol ，原麦汁浓度 ：14 P 。  贮藏方式：存放于阴凉干燥处 ， 请勿倒置  。保质期 ：2年 。","buy_count":"120","current_price":408,"origin_price":528,"icon":"http://img.bphapp.com/public/attachment/201702/08/10/589a81cc2d370.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201702/08/10/589a81cc2d370.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"190","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"林德曼系列啤酒 - 樱桃 250ml","sub_name":"林德曼系列啤酒 - 樱桃 250ml","brief":"原产国：比利时 。  原料与辅料：水 、麦芽 、啤酒花 、果糖 、白砂糖 、食用香精 、维生素C 。  酒精度 ：3.5%vol ，原麦汁浓度 ：14 P 。  贮藏方式：存放于阴凉干燥处 ， 请勿倒置  。保质期 ：2年 。","buy_count":"130","current_price":408,"origin_price":528,"icon":"http://img.bphapp.com/public/attachment/201702/08/10/589a812f6ec50.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201702/08/10/589a812f6ec50.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"189","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"林德曼系列啤酒 - 蓝莓 250ml","sub_name":"林德曼系列啤酒 - 蓝莓 250ml","brief":"原产国：比利时 。  原料与辅料：水 、麦芽 、啤酒花 、果糖 、白砂糖 、食用香精 、维生素C 。  酒精度 ：3.5%vol ，原麦汁浓度 ：14 P 。  贮藏方式：存放于阴凉干燥处 ， 请勿倒置  。保质期 ：2年 。","buy_count":"135","current_price":408,"origin_price":528,"icon":"http://img.bphapp.com/public/attachment/201702/08/10/589a806462b41.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201702/08/10/589a806462b41.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"161","distance":0,"ypoint":0,"xpoint":0,"name":"阿尔寇 2014 干白葡萄酒","sub_name":"阿尔寇干白葡萄酒","brief":"净含量：750ml  。 原产国：西班牙  。 产品类型：干型  。 原料与辅料：葡萄汁 、二氧化硫 。酒精度：10.5%vol 。 保质期 ： 10 年 。储存条件：14度~16度 避光阴凉干燥处平放  。","buy_count":"220","current_price":49,"origin_price":98,"icon":"http://img.bphapp.com/public/attachment/201701/11/11/5875a49fe7193.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/11/11/5875a49fe7193.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"142","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"马茨干红葡萄酒（187ml)","sub_name":"马茨干红葡萄酒（187ml)","brief":"原产国：西班牙 。葡萄采摘年份：2015年 。 产品类型：干型 。 原料与辅料：葡萄汁、二氧化硫 。酒精度：13.5%vol 。 保质期 ： 10 年 。储存条件：14度~16度 避光阴凉平放 。","buy_count":"334","current_price":26,"origin_price":38,"icon":"http://img.bphapp.com/public/attachment/201701/10/17/5874a55f092ea.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/10/17/5874a55f092ea.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"139","distance":0,"ypoint":28.017552,"xpoint":120.689504,"name":"阿尔寇 干红葡萄酒","sub_name":"阿尔寇 干红葡萄酒","brief":"原产国：西班牙 。葡萄采摘年份：2015年 。 产品类型：干型 。 原料与辅料：葡萄汁、二氧化硫 。酒精度：13%vol 。保质期 ： 10 年 。储存条件 ：14度 -16度度　避光阴凉平放　。净含量：750ml 。","buy_count":"139","current_price":48,"origin_price":98,"icon":"http://img.bphapp.com/public/attachment/201702/07/09/58991f5c7fe0c.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201702/07/09/58991f5c7fe0c.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"138","distance":0,"ypoint":28.017552,"xpoint":120.689504,"name":"扑克牌A 礼盒-干红葡萄酒","sub_name":"扑克牌A 礼盒-干红葡萄酒","brief":"梅花AS干红葡萄酒 净含量：750ml 。原产国：西班牙 。葡萄采摘年份 ：2011年 。 产品类型：干型 。 原料与辅料：葡萄汁、二氧化硫 。酒精度：14%vol 。储存条件：14度 ~16度 避光阴凉平放 。                        方块AS干白葡萄酒  净含量 ：750ml 。 原料与辅料：葡萄汁、二氧化硫 。酒精度：13.5%vol 。储存条件：14度~16度避光阴凉平放 。  保质期 ：15年 。","buy_count":"43","current_price":1580,"origin_price":1680,"icon":"http://img.bphapp.com/public/attachment/201701/10/16/5874a200e0fca.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/10/16/5874a200e0fca.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"12","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"舒马赫干红葡萄酒2012（750ml)","sub_name":"舒马赫干红葡萄酒2012（750ml)","brief":"原料与辅料：葡萄汁、二氧化硫 。  原产国：西班牙 。  产品类型：干型 。  葡萄采摘年份：2012年 。  酒精度：14%vol 。储存条件 ： 14度 ~ 16 度 避光阴凉平放 。保质期 ：20年 。","buy_count":"203","current_price":298,"origin_price":348,"icon":"http://img.bphapp.com/public/attachment/201612/07/13/58479f6e484a6.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201612/07/13/58479f6e484a6.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"11","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"库木特红酒 ( 750ml )","sub_name":"库木特红酒 ( 750ml )","brief":"原产国：意大利 。 葡萄采摘年份：2015年 。 产品类型：干型 。 原料与辅料：葡萄汁、二氧化硫 。酒精度：13 %vol 。 保质期 ： 10 年 。储存方法：10度~25度 阴凉干燥处平放 。","buy_count":"148","current_price":118,"origin_price":118,"icon":"http://img.bphapp.com/public/attachment/201612/07/13/58479f0120b18.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201612/07/13/58479f0120b18.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"10","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"科腾干红葡萄酒 ( 187ml )","sub_name":"科腾干红葡萄酒 ( 187ml )","brief":"原产国：西班牙 。葡萄采摘年份：2015年 。 产品类型：干型 。 原料与辅料：葡萄汁、二氧化硫 。 酒精度：13%vol 。 保质期 ： 10 年 。 储存条件：14度~16度避光阴凉平放 。","buy_count":"107","current_price":23,"origin_price":73,"icon":"http://img.bphapp.com/public/attachment/201612/07/13/58479e546ef31.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201612/07/13/58479e546ef31.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"8","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"科特勒 2014干红葡萄酒","sub_name":"科特勒 2014干红葡萄酒","brief":"原产国：西班牙 。葡萄采摘年份：2014年 。 产品类型：干型 。 原料与辅料：葡萄汁、二氧化硫 。酒精度：13%vol 。 保质期 ： 10 年 。储存条件：14 度 ~ 16 度 避光阴凉平放 。保质期 ：10年 。","buy_count":"201","current_price":78,"origin_price":128,"icon":"http://img.bphapp.com/public/attachment/201612/07/13/58479d9490d75.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201612/07/13/58479d9490d75.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"7","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"格鲁尔干红葡萄酒","sub_name":"格鲁尔干红葡萄酒","brief":"原产国：意大利 。 葡萄采摘年份：2014年 。 产品类型：干型 。 原料与辅料：葡萄汁、二氧化硫 。 酒精度：14%vol 。 保质期 ： 10 年 。 储存条件：10度 ~ 25度 避光阴凉平放","buy_count":"180","current_price":128,"origin_price":178,"icon":"http://img.bphapp.com/public/attachment/201612/07/13/58479cf2d3568.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201612/07/13/58479cf2d3568.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"5","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"诺伊阿乐干红葡萄酒(750ml)全国包邮","sub_name":"诺伊阿乐干红葡萄酒(750ml)全国包邮","brief":"葡萄采摘年份：2015年 。  产品类型：干型 。 \r\n原料与辅料：葡萄汁、二氧化硫 。产区：威尼托大区 。原产国：意大利 。  酒精度：11%vol 。","buy_count":"211","current_price":55,"origin_price":105,"icon":"http://img.bphapp.com/public/attachment/201612/07/13/58479a0403f6c.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201612/07/13/58479a0403f6c.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"3","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"萨利纳干红葡萄酒","sub_name":"萨利纳干红葡萄酒","brief":"","buy_count":"163","current_price":88,"origin_price":138,"icon":"http://img.bphapp.com/public/attachment/201612/07/13/584798f53e415.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201612/07/13/584798f53e415.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"2","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"斯蒙德干红葡萄酒（750ml）（全国包邮）","sub_name":"斯蒙德干红葡萄酒（750ml）（全国包邮","brief":"葡萄采摘年份：2015年。产品类型：干型 。原料与辅料：葡萄汁、二氧化硫  。产区：艾米利亚罗马涅大区  。原产国：意大利 。酒精度：11%vol 。\r\n                ","buy_count":"308","current_price":49,"origin_price":99,"icon":"http://img.bphapp.com/public/attachment/201612/07/13/584798753bf86.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201612/07/13/584798753bf86.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"1","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"尤斯图2008干红葡萄酒","sub_name":"尤斯图2008干红葡萄酒","brief":"净含量：750ml 。原产国：西班牙 。葡萄采摘年份：2009年 。 产品类型：干红 。 原料与辅料：葡萄汁、二氧化硫 。酒精度：14%vol 。 保质期 ： 15 年 。储存条件：14度~16度避光阴凉平放 。","buy_count":"187","current_price":198,"origin_price":248,"icon":"http://img.bphapp.com/public/attachment/201612/07/11/584787d19c27c.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201612/07/11/584787d19c27c.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"149","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"塔牌 冬酿6年/瓶","sub_name":"塔牌 冬酿6年/瓶","brief":"净含量：480ml 。 产品类型： 特型黄酒 。 原料：鉴湖水  、糯米  、小麦  、枸杞子 、龙眼肉 、低聚异麦芽糖 、果葡糖浆 。 食品添加剂 ：焦糖色 。 总糖 ：15.1 - 40.0 g/L 。 酒精度 ：10.0%vol （基酒：六年） 。保质期 ：60个月 。 贮存方法 ：贮存于阴凉  、干燥  、通风处 ，不得倒置 。","buy_count":"110","current_price":32,"origin_price":38,"icon":"http://img.bphapp.com/public/attachment/201701/11/09/58758cac8024e.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/11/09/58758cac8024e.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"133","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"尊尼获加黑牌12年调配型苏格兰威士忌750ml","sub_name":"尊尼获加黑牌12年调配型苏格兰威士忌75","brief":"原产国：英国。原料与辅料：水、大麦芽、玉米、小麦、焦糖色。酒精度：40% vol 。","buy_count":"83","current_price":290,"origin_price":340,"icon":"http://img.bphapp.com/public/attachment/201701/09/17/5873526a0ffd7.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/09/17/5873526a0ffd7.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"131","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"珍宝苏格兰威士忌750ml","sub_name":"珍宝苏格兰威士忌750ml","brief":"原产国：英国。原料与辅料：水、麦芽、小麦、焦糖色。酒精度：40% vol 。","buy_count":"9","current_price":95,"origin_price":145,"icon":"http://img.bphapp.com/public/attachment/201701/09/17/587351404500c.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/09/17/587351404500c.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"130","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"雪树伏特加700ml","sub_name":"雪树伏特加700ml","brief":"原产国：波兰。原料与辅料：水、黑麦。酒精度：40% vol 。","buy_count":"25","current_price":295,"origin_price":345,"icon":"http://img.bphapp.com/public/attachment/201701/09/16/587350a87e254.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/09/16/587350a87e254.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"129","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"四玫瑰小批量波本威士忌700ml","sub_name":"四玫瑰小批量波本威士忌700ml","brief":"原产国：美国。原料与辅料：水、麦芽、玉米。酒精度：45% vol 。","buy_count":"26","current_price":228,"origin_price":278,"icon":"http://img.bphapp.com/public/attachment/201701/09/16/5873502fc1c6c.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/09/16/5873502fc1c6c.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"128","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"孟买蓝宝石金酒750ml","sub_name":"孟买蓝宝石金酒750ml","brief":"原产国：英国。原料与辅料：水、小麦、杜松子、食用酒精、食用香料。酒精度：47% vol 。","buy_count":"17","current_price":98,"origin_price":148,"icon":"http://img.bphapp.com/public/attachment/201701/09/16/58734fa659bad.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/09/16/58734fa659bad.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"127","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"杰克丹尼威士忌700ml","sub_name":"杰克丹尼威士忌700ml","brief":"原产国：美国。原料与辅料：水、黑麦、玉米、麦芽、焦糖色。酒精度：40% vol 。","buy_count":"27","current_price":158,"origin_price":208,"icon":"http://img.bphapp.com/public/attachment/201701/09/16/58734ef1b4dad.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/09/16/58734ef1b4dad.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"126","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"豪帅快活特醇银标龙舌兰酒750ml","sub_name":"豪帅快活特醇银标龙舌兰酒750ml","brief":"原产国：墨西哥。原料与辅料：水、龙舌兰。酒精度：40% vol 。","buy_count":"26","current_price":98,"origin_price":148,"icon":"http://img.bphapp.com/public/attachment/201701/09/16/58734e5720a4f.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/09/16/58734e5720a4f.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"125","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"哥顿金酒700ml","sub_name":"哥顿金酒700ml","brief":"原产国：英国。原料与辅料：水、小麦、杜松子、大麦芽。酒精度：37.5% vol 。","buy_count":"13","current_price":88,"origin_price":138,"icon":"http://img.bphapp.com/public/attachment/201701/09/16/58734dca47022.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/09/16/58734dca47022.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"124","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"法国灰雁伏特加750ml","sub_name":"法国灰雁伏特加750ml","brief":"原产国：法国。原料与辅料：水、大麦。酒精度：40% vol 。","buy_count":"23","current_price":198,"origin_price":258,"icon":"http://img.bphapp.com/public/attachment/201701/09/16/58734d194030b.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/09/16/58734d194030b.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"123","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"波士棕可可力娇酒","sub_name":"波士棕可可力娇酒","brief":"原料与辅料：水、白砂糖、食用酒精、柠檬酸、天然香料。原产国：荷兰。","buy_count":"24","current_price":112,"origin_price":152,"icon":"http://img.bphapp.com/public/attachment/201701/09/16/58734c59d0ef3.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/09/16/58734c59d0ef3.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"122","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"必发达金酒750ml","sub_name":"必发达金酒750ml","brief":"原产国：英国。原料与辅料：水、小麦、杜松子。酒精度：47% vol。储藏条件：避光，常温保存。","buy_count":"26","current_price":78,"origin_price":108,"icon":"http://img.bphapp.com/public/attachment/201701/09/16/58734b4161cac.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/09/16/58734b4161cac.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"80","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"唯德 柠檬皮尔森啤酒 355ml*24罐","sub_name":"唯德 柠檬皮尔森啤酒 355ml*24罐","brief":"原产国：德国 。 原料与辅料：皮尔森啤酒（水 、大麦麦芽 、啤酒花 ） 、柠檬汁（水 、糖 、碳酸 、柠檬汁、维生素C） 。 酒精度 ：2.4%vol ，原麦汁浓度 ：10 P 。 贮藏方式：常温保存 、置于阴凉处 。保质期：12个月 。日期不断更新中 ，质量保证 ，请放心购买 。\r\n","buy_count":"213","current_price":180,"origin_price":210,"icon":"http://img.bphapp.com/public/attachment/201701/03/14/586b3eff0f1e9.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/14/586b3eff0f1e9.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"141","distance":0,"ypoint":28.017552,"xpoint":120.689504,"name":"M187赤霞珠干红","sub_name":"M187赤霞珠干红","brief":"原产国：智利 。 净含量：187.5ml  。 原料与辅料 : 葡萄汁  二氧化硫  。 酒精度：13.5%vol   。 产品类型：干红葡萄酒  。 保质期：10年 。 储藏方式 ： 于避光处卧放或倒放 ，宜15度饮用  。","buy_count":"248","current_price":23,"origin_price":23,"icon":"http://img.bphapp.com/public/attachment/201701/10/17/5874a4a3e4bc9.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/10/17/5874a4a3e4bc9.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"221","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"阿尔寇啤酒礼盒装   500m l* 12罐","sub_name":"阿尔寇啤酒礼盒装","brief":"阿尔寇礼盒装 ，保质期至18年1月 。礼盒装是您送人的最佳选择 。原产国：西班牙 。  原料与辅料：水 、大麦芽 、玉米 、大麦 、啤酒花 。  酒精度 ：4.8%vol ，原麦汁浓度 ：10.7 P 。  贮藏方式：常温 、避光  。","buy_count":"296","current_price":39.9,"origin_price":120,"icon":"http://img.bphapp.com/public/attachment/201704/05/17/58e4bec409076.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201704/05/17/58e4bec409076.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"227","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"新活动：买二送一 希罗啤酒 250ml*24瓶","sub_name":"新活动：买二送一 希罗啤酒","brief":"活动：原价120元/件 希罗啤酒 ，买二件送一件 。付款240元就可以3件带回家 ！ 原产国：葡萄牙 。  原料与辅料：水 、大麦麦芽 、玉米 、大麦 、啤酒花 。  酒精度 ：5.0%vol ，原麦汁浓度 ：10.7 P 。  贮藏条件：置于阴凉处  。  保质期：18个月 。  ","buy_count":"1328","current_price":120,"origin_price":120,"icon":"http://img.bphapp.com/public/attachment/201705/10/10/59127f551e9ce.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201705/10/10/59127f551e9ce.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"2017-08-06 10:47:00","begin_time_format":"2017-07-10 10:47:00","begin_time":"1499626020","end_time":"1501958820","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"230","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"唯德夜宴窖藏桶装5L","sub_name":"唯德夜宴窖藏桶装5L","brief":"原产国：德国 。 原料与辅料：水 、大麦麦芽 、酵母 。 酒精度 ：5.1%vol ，麦汁浓度 ：11\u20196 P 。 贮藏条件：常温保存 ， 置于阴凉干燥处 。注：浑浊为正常现象，饮用前轻微摇匀口感最佳 。","buy_count":"80","current_price":129,"origin_price":129,"icon":"http://img.bphapp.com/public/attachment/201706/09/12/593a28ed1cd85.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201706/09/12/593a28ed1cd85.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"231","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"阿尔寇啤酒 玻璃瓶装250ml*24瓶","sub_name":"阿尔寇啤酒 玻璃瓶装250ml*24瓶","brief":"原产国：葡萄牙。  原料与辅料：水 、大麦芽 、玉米 、大麦 、啤酒花 。  酒精度 ：4.8%vol ，原麦汁浓度 ：10.7 P 。  贮藏方式：常温 、避光  。","buy_count":"120","current_price":120,"origin_price":120,"icon":"http://img.bphapp.com/public/attachment/201706/09/13/593a378729540.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201706/09/13/593a378729540.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"236","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"泰谷迷你（玻璃瓶）200ml*24瓶","sub_name":"泰谷迷你（玻璃瓶）","brief":"原产国：葡萄牙 。 原料与辅料：水 、大麦麦芽 、玉米 、大麦 、啤酒花 。 酒精度 ：4.8%vol ，原麦汁浓度 ：10.7 P 。 贮藏条件：置于阴凉处 。 保质期：18个月 \r\n","buy_count":"0","current_price":120,"origin_price":120,"icon":"http://img.bphapp.com/public/attachment/201706/12/14/593e3059564c5.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201706/12/14/593e3059564c5.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"237","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"泰谷330（玻璃瓶） 330ml *24 瓶","sub_name":"泰谷330（玻璃瓶） 330ml *24","brief":"原产国：葡萄牙 。 原料与辅料：水 、大麦麦芽 、玉米 、大麦 、啤酒花 。 酒精度 ：4.8%vol ，原麦汁浓度 ：10.7 P 。 贮藏条件：置于阴凉处 。 保质期：18个月 ","buy_count":"50","current_price":132,"origin_price":132,"icon":"http://img.bphapp.com/public/attachment/201706/12/14/593e30feaba59.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201706/12/14/593e30feaba59.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0}]
     * best_deal_list : [{"id":"137","distance":0,"ypoint":28.017552,"xpoint":120.689504,"name":"晨之星全脂牛奶*12瓶","sub_name":"晨之星全脂牛奶*12瓶","brief":" 晨之星超高温灭菌全脂牛奶  。  配料 ：100 % 生牛乳  。 产品类型 ：超高温灭菌乳 。 原产国 ：德国  。 脂肪含量：3.5%  。 保质期 ：至2017年11月 。 贮藏方式 ： 置于阴凉干燥密封处存贮 。开封后 ，请冷藏保存（6度以下）并且4天内饮用完毕 。","buy_count":"377","current_price":144,"origin_price":168,"icon":"http://img.bphapp.com/public/attachment/201702/21/10/58ab9fd2687b3.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201702/21/10/58ab9fd2687b3.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"221","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"阿尔寇啤酒礼盒装   500m l* 12罐","sub_name":"阿尔寇啤酒礼盒装","brief":"阿尔寇礼盒装 ，保质期至18年1月 。礼盒装是您送人的最佳选择 。原产国：西班牙 。  原料与辅料：水 、大麦芽 、玉米 、大麦 、啤酒花 。  酒精度 ：4.8%vol ，原麦汁浓度 ：10.7 P 。  贮藏方式：常温 、避光  。","buy_count":"296","current_price":39.9,"origin_price":120,"icon":"http://img.bphapp.com/public/attachment/201704/05/17/58e4bec409076.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201704/05/17/58e4bec409076.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"201","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"松鸡特价 买一送二（ 买一箱松鸡啤酒送二瓶诺伊阿乐干红葡萄酒 ）","sub_name":"松鸡特价 买一送二","brief":"松鸡啤酒 ：净含量：500ml（500ml *24罐） 。原产国：波兰。 原料与辅料：水 、大麦芽 、大麦、啤酒花、啤酒花提取物 。  酒精度 ：4.0%vol ，原麦汁浓度 ：8.1P 。  贮藏方式：阴凉干燥 、常温 、避光  。   \r\n诺伊阿乐干红葡萄酒：净含量：750ml（750ml*2瓶）。原产国：意大利 。酒精度：11%vol 。  葡萄采摘年份：2015年 。  产品类型：干型 。 原料与辅料：葡萄汁、二氧化硫 。产区：威尼托大区 。","buy_count":"229","current_price":120,"origin_price":218,"icon":"http://img.bphapp.com/public/attachment/201702/14/11/58a272ce9e450.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201702/14/11/58a272ce9e450.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"135","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"星得斯赤霞珠红葡萄酒750ML 买一送一","sub_name":"星得斯赤霞珠红葡萄酒750ML","brief":"特价 特价 特价 ！ 智利原瓶进口星得斯赤霞干红葡萄酒礼盒装 买一送一  。 星得斯干红葡萄酒来自智利中央山谷黄金产区 ，此款赤霞珠干红葡萄酒呈宝石红，澄清透明 ，酒体醇厚细腻，富有层次感，拥有着令人愉快的黑李子和香草芳香  。原料与辅料 ：葡萄汁 , 二氧化硫 。产品类型：干型 。原产国：智利 。葡萄品种：赤霞珠 。贮藏条件：避免阳光直射，于5度~25度干燥通风处卧放。","buy_count":"220","current_price":380,"origin_price":580,"icon":"http://img.bphapp.com/public/attachment/201701/10/10/587449a28fc46.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/10/10/587449a28fc46.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"","begin_time_format":"","begin_time":"0","end_time":"0","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0}]
     * nowtime : 1501624643
     * qianggou_deal_list : [{"id":"248","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"新活动：庄园主小麦白啤酒 买一送二","sub_name":"庄园主小麦白啤酒","brief":"特价！特价！特价！保质期到17年9月 ！原产国：德国 。  原料与辅料：水 、小麦麦芽 、大麦麦芽 、啤酒花提取物 、酵母  。  酒精度 ：5.3%vol ，麦汁浓度 ：11.8 P 。  贮藏条件：常温保存 ， 置于阴凉干燥处 。注：浑浊为正常现象，饮用前轻微摇匀口感最佳  。\r\n","buy_count":"234","current_price":128,"origin_price":258,"icon":"http://img.bphapp.com/public/attachment/201707/25/14/5976e607c6297.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201707/25/14/5976e607c6297.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"2017-08-05 14:33:03","begin_time_format":"2017-07-25 14:32:00","begin_time":"1500935520","end_time":"1501885983","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"247","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"特价！特价！贝维尔啤酒  500ML*24罐","sub_name":"特价！特价！贝维尔啤酒","brief":"特价！保质期到17年12月！欲买从速！！！原产国：荷兰 。  原料与辅料：水 、大麦麦芽 、啤酒花提取物 。  酒精度 ：5.0 %vol ，原麦汁浓度 ：11.4 P 。  贮藏方式：常温  、避光 。","buy_count":"168","current_price":59.9,"origin_price":0,"icon":"http://img.bphapp.com/public/attachment/201707/18/17/596dd52d9449f.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201707/18/17/596dd52d9449f.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"2017-08-06 17:28:00","begin_time_format":"2017-07-18 17:28:55","begin_time":"1500341335","end_time":"1501982880","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"246","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"特价！阿皮斯巴赫修道院茨威克啤酒 500ml*20瓶","sub_name":"特价！阿皮斯巴赫修道院茨威克啤酒","brief":"特价！保质期17.9月 。原产国：德国。原料与辅料：水、小麦麦芽、酵母、啤酒花。\r\n酒精度：5.4%vol 。原麦汁浓度：12度 贮藏方式：常温保存、置于阴凉处。","buy_count":"53","current_price":69,"origin_price":240,"icon":"http://img.bphapp.com/public/attachment/201707/15/17/5969e1d87248e.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201707/15/17/5969e1d87248e.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"2017-08-06 17:33:00","begin_time_format":"2017-07-15 17:33:10","begin_time":"1500082390","end_time":"1501983180","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"245","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"特价！阿皮斯巴赫修道院黑啤酒 500ml*20瓶","sub_name":"特价！阿皮斯巴赫修道院黑啤酒","brief":"特价！保质期17.9月 。原产国：德国。原料与辅料：水、大麦麦芽、啤酒花。\r\n酒精度：5.2%vol 。原麦汁浓度：13.6度 贮藏方式：常温保存、置于阴凉处。","buy_count":"31","current_price":69,"origin_price":240,"icon":"http://img.bphapp.com/public/attachment/201707/15/17/5969e06b77027.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201707/15/17/5969e06b77027.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"2017-08-04 17:27:00","begin_time_format":"2017-07-15 17:27:13","begin_time":"1500082033","end_time":"1501810020","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"68","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"临期特价：（买一送二）唯德 柠檬皮尔森啤酒 330mlX24瓶（购买此款产品后限三天内领取）","sub_name":"购买此款产品限三天内领取","brief":"保质期至17年8月份。买1件送2件                      说明：购买此款产品后限三天内领取）切记。\r\n                                         原产国：德国 。  原料与辅料：皮尔森啤酒（水 、大麦麦芽 、啤酒花 ） 、柠檬汁（水 、糖 、碳酸 、柠檬汁、维生素C）  。  酒精度 ：2.4%vol ，原麦汁浓度 ：10 P 。  贮藏方式：常温保存 、置于阴凉处 。保质期：12个月 。日期不断更新中 ，质量保证 ，请放心购买 。\r\n","buy_count":"415","current_price":132,"origin_price":384,"icon":"http://img.bphapp.com/public/attachment/201701/03/11/586b20356e560.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/11/586b20356e560.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"2017-08-13 10:11:00","begin_time_format":"2017-06-24 10:11:00","begin_time":"1498241460","end_time":"1502561460","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"232","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"临期特价 罗滕堡黑啤 买一送一 500*24罐","sub_name":"临期特价 罗滕堡黑啤 买一送一","brief":"临期特价！保质期至9月 ！9月到期 ！原产国：德国 。  原料与辅料：水 、大麦芽 、烘培麦芽 、啤酒花 。  酒精度 ：4.9vol ，原麦汁浓度 ：11.5 P 。  贮藏方式：常温 、避光  。\r\n","buy_count":"130","current_price":120,"origin_price":240,"icon":"http://img.bphapp.com/public/attachment/201706/09/15/593a507c5c411.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201706/09/15/593a507c5c411.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"2017-07-21 16:50:00","begin_time_format":"2017-06-26 16:50:00","begin_time":"1498438200","end_time":"1500598200","time_status":"2","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"228","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"松鸡啤酒买一送一 500ml *24罐","sub_name":"松鸡啤酒买一送一 500ml *24罐","brief":"新活动：波兰原装进口松鸡啤酒买一送一 ，买一箱送一箱 。 保质期至：18年4月 。原产国：波兰。 原料与辅料：水 、大麦芽 、大麦、啤酒花、啤酒花提取物 。  酒精度 ：4.0%vol ，原麦汁浓度 ：8.1P 。  贮藏方式：阴凉干燥 、常温 、避光  。  ","buy_count":"273","current_price":120,"origin_price":240,"icon":"http://img.bphapp.com/public/attachment/201705/10/17/5912d92f34007.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201705/10/17/5912d92f34007.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"2017-08-06 17:10:00","begin_time_format":"2017-06-26 17:10:00","begin_time":"1498439400","end_time":"1501981800","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"227","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"新活动：买二送一 希罗啤酒 250ml*24瓶","sub_name":"新活动：买二送一 希罗啤酒","brief":"活动：原价120元/件 希罗啤酒 ，买二件送一件 。付款240元就可以3件带回家 ！ 原产国：葡萄牙 。  原料与辅料：水 、大麦麦芽 、玉米 、大麦 、啤酒花 。  酒精度 ：5.0%vol ，原麦汁浓度 ：10.7 P 。  贮藏条件：置于阴凉处  。  保质期：18个月 。  ","buy_count":"1328","current_price":120,"origin_price":120,"icon":"http://img.bphapp.com/public/attachment/201705/10/10/59127f551e9ce.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201705/10/10/59127f551e9ce.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"2017-08-06 10:47:00","begin_time_format":"2017-07-10 10:47:00","begin_time":"1499626020","end_time":"1501958820","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"226","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"海南椰汁 245ml*20罐 买一送二","sub_name":"海南椰汁 245ml*20罐 买一送二","brief":"正宗海南椰汁 ，买一箱送二箱。 名称：九木生榨果肉椰子汁 配料：饮用水 、鲜椰肉汁、白砂糖、椰纤果、食品添加剂 。生产日期：17年03月22日 。保质期：12个月 。","buy_count":"567","current_price":118,"origin_price":240,"icon":"http://img.bphapp.com/public/attachment/201704/27/11/59016197a90d8.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201704/27/11/59016197a90d8.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"2017-08-06 11:12:00","begin_time_format":"2017-07-24 11:12:00","begin_time":"1500837120","end_time":"1501960320","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"223","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"贝维尔 啤酒 红酒组合","sub_name":"贝维尔红酒组合","brief":"啤酒和红酒的最佳组合：贝维尔啤酒（500ml*18罐） * 3件  & 阿尔寇干红葡萄酒（750ml*6瓶）* 1件 。\r\n贝维尔啤酒：原产国：荷兰 。  原料与辅料：水 、大麦麦芽 、啤酒花提取物 。  酒精度 ：5.0 %vol ，原麦汁浓度 ：11.4 P 。  贮藏方式：常温  、避光 。\r\n阿尔寇干红 ：原产国：西班牙 。葡萄采摘年份：2015年 。 产品类型：干型 。 原料与辅料：葡萄汁、二氧化硫 。酒精度：12%vol 。保质期 ： 10 年 。　避光阴凉平放　。净含量：750ml 。","buy_count":"193","current_price":318,"origin_price":658,"icon":"http://img.bphapp.com/public/attachment/201704/13/10/58eee82a9c5e2.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201704/13/10/58eee82a9c5e2.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"2017-08-13 10:54:00","begin_time_format":"2017-06-26 10:54:00","begin_time":"1498416840","end_time":"1502564040","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"181","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"特价！阿皮斯巴赫修道院特酿啤酒 500ml*20瓶","sub_name":"阿皮斯巴赫修道院特酿啤酒","brief":"特价！保质期17.9月 。原产国：德国。原料与辅料：水、大麦麦芽、啤酒花。\r\n酒精度：5.2%vol 。原麦汁浓度：12.5度 贮藏方式：常温保存、置于阴凉处。","buy_count":"40","current_price":69,"origin_price":240,"icon":"http://img.bphapp.com/public/attachment/201707/15/17/5969e0ed4929f.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201707/15/17/5969e0ed4929f.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"2017-08-06 11:38:00","begin_time_format":"2017-07-14 11:38:01","begin_time":"1499974681","end_time":"1501961880","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"90","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"特价 布兰克啤酒 330mlX24瓶","sub_name":"特价 布兰克啤酒 330mlX24瓶","brief":"特价 ！特价！特价！保质期至 17年9月 。原产国：德国 。  原料与辅料：水 、大麦麦芽 、啤酒花、酵母 。  酒精度 ：5.1%vol ，原麦汁浓度 ：12.5 P 。  贮藏条件：常温保存 ，置于阴凉干燥处存放 。\r\n","buy_count":"244","current_price":88,"origin_price":320,"icon":"http://img.bphapp.com/public/attachment/201701/03/14/586b457dde564.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201701/03/14/586b457dde564.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"2017-08-13 17:00:00","begin_time_format":"2017-07-09 17:00:47","begin_time":"1499562047","end_time":"1502586000","time_status":"1","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0},{"id":"116","distance":0,"ypoint":27.99123,"xpoint":120.665908,"name":"泰谷（易拉罐）礼盒 330ml*12罐 买一送二","sub_name":"泰谷330","brief":"泰谷330ml易拉罐礼盒活动。每个礼盒中有12罐！   不限数量！！！      原产国：西班牙 。  原料与辅料：水 、大麦麦芽 、玉米 、大麦 、啤酒花 。  酒精度 ：4.8%vol ，原麦汁浓度 ：10.7 P 。  贮存条件：置于阴凉处  。保质期：18个月 。","buy_count":"3273","current_price":88,"origin_price":162,"icon":"http://img.bphapp.com/public/attachment/201702/22/16/58ad4c020f43b.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","image":"http://img.bphapp.com/public/attachment/201702/22/16/58ad4c020f43b.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80","end_time_format":"2017-07-31 17:15:00","begin_time_format":"2017-07-10 17:15:00","begin_time":"1499649300","end_time":"1501463700","time_status":"2","auto_order":"0","is_lottery":"0","is_refund":"1","deal_score":0,"buyin_app":0,"is_today":0}]
     * index_notice : [{"id":"138","name":"飞机测试","img":"","type":"0","data":{"url":"http://www.bphapp.com/wap/index.php?ctl=game&act=feiji"},"ctl":"url"},{"id":"130","name":"购买：（泰谷啤酒）或（希罗啤酒）1件、送市区6公里内免费代驾卡1张。（不与其他活动同享）","img":"","type":"12","data":{"cate_id":"45"},"ctl":"list"},{"id":"125","name":" 新活动：买二送一（希罗啤酒 250ml*24瓶）","img":"","type":"21","data":{"item_id":"227"},"ctl":"item"},{"id":"124","name":"海南椰汁 245ml*20罐，正宗海南椰汁 ，买一箱送二箱","img":"","type":"21","data":{"item_id":"226"},"ctl":"item"},{"id":"117","name":"松鸡啤酒120元/件买一送一，原产国：波兰。酒精度 ：4.0%vol。原麦汁浓度 ：8.1P 。","img":"","type":"21","data":{"item_id":"228"},"ctl":"item"}]
     * zt_html : <!--app专题需定义的公共头部-->
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
     <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0;" name="viewport">
     <script type="text/javascript">
     var APP_ROOT = '';
     </script>
     <script type="text/javascript" src="http://www.bphapp.com/wap/Tpl/main/519/mobile_zt/js/utils/jquery-1.6.2.min.js"></script>
     <script type="text/javascript" src="http://www.bphapp.com/wap/Tpl/main/519/mobile_zt/js/utils/jquery.timer.js"></script><html>
     <head>
     <script>
     var _hmt = _hmt || [];
     (function() {
     var hm = document.createElement("script");
     hm.src = "https://hm.baidu.com/hm.js?b4eeb065f82d80ea79f415de3cca6acb";
     var s = document.getElementsByTagName("script")[0];
     s.parentNode.insertBefore(hm, s);
     })();
     </script>

     <!--index_zt1_p1-->
     <!--index_zt1_p2-->
     <!--index_zt1_p3-->
     <!--index_zt1_p4-->
     <style type="text/css">

     img{
     width: 100%;
     }
     a{
     display: block;
     }
     .index_zt1_p2{
     box-sizing: border-box;
     -moz-box-sizing: border-box;
     -webkit-box-sizing: border-box;
     border-bottom: 1px solid #eee;
     }
     .index_zt1_table .left{
     width: 43.7%;
     float: left;
     box-sizing: border-box;
     -moz-box-sizing: border-box;
     -webkit-box-sizing: border-box;
     border-right: 1px solid #eee;
     }
     .index_zt1_table .right{
     width: 56.3%;
     float: right;
     }
     .index_zt1_p3,.index_zt1_p4{
     width: 50%;
     float: left;
     box-sizing: border-box;
     -moz-box-sizing: border-box;
     -webkit-box-sizing: border-box;
     border-right: 1px solid #eee;

     }

     @media screen and (min-width:414px){

     .index_zt1_table .right{
     width: 56.2%;
     float: right;
     }
     .index_zt1_table .left{
     width: 43.6%;
     float: left;
     }
     }
     </style>
     </head>
     <body style="margin:0px;">
     <div class="index_zt1_table bdr-bottom clearfix">
     <div class="floor-item">
     <div class="container left">
     <a href="javascript:App.app_detail(21,98)">
     <img src="http://img.bphapp.com/public/attachment/201612/27/15/586213a5c4dd3.jpg" />
     </a>
     </div>
     <div class="container right">
     <div class="index_zt1_p2 bdr-bottom"><a href="javascript:App.app_detail(21,76)"><img src="http://img.bphapp.com/public/attachment/201612/27/15/586213b7aa977.jpg" /></a></div>
     <div class="index_zt1_p3"><a href="javascript:App.app_detail(21,76)"><img src="http://img.bphapp.com/public/attachment/201706/12/14/593e39d13b88e.jpg" /></a></div>
     <div class="index_zt1_p4 "><a href="javascript:App.app_detail(12,27)"><img src="http://img.bphapp.com/public/attachment/201612/27/15/586213d83ed2c.jpg" /></a></div>
     </div>
     </div>
     </div>
     </body>
     </html>
      * page_title : 首页
      * ctl : index
      * act : index
      * status : 1
      * sess_id : mnk8c754f9t2ekh78ahult7h75
      * ref_uid : null
     */

    @SerializedName("return")
    private int returnX;
    private String city_id;
    private String city_name;
    private int shop_id;
    private String shop_name;
    private int nowtime;
    private String zt_html;
    private String page_title;
    private String ctl;
    private String act;
    private int status;
    private String sess_id;
    private Object ref_uid;
    private List<AdvsBean> advs;
    private List<IndexsBean> indexs;
    private List<AdvGundongBean> adv_gundong;
    private List<?> adv_btn_img;
    private List<?> adv_3_pic;
    private List<Adv4Bean> adv_4;
    private List<Adv5Bean> adv_5;
    private List<SupplierDealListBean> supplier_deal_list;
    private List<BestDealListBean> best_deal_list;
    private List<QianggouDealListBean> qianggou_deal_list;
    private List<IndexNoticeBean> index_notice;

    public int getReturnX() {
        return returnX;
    }

    public void setReturnX(int returnX) {
        this.returnX = returnX;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public int getShop_id() {
        return shop_id;
    }

    public void setShop_id(int shop_id) {
        this.shop_id = shop_id;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public int getNowtime() {
        return nowtime;
    }

    public void setNowtime(int nowtime) {
        this.nowtime = nowtime;
    }

    public String getZt_html() {
        return zt_html;
    }

    public void setZt_html(String zt_html) {
        this.zt_html = zt_html;
    }

    public String getPage_title() {
        return page_title;
    }

    public void setPage_title(String page_title) {
        this.page_title = page_title;
    }

    public String getCtl() {
        return ctl;
    }

    public void setCtl(String ctl) {
        this.ctl = ctl;
    }

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getSess_id() {
        return sess_id;
    }

    public void setSess_id(String sess_id) {
        this.sess_id = sess_id;
    }

    public Object getRef_uid() {
        return ref_uid;
    }

    public void setRef_uid(Object ref_uid) {
        this.ref_uid = ref_uid;
    }

    public List<AdvsBean> getAdvs() {
        return advs;
    }

    public void setAdvs(List<AdvsBean> advs) {
        this.advs = advs;
    }

    public List<IndexsBean> getIndexs() {
        return indexs;
    }

    public void setIndexs(List<IndexsBean> indexs) {
        this.indexs = indexs;
    }

    public List<AdvGundongBean> getAdv_gundong() {
        return adv_gundong;
    }

    public void setAdv_gundong(List<AdvGundongBean> adv_gundong) {
        this.adv_gundong = adv_gundong;
    }

    public List<?> getAdv_btn_img() {
        return adv_btn_img;
    }

    public void setAdv_btn_img(List<?> adv_btn_img) {
        this.adv_btn_img = adv_btn_img;
    }

    public List<?> getAdv_3_pic() {
        return adv_3_pic;
    }

    public void setAdv_3_pic(List<?> adv_3_pic) {
        this.adv_3_pic = adv_3_pic;
    }

    public List<Adv4Bean> getAdv_4() {
        return adv_4;
    }

    public void setAdv_4(List<Adv4Bean> adv_4) {
        this.adv_4 = adv_4;
    }

    public List<Adv5Bean> getAdv_5() {
        return adv_5;
    }

    public void setAdv_5(List<Adv5Bean> adv_5) {
        this.adv_5 = adv_5;
    }

    public List<SupplierDealListBean> getSupplier_deal_list() {
        return supplier_deal_list;
    }

    public void setSupplier_deal_list(List<SupplierDealListBean> supplier_deal_list) {
        this.supplier_deal_list = supplier_deal_list;
    }

    public List<BestDealListBean> getBest_deal_list() {
        return best_deal_list;
    }

    public void setBest_deal_list(List<BestDealListBean> best_deal_list) {
        this.best_deal_list = best_deal_list;
    }

    public List<QianggouDealListBean> getQianggou_deal_list() {
        return qianggou_deal_list;
    }

    public void setQianggou_deal_list(List<QianggouDealListBean> qianggou_deal_list) {
        this.qianggou_deal_list = qianggou_deal_list;
    }

    public List<IndexNoticeBean> getIndex_notice() {
        return index_notice;
    }

    public void setIndex_notice(List<IndexNoticeBean> index_notice) {
        this.index_notice = index_notice;
    }

    public static class AdvsBean {
        /**
         * id : 140
         * name : 庄园主
         * img : http://img.bphapp.com/public/attachment/201707/25/15/5976f36b5e81a.jpg?x-oss-process=image/quality,Q_80
         * type : 21
         * data : {"item_id":"248"}
         * ctl : item
         */

        private String id;
        private String name;
        private String img;
        private String type;
        private DataBean data;
        private String ctl;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public String getCtl() {
            return ctl;
        }

        public void setCtl(String ctl) {
            this.ctl = ctl;
        }

        public static class DataBean {
            /**
             * item_id : 248
             */

            private String item_id;

            public String getItem_id() {
                return item_id;
            }

            public void setItem_id(String item_id) {
                this.item_id = item_id;
            }
        }
    }

    public static class IndexsBean {
        /**
         * id : 121
         * name : 秒杀
         * img : http://img.bphapp.com/public/attachment/201704/13/10/58eede9f2e1eb.png?x-oss-process=image/quality,Q_80
         * icon_name :
         * color : #f16522
         * data : {"url":"http://www.bphapp.com/wap/index.php?ctl=yingxiao&act=miaosha"}
         * ctl : url
         * type : 0
         */

        private String id;
        private String name;
        private String img;
        private String icon_name;
        private String color;
        private DataBeanX data;
        private String ctl;
        private String type;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getIcon_name() {
            return icon_name;
        }

        public void setIcon_name(String icon_name) {
            this.icon_name = icon_name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public DataBeanX getData() {
            return data;
        }

        public void setData(DataBeanX data) {
            this.data = data;
        }

        public String getCtl() {
            return ctl;
        }

        public void setCtl(String ctl) {
            this.ctl = ctl;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public static class DataBeanX {
            /**
             * url : http://www.bphapp.com/wap/index.php?ctl=yingxiao&act=miaosha
             */

            private String url;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }

    public static class AdvGundongBean {
        /**
         * id : 67
         * name : 滚动1
         * img : http://img.bphapp.com/public/attachment/201702/17/14/58a69787bc5ff.jpg?x-oss-process=image/quality,Q_80
         * type : 12
         * data : {"cate_id":"27"}
         * ctl : list
         */

        private String id;
        private String name;
        private String img;
        private String type;
        private DataBeanXX data;
        private String ctl;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public DataBeanXX getData() {
            return data;
        }

        public void setData(DataBeanXX data) {
            this.data = data;
        }

        public String getCtl() {
            return ctl;
        }

        public void setCtl(String ctl) {
            this.ctl = ctl;
        }

        public static class DataBeanXX {
            /**
             * cate_id : 27
             */

            private String cate_id;

            public String getCate_id() {
                return cate_id;
            }

            public void setCate_id(String cate_id) {
                this.cate_id = cate_id;
            }
        }
    }

    public static class Adv4Bean {
        /**
         * id : 131
         * name : 泰谷代金券
         * img : http://img.bphapp.com/public/attachment/201706/10/17/593bc2e151e20.jpg?x-oss-process=image/quality,Q_80
         * type : 12
         * data : {"cate_id":"45"}
         * ctl : list
         */

        private String id;
        private String name;
        private String img;
        private String type;
        private DataBeanXXX data;
        private String ctl;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public DataBeanXXX getData() {
            return data;
        }

        public void setData(DataBeanXXX data) {
            this.data = data;
        }

        public String getCtl() {
            return ctl;
        }

        public void setCtl(String ctl) {
            this.ctl = ctl;
        }

        public static class DataBeanXXX {
            /**
             * cate_id : 45
             */

            private String cate_id;

            public String getCate_id() {
                return cate_id;
            }

            public void setCate_id(String cate_id) {
                this.cate_id = cate_id;
            }
        }
    }

    public static class Adv5Bean {
        /**
         * id : 77
         * name : 爆款上方2
         * img : http://img.bphapp.com/public/attachment/201703/20/11/58cf4ad731b25.jpg?x-oss-process=image/quality,Q_80
         * type : 12
         * data : {"cate_id":"2"}
         * ctl : list
         */

        private String id;
        private String name;
        private String img;
        private String type;
        private DataBeanXXXX data;
        private String ctl;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public DataBeanXXXX getData() {
            return data;
        }

        public void setData(DataBeanXXXX data) {
            this.data = data;
        }

        public String getCtl() {
            return ctl;
        }

        public void setCtl(String ctl) {
            this.ctl = ctl;
        }

        public static class DataBeanXXXX {
            /**
             * cate_id : 2
             */

            private String cate_id;

            public String getCate_id() {
                return cate_id;
            }

            public void setCate_id(String cate_id) {
                this.cate_id = cate_id;
            }
        }
    }

    public static class SupplierDealListBean {
        /**
         * id : 79
         * distance : 0
         * ypoint : 27.99123
         * xpoint : 120.665908
         * name : 泰谷啤酒（易拉罐）500ml*24罐
         * sub_name : 泰谷啤酒（易拉罐）500ml*24罐
         * brief : 原产国：西班牙 。 原料与辅料：水 、大麦麦芽 、玉米 、大麦 、啤酒花 。 酒精度 ：4.8%vol ，原麦汁浓度 ：10.7 P 。 贮藏条件：置于阴凉处 。 保质期：18个月 。

         * buy_count : 735
         * current_price : 120
         * origin_price : 168
         * icon : http://img.bphapp.com/public/attachment/201701/03/14/586b3e9a5602a.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80
         * image : http://img.bphapp.com/public/attachment/201701/03/14/586b3e9a5602a.JPG?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80
         * end_time_format :
         * begin_time_format :
         * begin_time : 0
         * end_time : 0
         * time_status : 1
         * auto_order : 0
         * is_lottery : 0
         * is_refund : 1
         * deal_score : 0
         * buyin_app : 0
         * is_today : 0
         */

        private String id;
        private int distance;
        private double ypoint;
        private double xpoint;
        private String name;
        private String sub_name;
        private String brief;
        private String buy_count;
        private int current_price;
        private int origin_price;
        private String icon;
        private String image;
        private String end_time_format;
        private String begin_time_format;
        private String begin_time;
        private String end_time;
        private String time_status;
        private String auto_order;
        private String is_lottery;
        private String is_refund;
        private int deal_score;
        private int buyin_app;
        private int is_today;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getDistance() {
            return distance;
        }

        public void setDistance(int distance) {
            this.distance = distance;
        }

        public double getYpoint() {
            return ypoint;
        }

        public void setYpoint(double ypoint) {
            this.ypoint = ypoint;
        }

        public double getXpoint() {
            return xpoint;
        }

        public void setXpoint(double xpoint) {
            this.xpoint = xpoint;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSub_name() {
            return sub_name;
        }

        public void setSub_name(String sub_name) {
            this.sub_name = sub_name;
        }

        public String getBrief() {
            return brief;
        }

        public void setBrief(String brief) {
            this.brief = brief;
        }

        public String getBuy_count() {
            return buy_count;
        }

        public void setBuy_count(String buy_count) {
            this.buy_count = buy_count;
        }

        public int getCurrent_price() {
            return current_price;
        }

        public void setCurrent_price(int current_price) {
            this.current_price = current_price;
        }

        public int getOrigin_price() {
            return origin_price;
        }

        public void setOrigin_price(int origin_price) {
            this.origin_price = origin_price;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getEnd_time_format() {
            return end_time_format;
        }

        public void setEnd_time_format(String end_time_format) {
            this.end_time_format = end_time_format;
        }

        public String getBegin_time_format() {
            return begin_time_format;
        }

        public void setBegin_time_format(String begin_time_format) {
            this.begin_time_format = begin_time_format;
        }

        public String getBegin_time() {
            return begin_time;
        }

        public void setBegin_time(String begin_time) {
            this.begin_time = begin_time;
        }

        public String getEnd_time() {
            return end_time;
        }

        public void setEnd_time(String end_time) {
            this.end_time = end_time;
        }

        public String getTime_status() {
            return time_status;
        }

        public void setTime_status(String time_status) {
            this.time_status = time_status;
        }

        public String getAuto_order() {
            return auto_order;
        }

        public void setAuto_order(String auto_order) {
            this.auto_order = auto_order;
        }

        public String getIs_lottery() {
            return is_lottery;
        }

        public void setIs_lottery(String is_lottery) {
            this.is_lottery = is_lottery;
        }

        public String getIs_refund() {
            return is_refund;
        }

        public void setIs_refund(String is_refund) {
            this.is_refund = is_refund;
        }

        public int getDeal_score() {
            return deal_score;
        }

        public void setDeal_score(int deal_score) {
            this.deal_score = deal_score;
        }

        public int getBuyin_app() {
            return buyin_app;
        }

        public void setBuyin_app(int buyin_app) {
            this.buyin_app = buyin_app;
        }

        public int getIs_today() {
            return is_today;
        }

        public void setIs_today(int is_today) {
            this.is_today = is_today;
        }
    }

    public static class BestDealListBean {
        /**
         * id : 137
         * distance : 0
         * ypoint : 28.017552
         * xpoint : 120.689504
         * name : 晨之星全脂牛奶*12瓶
         * sub_name : 晨之星全脂牛奶*12瓶
         * brief :  晨之星超高温灭菌全脂牛奶  。  配料 ：100 % 生牛乳  。 产品类型 ：超高温灭菌乳 。 原产国 ：德国  。 脂肪含量：3.5%  。 保质期 ：至2017年11月 。 贮藏方式 ： 置于阴凉干燥密封处存贮 。开封后 ，请冷藏保存（6度以下）并且4天内饮用完毕 。
         * buy_count : 377
         * current_price : 144
         * origin_price : 168
         * icon : http://img.bphapp.com/public/attachment/201702/21/10/58ab9fd2687b3.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80
         * image : http://img.bphapp.com/public/attachment/201702/21/10/58ab9fd2687b3.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80
         * end_time_format :
         * begin_time_format :
         * begin_time : 0
         * end_time : 0
         * time_status : 1
         * auto_order : 0
         * is_lottery : 0
         * is_refund : 1
         * deal_score : 0
         * buyin_app : 0
         * is_today : 0
         */

        private String id;
        private int distance;
        private double ypoint;
        private double xpoint;
        private String name;
        private String sub_name;
        private String brief;
        private String buy_count;
        private int current_price;
        private int origin_price;
        private String icon;
        private String image;
        private String end_time_format;
        private String begin_time_format;
        private String begin_time;
        private String end_time;
        private String time_status;
        private String auto_order;
        private String is_lottery;
        private String is_refund;
        private int deal_score;
        private int buyin_app;
        private int is_today;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getDistance() {
            return distance;
        }

        public void setDistance(int distance) {
            this.distance = distance;
        }

        public double getYpoint() {
            return ypoint;
        }

        public void setYpoint(double ypoint) {
            this.ypoint = ypoint;
        }

        public double getXpoint() {
            return xpoint;
        }

        public void setXpoint(double xpoint) {
            this.xpoint = xpoint;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSub_name() {
            return sub_name;
        }

        public void setSub_name(String sub_name) {
            this.sub_name = sub_name;
        }

        public String getBrief() {
            return brief;
        }

        public void setBrief(String brief) {
            this.brief = brief;
        }

        public String getBuy_count() {
            return buy_count;
        }

        public void setBuy_count(String buy_count) {
            this.buy_count = buy_count;
        }

        public int getCurrent_price() {
            return current_price;
        }

        public void setCurrent_price(int current_price) {
            this.current_price = current_price;
        }

        public int getOrigin_price() {
            return origin_price;
        }

        public void setOrigin_price(int origin_price) {
            this.origin_price = origin_price;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getEnd_time_format() {
            return end_time_format;
        }

        public void setEnd_time_format(String end_time_format) {
            this.end_time_format = end_time_format;
        }

        public String getBegin_time_format() {
            return begin_time_format;
        }

        public void setBegin_time_format(String begin_time_format) {
            this.begin_time_format = begin_time_format;
        }

        public String getBegin_time() {
            return begin_time;
        }

        public void setBegin_time(String begin_time) {
            this.begin_time = begin_time;
        }

        public String getEnd_time() {
            return end_time;
        }

        public void setEnd_time(String end_time) {
            this.end_time = end_time;
        }

        public String getTime_status() {
            return time_status;
        }

        public void setTime_status(String time_status) {
            this.time_status = time_status;
        }

        public String getAuto_order() {
            return auto_order;
        }

        public void setAuto_order(String auto_order) {
            this.auto_order = auto_order;
        }

        public String getIs_lottery() {
            return is_lottery;
        }

        public void setIs_lottery(String is_lottery) {
            this.is_lottery = is_lottery;
        }

        public String getIs_refund() {
            return is_refund;
        }

        public void setIs_refund(String is_refund) {
            this.is_refund = is_refund;
        }

        public int getDeal_score() {
            return deal_score;
        }

        public void setDeal_score(int deal_score) {
            this.deal_score = deal_score;
        }

        public int getBuyin_app() {
            return buyin_app;
        }

        public void setBuyin_app(int buyin_app) {
            this.buyin_app = buyin_app;
        }

        public int getIs_today() {
            return is_today;
        }

        public void setIs_today(int is_today) {
            this.is_today = is_today;
        }
    }

    public static class QianggouDealListBean {
        /**
         * id : 248
         * distance : 0
         * ypoint : 27.99123
         * xpoint : 120.665908
         * name : 新活动：庄园主小麦白啤酒 买一送二
         * sub_name : 庄园主小麦白啤酒
         * brief : 特价！特价！特价！保质期到17年9月 ！原产国：德国 。  原料与辅料：水 、小麦麦芽 、大麦麦芽 、啤酒花提取物 、酵母  。  酒精度 ：5.3%vol ，麦汁浓度 ：11.8 P 。  贮藏条件：常温保存 ， 置于阴凉干燥处 。注：浑浊为正常现象，饮用前轻微摇匀口感最佳  。

         * buy_count : 234
         * current_price : 128
         * origin_price : 258
         * icon : http://img.bphapp.com/public/attachment/201707/25/14/5976e607c6297.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80
         * image : http://img.bphapp.com/public/attachment/201707/25/14/5976e607c6297.jpg?x-oss-process=image/resize,m_fill,h_320,w_320/quality,Q_80
         * end_time_format : 2017-08-05 14:33:03
         * begin_time_format : 2017-07-25 14:32:00
         * begin_time : 1500935520
         * end_time : 1501885983
         * time_status : 1
         * auto_order : 0
         * is_lottery : 0
         * is_refund : 1
         * deal_score : 0
         * buyin_app : 0
         * is_today : 0
         */

        private String id;
        private int distance;
        private double ypoint;
        private double xpoint;
        private String name;
        private String sub_name;
        private String brief;
        private String buy_count;
        private int current_price;
        private int origin_price;
        private String icon;
        private String image;
        private String end_time_format;
        private String begin_time_format;
        private String begin_time;
        private String end_time;
        private String time_status;
        private String auto_order;
        private String is_lottery;
        private String is_refund;
        private int deal_score;
        private int buyin_app;
        private int is_today;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getDistance() {
            return distance;
        }

        public void setDistance(int distance) {
            this.distance = distance;
        }

        public double getYpoint() {
            return ypoint;
        }

        public void setYpoint(double ypoint) {
            this.ypoint = ypoint;
        }

        public double getXpoint() {
            return xpoint;
        }

        public void setXpoint(double xpoint) {
            this.xpoint = xpoint;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSub_name() {
            return sub_name;
        }

        public void setSub_name(String sub_name) {
            this.sub_name = sub_name;
        }

        public String getBrief() {
            return brief;
        }

        public void setBrief(String brief) {
            this.brief = brief;
        }

        public String getBuy_count() {
            return buy_count;
        }

        public void setBuy_count(String buy_count) {
            this.buy_count = buy_count;
        }

        public int getCurrent_price() {
            return current_price;
        }

        public void setCurrent_price(int current_price) {
            this.current_price = current_price;
        }

        public int getOrigin_price() {
            return origin_price;
        }

        public void setOrigin_price(int origin_price) {
            this.origin_price = origin_price;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getEnd_time_format() {
            return end_time_format;
        }

        public void setEnd_time_format(String end_time_format) {
            this.end_time_format = end_time_format;
        }

        public String getBegin_time_format() {
            return begin_time_format;
        }

        public void setBegin_time_format(String begin_time_format) {
            this.begin_time_format = begin_time_format;
        }

        public String getBegin_time() {
            return begin_time;
        }

        public void setBegin_time(String begin_time) {
            this.begin_time = begin_time;
        }

        public String getEnd_time() {
            return end_time;
        }

        public void setEnd_time(String end_time) {
            this.end_time = end_time;
        }

        public String getTime_status() {
            return time_status;
        }

        public void setTime_status(String time_status) {
            this.time_status = time_status;
        }

        public String getAuto_order() {
            return auto_order;
        }

        public void setAuto_order(String auto_order) {
            this.auto_order = auto_order;
        }

        public String getIs_lottery() {
            return is_lottery;
        }

        public void setIs_lottery(String is_lottery) {
            this.is_lottery = is_lottery;
        }

        public String getIs_refund() {
            return is_refund;
        }

        public void setIs_refund(String is_refund) {
            this.is_refund = is_refund;
        }

        public int getDeal_score() {
            return deal_score;
        }

        public void setDeal_score(int deal_score) {
            this.deal_score = deal_score;
        }

        public int getBuyin_app() {
            return buyin_app;
        }

        public void setBuyin_app(int buyin_app) {
            this.buyin_app = buyin_app;
        }

        public int getIs_today() {
            return is_today;
        }

        public void setIs_today(int is_today) {
            this.is_today = is_today;
        }
    }

    public static class IndexNoticeBean {
        /**
         * id : 138
         * name : 飞机测试
         * img :
         * type : 0
         * data : {"url":"http://www.bphapp.com/wap/index.php?ctl=game&act=feiji"}
         * ctl : url
         */

        private String id;
        private String name;
        private String img;
        private String type;
        private DataBeanXXXXX data;
        private String ctl;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public DataBeanXXXXX getData() {
            return data;
        }

        public void setData(DataBeanXXXXX data) {
            this.data = data;
        }

        public String getCtl() {
            return ctl;
        }

        public void setCtl(String ctl) {
            this.ctl = ctl;
        }

        public static class DataBeanXXXXX {
            /**
             * url : http://www.bphapp.com/wap/index.php?ctl=game&act=feiji
             */

            private String url;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
