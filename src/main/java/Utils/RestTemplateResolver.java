package Utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Configuration
public class RestTemplateResolver implements Serializable {

    @Bean
    public RestTemplate qiitaItemsRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        MappingJacksonHttpMessageConverter messageConverter = new MappingJacksonHttpMessageConverter();
        List<MediaType> supportedMediaTypes = new ArrayList<>(messageConverter.getSupportedMediaTypes());
        supportedMediaTypes.add(MediaType.TEXT_PLAIN); // text/plainのJacksonの処理対象にくわえる
        messageConverter.setSupportedMediaTypes(supportedMediaTypes);
        restTemplate.setMessageConverters(Collections.singletonList(messageConverter)); // カスタムしたHttpMessageConverterを適用
        return restTemplate;
    }
}
