package org.factoriaf5.computershop.models;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class StoreTest {
    @Test
    void testGetComputers() {
        Computer computer1 = new Computer("ThinkPad", 8, "Intel i7", "Windows 10", 1500.0);
        Computer computer2 = new Computer("MacBook", 16, "M1", "macOS", 2500.0);
        List<Computer> computers = Arrays.asList(computer1, computer2);
        Store store = new Store("MissingXP", "Travis Gutierrez", 0000123, computers);
        assertThat(store.getComputers(), is(equalTo(computers)));
    }

    @Test
    void testGetName() {
        List<Computer> computers = Arrays.asList();
        Store store = new Store("MissingXP", "Travis Gutierrez", 0000123, computers);
        assertThat(store.getName(), is(equalTo("MissingXP")));
       
    }

    @Test
    void testGetOwner() {
        Store store = new Store("MissingXP", "Travis Gutierrez", 0000123, null);
        assertThat(store.getOwner(), is(equalTo("Travis Gutierrez")));
    }

    @Test
    void testGetTaxId() {
        Store store = new Store("MissingXP", "Travis Gutierrez", 0000123, null);
        assertThat(store.getTaxId(), is(0000123));
    }

    @Test
    void testSetComputers() {
        Computer computer1 = new Computer("ThinkPad", 8, "Intel i7", "Windows 10", 1500.0);
        Computer computer2 = new Computer("MacBook", 16, "M1", "macOS", 2500.0);
        List<Computer> computers = Arrays.asList(computer1, computer2);
        Store store = new Store("MissingXP", "Travis Gutierrez", 0000123, computers);
        store.setComputers(computers);
        assertThat(store.getComputers(), is(equalTo(computers)));
    }

    @Test
    void testSetName() {
        Store store = new Store("MissingXP", "Travis Gutierrez", 0000123, null);
        store.setName("MyPc");
        assertThat(store.getName(), is(equalTo("MyPc")));
    }

    @Test
    void testSetOwner() {
        Store store = new Store("MissingXP", "Travis Gutierrez", 0000123, null);
        store.setOwner("LaraLi");
        assertThat(store.getOwner(), is(equalTo("LaraLi")));


    }

    @Test
    void testSetTaxId() {
        Store store = new Store("MissingXP", "Travis Gutierrez", 0000123, null);
        store.setTaxId(123123);
        assertThat(store.getTaxId(), is(equalTo(123123)));



    }
}
