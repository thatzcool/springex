package net.ict.springex.controller;

import lombok.extern.log4j.Log4j2;
import net.ict.springex.dto.TodoDTO;
import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/todo")
@Log4j2
public class TodoController {
        @RequestMapping("/list")      //     최종경로는 /todo/list
        public void list(Model model){
                       log.info("todo list............");
            }


        @RequestMapping(value = "/register", method = RequestMethod.GET)
        public void register(){
            log.info("todo register...........");
        }

        //todo/register 를 POST방식 으로 처리하는 메소드 TodoDTO 를 파라미터로 적용
        @PostMapping("/register")
        public String registerPost(TodoDTO todoDTO, RedirectAttributes redirectAttributes){
              log.info("POST todo register ...........");
              log.info(todoDTO);
              return  "redirect:/todo/list";

        }






}
