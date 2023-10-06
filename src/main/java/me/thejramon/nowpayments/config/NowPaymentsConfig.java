package me.thejramon.nowpayments.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnMissingBean(type = "org.springframework.data.mongodb.MongoDbFactory")
public class NowPaymentsConfig {

    /**
     * Conditional
     * The @Conditional annotation indicates that a component is only registered into the application context when all the specified conditions match.
     * If a @Configuration class is marked with @Conditional, all of the @Bean methods, @Import annotations, and @ComponentScan annotations associated with that class will be subject to the conditions.
     * Spring provides plenty of conditional annotations out-of-the-box,
     * Including @ConditionalOnClass, @ConditionalOnMissingBean, @ConditionalOnBean, @ConditionalOnProperty, @ConditionalOnNotWebApplication, and @ConditionalOnExpression.
     */

    @Bean
    @ConditionalOnMissingBean(OkHttpClient.class)
    public OkHttpClient httpClient() {
        return new OkHttpClient().newBuilder().build();
    }


    @Bean
    @ConditionalOnMissingBean(ObjectMapper.class)
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

}
