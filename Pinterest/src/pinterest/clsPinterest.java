package pinterest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.JSONArray;
import org.json.JSONObject;

import HTTPRequest.HttpRequest;

public class clsPinterest {
	private Map<String,String> Property = new HashMap<String, String>();
	//private final static String UserAgent_Chrome = "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Safari/537.36";
	private final String USerAgent_FireFox = "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:55.0) Gecko/20100101 Firefox/55.0";
	
	public JSONArray getListUser(String srcJSON){
            try{
		JSONArray jsObj = new JSONObject(srcJSON).getJSONObject("resource_response").getJSONArray("data");
		return jsObj;	
            }catch(Exception e){
		System.out.println("[Error] JSONObject\n" + e.getMessage());
            }
            return null;
	}
	
	public String getBookmark(String srcJSON){
            try {
		JSONArray jsObj = new JSONObject(srcJSON).getJSONObject("resource").getJSONObject("options").getJSONArray("bookmarks");
		return jsObj.getString(0);
            } catch (Exception e) {
		System.out.println("[Error] JSONObject\n" + e.getMessage());
            }
            return null;
	}
	
	public String getTotalFollowersByUserBoard(String srcPage){
            List<String> regx;		
            regx = regexMatcher("\"followers\":\"([0-9]+)\"", srcPage);
            if(regx.size() > 0)
		return regx.get(0);
            return null;
	}
        
        public String getTotalFollowersByUser(String srcPage){
            List<String> regx;		
            regx = regexMatcher("\"pinterestapp:followers\":\"([0-9]+)\"", srcPage);
            if(regx.size() > 0)
		return regx.get(0);
            return null;
	}
	
	public String getIDByUserBoard(String srcPage){
            List<String> regx;	
            regx = regexMatcher("\"board_id\": \"([0-9]+)\",", srcPage);
            if(regx.size() > 0)
        	return regx.get(0);
            return null;
	}
	
	private List<String> regexMatcher(String regx, String input){
            List<String> Result = new ArrayList<String>();
            Pattern pattern = Pattern.compile(regx);    
            Matcher matcher = pattern.matcher(input);
            while (matcher.find())   
                Result.add(matcher.group(1));    
            return Result;
	}
	
	public String getPageFollowers(HttpRequest HTTP, String keyword){
		HTTP.Connect("https://www.pinterest.com/"+keyword+"/");
		Property.put("Host", "www.pinterest.com");
		Property.put("User-Agent", USerAgent_FireFox);
		Property.put("Accept", "application/json, text/javascript, */*, q=0.01");
		Property.put("Accept-Language", "vi-VN,vi;q=0.8,en-US;q=0.5,en;q=0.3");
		Property.put("Accept-Encoding", "gzip, deflate, br");
		Property.put("Connection", "keep-alive");
		HTTP.setRequestHeader(Property);
		return HTTP.GetHttp();
	}
	
	public String getJSonFollowersByUserBoard(HttpRequest HTTP,String keyword,String id,String pagesize,String bookmarks){
		HTTP.Connect("https://www.pinterest.com/resource/BoardFollowersResource/get/"
				+ "?source_url=/"+keyword+"/"
				+ "&data={\"options\":{"
					+ "\"board_id\":\""+id+"\","
					+ (!bookmarks.contains("null")?"\"bookmarks\":[\""+bookmarks+"\"],":"\"bookmarks\":"+bookmarks+",")
					+ "\"page_size\":"+pagesize+"},"
					+ "\"context\":{}}"
					+ "&_=1506351579318"
				);
		
		Property.put("Host", "www.pinterest.com");
		Property.put("User-Agent", USerAgent_FireFox);
		Property.put("Accept", "application/json, text/javascript, */*, q=0.01");
		Property.put("Accept-Language", "vi-VN,vi;q=0.8,en-US;q=0.5,en;q=0.3");
		Property.put("Accept-Encoding", "gzip, deflate, br");
		Property.put("X-Requested-With", "XMLHttpRequest");
		Property.put("X-APP-VERSION", "b98e4ae");
		Property.put("X-Pinterest-AppState", "active");
		Property.put("Pragma", "no-cache");
		Property.put("Cache-Control", "no-cache");
		Property.put("Connection", "keep-alive");
		HTTP.setRequestHeader(Property);
		return HTTP.GetHttp();		
	}

        public String getJSonFollowersByUser(HttpRequest HTTP,String keyword,String pagesize,String bookmarks){
		HTTP.Connect("https://www.pinterest.com/resource/UserFollowersResource/get/"
				+ "?source_url=/"+keyword+"/followers/"
				+ "&data={\"options\":{"
					+ "\"hide_find_friends_rep\":true,"
					+ "\"username\":\""+keyword+"\","
					+ (!bookmarks.contains("null")?"\"bookmarks\":[\""+bookmarks+"\"],":"\"bookmarks\":null,")
					+ "\"page_size\":"+pagesize+"},"
					+ "\"context\":{},"
					+ "\"module\":{}}"
					+ "&_=1506371792206"
				);
		
		Property.put("Host", "www.pinterest.com");
		Property.put("User-Agent", USerAgent_FireFox);
		Property.put("Accept", "application/json, text/javascript, */*, q=0.01");
		Property.put("Accept-Language", "vi-VN,vi;q=0.8,en-US;q=0.5,en;q=0.3");
		Property.put("Accept-Encoding", "gzip, deflate, br");
		Property.put("X-Requested-With", "XMLHttpRequest");
		Property.put("X-APP-VERSION", "b98e4ae");
		Property.put("X-Pinterest-AppState", "active");
		Property.put("Pragma", "no-cache");
		Property.put("Cache-Control", "no-cache");
		Property.put("Connection", "keep-alive");
		HTTP.setRequestHeader(Property);
		return HTTP.GetHttp();		
	}
}

