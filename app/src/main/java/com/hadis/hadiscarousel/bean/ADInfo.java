package com.hadis.hadiscarousel.bean;

import java.io.Serializable;

/**
 * 描述：广告信息</br>
 */
public class ADInfo implements Serializable {

	// String id = "";
	// String url = "";
	// String content = "";
	// String type = "";
	//
	// public String getId() {
	// return id;
	// }
	//
	// public void setId(String id) {
	// this.id = id;
	// }
	//
	// public String getUrl() {
	// return url;
	// }
	//
	// public void setUrl(String url) {
	// this.url = url;
	// }
	//
	// public String getContent() {
	// return content;
	// }
	//
	// public void setContent(String content) {
	// this.content = content;
	// }
	//
	// public String getType() {
	// return type;
	// }
	//
	// public void setType(String type) {
	// this.type = type;
	// }
	// "id": "首页轮播图2016.03_1",
	// "iurl":
	// "http://img.pic.ubetween.com.cn/?f=9e970d4dcb13ec3013068f1036588fd3",
	// "imemo": "协和医院主治医师诊断视频协和协和医院主治医师诊断;首都医科大学附属北京
	// "itarget": "#"
	private String id;
	private String iurl;
	private String imemo;
	private String itarget;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIurl() {
		return iurl;
	}

	public void setIurl(String iurl) {
		this.iurl = iurl;
	}

	public String getImemo() {
		return imemo;
	}

	public void setImemo(String imemo) {
		this.imemo = imemo;
	}

	public String getItarget() {
		return itarget;
	}

	public void setItarget(String itarget) {
		this.itarget = itarget;
	}

}
