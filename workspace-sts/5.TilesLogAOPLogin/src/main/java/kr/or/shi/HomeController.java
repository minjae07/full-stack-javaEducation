package kr.or.shi;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/* @RequestMapping(value = "/main.do", method = RequestMethod.GET) */
	public String home(Locale locale, Model model) {

		
		return "main";			/* /main.do로 요청 시 컨트롤러에서는 <definition> 태그에서 설정한 뷰어를 main을 타일즈 뷰리졸버로 반환함. */
	}
	
}

















