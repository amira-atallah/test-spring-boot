package com.amira.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class StaffController {

    List<Staff> allStaff = Arrays.asList(
            new Staff("Amira", "amira@gmail.com", "01025437865", "Bakend", "20000"),
            new Staff("Smira", "smira@gmail.com", "010200437865", "frontend", "15000"),
            new Staff("Amir", "amir@gmail.com", "01025488865", "ui/ux", "28000")
    );

    @GetMapping("/listallstaff")
    public String listStaffDetails(Model model) {
        System.out.println("allStaff: " + allStaff);
        model.addAttribute("allStaff", allStaff);
        return "listallstaff"; // Return the name of the view as a string
    }
}
