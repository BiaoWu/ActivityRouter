/*
 * Copyright (C) 2017 BiaoWu
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.biao.intent.router;

import android.os.Bundle;

/**
 * Activity.xxx()
 *
 * @author biaowu.
 */
public interface ActivityCall extends ContextCall {
  void startActivityForResult(String key, int requestCode);

  void startActivityForResult(String key, int requestCode, Bundle args);
}
