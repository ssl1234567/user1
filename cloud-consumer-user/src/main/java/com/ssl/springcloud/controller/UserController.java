package com.ssl.springcloud.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssl.springcloud.bean.User;
import com.ssl.springcloud.service.UserService;
@RestController
public class UserController {
	@Autowired
	UserService userService;
    
	@GetMapping("/user")
	public User getUser(@RequestParam("id") Integer id) {
		User user = userService.getUserById(id);
		return user;
	}
	/*@GetMapping("/user")
	public User getUser(@RequestParam("id") Integer id) {
		User user = userService.getUserById(id);
		return user;
	}
*/
	
	@GetMapping("/byMovie")
	public Map<String,Object> byMovie(@RequestParam("id") Integer userid){
		Map<String, Object> map = userService.buyMovie(userid);
		return map;
	}
	/*@GetMapping("/buyMovie")
	public Map<String, Object> buyMovie(@RequestParam("id") Integer userid) {
		Map<String, Object> map = userService.buyMovie(userid);
		return map;
	}
*/
}
