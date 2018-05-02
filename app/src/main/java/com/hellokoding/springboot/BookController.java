package com.hellokoding.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {
    protected static Logger logger = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private BookRepository bookRepository;

    @PostMapping
    public String post(Book book) {
        if (logger.isInfoEnabled()) {
            logger.info(">>> post book: {}", CoreUtil.toJson(book));
        }

        this.bookRepository.save(book);
        return "redirect:/book";
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("list", this.bookRepository.findAllByOrderByBookIdDesc());
        return "/book/list";
    }
}
