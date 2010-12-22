package com.mydoors.tsp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;


import org.restlet.Application;
import org.restlet.Client;
import org.restlet.Response;
import org.restlet.data.Form;
import org.restlet.data.Protocol;
import org.restlet.data.Reference;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;


import com.google.gwt.resources.client.ResourceException;

public class TspService extends ServerResource {
	
	@Get
	public String represent()throws IOException {
		/*URL url = new URL("http://photo.163.com");
		InputStreamReader in = new InputStreamReader(url.openStream(), "GBK");
		char[] buf = new char[2048];//缓存
		StringBuffer sb = new StringBuffer();
		int len = 0;
		while ((len = in.read(buf)) != -1) {//当没到文档尽头继续读取
			sb.append(buf, 0, len);
		}
		
		// 输出在网页上
		return sb.toString();*/
		
		
		URL url = new URL("http://2.latest.fatkuns.appspot.com/request.jsp");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setDoOutput(true);// 使用 URL 连接进行输出
		connection.setRequestMethod("POST");
		// 取得输出流
		OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
		// 用UTF-8编码，保证中文传递正常
		String message = URLEncoder.encode("你好，I'm Fatkun!", "UTF-8");
		// 写入发送的内容
		writer.write("msg=" + message);
		writer.close();
		return "";
		
		
	}
	public boolean allowPut() {  
	    return true;  
	}    
	public boolean allowPost() {  
	    return true;  
	} 
	public boolean allowDelete() {  
	    return true;  
	}
	@Post
	public String acceptRepresentation(Representation entity) throws IOException {  
		URL url = new URL("http://photo.163.com");
		InputStreamReader in = new InputStreamReader(url.openStream(), "GBK");
		char[] buf = new char[2048];//缓存
		StringBuffer sb = new StringBuffer();
		int len = 0;
		while ((len = in.read(buf)) != -1) {//当没到文档尽头继续读取
			sb.append(buf, 0, len);
		}
 
		// 输出在网页上
		return sb.toString();
		}
		
	}  
   

