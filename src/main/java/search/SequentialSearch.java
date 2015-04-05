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

import main.java.search.Search;

/**
 * An algorithm that searches for data in a sequential order with an order N
 * complexity.
 * @author Matthew E. Coupal
 *
 */
public class SequentialSearch extends Search{

  /**
   * The method which performs the sequential search.
   * @param args The list of integers to be searched.
   * @param element The element to be found in the list.
   * @return The index of the first occurrence of the element; -1 if not found.
   */
  @Override
  public int search(int[] args, int element) {
    for (int i = 0; i < args.length; i++) {
      if (args[i] == element) {
        return i;
      }
    }
    return -1;
  }
}
