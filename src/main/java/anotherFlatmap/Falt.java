package anotherFlatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Falt {
	
public static void main(String[] args) {

	
	List<String>name=Arrays.asList("abhishek","lokendrea","sachin");
	List<String>phone=Arrays.asList("iphone","samsung","redmi");
	List<List<String>>phonename=Arrays.asList(name,phone);
	List<String> collect = phonename.stream().flatMap(p->p.stream()).collect(Collectors.toList());
	System.out.println(collect);
}
}
