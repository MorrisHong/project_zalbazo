package kr.project.zalbazo.controller;

import kr.project.zalbazo.config.RootConfig;
import kr.project.zalbazo.config.ServletConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class, ServletConfig.class})
@Slf4j
@WebAppConfiguration
public class SampleControllerTest {

    @Autowired
    private WebApplicationContext context;

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void testSampleView() throws Exception{
        mockMvc.perform(get("/sample/sampleview"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void testHomepage() throws Exception {
        mockMvc.perform(get("/"))
                .andDo(print())
                .andExpect(view().name("index"))
                .andExpect(handler().method(SampleController.class.getMethod("home")))
                .andExpect(status().isOk());
    }

    @Test
    public void testPostMemSuccess() throws Exception {
        mockMvc.perform(post("/loginProcess")
                    .param("username","govlmo91")
                    .param("password","1234")
                    .characterEncoding("UTF-8"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void testPostMemFail() throws Exception {
        mockMvc.perform(post("/loginProcess")
                    .param("username","govlmo91")
                    .param("password","123")
                    .characterEncoding("UTF-8"))
                .andDo(print())
                .andExpect(status().isBadRequest());
    }

}