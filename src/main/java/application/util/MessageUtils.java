package application.util;


import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MessageUtils {

    public Map<String, String> getMessage(String message) {
        Map<String, String> result = new HashMap<>();
        if (message.equals("update_success")) {
            result.put("message", "Update Success");
            result.put("alert", "success");
        } else if (message.equals("insert_success")) {
            result.put("message", "Insert Success");
            result.put("alert", "success");
        } else if (message.equals("error_system")) {
            result.put("message", "error system");
            result.put("alert", "danger");
        }
        return result;
    }
}