package fc.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class NickName {

	public static void main(String[] args) {
        Optional<String> nickOptional  = getNickName("Duke");
        String nickName = "Openhome Reader";
        if(nickOptional.isPresent()) {
            nickName = nickOptional.get();
        }
        System.out.println(nickName);
	}
	
    static Optional<String> getNickName(String name) {
        Map<String, String> nickNames = new HashMap<>(); // 假裝的鍵值資料庫
        nickNames.put("Justin", "caterpillar");
        nickNames.put("Monica", "momor");
        nickNames.put("Irene", "hamimi");
        
        //return nickNames.get(name); // 鍵不存在時會傳回null
       
        return Optional.ofNullable(nickNames.get(name));
    }
}
