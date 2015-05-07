package kr.ac.korea.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class IOManager {
	public String getFilePath(){
		String path = this.getClass().getResource(".").getPath();
		
		return path;
	}
	
	public File getFile(String path){
		File file = new File(path);
		
		return file;
	}
	
	public FileInputStream getFileInputStream(File file){
		
		FileInputStream fis = null;
		try {
			 fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return fis;
	}
	
	public BufferedInputStream getBufferedInputStream(FileInputStream fis){
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		return bis;
	}
	
	public FileReader getFileReader(File file){
		FileReader reader = null;
		try {
			reader = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return reader;
	}
	
	public BufferedReader getBufferedReader(FileReader fr){
		BufferedReader br = new BufferedReader(fr);
		
		return br;
	}
}
