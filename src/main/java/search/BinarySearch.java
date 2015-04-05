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
package main.java.search;

/**
 * An algorithm with complexity logN which searches an ordered list by trimming the
 * range of the upper and lower bounds.
 * @author Matthew E. Coupal
 *
 */
public class BinarySearch extends Search {

  /**
   * Method that searches an array.
   */
  @Override
  public int search(int[] args, int element) {
    int min = 0;
    int max = args.length - 1;

    while (min <= max) {
      int mid = (max + min)/2;
      if (args[mid] == element) { // Found the element.
        return mid;
      } else if (args[mid] < element) { // Only view the upper-half.
        min = mid + 1;
      } else { // Only view the lower-half.
        max = mid - 1;
      }
    }
    return -1;
  }

  /**
   * Performs the Binary Search recursively.
   * @param args List of integers to be searched through.
   * @param element The integer to locate.
   * @return The index of the element in the given list; -1 if not found.
   */
  public int recursiveSearch(int[] args, int element) {
    return recursiveSearch(args, element, 0, args.length - 1);
  }

  /**
   * Helper method of recursiveSearch. Performs the Binary Search recursively.
   * @param args List of integers to be searched through.
   * @param element The integer to locate.
   * @param min The lower bound of the search.
   * @param max The upper bound of the search.
   * @return The index of the element in the given list; -1 if not found.
   */
  private int recursiveSearch(int[] args, int element, int min, int max) {
    //Base Case
    if(min > max) { // The element is not found.
      return -1;
    } else {
      int mid = (max + min)/2;
      if (args[mid] == element) { // Found the element.
        return mid;
      } else if (args[mid] < element) { // Only view the upper-half.
        return recursiveSearch(args, element, mid + 1, max);
      } else { // Only view the lower-half.
        return recursiveSearch(args, element, min, mid - 1);
      }
    }
  }

}
