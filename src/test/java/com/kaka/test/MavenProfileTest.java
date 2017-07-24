package com.kaka.test;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Hem on 2017/7/24.
 */
public class MavenProfileTest {

    @Test
    public void testProfile() throws IOException {
        InputStream in = ClassLoader.getSystemResourceAsStream("application.properties");
        Properties p = new Properties();
        p.load(in);
        String version = (String) p.get("version");

        System.out.println(version);

    }

}
