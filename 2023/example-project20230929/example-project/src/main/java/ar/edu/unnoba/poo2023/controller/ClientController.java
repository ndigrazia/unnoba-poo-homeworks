package ar.edu.unnoba.poo2023.controller;

import ar.edu.unnoba.poo2023.model.Client;
import ar.edu.unnoba.poo2023.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/new")
    public String newClient(Model model){
        model.addAttribute("client",new Client());
        return "clients/new";
    }

    @PostMapping
    public String create(@ModelAttribute Client client){
        clientService.create(client);
        return "redirect:/clients";
    }

    @GetMapping
    public String clients(Model model){
        model.addAttribute("clients",clientService.getClients());
        return "clients/index";
    }

    @GetMapping("/{taxID}")
    public String view(@PathVariable("taxID") String taxID,Model model){
        model.addAttribute("client",clientService.getClientByTaxID(taxID));
        return "clients/view";
    }

    @GetMapping("/{taxID}/edit")
    public String edit(@PathVariable("taxID") String taxID,Model model){
        model.addAttribute("client",clientService.getClientByTaxID(taxID));
        return "clients/edit";
    }

    @PostMapping("/{taxID}")
    public String update(@ModelAttribute Client client,@PathVariable("taxID") String taxID,Model model){
        //TODO
        return "redirect:/clients";
    }

    @GetMapping("/{taxID}/delete")
    public String view(@PathVariable("taxID") String taxID){
        //TODO
        return "redirect:/clients";
    }
}
