package com.demo.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ JunitSample.class, JunitClasses.class,Day1.class })
public class TestRunner {

}
