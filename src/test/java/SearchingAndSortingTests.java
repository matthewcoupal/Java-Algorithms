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

import main.java.search.BinarySearch;
import main.java.search.SequentialSearch;
import main.java.sort.MergeSort;
import main.java.sort.SelectionSort;
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
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
    // Generate a sequential sequence 1 through 100.
    int[] args = new int[100];
    for (int i = 0; i < args.length; i++) {
      args[i] = i;
    }
    SequentialSearch seq = new SequentialSearch();
    
    // Generate a random index to find and calls the function with that indexes
    // element.
    Random rand = new Random();
    int index = rand.nextInt(100);
    int element = args[index];
    assertEquals(index, seq.search(args,element));
  }
  
  @Test
  public void BinarySearchTest() {
    // Generate a sequential sequence 1 through 100.
    int[] args = new int[100];
    for (int i = 0; i < args.length; i++) {
      args[i] = i;
    }
    
    BinarySearch bin = new BinarySearch();
    
    // Generate a random index to find and calls the function with that indexes
    // element.
    Random rand = new Random();
    int index = rand.nextInt(100);
    int element = args[index];
    
    // Test both the recursive method and non-recursive method.
    assertEquals(index, bin.search(args,element));
    assertEquals(index, bin.recursiveSearch(args, element));
  }
  
  @Test
  public void SelectionSortTest() {
    int[] args = {12, 6, 31, 42, 1, 0};
    int[] expectedSort = {0,1,6,12,31,42};
    SelectionSort sel = new SelectionSort();
    int[] actualSort = sel.sort(args);
    for (int i = 0; i < args.length; i++) {
      assertEquals(expectedSort[i], actualSort[i]);
    }
  }
  
  @Test
  public void MergeSortTest() {
    int[] args = {12, 6, 31, 42, 1, 0};
    int[] expectedSort = {0, 1, 6, 12, 31, 42};
    MergeSort mer = new MergeSort();
    int[] actualSort = mer.sort(args);
    for (int i = 0; i < args.length; i++) {
      assertEquals(expectedSort[i], actualSort[i]);
    }
  }
}
