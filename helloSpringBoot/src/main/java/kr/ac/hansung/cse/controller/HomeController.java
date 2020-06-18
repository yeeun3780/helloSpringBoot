package kr.ac.hansung.cse.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	static Logger logger = LoggerFactory.getLogger(HomeController.class);
		
		// @GetMapping is a composed annotation that acts as a shortcut for
		// @RequestMapping(value="/", method = RequestMethod.GET).
		@GetMapping("/") //단축(root로 mapping)
		public String home(Model model) {
	
			logger.info("Info: Calling home( )" ); //logging 레벨이 info보다 같거나 높지 않으면 출력x
			logger.debug("Debug: Calling home( )" );
			logger.trace("trace: Calling home( )" );
			
			model.addAttribute("message", "hello world"); //root로 들어오면 메세지 출력
			
			return "index";//index.html로 넘기기(jsp 안씀!)
	
		}	
	
}
