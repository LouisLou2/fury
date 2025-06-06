/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.fory.collection;

import java.io.Serializable;
import java.util.Objects;

public class Tuple2<T0, T1> implements Serializable {

  private static final long serialVersionUID = 1L;

  /** Field 0 of the tuple. */
  public final T0 f0;

  /** Field 1 of the tuple. */
  public final T1 f1;

  /** Creates a new tuple where all fields are null. */
  public Tuple2() {
    this(null, null);
  }

  /**
   * Creates a new tuple and assigns the given values to the tuple's fields, with field value final.
   * In case field value is nonFinal, use {@link MutableTuple2}
   *
   * @param value0 The value for field 0
   * @param value1 The value for field 1
   */
  public Tuple2(T0 value0, T1 value1) {
    this.f0 = value0;
    this.f1 = value1;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tuple2<?, ?> tuple2 = (Tuple2<?, ?>) o;
    return Objects.equals(f0, tuple2.f0) && Objects.equals(f1, tuple2.f1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(f0, f1);
  }

  public static <T0, T1> Tuple2<T0, T1> of(T0 value0, T1 value1) {
    return new Tuple2<>(value0, value1);
  }

  @Override
  public String toString() {
    return "Tuple2(" + f0 + ", " + f1 + ')';
  }
}
