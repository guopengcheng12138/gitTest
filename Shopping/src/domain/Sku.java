package domain;

import java.util.Date;

public class Sku {
	private Integer sku_id;//SKU编号
	private Integer spu_id;//SPU编号
	private String sku_name;//SKU名称
	private Double cprice;//成本价
	private Double price;//SKU价格
	private Integer stock;//数量
	private Integer shop_id;//店铺编号
	private Date release_time;//上架时间
	private String main;//主图
	public Double getCprice() {
		return cprice;
	}
	public void setCprice(Double cprice) {
		this.cprice = cprice;
	}
	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	public Integer getSku_id() {
		return sku_id;
	}
	public void setSku_id(Integer sku_id) {
		this.sku_id = sku_id;
	}
	public Integer getSpu_id() {
		return spu_id;
	}
	public void setSpu_id(Integer spu_id) {
		this.spu_id = spu_id;
	}
	public String getSku_name() {
		return sku_name;
	}
	public void setSku_name(String sku_name) {
		this.sku_name = sku_name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Integer getShop_id() {
		return shop_id;
	}
	public void setShop_id(Integer shop_id) {
		this.shop_id = shop_id;
	}
	public Date getRelease_time() {
		return release_time;
	}
	public void setRelease_time(Date release_time) {
		this.release_time = release_time;
	}
	
}
