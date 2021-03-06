package com.osf.web;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ArrayCopyTest {

	public static void main(String[] args) {
		String str1 = "1234";
		byte[] strBytes = str1.getBytes();
		String str2 = "abcd";
		byte[] strBytes1 = str2.getBytes();
		byte[] subBytes = new byte[strBytes.length+strBytes1.length];
		System.arraycopy(strBytes, 0, subBytes, 0, strBytes.length);
		System.arraycopy(strBytes1, 0, subBytes, strBytes.length, strBytes1.length);

		for(int i=0;i<subBytes.length;i++) {
			log.info("b[{}]=>{}",i,subBytes[i]);
		}
		
		try {
			MessageDigest mDigest = MessageDigest.getInstance("SHA-256");
			subBytes = mDigest.digest(subBytes);
			StringBuffer sb = new StringBuffer();
			for(int i=0;i<subBytes.length;i++) {
				String s = Integer.toString((subBytes[i] & 0xFF)+0x100,16).substring(1);
				sb.append(s);
			}
			log.info("encoding str => {}",sb.toString());
			//221b37fcdb52d0f7c39bbd0be211db0e1c00ca5fbecd5788780463026c6b964b
			//221b37fcdb52d0f7c39bbd0be211db0e1c00ca5fbecd5788780463026c6b964b
			log.info("encoding str length=>{}",sb.toString().length());
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
