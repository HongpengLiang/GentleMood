package hongpeng.gentlemood;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hongpeng.liang
 */

@SpringBootApplication
@MapperScan("hongpeng.gentlemood.mapper")
public class GentlemoodApplication {

	public static void main(String[] args) {
		SpringApplication.run(GentlemoodApplication.class, args);
	}

}
