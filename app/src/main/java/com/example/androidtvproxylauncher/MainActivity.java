/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.example.androidtvproxylauncher;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/*
 * Main Activity class that loads {@link MainFragment}.
 */
public class MainActivity extends Activity {
    private static final String TAG = "ActivityManager";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // com.lego.android.tvleanback/com.example.android.tvleanback.ui.MainActivity
        // hdpfans.com/com.hdpfans.app.ui.main.MainActivity
        // com.dianshijia.newlive/com.dianshijia.newlive.entry.SplashActivity
        String pkg = "hdpfans.com";
        String cls = "com.hdpfans.app.ui.main.MainActivity";
        Log.i(TAG, "Launching " + pkg + "/" + cls);
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.setComponent(new ComponentName(pkg,cls));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_TASK_ON_HOME);
        Log.i(TAG, "Launching " + pkg + "/" + cls);
        startActivity(intent);
    }
}
