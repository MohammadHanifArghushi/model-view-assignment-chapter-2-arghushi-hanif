package fi.haagahelia.homework1basics.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import fi.haagahelia.homework1basics.domain.Friend;

@Controller
public class FriendController {

    private static List<Friend> friends = new ArrayList<>();

    @GetMapping("/index")
    public String showFriendList(Model model) {

        if (friends.isEmpty()) {
            friends.add(new Friend("Minna", "Pellikka"));
            friends.add(new Friend("Tanja", "Bergius"));
            friends.add(new Friend("Jukka", "Juslin"));
        }

        model.addAttribute("friends", friends);
        return "friendlist";
    }
}