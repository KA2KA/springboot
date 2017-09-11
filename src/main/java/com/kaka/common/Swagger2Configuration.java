package com.kaka.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * api文档配置类
 * <p>
 * Created by Hem on 2017/6/30.
 */
@Configuration
@EnableSwagger2
public class Swagger2Configuration {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.kaka.web")).paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        ApiInfoBuilder docApi = new ApiInfoBuilder();
        docApi.title("Spring Boot中使用Swagger2构建RESTful APIs");
        docApi.description("更多Spring Boot相关文章请关注：http://blog.didispace.com/");
        docApi.termsOfServiceUrl("http://blog.didispace.com/");
        docApi.contact("切糕");
        docApi.version("1.0");
        return docApi.build();
    }
}