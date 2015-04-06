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
package main.java.sort;

/**
 * An algorithm with order N squared complexity, it sorts by finding the smallest value
 * by making N passes over N elements.
 * @author Matthew E. Coupal
 *
 */
public class SelectionSort extends Sort {

  /**
   * Method that sorts a given array of integers.
   * @param args The array of integers to be sorted.
   * @return The sorted version of the array (in increasing order).
   */
  @Override
  public int[] sort(int[] args) {
    for (int i = 0; i < args.length; i++) {
      // Set the default smallest value in the unsorted section of the array.
      int minValue = i;
      
      // Look for the smallest value through the rest of the unsorted section
      // of the array.
      for (int j = i + 1; j < args.length; j++) {
        if (args[j] < args[minValue]) {
          minValue = j;
        }
      }
      
      // Swap the values between the smallest values current position, and the
      // beginning of the unsorted section of the array.
      int temp = args[i];
      args[i] = args[minValue];
      args[minValue] = temp; 
    }
    return args;
  }

}
