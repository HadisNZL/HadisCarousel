package com.hadis.hadiscarousel.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by hadis on 16.3.16.
 */
public class HomePlayBean implements Serializable {
	// "status": 1,
	// "message": "ok",
	// "data": [],
	// "errorcode": "0"
	private String status;
	private String message;
	private List<ADInfo> data;
	private String errorcode;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<ADInfo> getData() {
		return data;
	}

	public void setData(List<ADInfo> data) {
		this.data = data;
	}

	public String getErrorcode() {
		return errorcode;
	}

	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}

}
