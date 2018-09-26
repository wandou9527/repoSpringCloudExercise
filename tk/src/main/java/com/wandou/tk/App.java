package com.wandou.tk;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.TimeZone;

@ServletComponentScan //使用注解注册Servlet
@MapperScan("com.wandou.tk.mapper") //通过使用@MapperScan可以指定要扫描的Mapper类的包的路径
@EnableEurekaClient
@RestController
@SpringBootApplication
public class App {

    @Value("${foo}")
    String foo;

    @Value("${foo1}")
    String foo1;

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
        SpringApplication.run(App.class, args);
    }

    @RequestMapping(value = "/hi")
    public String hi() {
        return foo;
    }

    @RequestMapping(value = "/hi1")
    public String hi1() {
        String string = "str";
        String string1 = "wo 爱你商品成本";
        return foo1;
    }

//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(App.class);
//    }
//
//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSource dataSource() {
//        return new DruidDataSource();
//    }
//
//    @Bean
//    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSource());
//        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
////        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mybatis/*.xml"));
//        // 加载全局的配置文件
////        sqlSessionFactoryBean.setConfigLocation(new DefaultResourceLoader().getResource("classpath:mybatis-config.xml"));
//        return sqlSessionFactoryBean.getObject();
//    }


}
