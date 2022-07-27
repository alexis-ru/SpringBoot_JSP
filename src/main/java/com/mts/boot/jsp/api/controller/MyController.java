package com.mts.boot.jsp.api.controller;

import com.mts.boot.jsp.api.entity.Client;
import com.mts.boot.jsp.api.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MyController {

    private final ClientService clientService;

    @Autowired
    public MyController(ClientService clientService) {
        this.clientService = clientService;
    }

    @RequestMapping("/")
    public String getInfoForAllClients(){
        return "login2";
    }

    @GetMapping("/allinfo")
    public String getInfo(){
        return "view_for_all_employees";
    }

    @RequestMapping(value = "/manager_info", method = RequestMethod.GET)
    public String getInfoOnlyForCM(Model model){
        List<Client> allClients = clientService.getAllClients();
        model.addAttribute("allclients", allClients);
        return "view_for_clmanager";
    }

    @RequestMapping("/addnewclient")
    public String addNewEmployee(Model model){
        Client client = new Client();
        model.addAttribute("client", client);
        return "employee-info";
    }

    @RequestMapping("/saveclient")
    public String saveClient(@ModelAttribute("client") Client client){
        clientService.saveClient(client);
        return "redirect:/";
    }

    @RequestMapping("/updateinfo")
    public String updateClient(@RequestParam("clsId") int id, Model model){
        Client client = clientService.getClient(id);
        model.addAttribute("client", client);
        return "employee-info";
    }

    @RequestMapping("/deleteclient")
    public String deleteClient(@RequestParam("clsId") int id) {
        clientService.deleteClient(id);
        return "redirect:/";
    }





    @GetMapping("/secuser_info")
    public String getInfoOnlyForSecUser(){
        return "view_for_secuser";
    }
}
