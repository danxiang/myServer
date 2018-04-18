package com.feng.demo.bean;

import java.io.Serializable;
import java.util.Date;

public class GoodsInfo implements Serializable{

	private static final long serialVersionUID = -4215077135030838015L;
	
	private long id;   //商品id
    private String title;  //商品名字
    private long sale_price;  //商品价格
    private long original_price;   //原价
    private long sales;   //销售数量
    private long collect;  //被收藏数量
    private Date creatTime; //创建时间     
    private Date updateTime; //修改时间
    private String credit;   //信用度
    private String pic_url;   //图片
    private String shop_id;   //店铺id
    private String shop_name;   //店铺名称
    private String address;   //发货地
    private String express_fee;   //快递费
    private String comments;   //评价
    private String remarks;   //备注
    private String url;   //商品链接	
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getSale_price() {
		return sale_price;
	}
	public void setSale_price(long sale_price) {
		this.sale_price = sale_price;
	}
	public long getOriginal_price() {
		return original_price;
	}
	public void setOriginal_price(long original_price) {
		this.original_price = original_price;
	}
	public long getSales() {
		return sales;
	}
	public void setSales(long sales) {
		this.sales = sales;
	}
	public long getCollect() {
		return collect;
	}
	public void setCollect(long collect) {
		this.collect = collect;
	}
	public Date getCreatTime() {
		return creatTime;
	}
	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public String getPic_url() {
		return pic_url;
	}
	public void setPic_url(String pic_url) {
		this.pic_url = pic_url;
	}
	public String getShop_id() {
		return shop_id;
	}
	public void setShop_id(String shop_id) {
		this.shop_id = shop_id;
	}
	public String getShop_name() {
		return shop_name;
	}
	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getExpress_fee() {
		return express_fee;
	}
	public void setExpress_fee(String express_fee) {
		this.express_fee = express_fee;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
