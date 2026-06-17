package com.bytedance.frameworks.baselib.network.c.c;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.c.c.c;
import com.ss.android.message.log.PushLog;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class b<T extends c> {
    protected final AtomicBoolean a = new AtomicBoolean(false);
    private final List<Pair<a, T>> b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private T f5029c;

    public abstract String a();

    /* JADX WARN: Removed duplicated region for block: B:106:0x012e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0034 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public T b(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.c.c.b.b(java.lang.String):com.bytedance.frameworks.baselib.network.c.c.c");
    }

    public List<Pair<a, T>> c() {
        return this.b;
    }

    public boolean d() {
        return this.a.get();
    }

    public abstract T e(Object obj);

    protected Set<String> f(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            if (!TextUtils.isEmpty(optString)) {
                hashSet.add(optString);
            }
        }
        return hashSet;
    }

    public boolean g(JSONObject jSONObject) {
        Set<String> set;
        Set<String> set2;
        Set<String> set3;
        Set<Pattern> set4;
        this.a.set(false);
        this.b.clear();
        if (jSONObject.length() == 0) {
            return false;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(a());
        if (optJSONObject == null || optJSONObject.length() == 0) {
            return true;
        }
        this.a.set(optJSONObject.optInt("enabled", 0) > 0);
        if (!this.a.get()) {
            return true;
        }
        Object opt = optJSONObject.opt(DownloadSettingKeys.BugFix.DEFAULT);
        if (opt != null) {
            this.f5029c = e(opt);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("rule_list");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
            if (optJSONObject2 != null && optJSONObject2.length() != 0) {
                a aVar = new a();
                aVar.a = f(optJSONObject2.optJSONArray("host_eq"));
                aVar.b = f(optJSONObject2.optJSONArray("host_wc"));
                Set<String> set5 = aVar.a;
                if ((set5 != null && !set5.isEmpty()) || ((set = aVar.b) != null && !set.isEmpty())) {
                    aVar.f5025c = f(optJSONObject2.optJSONArray("path_eq"));
                    aVar.f5026d = f(optJSONObject2.optJSONArray("path_prefix"));
                    aVar.f5027e = f(optJSONObject2.optJSONArray("path_contain"));
                    Set<String> f2 = f(optJSONObject2.optJSONArray("path_pattern"));
                    if (f2 != null) {
                        aVar.f5028f = new HashSet();
                        Iterator<String> it2 = f2.iterator();
                        while (it2.hasNext()) {
                            try {
                                aVar.f5028f.add(Pattern.compile(it2.next()));
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    Set<String> set6 = aVar.f5025c;
                    if ((set6 != null && !set6.isEmpty()) || (((set2 = aVar.f5026d) != null && !set2.isEmpty()) || (((set3 = aVar.f5027e) != null && !set3.isEmpty()) || ((set4 = aVar.f5028f) != null && !set4.isEmpty())))) {
                        Object opt2 = optJSONObject2.opt(PushLog.KEY_VALUE);
                        if (opt2 != null) {
                            T e2 = e(opt2);
                            if (e2 != null) {
                                TextUtils.isEmpty(optJSONObject2.optString("sign"));
                                this.b.add(new Pair<>(aVar, e2));
                            } else if (Logger.debug()) {
                                Logger.d("TTHostPathMatchRule", "ParseHostPathValue failed.");
                            }
                        } else if (Logger.debug()) {
                            Logger.d("TTHostPathMatchRule", "value is null.");
                        }
                    } else if (Logger.debug()) {
                        Logger.d("TTHostPathMatchRule", "no path filter exist.");
                    }
                } else if (Logger.debug()) {
                    Logger.d("TTHostPathMatchRule", "both host_eq and host_wc empty.");
                }
            }
        }
        return true;
    }

    public void h(boolean z) {
        this.a.set(z);
    }
}
