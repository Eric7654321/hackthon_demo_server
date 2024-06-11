package demo_makerthon.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping
@RestController
public class DDosController {

    private boolean permission = false;
    private int count = 0;

    @CrossOrigin(origins = "*")
    @GetMapping("/web-request")
    public String webRequest() {
        permission = true;
        count = 0; // Reset count when permission is granted
        return "Permission granted.";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/box-request")
    public String boxRequest() {
        if (permission) {
            count++;
            if (count >= 10) {
                permission = false; // Reset permission after 10 requests
                count = 0;
                return "Permission is false after 10 requests. No action required.";
            } else {
                return "Permission is true. Box should send photo.";
            }
        } else {
            return "Permission is false. No action required.";
        }
    }
}
/**
                        ⣿⣿⣿⠿⡿⠀⠀⠈⠙⣿⣿⡿⠁⠀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣷⣼⡇⢸⣟⣿⣿⣿⣿⣿⣿⣟⣵⣦⡀⠏⣿⡄⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢺
                        ⣿⣿⣇⣤⡇⠀⠀⠀⣴⣿⠿⠃⠀⣭⣿⣿⣿⣿⣿⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠋⠉⢸⣿⡟⣇⣾⡗⠀⠀⠀⠨⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸
                        ⣿⣿⡏⡏⡅⠀⢀⣴⣿⣿⣿⣿⠶⢿⣽⣿⣿⣿⣿⣿⣿⣿⡿⠿⠟⠋⠉⠉⠉⠉⠉⠉⠙⠛⠋⠳⣼⣽⣇⢿⡇⣿⡆⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⣿⣿⣷⣅⣷⠀⣼⣿⣿⣿⡿⣿⣯⣽⣿⣿⣿⣿⣿⠟⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⣿⣾⣿⣿⣧⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠀⠀⢿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠀⣿⡿⣿⡄⣻⣧⠠⠴⡇⢸⣿⡗⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⣿⣿⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀⠸⣿⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠘⣧⠹⣿⣿⡄⠀⠀⡇⢸⡛⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⣿⣿⣿⣿⣿⣿⡿⠟⠋⠀⠀⠀⠀⠀⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⡀⠀⠀⠀⠀⠸⠂⠘⣇⡀⠙⢿⡗⠀⠀⡷⢸⢱⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⣿⣿⣿⡿⣿⠏⠁⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⠇⢀⣤⡶⠶⢿⡿⠿⠿⢦⡀⠸⣾⣿⣿⡿⠿⠷⢶⣤⣄⠀⢻⣧⠀⡾⠁⠀⠀⡇⢸⢄⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠
                        ⣿⣿⡟⠇⠿⠉⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⠀⡟⠀⣡⣴⣶⣶⣧⠈⠁⠀⠀⠈⠙⠿⠾⠷⠶⣦⣄⣹⡆⠀⣿⣾⠇⠀⠀⠀⡟⢸⢀⠟⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⣀⠀⠿
                        ⣿⣿⡇⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⠀⠁⠀⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⡇⠀⣧⣟⣀⡀⠀⠀⣷⣀⣘⣧⣤⣤⣶⣶⣶⣿⣿⣿⣿⣿⡉⠉⠀⠀⠀
                        ⣿⣿⡇⠅⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡼⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠐⠀⠀⠐⣆⡀⠀⠀⠀⠀⠀⠀⠇⠀⣿⠙⢿⣽⣟⠋⠛⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠿⠿⠚⠉⠀
                        ⣿⣿⡇⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡟⠙⣷⠀⠀⠀⠀⠀⠀⠀⣠⡶⣶⣦⣷⣭⣿⡄⠀⠀⠀⠀⠀⡎⠀⢿⣇⢸⣷⡿⠶⢶⡶⢾⠛⠋⠙⠋⠉⣨⣿⣦⣽⢧⡀⠀⠀⠀⠀⠀
                        ⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣧⣼⠏⠀⠀⠀⠀⠀⠀⠀⠉⠛⠛⠋⠉⠁⠀⠙⠀⠀⠀⠀⠀⢿⠀⣨⠿⣿⠁⠀⣀⡞⠀⠘⣆⣠⠞⢀⣴⣿⣿⣿⣿⣿⣝⣇⠀⠀⠀⠀
                        ⣿⣿⡇⠋⠀⠀⣀⣀⣤⠤⠄⠀⠀⠀⠀⣿⢇⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⣽⡁⢀⡿⠀⠀⠈⢷⠀⢀⡟⠀⢀⣾⣿⣿⣿⠟⠻⣿⣿⣿⠳⣄⣀⢀
                        ⣿⣿⠇⣼⣿⣿⡿⣿⡻⣲⢶⠄⠀⠀⠀⣿⣿⣆⡠⠀⠀⠀⠀⠀⣴⣿⣿⣭⣭⣭⣿⣷⡦⠀⠀⠀⠀⠀⢠⢿⣿⣿⣦⣥⣄⡀⢸⣀⣤⣀⣴⣿⣿⣿⡟⠃⠀⠀⠈⠻⣿⣷⣈⠉⠉
                        ⣿⣿⠰⡇⠐⠈⠀⠋⣩⡽⣿⠀⠠⣄⠰⣿⣟⣿⠟⢧⠀⠀⠀⠀⠛⢿⣿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⢠⡾⡏⠀⠟⣿⣿⣿⣿⠛⢻⣿⣿⣿⡿⢻⠏⠀⠀⠀⠀⠀⠈⣿⣿⣿⣆⠀
                        ⣿⣿⢸⠇⠀⢴⣾⣿⣖⡯⣿⡇⠀⢮⠉⣿⣎⣋⣠⣾⡁⠀⠀⠀⠀⠀⠻⢤⣤⠞⡁⠀⠀⠀⠀⠀⢠⠿⣼⢿⡛⡄⢸⣿⣿⡿⠀⣿⣿⣿⣿⣿⣷⣶⠴⢶⣄⣀⣤⠌⠿⠛⠛⢻⡄
                        ⣿⡿⢸⠀⠀⠉⣻⣿⢵⣻⣿⠀⠀⣟⠷⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠲⣶⣶⡞⠃⠀⠀⠀⠀⠀⠀⠀⢻⡊⢳⣶⡛⠿⠿⣷⡤⣾⣿⣿⣿⠏⠉⠉⠠⣤⡌⠉⠀⠀⠀⠀⠀⠀⠱
                        ⣿⡇⣿⠀⠰⣿⣿⣿⡽⣾⣿⠀⠰⢯⣠⣿⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡇⢸⣿⣿⣦⣄⠈⣧⢘⣿⣿⡇⠀⢀⣀⣤⣤⡤⠀⠀⠀⠀⠀⠀⠀⠀
                        ⣿⣿⣿⠀⢈⣺⣿⣿⣯⣿⡇⠀⢘⠳⣿⣿⣿⣿⣿⠿⠍⠿⣿⠀⠘⠲⣤⣄⣀⣀⣀⣀⣠⠾⠃⠀⠀⢀⡞⠀⣾⣿⣿⣿⣿⣷⣝⣃⡿⢿⠇⠀⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⣿⣿⣿⠀⣸⣿⣿⣿⣺⢽⠇⠀⢨⣹⣿⣿⣿⣿⣯⣠⣤⣴⢛⡇⠀⠀⠈⠙⢿⣿⠟⠉⠀⠀⠀⠀⣠⠟⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣶⣶⣶⣤⣤⣤⣀⣀⠀⠀⠀
                        ⣿⣿⣿⠁⣽⢟⣿⡟⠋⠛⠀⠀⠓⢬⣿⣿⣿⣿⡏⠀⡼⠁⣼⡇⠀⠀⠀⠀⠀⢶⡄⠀⠀⠀⢀⡴⠃⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶
                        ⣿⣿⣿⠁⣤⣿⣿⣷⡶⣶⣤⣄⣀⣸⣾⣿⣿⣿⡇⢸⠇⠀⣿⡇⠀⠀⠀⠀⠀⠙⠟⠀⢀⡴⠋⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                        ⣿⣿⣿⡖⠸⢿⡍⣼⣹⡟⡉⠹⡍⠁⢸⣿⣿⣿⣷⣿⠀⠀⢿⣷⠀⠀⠀⠀⠀⠀⢈⣷⠟⠁⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                        ⣿⣿⣿⡇⠁⠈⡟⠿⢻⠘⠶⠄⡇⠀⢸⣿⣿⣿⣿⣿⠀⠀⠀⡻⣦⠀⠀⠀⢀⣴⠿⠋⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿*/
