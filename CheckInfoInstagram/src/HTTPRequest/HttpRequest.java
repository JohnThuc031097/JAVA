package HTTPRequest;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

public class HttpRequest {	

	private Map<String, String> property = new HashMap<>();
	private Map<String, List<String>> header;
	private HttpURLConnection Http;
	private int responseCode;
	public HttpURLConnection Connect(String url){		
		try {
			URL objURL = new URL(url);
			this.Http = (HttpURLConnection)objURL.openConnection();
			return this.Http;
		} catch (Exception ex) {
			System.out.println("[Error] Connect():\n" + ex.getMessage());
			return null;
		}	
	}
	
	public String GetHttp(boolean getCode){	
		try {
			Http.setRequestMethod("GET");
			for (Map.Entry<String, String> data : property.entrySet())
				Http.setRequestProperty(data.getKey(), data.getValue());		

			this.responseCode = Http.getResponseCode();
                        if(getCode) return null; 
			if(this.responseCode == 200){
				this.header = Http.getHeaderFields();
				
				if(this.getRequestHeaderByKey("Content-Encoding").contains("gzip")){
					String respone = unpackGzip(Http.getInputStream());
					return respone;
				}else{
					try {
						BufferedReader in = new BufferedReader(new InputStreamReader(Http.getInputStream()));
						String inputLine;
						StringBuffer response = new StringBuffer();

						while ((inputLine = in.readLine()) != null) {
							response.append(inputLine);
						}
						in.close();
						return response.toString();					
					} catch (Exception e) {
						System.out.println("[Error] GetHttp() ==> BufferedReader():\n" + e.getMessage());
					}					
				}
			}else
				System.out.println("[Error] [GET] Response Code :" + this.responseCode);						
			
		} catch (Exception e) {
			System.out.println("[Error] GetHttp() ==> getResponseCode():\n" + e.getMessage());
		}
		return null;
	}
	
	public String PostHttp(String urlParameters){
		try {
			Http.setRequestMethod("POST");
			for (Map.Entry<String, String> data : property.entrySet())
				Http.setRequestProperty(data.getKey(), data.getValue());
			Http.setDoOutput(true);
			
			DataOutputStream wr = new DataOutputStream(Http.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			this.responseCode = Http.getResponseCode();
			System.out.println("[POST] Response Code :" + this.responseCode + "\n");
			
			this.header = Http.getHeaderFields();
			
			BufferedReader in = new BufferedReader(
			        new InputStreamReader(Http.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			return response.toString();	
		} catch (Exception e) {
			System.out.println("[Error] PostHttp():\n" + e.getMessage());
		}
		return null;
	}
	
        public int getStateCode(){
            return this.responseCode;
        }
        
	public String getRequestHeader(){
		StringBuffer buffHeader = new StringBuffer();
		buffHeader.append("[HEADER] Respone:\n");
		for(Map.Entry<String, List<String>> data : this.header.entrySet()){
			buffHeader.append("\n[" +data.getKey()+ "] ");
			for(String data_value : data.getValue()){
				buffHeader.append(data_value + "; ");
			}
		}
		return buffHeader.toString();
	}
	
	public String getRequestHeaderByKey(String strKey){
		StringBuffer buffHeader = new StringBuffer();
		for(Map.Entry<String, List<String>> data : this.header.entrySet()){
			if(data.getKey() == null) continue;
			if(data.getKey().equals(strKey)){
				for(String data_value : data.getValue())
					buffHeader.append(data_value).append(';');
				return buffHeader.toString();
			}
		}
		return "Found not KEY in Header Fields";		
	}
	
	public void setRequestHeader(String key,String value) {
		this.property.put(key, value);
	}
	
	public void setRequestHeader(Map<String,String> proMap) {
		this.property = proMap;
	}
	
	public String unpackGzip(InputStream data){
		try {
			byte[] buff = new byte[1024];
			byte[] emptyBuff = new byte[1024];
			GZIPInputStream  gzip = new GZIPInputStream(data);
			StringBuffer unGzipRes = new StringBuffer();

			int byteCount = 0;
			while ((byteCount = gzip.read(buff, 0, 1024)) > 0) {
				unGzipRes.append(new String(Arrays.copyOf(buff, byteCount), "utf-8"));
			    System.arraycopy(emptyBuff, 0, buff, 0,1024);
			}
			gzip.close();
			return unGzipRes.toString();
		} catch (Exception e) {
			System.out.println("[Error] unpackGzip() ==> getInputStream():\n" + e.getMessage());
		}
		return null;
	}
}
