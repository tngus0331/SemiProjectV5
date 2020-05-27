package siestageek.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {

    // 목록보기
    @RequestMapping(value = "/board/list")
    public ModelAndView list() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("layout/layout"); // 뷰이름 지정

        mv.addObject("action", "../board/list.jsp");

        return mv;
    }

    // 새글쓰기
    @RequestMapping(value = "/board/write")
    public ModelAndView write() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("layout/layout"); // 뷰이름 지정

        mv.addObject("action", "../board/write.jsp");

        return mv;
    }

    // 새글쓰기
    @RequestMapping(value = "/board/write", method = RequestMethod.POST)
    public String writeok() {

        return "redirect:/board/list";
    }

    // 본문보기
    @RequestMapping(value = "/board/view")
    public ModelAndView view() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("layout/layout"); // 뷰이름 지정

        mv.addObject("action", "../board/view.jsp");

        return mv;
    }

    // 수정하기
    @RequestMapping(value = "/board/update")
    public ModelAndView update() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("layout/layout"); // 뷰이름 지정

        mv.addObject("action", "../board/modify.jsp");

        return mv;
    }

    // 삭제하기
    @RequestMapping(value = "/board/delete")
    public String delete() {

        return "redirect:/board/list";
    }

}
