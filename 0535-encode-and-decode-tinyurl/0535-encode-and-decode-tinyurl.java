public class Codec {
    HashMap<String , String>map=new HashMap<>();
    String str="0";
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        map.put(str,longUrl);
        String ans=str;
        int num=str.charAt(str.length()-1)-'0';
        if(num==9){
            num=0;
        }else{
            num++;
        }
        str=str+num;
        return ans;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));