package com.example.gaspriceapi;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import static org.assertj.core.api.BDDAssumptions.given;


@RunWith(SpringRunner.class)
@WebMvcTest(GasPriceController.class)
class GaspriceApiApplicationTests {


    @Autowired
    private MockMvc mvc;

    @MockBean
    private RestService service;


    @Test
    public void getStatus() throws Exception {

        given(service.getPostsPlainJSON());

        mvc.perform(get("/gasprice")
                        .contentType(APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}

