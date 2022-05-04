package com.uuu.demo1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(controllers=RootController.class)
public class SpringTest3 {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void isNotNull() {
        assertThat(mockMvc).isNotNull();
    }
    @Test
    public void testRootDirectory() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("home"))
                .andExpect(content().string(containsString("FET")));
    }
    @Test
    public void testHomeDirectory() throws Exception {
        mockMvc.perform(get("/home"))
                .andExpect(status().isNotFound());
    }
}
