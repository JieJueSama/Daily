# Ribbon是什么  
Ribbon是一个负载均衡的工具，提供各种负载均衡算法  
Srping Cloud Ribbon 是基于Netflix Ribbon实现的一套客户端负载均衡的工具。  
SpringCloud Ribbon 和 Netflix Ribbon的区别？   (Netflix Ribbon就是SpringCloud Ribbon？  SpringCloud用了Netflix的ribbon组件？)  
### 负载均衡（Load Balance）是什么
将用户的满求平滩的分配到多个务上，从而达到系统的高可用  
LB主要分成两种方式  
**集中式LB**  
在消费者和服务者之间使用的设施（可以是硬件--F5\也可以是软件--nginx）  
nginx是客户端所有请求统一交给nginx，由nginx进行实现负载均衡请求转发，属于服务器端负载均衡。既请求有nginx服务器端进行转发。  
**进程内LB**  
消费方从服务注册中心获知有哪些地址可用，然后自己再从这些地址中选择一个合适的服务器。***Ribbon就属于进程内LB***   
Ribbon是在客户端实现负载均衡。  
# 为什么使用Ribbon(Ribbon能干嘛、Ribbon的优点)  
1. 实现负载均衡，达到系统的高可用
2. 提供了多种负载均衡策略，可以自定义负载均衡算法



