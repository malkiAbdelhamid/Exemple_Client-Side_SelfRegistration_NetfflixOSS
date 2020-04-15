package com.esi.webclient.controller;

import com.esi.webclient.proxy.FormationProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class webController {

    @Autowired
    FormationProxy formationProxy;

    @RequestMapping("/formation")

    public String getFormation(Model model)
    {
        model.addAttribute("formations", new ArrayList<>(formationProxy.getFormations().getContent()));

        return "FormationView";
    }
}

