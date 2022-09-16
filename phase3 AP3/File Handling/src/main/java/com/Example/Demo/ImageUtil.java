package com.example.demo;

import java.io.ByteArrayOutputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class ImageUtil {

	//compression of file into dB-Deflater
	public static byte[] compressImage(byte[] data) {
		Deflater defalter =new Deflater();
		defalter.setLevel(Deflater.BEST_COMPRESSION);
		defalter.setInput(data);
		defalter.finish();
		ByteArrayOutputStream out=new ByteArrayOutputStream(data.length);
		byte[] tmp=new byte[4*1024];
		while(!defalter.finished()) {
			int size=defalter.deflate(tmp);
			out.write(tmp,0, size);
		}
		return out.toByteArray();
		
	}
	
	
	
	//decompression of the file from the dB-Infalter
	
	public static byte[] decompression(byte[] data) throws DataFormatException {
		Inflater inflat=new Inflater();
		inflat.setInput(data);
		ByteArrayOutputStream out=new ByteArrayOutputStream(data.length);
		byte[] tmp=new byte[4*1024];
		while(!inflat.finished()) {
			int size=inflat.inflate(tmp);
			out.write(tmp,0, size);

		}
		return out.toByteArray();
	}
	
}
