package com.bytedance.common;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.bytedance.common.g.a;
import com.bytedance.push.g0.f;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MainProcessEventService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        f.c("MainProcessEventServiceTag", "onBind");
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        String string = extras.getString("event_name");
        String string2 = extras.getString("event_params");
        try {
            f.c("MainProcessEventServiceTag", "report " + string + " :" + string2);
            a.c().e().c().l.onEventV3(string, new JSONObject(string2));
            return null;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
