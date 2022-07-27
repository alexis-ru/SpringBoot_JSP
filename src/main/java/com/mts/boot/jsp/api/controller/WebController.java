package com.mts.boot.jsp.api.controller;

import com.mts.boot.jsp.api.entity.Flower;
import com.mts.boot.jsp.api.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class WebController {

    private FlowerService flowerService;
    private Flower flower;

    @Autowired
    public void FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

//    @GetMapping("/")
//    public String home1() {
//        return "/home";
//    }
//
//    @GetMapping("/home")
//    public String home() {
//        return "/home";
//    }

    @RequestMapping(value ="/index", method = RequestMethod.GET)
    public String showAllEmployees(Model model) {
        List<Flower> allFlower = flowerService.getAllFlowers();
        model.addAttribute("allflow", allFlower);
        return "/view_for_clmanager";
    }

//    @RequestMapping("/addnewflower")
//    public String addNewFlower(Model model){
//        Flower flower = new Flower();
//        model.addAttribute("flower", flower);
//        return "flower-info";
//    }
//
//    @RequestMapping("/saveflower")
//    public String saveFlower(@ModelAttribute("flower") Flower flower){
//        flowerService.saveFlower(flower);
//        return "redirect:/admin";
//    }
//
//    @RequestMapping("/updateinfo")
//    public String updateFlower(@RequestParam("FlowId") int id, Model model){
//        Flower flower = flowerService.getFlower(id);
//        model.addAttribute("flower", flower);
//        return "flower-info";
//    }
//
//    @RequestMapping("/deleteflower")
//    public String deleteFlower(@RequestParam("flowId") int id){
//        flowerService.deleteFlower(id);
//        return "redirect:/admin";
//    }






    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String getFlowers(Model model) {
        List<Flower> flowers = flowerService.getAllFlowers();
        model.addAttribute("flowers", flowers);
        return "admin";
    }

    @RequestMapping("/adminz")
    public String handleRequest(Model model) {
        List<Flower> flowers = flowerService.getAllFlowers();
        model.addAttribute("flowers", flowers);
        return "adminz";
    }

    @RequestMapping("/view")
    public String AllFlowers(Model model){
        List<Flower> allFlowers = flowerService.getAllFlowers();
        model.addAttribute("allflowers", allFlowers);
        return "view_flowers";
    }

    @GetMapping("/user2")
    public String ListExample(Model model) {
//        List<Flower> listFlowers = new ArrayList<Flower>();
//        model.addAttribute("flowers", flower);
        List<Flower> allFlower = flowerService.getAllFlowers();
        model.addAttribute("ListFlower", allFlower);
        return "user2";
    }






    @GetMapping("/user")
    public String user() {
        return "/user";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }

    @GetMapping("/403")
    public String error403() {
        return "/403";
    }

}
