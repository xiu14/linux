package com.bytedance.ies.common;

import androidx.annotation.Keep;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
/* loaded from: classes.dex */
public class IESAppLogger {
    private static final String VESDK_EVENT_SECOND_APPID = "1357";
    private static final String VESDK_EVENT_SECOND_APPID_ABROAD = "2780";
    private static final String VESDK_EVENT_SECOND_APPID_KEY = "second_appid";
    private static final String VESDK_EVENT_SECOND_APPNAME = "video_editor_sdk";
    private static final String VESDK_EVENT_SECOND_APPNAME_ABROAD = "vesdk_abroad";
    private static final String VESDK_EVENT_SECOND_APPNAME_KEY = "second_appname";
    private static volatile IESAppLogger instance;
    private static final Object object = new Object();
    private String appId;
    private Boolean initFlag;
    private Boolean isAbroad;
    private final Set<String> mSampler = new HashSet();
    private a appLoggerCallback = null;

    public interface a {
        void a(String str, JSONObject jSONObject, String str2);
    }

    private IESAppLogger() {
        Boolean bool = Boolean.FALSE;
        this.initFlag = bool;
        this.appId = null;
        this.isAbroad = bool;
    }

    private static JSONObject copyJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        LinkedList linkedList = new LinkedList();
        Iterator<String> keys = jSONObject.keys();
        if (keys == null) {
            return new JSONObject();
        }
        while (keys.hasNext()) {
            linkedList.add(keys.next());
        }
        try {
            return new JSONObject(jSONObject, (String[]) linkedList.toArray(new String[0]));
        } catch (Exception e2) {
            e2.printStackTrace();
            return jSONObject;
        }
    }

    public static IESAppLogger sharedInstance() {
        IESAppLogger iESAppLogger;
        if (instance != null) {
            return instance;
        }
        synchronized (object) {
            if (instance == null) {
                instance = new IESAppLogger();
            }
            iESAppLogger = instance;
        }
        return iESAppLogger;
    }

    public void appLogOnEvent(String str, String str2, String str3) {
        appLogOnEvent(str, str2, str3, false);
    }

    public boolean isSampled(String str) {
        return (str == null || str.isEmpty() || this.mSampler.isEmpty() || !this.mSampler.contains(str)) ? false : true;
    }

    public native void nativeSetSampler(Set<String> set);

    public void setAppLogCallback(String str, a aVar, boolean z) {
        if (this.initFlag.booleanValue()) {
            return;
        }
        synchronized (object) {
            if (!this.initFlag.booleanValue()) {
                this.appId = str;
                this.appLoggerCallback = aVar;
                this.initFlag = Boolean.TRUE;
                this.isAbroad = Boolean.valueOf(z);
            }
        }
    }

    public synchronized void setSampler(Set<String> set) {
        if (set != null) {
            if (!set.isEmpty()) {
                this.mSampler.clear();
                this.mSampler.addAll(set);
                nativeSetSampler(this.mSampler);
            }
        }
    }

    public void appLogOnEvent(String str, String str2, String str3, boolean z) {
        JSONObject jSONObject;
        if (this.appLoggerCallback == null) {
            return;
        }
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException e2) {
            e2.printStackTrace();
            jSONObject = new JSONObject();
        }
        appLogOnEvent(str, jSONObject, str3, z);
    }

    public void appLogOnEvent(String str, JSONObject jSONObject, String str2) {
        appLogOnEvent(str, jSONObject, str2, false);
    }

    public void appLogOnEvent(String str, JSONObject jSONObject, String str2, boolean z) {
        appLogOnEvent(str, jSONObject, str2, z ? 3 : 1);
    }

    public void appLogOnEvent(String str, JSONObject jSONObject, String str2, int i) {
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        if (this.appLoggerCallback == null) {
            return;
        }
        if (this.mSampler.isEmpty() || !this.mSampler.contains(str)) {
            if (z2) {
                this.appLoggerCallback.a(str, copyJson(jSONObject), str2);
            }
            if (z) {
                JSONObject copyJson = copyJson(jSONObject);
                try {
                    if (this.isAbroad.booleanValue()) {
                        copyJson.put(VESDK_EVENT_SECOND_APPID_KEY, VESDK_EVENT_SECOND_APPID_ABROAD);
                        copyJson.put(VESDK_EVENT_SECOND_APPNAME_KEY, VESDK_EVENT_SECOND_APPNAME_ABROAD);
                    } else {
                        copyJson.put(VESDK_EVENT_SECOND_APPID_KEY, VESDK_EVENT_SECOND_APPID);
                        copyJson.put(VESDK_EVENT_SECOND_APPNAME_KEY, VESDK_EVENT_SECOND_APPNAME);
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                this.appLoggerCallback.a(str, copyJson, str2);
            }
        }
    }

    public void appLogOnEvent(String str, String str2, String str3, int i) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException e2) {
            e2.printStackTrace();
            jSONObject = new JSONObject();
        }
        appLogOnEvent(str, jSONObject, str3, i);
    }
}
