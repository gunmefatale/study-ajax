package test.ajax.bean;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/ajax2/")
public class AjaxController2 {
	@RequestMapping("test.do")
	public String test() {
		return "ajax/test01";
	}
}
