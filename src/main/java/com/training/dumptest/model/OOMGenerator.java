package com.training.dumptest.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Long.SIZE;
import static java.lang.Math.abs;
import static java.lang.Runtime.getRuntime;

public class OOMGenerator {
    private Logger logger = LoggerFactory.getLogger(OOMGenerator.class);

    public void generateOOM() throws Exception {
        int arraySize = 5;

        logger.info("Max JVM memory: " + getRuntime().maxMemory());

        for (int loop = 0; loop < MAX_VALUE; loop++) {
            long[] memoryAllocated = new long[abs(arraySize)];
            logger.info("Current allocation memory : " + abs(arraySize * SIZE));
            arraySize *= 10;
            Thread.sleep(1000);
        }
    }
}