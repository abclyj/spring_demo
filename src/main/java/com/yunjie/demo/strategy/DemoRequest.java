package com.yunjie.demo.strategy;

import lombok.Builder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author yunjie
 * @date 17-12-19
 */
@Builder
public class DemoRequest {

    private String name;

    private Integer age;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }

}

