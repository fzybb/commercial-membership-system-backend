package net.fzy.fitness;

import io.jsonwebtoken.Claims;
import net.fzy.fitness.model.entity.User;
import net.fzy.fitness.utils.JWTUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FitnessApplicationTests {

	@Test
	public void testGeneJwt(){

		User user = new User();
		user.setId(66);
		user.setName("fzy");
		user.setHeadImg("png");

		String token = JWTUtils.geneJsonWebToken(user);

		System.out.println(token);

		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Claims claims = JWTUtils.checkJWT(token);


		System.out.println(claims.get("name"));

	}




}
