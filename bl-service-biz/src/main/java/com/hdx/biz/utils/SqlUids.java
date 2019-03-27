package com.hdx.biz.utils;

import com.hdx.common.IDFactory;
import com.hdx.common.SnowflakeIdWorker;

public class SqlUids {
	private final static IDFactory worker = new SnowflakeIdWorker(2095,999);
	public static Long nextId() {
		return worker.nextId();
	}
}
