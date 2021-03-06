/*
 * Copyright (C) 2020 ThoughtWorks, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.thoughtworks.gauge.rename;

public final class RefactoringStatus {

  private String errorMessage;
  private final Boolean isPassed;

  public RefactoringStatus(Boolean isPassed, String errorMessage) {
    this.errorMessage = errorMessage;
    this.isPassed = isPassed;
  }

  public RefactoringStatus(boolean isPassed) {
    this.isPassed = isPassed;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public Boolean isPassed() {
    return isPassed;
  }
}
