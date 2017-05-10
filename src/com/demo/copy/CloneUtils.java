package com.demo.copy;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 利用序列化实现对象的拷贝：(深拷贝)
 * @author Administrator
 */
public class CloneUtils {

	@SuppressWarnings("unchecked")
	public static <T extends Serializable> T clone(T obj){
		T cloneObj = null;
		
		try {
			// 写入字节流
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			ObjectOutputStream obs = new ObjectOutputStream(out);
			obs.writeObject(obj);
			obs.close();
			
			// 分配内存，写入原始对象，生成新对象
			ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(in);
			cloneObj = (T) ois.readObject();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cloneObj;
	}
}
