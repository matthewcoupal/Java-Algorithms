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

import java.util.Arrays;

/**
 * An algorithm with order NlogN complexity. Although this algorithm is very
 * efficient, there is a tradeoff of memory allocation, due to breaking up an
 * array of size N in half log_2(N) times. 
 * @author Matthew E. Coupal
 *
 */
public class MergeSort extends Sort {

  /**
   * Method that sorts a given array of integers.
   * @param args Array to be sorted.
   * @return The sorted array.
   */
  @Override
  public int[] sort(int[] args) {
    if (args.length > 1) {
      // Split the array into two halves.
      int[] left = Arrays.copyOfRange(args, 0, args.length / 2);
      int[] right = Arrays.copyOfRange(args, args.length / 2, args.length);
      
      // Sort the left and right halves.
      this.sort(left);
      this.sort(right);
      
      //Merge the two halves into the original array.
      args = this.merge(left, right, args);
    }
    return args;
  }
  
  /**
   * Merges two given arrays into a single, specified array.
   * @param left The left array.
   * @param right The right array.
   * @param list The single array to be merged into.
   * @return The list, with each index derived from the left and right arrays.
   */
  private int[] merge(int[] left, int[] right, int[] list) {
    int indexLeft = 0; // Index of the left array.
    int indexRight = 0; // Index of the right array.
    for (int i = 0; i < list.length; i++) {
      // Compares values and ensures their indices are within bounds.
      if (indexRight >= right.length || (indexLeft < left.length && 
          left[indexLeft] <= right[indexRight])) { // Left is smaller.
        list[i] = left[indexLeft];
        indexLeft++;
      } else { // Right is smaller.
        list[i] = right[indexRight];
        indexRight++;
      }
    }
    return list;
  }
}
