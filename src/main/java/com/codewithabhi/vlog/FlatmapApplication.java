package com.codewithabhi.vlog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;

@SpringBootApplication
public class FlatmapApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlatmapApplication.class, args);	
		
	List<State>name=new ArrayList<>();
	name.add(new State("MP",Arrays.asList("bhopal","indore")));
	name.add(new State("up",Arrays.asList("kanpur","muradabad")));
	
	List<List<String>> collect2 = name.stream().map(stat->stat.cityname).collect(Collectors.toList());
	System.out.println("useing map"+collect2);
	
	List<String> collect = name.stream().flatMap(state->state.cityname.stream()).collect(Collectors.toList());
	System.out.println("useing flatmap"+collect);
	System.out.println("useing flatmap"+collect);
	System.out.println("useing flatmap"+collect);
	System.out.println("useing flatmap"+collect);
	System.out.println("useing flatmap"+collect);
	System.out.println("useing flatmap"+collect);
	System.out.println("useing flatmap"+collect);
	System.out.println("useing flatmap"+collect);
	List<State> collect1 = name.stream().collect(Collectors.toList());
	System.out.println("only print collection"+collect1);	
	
	 collect.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
	
	List<String>alph=Arrays.asList("abhishek");
	List<String>alph1=Arrays.asList("rajpiut");
	
	List<String> collect3 = Stream.concat(alph.stream(),alph1.stream()).collect(Collectors.toList());
	
	System.out.println(collect3);
	}

}
