package sqltutorial.evms.controller;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VaccineTypeController {

	
	@GetMapping("/")
	public String index(Model model) {
		
		Map<String, String> vaccineTypeMap = new TreeMap<String, String>();
		vaccineTypeMap.put("COVID19", "COVID19 - It Typically Requires 2 Shots");
		vaccineTypeMap.put("FLU", "FLU - It Typically Requires 1 Shot");
		vaccineTypeMap.put("EBOLA", "EBOLA - It Typically Requires 2 Shots");
		
		model.addAttribute("vaccineTypeMap", vaccineTypeMap);
		
		return "index";
	}
}
