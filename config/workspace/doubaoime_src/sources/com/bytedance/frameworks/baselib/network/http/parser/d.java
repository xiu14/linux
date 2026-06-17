package com.bytedance.frameworks.baselib.network.http.parser;

import android.text.TextUtils;
import com.bytedance.frameworks.baselib.network.http.p.l;
import com.ss.android.message.log.PushLog;
import java.net.URL;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {
    private static JSONObject a;
    private static ReentrantReadWriteLock b;

    /* renamed from: c, reason: collision with root package name */
    private static Lock f5243c;

    /* renamed from: d, reason: collision with root package name */
    private static Lock f5244d;

    public static class a {
        public int a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public int f5245c;
    }

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        b = reentrantReadWriteLock;
        f5243c = reentrantReadWriteLock.readLock();
        f5244d = b.writeLock();
    }

    public static int a(URL url, a aVar) {
        JSONArray optJSONArray;
        int i;
        JSONArray jSONArray;
        int i2;
        JSONObject optJSONObject;
        if (url == null) {
            return -1;
        }
        try {
            f5243c.lock();
            JSONObject jSONObject = a;
            if (jSONObject != null) {
                if ((jSONObject.optInt("enabled", 0) > 0) && (optJSONArray = a.optJSONArray("rule_list")) != null && optJSONArray.length() != 0) {
                    for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                        JSONObject optJSONObject2 = optJSONArray.optJSONObject(i3);
                        if (optJSONObject2 != null) {
                            JSONArray jSONArray2 = null;
                            if (optJSONObject2.has("host_eq")) {
                                jSONArray = optJSONObject2.optJSONArray("host_eq");
                                i = 1;
                            } else if (optJSONObject2.has("host_wc")) {
                                i = 2;
                                jSONArray = optJSONObject2.optJSONArray("host_wc");
                            } else {
                                i = 0;
                                jSONArray = null;
                            }
                            if (jSONArray != null && b(url.getHost(), jSONArray, i)) {
                                if (optJSONObject2.has("path_eq")) {
                                    i2 = 3;
                                    jSONArray2 = optJSONObject2.optJSONArray("path_eq");
                                } else if (optJSONObject2.has("path_prefix")) {
                                    i2 = 4;
                                    jSONArray2 = optJSONObject2.optJSONArray("path_prefix");
                                } else if (optJSONObject2.has("path_contain")) {
                                    i2 = 5;
                                    jSONArray2 = optJSONObject2.optJSONArray("path_contain");
                                } else if (optJSONObject2.has("path_pattern")) {
                                    i2 = 6;
                                    jSONArray2 = optJSONObject2.optJSONArray("path_pattern");
                                } else {
                                    i2 = 0;
                                }
                                if (jSONArray2 != null && b(url.getPath(), jSONArray2, i2) && (optJSONObject = optJSONObject2.optJSONObject(PushLog.KEY_VALUE)) != null) {
                                    aVar.a = optJSONObject.optInt("conn_to", -1);
                                    aVar.b = optJSONObject.optInt("read_to", -1);
                                    aVar.f5245c = optJSONObject.optInt("write_to", -1);
                                    int optInt = optJSONObject.optInt("pro_to", -1);
                                    f5243c.unlock();
                                    return optInt;
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        f5243c.unlock();
        return -1;
    }

    private static boolean b(String str, JSONArray jSONArray, int i) {
        if (str != null && !str.isEmpty() && jSONArray != null && jSONArray.length() != 0) {
            try {
                switch (i) {
                    case 1:
                    case 3:
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            String optString = jSONArray.optString(i2);
                            if (!TextUtils.isEmpty(optString) && str.equals(optString)) {
                                return true;
                            }
                        }
                        return false;
                    case 2:
                        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                            String optString2 = jSONArray.optString(i3);
                            if (!TextUtils.isEmpty(optString2) && l.b(str, optString2)) {
                                return true;
                            }
                        }
                        return false;
                    case 4:
                        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                            String optString3 = jSONArray.optString(i4);
                            if (!TextUtils.isEmpty(optString3) && str.startsWith(optString3)) {
                                return true;
                            }
                        }
                        return false;
                    case 5:
                        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                            String optString4 = jSONArray.optString(i5);
                            if (!TextUtils.isEmpty(optString4) && str.contains(optString4)) {
                                return true;
                            }
                        }
                        return false;
                    case 6:
                        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                            String optString5 = jSONArray.optString(i6);
                            if (!TextUtils.isEmpty(optString5) && str.matches(optString5)) {
                                return true;
                            }
                        }
                        return false;
                    default:
                        return false;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    public static void c(JSONObject jSONObject) {
        try {
            f5244d.lock();
            a = jSONObject.optJSONObject("to_config_v1");
        } finally {
            f5244d.unlock();
        }
    }
}
