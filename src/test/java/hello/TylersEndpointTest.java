package hello;

import static org.hamcrest.CoreMatchers.containsString;

import java.net.URI;

import com.google.gson.Gson;
import org.codehaus.groovy.tools.groovydoc.Main;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URI;
import java.util.Date;

import static org.hamcrest.CoreMatchers.containsString;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TylersEndpointTest {

    private TestRestTemplate template = new TestRestTemplate();


    @Test
    public void addTodo() throws Exception {
        Gson gson = new Gson();

        String expected = "Atlanta";

        ResponseEntity<String> response = template.getForEntity("tyler's ip/endpoint", String.class);
        JSONAssert.assertEquals(expected, response.getBody(), false);


    }

}
