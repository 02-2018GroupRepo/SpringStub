package hello;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import passengerSide.Application;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TylersEndpointTest {

    private TestRestTemplate template = new TestRestTemplate();

    @Test
    public void addTodo() throws Exception {

        String expected = "Boston";

        ResponseEntity<String> response = template.getForEntity("http://192.168.88.26:8080/atlanta", String.class);
        Assert.assertEquals(expected, response.getBody());
    }
}
