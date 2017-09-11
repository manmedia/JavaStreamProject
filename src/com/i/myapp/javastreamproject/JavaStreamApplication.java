package com.i.myapp.javastreamproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaStreamApplication {

	
	public static void main (String[] args) {
		
		
		List<String> x = new ArrayList();
		
		x.add("Red");
		x.add("Green");
		x.add("Blue");
		x.add("Yello");
		x.add("Pinapple");
		x.add("Watermelon");
		x.add("Satsuma");
		
		System.out.println(x.toString());
//		/Map<Boolean, List<String>> _x = x.stream().collect(Collectors.groupingBy(String::valueOf));
		
		System.out.println(_x.toString());
		
	}
}
