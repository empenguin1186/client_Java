package Service;

import Model.Items;
import Utils.RestTemplateResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Service;

@Component
public class RequestService {

//    @Autowired
//    @Qualifier("qiitaItemsRestTemplate")
//    RestTemplate restTemplate;

    @Autowired
    @Qualifier("qiitaItemsRestTemplate")
    RestTemplate restTemplate;

    public String getQiitaAllItems() {

        Items sample = restTemplate.getForObject("https://qiita.com/api/v2/items", Items.class);
        return sample.getItems().get(0).getUrl();
    }

}
