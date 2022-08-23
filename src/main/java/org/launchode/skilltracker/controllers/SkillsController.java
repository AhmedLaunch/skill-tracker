package org.launchode.skilltracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {
   @GetMapping("text")
   public String skillTracker(){
       return "<html>" +
               "<h1>" +
               "Skills Tracker" +
               "</h1>" +
               "<h2>" +
               "We have a few skills we would like to learn. Here is the list!" +
               "</h2>" +
               "<body>" +
               "<ol>1. Java</ol>" +
               "<ol>2. JavaScript</ol>" +
               "<ol>3. Python</ol>" +
               "</body>" +
               "</html>";

   }
   @GetMapping("form")
   public String formData(){
       return
               "<html>" +
                       "<body>" +
                       "<form method = 'post' action = '/form'>" +
                       "<br>"+
                       "\n<label>Name:<br><input type = 'text' name = \"name\" /></label>" +
                       "<br>"+
                       "<label>My Favorite language: <br><name = 'Fav:' /></label><select name=\"lang1\" id=\"lang1\">\n" +
                       "  <option value=\"java\">Java</option>\n" +
                       "  <option value=\"javascript\">JavaScript</option>\n" +
                       "  <option value=\"python\">Python</option>\n" +
                       "</select>\n" +
                       "<br>"+
                       "<label>My Second language: <br><name = 'Fav:' /></label><select name=\"lang2\" id=\"lang2\">\n" +
                       "  <option value=\"java\">Java</option>\n" +
                       "  <option value=\"javascript\">JavaScript</option>\n" +
                       "  <option value=\"python\">Python</option>\n" +
                       "</select>\n" +
                       "<br>"+

                       "<label>My Third language: <br><name = 'Fav:' /></label><select name=\"lang3\" id=\"lang3\">\n" +
                       "  <option value=\"java\">Java</option>\n" +
                       "  <option value=\"javascript\">JavaScript</option>\n" +
                       "  <option value=\"python\">Python</option>\n" +
                       "</select>\n" +
                       "\n<input type = 'submit' value = 'Submit' />" +
                       "</form>" +
                       "</body>" +
                       "</html>";

   }
   @PostMapping("form")
    public String forOutput(@RequestParam String name, @RequestParam String lang1, @RequestParam String lang2, @RequestParam String lang3){
   return "<html>" +
           "<h1>" + "Hello" + name + "</h1>" +
           "<ol>" +
           "<li>" + lang1 + "</li>" +
           "<li>" + lang2 + "</li>" +
           "<li>" + lang3 + "</li>" +
           "</ol>" +
           "</html>";

   }
}