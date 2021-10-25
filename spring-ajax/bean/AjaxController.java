package test.ajax.bean;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
// [ajax-spring-json]
// #1. 기본환경 컨트롤러 세팅  
//@Controller
@RestController
@RequestMapping("/ajax/")
public class AjaxController {

	/*#1. 
	@ResponseBody
	@RequestMapping("test.do")
	public String test() {
		return "하하하하";
	} // 브라우저에 http://localhost:8080/spring/ajax/test.do 요청 -> ???? 한글깨짐
	*/
	
	/*#5. 컨트롤러 매핑 추가(수정) 
	@ResponseBody
	@RequestMapping("test.do")
	public Map<String, Object> test() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "pika");
		map.put("age", 26);
		
		return map;
	}*/
	
	//#8. 
//	@RequestMapping("test.do")
//	public String test() {
//		return "ajax/test01";
//	}
	//@ResponseBody
	@RequestMapping("insert.do")
	public TestDTO test(@ModelAttribute("dto") TestDTO dto) {
		//TestDTO dto = abcService.insert(dto);
		return dto;
	}
	//@ResponseBody
	@RequestMapping("insert2.do")
	public TestDTO test2(@RequestBody TestDTO dto) {
		//TestDTO dto = abcService.insert(dto);
		return dto;
	}
	
	
	
	
	
}
