# Ribbon是什么  
Ribbon是一个负载均衡的工具，提供各种负载均衡算法  
Srping Cloud Ribbon 是基于Netflix Ribbon实现的一套客户端负载均衡的工具。  
SpringCloud Ribbon 和 Netflix Ribbon的区别？   (Netflix Ribbon就是SpringCloud Ribbon？  SpringCloud用了Netflix的ribbon组件？)  
### 负载均衡（Load Balance）是什么
将用户的满求平滩的分配到多个务上，从而达到系统的高可用  
LB主要分成两种方式  
**集中式LB**  
在消费者和提供者之间使用的设施（可以是硬件--F5\也可以是软件--nginx）  
nginx是客户端所有请求统一交给nginx，由nginx进行实现负载均衡请求转发，属于服务器端负载均衡。既请求有nginx服务器端进行转发。  
**进程内LB**  
消费方从服务注册中心获知有哪些地址可用，然后自己再从这些地址中选择一个合适的服务器。  
进程内负载均衡就是从一个实例库选取一个实例进行流量导入，在微服务的范畴内，实例库一般是存储在Eureka,Consul,Zookeeper,etcd这样的注册中心  
***Ribbon就属于进程内LB***   
Ribbon是在客户端实现负载均衡。  
# 为什么使用Ribbon(Ribbon能干嘛、Ribbon的优点)  
* 实现负载均衡，达到系统的高可用
* 提供了多种负载均衡策略，可以自定义负载均衡算法  
# Ribbon怎么使用  
pom文件ribbon的依赖
```
 <dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-ribbon</artifactId>
 </dependency>
```  
配置文件  
```
eureka:
  client:
    serviceUrl:
      defaultZone: http://localhost:8761/eureka/
spring:
  application:
    name: product-view-service-ribbon
```  
服务提供者只需要启动多个服务实例并注册到注册中心   
服务消费者直接通过调用被@LoadBalanced注解修饰过的RestTemplate来实现面向服务的接口调用   
```java
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
```  
```java
    @Autowired
    RestTemplate restTemplate;
    
    public List<Product> listProdcuts() {
        return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/products",List.class);
    }
```
上面是GET方式的getForObject    
### 在RestTemplate中   
##### GET请求  
***第一种：getForEntity函数。***  
返回的是ResponseEntity，除了需要的具体信息还返回了HTTP的几个元素，如状态码，HTTP请求的头信息对象HttpHeaders。。。  
**getForEntity(String url, Class responseType，Object... urlVariables)；**
url为请求的地址  
responseType为请求响应体body的包装类型  
urlVariables为url中的参数绑定  
ex:getForEntity("http://USER-SERVICE/user?name={1}", String.class, "didi")  
**getForEntity(String url, Class responseType, Map urlVariables);**
url为请求的地址  
responseType为请求响应体body的包装类型  
使用该方法进行参数绑定时需要再占位符中指定Map中的参数的key值   
**getForEntity(URI url, Class responseType)；**
uri对象来代替之前url和urlVariables参数来指定访问地址和参数绑定  
responseType为请求响应体body的包装类型  
***第二种：getForObject函数。***  
对getForEntity的进一步封装  
少一个从Response中获取body的步骤   
**getForObject(String url, Class responseType, Object ... urlVariables)**  
**getForObject(String url, Class responseType, Map urlVariables)**  
**getForObject(URI url, Class responseType)**  
##### POST请求  
***第一种：postForEntity函数。***  
该方法同GET请求中的getForEntity类似，会在调用后返回ResponseEntity对象  
**postForEntity(String url, Object request, Class responseType, Object... uriVariables)**  
**postForEntity(String url, Object request, Class responseType, Map uriVariables)**   
**postForEntity(URI url, Object request, Class responseType)**    
***第二种：postForObject函数。***  
简化postForEntity的后续处理。通过直接将请求响应的body内容包装成对象来返回使用  
**postForObject(String url, Class responseType, Object ... urlVariables)**  
**postForObject(String url, Class responseType, Map urlVariables)**  
**postForObject(URI url, Class responseType)**  
***第三种：postForObject函数。***  
postForLocation函数会返回新资源的URI，该URI就相当于指定了返回类型  
所以此方法实现的POST请求不需要像postForEntity和postForObject那样指定responseType  
**postForLocation(String url, Object request, Object... uriVariables)**  
**postForLocation(String url, Object request, Map uriVariables)**  
**postForLocation(URI url, Object request)**  
# 微服务之间互相调用  
**ribbon+restTemplate**  
RestTemplate是Spring Web模块提供的一个基于Rest规范提供Http请求的工具。  
Ribbon是springcloud中客户端负载均衡的组件。  
在程序的IOC容器中注入一个RestTemplate的bean，并在这个bean上加上@LoadBalanced注解，此时RestTemplate就结合Ribbon开启了负载均衡功能  
通过RestTemplate发送RPC请求，然后通过Ribbon做客户端负载均衡  
### RPC
RPC（Remote Procedure Call）－－远程过程调用,可以实现客户端像调用本地服务(方法)一样调用服务器的服务(方法)  
**客户端调用远程服务**
1.客户端client发起服务调用请求。
2.client stub 可以理解成一个代理，会将调用方法、参数按照一定格式进行封装，通过服务提供的地址，发起网络请求。
3.消息通过网络传输到服务端。
4.server stub接受来自socket的消息
5.server stub将消息进行解包、告诉服务端调用的哪个服务，参数是什么
6.结果返回给server stub。
7.sever stub把结果进行打包交给socket
8.socket通过网络传输消息
9.client slub 从socket拿到消息。
10.client stub解包消息将结果返回给client。 
我理解的就是2~9就是远程调用      rpc  











