package main.teste;

import java.util.HashMap;
import java.util.Map;

public class SandBox {
	
	public static void main(String[] args) {
		
		Map<Integer, Integer> retor =  CriaMap();
		System.out.println(retor.get(1));
		
	}
	
	public static Map<Integer, Integer> CriaMap(){
		
		Map<Integer, Integer> map2 = new HashMap<>();
		
		map2.put(1, 10);
		
		return map2;
	}
	
	
}
