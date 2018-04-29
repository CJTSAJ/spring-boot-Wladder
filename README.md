# spring-boot-Wladder
## 关于该项目
- 该项目基于eclips(4.7.2），用spring-boot自动生成。其中去掉了原本的logging日志，改用log4j2。用junit测试了该项目的一个简单函数。
- 项目运行在默认的8080端口，在/ladder路径下调用wordladder程序，并且需要传入3个参数(filename word1 word2)。运行后的程序如图

 ![](http://imgsrc.baidu.com/forum/w%3D580/sign=a965fb59bc7eca80120539efa1229712/a50e530fd9f9d72a7b2d4d67d82a2834359bbbc5.jpg)
 
 ## 作业更新（为该项目添加授权认证（基于spring security））
 ### 项目依赖
 - 在原有项目基础上的pom.xml添加如下依赖
 
 
![](http://wx4.sinaimg.cn/mw690/006AMixJly1fqtcmjgwgwj30ge04xjrd.jpg)
 ### 写配置类
 - 新建配置类SecurityConfig，并且继承WebSecurityConfigureAdapter。重载两个配置函数
 
 
 ![](http://wx3.sinaimg.cn/mw690/006AMixJly1fqtcre5f32j30mt0gcwf6.jpg)
 
 
 - 函数public void configure(AuthenticationManagerBuilder auth)添加一个普通用户和一个管理员。为了方便，将用户信息直接设置在内存中，而没有去操作数据库
 
 - 函数protected void configure(HttpSecurity http) throws Exception "/ladder"添加验证
 
 ### 项目运行
 - 运行项目后，直接访问localhost:8080/ladder?filename=dictionary.txt&word1=some&word2=good会重定向到登录界面（如图）
 
 
 ![](http://wx1.sinaimg.cn/mw690/006AMixJly1fqtd0wzp0ej30lq084q2y.jpg)
 
 
 - 如果用户输入信息与已经设定好的用户密码不符，则继续重定向到登录界面，请求再次输入。
 
 - 当用户输入信息正确以后，页面重定向到localhost:8080/ladder?filename=dictionary.txt&word1=some&word2=good并输出结果
 
 
 ![](http://wx3.sinaimg.cn/mw690/006AMixJly1fqtd681po4j30rb0563yh.jpg)
 
 
