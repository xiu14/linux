package com.bytedance.news.common.settings.bytesync;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bytedance.news.common.settings.api.model.SettingsByteSyncModel;
import com.bytedance.news.common.settings.c;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SettingsByteSyncManager {
    private static final String TAG = "SettingsByteSyncManager";
    private static String callerName;
    private static volatile int receiveCount;
    private static List<SettingsByteSyncListener> syncListeners = new ArrayList();
    private static String taskData;
    private static String taskDataTmp;
    private static int taskId;
    private static String taskIdTmp;
    private static int taskType;
    private static long timeStamp;

    public interface SettingsByteSyncListener {
        void onSettingsSyncRequest(@NonNull SettingsByteSyncModel settingsByteSyncModel);

        void onUpdateSettingKey(@NonNull SettingsByteSyncModel settingsByteSyncModel);
    }

    static class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SettingsByteSyncModel settingsByteSyncModel = new SettingsByteSyncModel();
            settingsByteSyncModel.callerName = SettingsByteSyncManager.callerName;
            settingsByteSyncModel.taskData = SettingsByteSyncManager.taskDataTmp;
            settingsByteSyncModel.taskId = SettingsByteSyncManager.taskIdTmp;
            settingsByteSyncModel.taskType = SettingsByteSyncManager.taskType;
            settingsByteSyncModel.timeStamp = SettingsByteSyncManager.timeStamp * 1000;
            String unused = SettingsByteSyncManager.taskDataTmp = SettingsByteSyncManager.taskIdTmp = "";
            if (TextUtils.isEmpty(SettingsByteSyncManager.callerName)) {
                if (c.c(settingsByteSyncModel)) {
                    c.g(settingsByteSyncModel);
                    c.i(true);
                }
            } else if (SettingsByteSyncManager.syncListeners != null) {
                for (SettingsByteSyncListener settingsByteSyncListener : SettingsByteSyncManager.syncListeners) {
                    if (settingsByteSyncListener != null) {
                        settingsByteSyncListener.onSettingsSyncRequest(settingsByteSyncModel);
                    }
                }
            }
            int unused2 = SettingsByteSyncManager.receiveCount = 0;
        }
    }

    public static void onReceiveConnectEvent(@NonNull String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            taskType = jSONObject.optInt("task_type");
            taskId = jSONObject.optInt("task_id");
            callerName = jSONObject.optString("caller_name");
            taskData = jSONObject.optString("task_data");
            timeStamp = jSONObject.optLong("time_stamp");
            int i = taskType;
            if (i != 2) {
                if (i == 1) {
                    if (receiveCount == 0) {
                        receiveCount = 1;
                        if (!TextUtils.isEmpty(taskData)) {
                            taskDataTmp = taskData;
                        }
                        int i2 = taskId;
                        if (i2 != 0) {
                            taskIdTmp = String.valueOf(i2);
                        }
                        c.b.postDelayed(new a(), com.heytap.mcssdk.constant.a.r);
                        return;
                    }
                    if (!TextUtils.isEmpty(taskData)) {
                        taskDataTmp += Constants.ACCEPT_TIME_SEPARATOR_SP + taskData;
                    }
                    if (taskId != 0) {
                        taskIdTmp += Constants.ACCEPT_TIME_SEPARATOR_SP + taskId;
                        return;
                    }
                    return;
                }
                return;
            }
            if (TextUtils.isEmpty(jSONObject.optString("task_data"))) {
                Log.e(TAG, "taskData is empty");
                return;
            }
            try {
                JSONObject jSONObject2 = new JSONObject(taskData);
                SettingsByteSyncModel settingsByteSyncModel = new SettingsByteSyncModel();
                settingsByteSyncModel.callerName = callerName;
                settingsByteSyncModel.taskData = taskData;
                settingsByteSyncModel.taskId = String.valueOf(taskId);
                settingsByteSyncModel.taskType = taskType;
                settingsByteSyncModel.timeStamp = timeStamp * 1000;
                if (TextUtils.isEmpty(callerName)) {
                    if (c.c(settingsByteSyncModel)) {
                        c.h(jSONObject2);
                        return;
                    }
                    return;
                }
                List<SettingsByteSyncListener> list = syncListeners;
                if (list != null) {
                    for (SettingsByteSyncListener settingsByteSyncListener : list) {
                        if (settingsByteSyncListener != null) {
                            settingsByteSyncListener.onUpdateSettingKey(settingsByteSyncModel);
                        }
                    }
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
    }

    public static void registerByteSyncListener(SettingsByteSyncListener settingsByteSyncListener) {
        syncListeners.add(settingsByteSyncListener);
    }

    public void unregisterByteSyncListener(SettingsByteSyncListener settingsByteSyncListener) {
        syncListeners.remove(settingsByteSyncListener);
    }
}
