package fi.haagahelia.homework1basics.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fi.haagahelia.homework1basics.domain.Friend;

@Controller
public class CombinedController {

    private static List<Friend> friends = new ArrayList<>();

    @GetMapping("/")
    public String showMainPage(Model model) {
        if (friends.isEmpty()) {
            friends.add(new Friend("Minna", "Pellikka"));
            friends.add(new Friend("Tanja", "Bergius"));
            friends.add(new Friend("Jukka", "Juslin"));
        }
        model.addAttribute("friends", friends);
        model.addAttribute("friend", new Friend());
        return "main";
    }

    @PostMapping("/")
    public String addFriend(@ModelAttribute Friend friend) {
        friends.add(friend);
        return "redirect:/";
    }
}