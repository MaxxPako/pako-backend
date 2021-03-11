package pako.soft;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TestIT {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getsAllTests() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/tests")
                        .accept(MediaType.APPLICATION_JSON)
        ).andExpect(status().isOk()).andReturn();
    }
}
