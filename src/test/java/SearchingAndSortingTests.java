/*
 * Copyright (C) 2015 Matthew E. Coupal
 * 
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package test.java;

import main.java.search.SequentialSearch;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.Random;

/**
 * The unit tests for the searching and sorting methods.
 * @author Matthew E. Coupal
 *
 */
public class SearchingAndSortingTests {

  @Test
  public void SequentialSearchTest() {
    // Generates a sequential sequence 1 through 100
    int[] args = new int[100];
    for (int i = 0; i < args.length; i++) {
      args[i] = i;
    }
    SequentialSearch seq = new SequentialSearch();
    
    // Generates a random index to find and calls the function with that indexes
    // element
    Random rand = new Random();
    int index = rand.nextInt(100);
    int element = args[index];
    assertEquals(index, seq.search(args,element));
  }
}