package com.amano.foodtruckchallenge.global;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hikaruamano
 * @date 2023/9/7
 */
@Configuration
public class MybatisPlusConfig {

    //声明【分页插件】的Bean对象，加入到容器中
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor mi = new MybatisPlusInterceptor();
        mi.addInnerInterceptor(new PaginationInnerInterceptor());

        return mi;
    }
}

