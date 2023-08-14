
package com.Tienda.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    
    @RequestMapping("/")
    public String page(Model model) {
        //Obtener usuario loggeado
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        
        UserDetails user = null;
        
        if (principal instanceof UserDetails){
            user = (UserDetails) principal;
        }
        
        return "index";
    }
    
}
