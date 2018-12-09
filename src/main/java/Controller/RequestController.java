package Controller;

import Service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RequestController {

    @Autowired
    public RequestService requestService;

    public String getAllItems() {
        return requestService.getQiitaAllItems();
    }

}
