package cz.csob.cc.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cz.csob.cc.demo.businessobject.Students;
import cz.csob.cc.demo.service.SomeService;

@Service
public class SomeServiceImpl implements SomeService {

	public List<Students> getAllStudents() {
		List<Students> pupils = new ArrayList<>();
		
		Students student1 = new Students();
		student1.setName("Radek Fajfr");
		student1.setAge(35);
		pupils.add(student1);
		
		Students student2 = new Students();
		student2.setName("Petr Kryl");
		student2.setAge(23);
		pupils.add(student2);
		
		
		Students student3 = new Students();
		student3.setName("Adam Kryl");
		student3.setAge(35);
		pupils.add(student3);
		
		return pupils;
	}


}
