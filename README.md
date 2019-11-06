2019년 11월 7일 첫시작.

## 설정
### RootConfig.java
`````java
@Configuration
@ComponentScan(basePackages = "kr.project.zalbazo",
        excludeFilters = @ComponentScan.Filter({
                Controller.class,
                RestController.class
        }))
@PropertySource(value = "classpath:application.properties")
@MapperScan(basePackages = "kr.project.zalbazo.mapper")
@EnableTransactionManagement
public class RootConfig { ... }
`````
- RootConfig은 xml 설정의 applicationContext.xml 역할을 합니다.
- @ComponentScan 으로 basePackages에 지정된 패키지 이하를 검색해 @Component 붙은 빈들을 등록시켜줍니다. 계층형 구조로 만들기 위해, @Controller,@RestController 어노테이션이 붙은 빈들은 excludeFilters를 이용해 빈등록에서 제외시켜줍니다.
- @PropertySource로는 디비정보 등과 같은 민감한 정보를 보호하기 위해, 따로 properties를 만들고, @Value로 주입시켜줍니다.
- @MapperScan은 마이바티스의 Mapper인터페이스를 검색하기 위해 설정합니다.
- @EnableTransactionManagement는 xml 기반의 설정에서 \<tx:annotation-driven\> 과 같은 역할을 합니다.


## ServletConfig.java
`````java
@EnableWebMvc
@ComponentScan(basePackages = "kr.project.zalbazo.controller")
public class ServletConfig implements WebMvcConfigurer {...}
`````
- xml설정에서 보통 servlet-context.xml로 쓰는 스프링컨텍스트의 역할과 같습니다.
- @EnableWebMvc를 사용하여 WebMvcConfigurationSupport 의 도움을 받습니다. 해당 클래스가 해주는 일은 문서를 통해 살펴보세요.
https://docs.spring.io/spring/docs/5.1.6.RELEASE/javadoc-api/org/springframework/web/servlet/config/annotation/WebMvcConfigurationSupport.html
- @ComponentScan(...) 을 이용해 controller 패키지 안에 있는 빈들을 등록시켜줍니다. 
    - 따라서 @Controller 빈들은 반드시 controller 패키지 안에 집어넣어야합니다. 그렇지않으면 빈으로 등록되지 않습니다.
- implements WebMvcConfigurer 를 이용해 @EbableWebMvc를 사용하여 자동구성된 스프링MVC 구성에 다른 설정을 추가할 수 있게끔 해줍니다.

## WebConfig.xml
`````java
public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {...}
`````
- web.xml 과 같은 역할을 합니다.