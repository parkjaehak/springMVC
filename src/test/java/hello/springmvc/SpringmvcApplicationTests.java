package hello.springmvc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class SpringmvcApplicationTests {

	@Autowired
	MockMvc mockMvc;
	@Test
	void contextLoads() {
	}

	@Test
	void test() throws Exception{
		mockMvc.perform(get("/mapping/userA"))
				.andExpect(status().isOk());
	}
}
