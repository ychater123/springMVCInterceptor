package org.o7planning.springmvcinterceptor.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class MainController {
 
   @RequestMapping(value = { "/", "/test" })
   public String test(Model model) {
 
       System.out.println("\n-------- MainController.test --- ");
 
       System.out.println(" ** You are in Controller : / or /test ** ");
 
       return "test";
   }
 
   // This path is no longer used.
   // It will be redirected by OldLoginInterceptor or
   @Deprecated
   @RequestMapping(value = { "/admin/oldLogin" })
   public String oldLogin(Model model) {
       // Code here never run.
       return "oldLogin";
   }
 
   @RequestMapping(value = { "/admin/login" })
   public String login(Model model) {
 
       System.out.println("\n-------- MainController.login --- ");
 
       System.out.println(" ** You are in Controller : /admin/login ** ");
 
       return "login";
   }
 
}