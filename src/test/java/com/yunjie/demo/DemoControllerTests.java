package com.yunjie.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoControllerTests extends BaseTest {

//    @Test
    public void testHealth() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/health");
        System.out.println("result:" + mockMvc.perform(request).andReturn().getResponse().getContentAsString());
        mockMvc.perform(request).andExpect(status().isOk()).andExpect(content().string("health"));
    }

    @Test
    public void testPostDemo() throws Exception {
        String content = "{\"name\":\"张三\", \"age\":\"25\"}";
        RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/post/demo").contentType(MediaType.APPLICATION_JSON_UTF8).content(content);
        System.out.println("post result:" + mockMvc.perform(requestBuilder).andReturn().getResponse().getContentAsString());
    }

}
