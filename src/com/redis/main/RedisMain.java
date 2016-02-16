package com.redis.main;

import redis.clients.jedis.Jedis;

public class RedisMain {

	private static Jedis jedis;

	public static void main(String[] args) {
		/*jedis = new Jedis("localhost");
		System.out.println("Sesrver is running: " + jedis.ping());
		System.out.println(jedis.exists("asdf"));*/
		jedis = RedisPool.getResource();
		System.out.println(jedis.ping());
	}

}
