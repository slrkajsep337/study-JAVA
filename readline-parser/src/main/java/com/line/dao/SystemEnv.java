package com.line.dao;

import java.util.Map;

public class SystemEnv {
    public static void main(String[] args) {

        Map<String, String> env = System.getenv();

        for (String key : env.keySet()) {
            System.out.printf("key : %s \nvalue : %s\n\n", key, env.get(key));

    }
}

}
