package com.kled.Hotel_Diploma_Teach.controller;

import com.kled.Hotel_Diploma_Teach.entity.Page;
import com.kled.Hotel_Diploma_Teach.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class PageController {

    @Autowired
    private PageService pageService;

    public PageController(PageService pageService) {
        this.pageService = pageService;
    }
    @GetMapping("/")
    public String List(Model model){
        List<Page> pages = pageService.findAll();
        model.addAttribute("pages",pages);
        return "page";
    }
    @GetMapping("/add")
    public String add(@ModelAttribute Page page) {
        return "add";
    }
    @PostMapping("/add")
    public String add(Page page, BindingResult bindingResult){
        pageService.save(page);
        return "redirect:/";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model){
        Page page = pageService.findById(id);
        model.addAttribute("pages", page);
        return "edit";
    }
    @PostMapping("/edit")
    public String edit(Page page){
        pageService.save(page);
        return "redirect:/";
    }
    @GetMapping("delete/{id}")
    public  String delete(@PathVariable int id){
        pageService.deleteById(id);
        return "redirect:/";
    }

}
