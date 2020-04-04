package com.training.dumptest.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Long.SIZE;
import static java.lang.Runtime.getRuntime;

public class OOMGenerator {
    private Logger logger = LoggerFactory.getLogger(OOMGenerator.class);

    public void generateOOM() throws Exception {
        int dummyArraySize = 15;
        long memoryConsumed = 0;
        long[] memoryAllocated;

        logger.info("Max JVM memory: " + getRuntime().maxMemory());

        for (int loop = 0; loop < MAX_VALUE; loop++) {
            memoryAllocated = new long[dummyArraySize];
            memoryConsumed += dummyArraySize * SIZE;
            logger.info("Memory Consumed till now: " + memoryConsumed);
            dummyArraySize *= dummyArraySize * 2;
            Thread.sleep(1000);
        }
    }
}