import Controller.RequestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@Component
public class Main {

    @Autowired
    private static RequestController requestController;

    private static RestTemplate restTemplate = new RestTemplate();

    private static String str = new RequestController().getAllItems();

    @Autowired
    public Main(RequestController controller) {
        Main.requestController = controller;
    }

    public static void main(String[] args){
        System.out.println(requestController.getAllItems());
    }
}
