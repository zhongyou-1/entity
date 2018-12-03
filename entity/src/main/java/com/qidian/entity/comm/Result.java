package com.qidian.entity.comm;

import java.io.Serializable;

public class Result implements Serializable {
	private static final long serialVersionUID = 1L;
	private int code;
	private String reason;
	private Object data;
	private Object att;

	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getReason() {
		return this.reason;
	}

	public Result setReason(String reason) {
		this.reason = reason;
		return this;
	}

	public Object getData() {
		return this.data;
	}

	public Result setData(Object data) {
		this.data = data;
		return this;
	}

	public Object getAtt() {
		return this.att;
	}

	public Result setAtt(Object att) {
		this.att = att;
		return this;
	}

	public boolean success() {
		return this.code == 0;
	}
}