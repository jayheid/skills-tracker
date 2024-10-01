package org.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    // Response at localhost:8080
    @GetMapping
    @ResponseBody
    public String skillTrackerHome(){
        return
            "<html>" +
            "<body>" +
                    "<h1>Skills Tracker</h1>" +
                    "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                    "<ol>" +
                        "<li>Java</li>" +
                        "<li>JavaScript</li>" +
                        "<li>Python</li>" +
                    "</ol>" +
            "</body>" +
            "</html>";
    }

    // Response at localhost:8080/form
    @GetMapping("form")
    @ResponseBody
    public String skillTrackerForm(){
        return
                "<html>" +
                    "<body>" +
                        "<form action='home' method = 'post'>" +
                            "<label> Name: </label>" +
                            "<br>" +
                            "<input type = 'text' name = 'name'>" +
                            "<br>" +
                            "<label> My Favorite Language: </label>" +
                            "<br>" +
                            "<select name= 'firstLanguage'>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='JavaScript'>JavaScript</option>" +
                                "<option value='Python'>Python</option>" +
                            "</select>" +
                            "<br>" +
                            "<label> My Second Favorite Language: </label>" +
                            "<br>" +
                            "<select name= 'secondLanguage'>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='JavaScript'>JavaScript</option>" +
                                "<option value='Python'>Python</option>" +
                            "</select>" +
                            "<br>" +
                            "<label> My Third Favorite Language: </label>" +
                            "<br>" +
                            "<select name= 'thirdLanguage'>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='JavaScript'>JavaScript</option>" +
                                "<option value='Python'>Python</option>" +
                            "</select>" +
                            "<br>" +
                            "<input type = 'submit' value = 'Submit' >" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }

    // Posting Response from Form and Modifying HTML
    @PostMapping(value="home")
    @ResponseBody
    public String skillTrackerPostForm(@RequestParam String name,
                                       @RequestParam String firstLanguage,
                                       @RequestParam String secondLanguage,
                                       @RequestParam String thirdLanguage){
        return
                "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<table>" +
                    "<thead>" +
                    "<tr>" +
                    "<th> Order </th>" +
                    "<th> Language </th>" +
                    "</thead>" +
                "<tbody>" +
                    "<tr>" +
                        "<td> 1 </td>" +
                        "<td>" + firstLanguage + "</td>" +
                    "</tr>" +
                    "<tr>" +
                        "<td> 2 </td>" +
                        "<td>" + secondLanguage + "</td>" +
                    "</tr>" +
                    "<tr>" +
                        "<td> 3 </td>" +
                        "<td>" + thirdLanguage + "</td>" +
                    "</tr>" +
                "</tbody>" +
                "</table>" +
                "</body>" +
                "</html>";
    }
}
