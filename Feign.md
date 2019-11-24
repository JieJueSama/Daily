# Feign是什么   
Feign是一个声明式web服务客户端、Spring Cloud的Netflix中提供实现软负载均衡的组件  
# 为什么要使用Feign（Feign的优点、好处）  
因为Feign和ribbon都是用来实现负载均衡的组件，为什么要使用feign而不使用ribbon   
### Feign和Ribbon的区别:  
**1.启动类使用的注解不同**  
Ribbon用的是@RibbonClient，Feign用的是@EnableFeignClients。   
**2.服务的指定位置不同**   
Ribbon是在@RibbonClient注解上声明，Feign则是在定义抽象方法的接口中使用@FeignClient声明。  
**3.调用方式不同**    
Ribbon需要自己构建http请求，模拟http请求然后使用RestTemplate发送给其他服务，步骤相当繁琐。  
Feign则是在Ribbon的基础上进行了一次改进，采用接口的方式，将需要调用的其他服务的方法定义成抽象方法即可,不需要自己构建http请求。  
# Feign怎么用  
pom.xml依赖
```
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-openfeign</artifactId>
    </dependency>
```  
启动类添加 @EnableFeignClients 注解支持  表示开启Feign  
```java
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class EurekaCallClientApplication {
 
    public static void main(String[] args) {
        SpringApplication.run(EurekaCallClientApplication.class, args);
    }
}
```  
创建一个接口，并在接口中定义需要调用的服务和方法  
```java
@FeignClient(value = "PRODUCT-DATA-SERVICE")
public interface ProductClientFeign {
 
    @GetMapping("/products")
    public List<Product> listProdcuts();
}
```  
服务类，数据从 productClientFeign 中获取   
```java
@Service
public class ProductService {
    @Autowired ProductClientFeign productClientFeign;
    public List<Product> listProducts(){
        return productClientFeign.listProdcuts();
 
    }
}
```  


