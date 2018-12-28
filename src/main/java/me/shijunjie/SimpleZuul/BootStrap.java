package me.shijunjie.SimpleZuul;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

@SpringCloudApplication
@ComponentScan("me.shijunjie")
@EnableZuulProxy
public class BootStrap {
	public static void main(String[] args) {
		String profile = args[0];
		new SpringApplicationBuilder(BootStrap.class).profiles(profile).run(args);
	}
}
