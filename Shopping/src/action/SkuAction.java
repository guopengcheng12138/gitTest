package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Member;
import domain.Sku;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;
import service.SkuService;
import service.SpuService;

public class SkuAction extends ActionSupport implements ModelDriven<Sku> {
	private boolean b;
	//返回json数据
	private String result;
	JSONObject jsonObject=new JSONObject();
	
	public JSONObject getJsonObject() {
		return jsonObject;
	}
	public String getResult() {
		return result;
	}
	//依赖注入skuService
	private SkuService skuService;
	public void setSkuService(SkuService skuService) {
		this.skuService = skuService;
	}
	private SpuService spuService;
	
	public void setSpuService(SpuService spuService) {
		this.spuService = spuService;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Sku sku=new Sku();
	@Override
	//封装数据
	public Sku getModel() {
		// TODO Auto-generated method stub
		return sku;
	}
	//添加数据
	public String save() {
		b=this.skuService.save(sku);
		jsonObject.clear();
		if(b) {
			jsonObject.put("result", "添加数据成功!");
		}
		else {
			jsonObject.put("result", "添加数据失败！");
		}
		return "save";
	}
	//更新数据
	public String update() {
		b=this.skuService.update(sku);
		jsonObject.clear();
		if(b) {
			jsonObject.put("result", "更新数据成功!");
		}
		else {
			jsonObject.put("result", "更新数据失败！");
		}
		return "update";
	}
	//删除数据
	public String delete() {
		b=this.skuService.delete(sku.getSku_id());
		jsonObject.clear();
		if(b) {
			jsonObject.put("result", "删除数据成功!");
		}
		else {
			jsonObject.put("result", "删除数据失败！");
		}
		return "delete";
	}
	//通过ID查询数据
	public String findById(Integer id) {
		Sku skus=this.skuService.findById(id);
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(skus,jsonConfig).toString();
		return "findById";
	}
	//查询所有数据
	public String findAll(){
		List<Sku> skumessage=this.skuService.findAll();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(skumessage,jsonConfig).toString();
		return "findAll";
	}

}
