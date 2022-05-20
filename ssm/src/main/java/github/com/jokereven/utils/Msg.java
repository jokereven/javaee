package github.com.jokereven.utils;
/**
 * 工具类
 * 用来返回通用的类数据
 * @author mrwang
 *
 */

import java.util.HashMap;
import java.util.Map;

public class Msg {
	//状态码  200 成功  400 失败
	private int code;
	//提示信息("操作成功","操作失败"....)
	private String msg;
	//用户要返回给浏览器的数据
	private Map<String, Object> extend=new HashMap<String, Object>();
	
	
	
	//成功,同时返回Msg对象
	public static Msg success() {
		Msg result=new Msg();
		result.setCode(200);
		result.setMsg("成功");
		return result;
	}
	//失败,同时返回Msg对象
	public static Msg fail() {
		Msg result=new Msg();
		result.setCode(400);
		result.setMsg("失败");
		return result;
	}
	
	//添加信息到Msg对象中,同时返回Msg对象
	public Msg add(String key,Object value) {
		this.getExtend().put(key, value);
		return this;
	}
	
	
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Map<String, Object> getExtend() {
		return extend;
	}
	public void setExtend(Map<String, Object> extend) {
		this.extend = extend;
	}
}
