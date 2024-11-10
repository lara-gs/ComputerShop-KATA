package org.factoriaf5.computershop.models;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;

public class ComputerTest {
    @Test
    void testGetBrand() {
        Computer computer = new Computer("ThinkPad", 6, "Intel i6", "Windows 10", 700.0);
        assertThat(computer.getBrand(), is(equalTo("ThinkPad")));
    }

    @Test
    void testGetMemory() {
        Computer computer = new Computer("ThinkPad", 6, "Intel i6", "Windows 10", 700.0);
        assertThat(computer.getMemory(), is(equalTo(6)));

    }

    @Test
    void testGetPrice() {
        Computer computer = new Computer("Dell", 8, "Intel i7", "Windows 10", 700.0);
        assertThat(computer.getPrice(),is(equalTo(700.0)));

    }

    @Test
    void testGetProcessador() {
        Computer computer = new Computer("Dell", 8, "Intel i7", "Windows 10", 700.0);
        assertThat(computer.getProcessor(), is(equalTo("Intel i7")));

    }

    @Test
    void testSetBrand() {
        Computer computer = new Computer("Dell", 8, "Intel i7", "Windows 10", 700.0);
        computer.setBrand("HP");
        assertThat(computer.getBrand(), is(equalTo("HP")));

    }

    @Test
    void testSetMemory() {
        Computer computer = new Computer("Dell", 8, "Intel i7", "Windows 10", 700.0);
        computer.setMemory(12);
        assertThat(computer.getMemory(), is(equalTo(12)));

    }

    @Test
    void testSetPrice() {
        Computer computer = new Computer("Dell", 8, "Intel i7", "Windows 10", 700.0);
        computer.setPrice(200.0);
        assertThat(computer.getPrice(), is(equalTo(200.0)));

    }

    @Test
    void testSetProcessador() {
        Computer computer = new Computer("Dell", 8, "Intel i7", "Windows 10", 700.0);
        computer.setProcessor("Ryzen 9");
        assertThat(computer.getProcessor(), is(equalTo("Ryzen 9")));

    }
}
