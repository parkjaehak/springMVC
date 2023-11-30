package hello.springmvc.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {

    // 1. ModelAndView로 반환
    @RequestMapping("/response-view-v1")
    public ModelAndView responseView1(){
        ModelAndView mav = new ModelAndView("response/hello")
                .addObject("data", "hello!");

        return mav;
    }

    // 2. view 반환, model은 parameter전달
    @RequestMapping("/response-view-v2")
    public String responseView2(Model model){
        model.addAttribute("data","hello!");

        return "response/hello";
    }

    // 3. mapping 정보로 자동인식 ( 추천 X)
    @RequestMapping("/response/hello")
    public void responseView3(Model model){
        model.addAttribute("data","hello!");

    }

}


