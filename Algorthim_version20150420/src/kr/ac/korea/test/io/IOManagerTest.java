package kr.ac.korea.test.io;

import static org.junit.Assert.*;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

import kr.ac.korea.io.IOManager;

import org.junit.BeforeClass;
import org.junit.Test;

public class IOManagerTest {
	private static IOManager iom;
	
	@BeforeClass
	public static void createObject(){
		iom = new IOManager();
	}
	
	@Test
	public void getFilePathTest() {
		String filePath = iom.getFilePath();
		assertNotNull(filePath);
	}
	
	@Test
	public void getFileTest(){
		String filePath = iom.getFilePath();
		String targetDir = "data";
		String targetFile = "test_doc.txt";
		
		File file = iom.getFile(filePath + File.separator + targetDir + File.separator + targetFile);
		
		assertNotNull(file);
		assertEquals(targetFile, file.getName());
		assertNotNull(iom.getFileInputStream(file));
	}
	
	@Test
	public void getBufferedInputStreamTest() throws FileNotFoundException{
		String filePath = iom.getFilePath();
		String targetDir = "data";
		String targetFile = "test_doc.txt";
		
		File file = iom.getFile(filePath + File.separator + targetDir + File.separator + targetFile);
		FileInputStream fis = iom.getFileInputStream(file);
		
		BufferedInputStream bis = iom.getBufferedInputStream(fis);
		
		assertNotNull(bis);
		
	}
	
	@Test
	public void createFileByBufferOutputStream(){
		String filePath = iom.getFilePath();
		String targetDir = "data";
		String targetFile = "test_doc.txt";
		
		File file = iom.getFile(filePath + File.separator + targetDir + File.separator + targetFile);
		FileInputStream fis = iom.getFileInputStream(file);
		BufferedInputStream bis = iom.getBufferedInputStream(fis);
		
		BufferedOutputStream bos = null;
		try {
			int i;
			bos = new BufferedOutputStream(new FileOutputStream(filePath + File.separator + targetDir + File.separator + "result.txt"));
			while((i = bis.read()) != -1){
				bos.write(i);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			try {
				bis.close();
				bos.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	@Test
	public void getFileReader(){
		String path = iom.getFilePath();
		String orignDir = "data";
		String orignFileName = "test_doc.txt";
		
		FileReader fr = iom.getFileReader(new File(path + File.separator + orignDir + File.separator + orignFileName));
		
		assertNotNull(fr);
	}
	
	@Test
	public void getBufferedReader(){
		String path = iom.getFilePath();
		String orignDir = "data";
		String orignFileName = "test_doc.txt";
		
		FileReader fr = iom.getFileReader(new File(path + File.separator + orignDir + File.separator + orignFileName));
		
		BufferedReader br = iom.getBufferedReader(fr);
		
		assertNotNull(br);
		
		String data = "";
		try {
			while((data = br.readLine()) != null){
				System.out.println(data);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void createFileByBufferedWriter(){
		String path = iom.getFilePath();
		String orignDir = "data";
		String orignFileName = "test_doc.txt";
		String targetFileName = "result_br.txt";
		
		FileReader fr = iom.getFileReader(new File(path + File.separator + orignDir + File.separator + orignFileName));
		
		BufferedReader br = iom.getBufferedReader(fr);
		
		assertNotNull(br);
		
		
		String data = "";
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(path + File.separator + orignDir + File.separator + targetFileName));
			while((data = br.readLine()) != null){
				bw.write(data);
				bw.newLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
