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

    @Test
    void testAddComputer() {
        Store store = new Store("MissingXP", "Travis Gutierrez", 0000123, null);
        Computer computer = new Computer("HP", 2, "Intel", "Windows 95", 100.00);
        store.addComputer(computer);
        assertThat(store.getComputers(), hasItems(computer));
    }

    @Test
    void testRemoveComputerByBrand() {
        Store store = new Store("MissingXP", "Travis Gutierrez", 0000123, null);
        Computer computer1 = new Computer("HP", 2, "Intel", "Windows 95", 100.00);
        Computer computer2 = new Computer("Dell", 16, "AMD Ryzen 7", "Windows 10", 1800.00);
        store.addComputer(computer1);
        store.addComputer(computer2);
        store.removeComputerByBrand("HP");
        assertThat(store.getComputers(), not(hasItem(computer1)));
        assertThat(store.getComputers(), hasItem(computer2));
    }

    @Test
    void testSearchComputerByBrand() {
        Store store = new Store("MissingXP", "Travis Gutierrez", 0000123, null);
        Computer computer1 = new Computer("HP", 2, "Intel", "Windows 95", 100.00);
        Computer computer2 = new Computer("Dell", 16, "AMD Ryzen 7", "Windows 10", 1800.00);
        store.addComputer(computer1);
        store.addComputer(computer2);
        Computer foundComputer = store.searchComputerByBrand("HP");
        assertThat(foundComputer, is(equalTo(computer1)));
        Computer notFoundComputer = store.searchComputerByBrand("Apple");
        assertThat(notFoundComputer, is(nullValue()));
    }

    @Test
    void testListComputers() {
        Store store = new Store("MissingXP", "Travis Gutierrez", 0000123, null);
        Computer computer1 = new Computer("HP", 2, "Intel", "Windows 95", 100.00);
        Computer computer2 = new Computer("Dell", 16, "AMD Ryzen 7", "Windows 10", 1800.00);
        store.addComputer(computer1);
        store.addComputer(computer2);
        List<String> details = store.listComputers();
        assertThat(details, hasItem(containsString("Brand: HP")));
        assertThat(details, hasItem(containsString("Brand: Dell")));
    }
    
}
