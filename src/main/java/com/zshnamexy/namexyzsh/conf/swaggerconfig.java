package com.zshnamexy.namexyzsh.conf;

import io.swagger.models.Contact;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

public class swaggerconfig {
    private boolean swaggerShow = true;
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(swaggerShow)
                .groupName("demo.controller(groupName)")
                //.globalOperationParameters(getTocken())
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zshnamexy.namexyzsh.contaller"))
                .paths(PathSelectors.any())
                .build();
    }

    // 可以为多个包添加接口说明。（@Bean的方法名是任意的）
    // 实际开发中，groupName与RequestHandlerSelectors.basePackage应一一对应。（本处为简洁用了同一个）
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger的Demo（title）")
                .description("Swagger的Demo（description）")
                //下边这行可以直接注释掉
                //.termsOfServiceUrl("https://blog.csdn.net/feiying0canglang/")
                .contact("")
                .version("Swagger的Demo（version）")
                .build();
    }


}
