package pkg1.restapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeTableController1 {
	@GetMapping("/getTimeTable1")
	public List<String> getTimeTable() {
		List<String>list1=new ArrayList<>();
		list1.add(Physics);
		list1.add(Chemistry);
		list1.add(Maths);
		list1.add(Biology);
		return list1;
		
	}

}
