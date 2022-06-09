package com.example.fxjavaProject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;


@WebMvcTest
public class FxControllerIntegrationTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    SortPriceFeedService sortPriceFeedService;
    PriceRepository repository;


//    @Test
//    public void shouldGetPriceFeed() throws Exception {
//        when(sortPriceFeedService
//                .sortPriceFeed(repository.findAll()))
//                .thenReturn();
//                mockMvc.perform(get("/FX"))
//                        .andDo(print())
//                .andExpect(status().isOk());
//    }
}
