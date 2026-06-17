package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.fw;
import com.xiaomi.push.hz;
import com.xiaomi.push.ia;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class aq {
    private static volatile aq a;

    /* renamed from: a, reason: collision with other field name */
    private final Context f1042a;

    /* renamed from: a, reason: collision with other field name */
    protected final SharedPreferences f1043a;

    /* renamed from: a, reason: collision with other field name */
    private HashSet<a> f1044a = new HashSet<>();
    protected final SharedPreferences b;

    /* renamed from: c, reason: collision with root package name */
    protected final SharedPreferences f9317c;

    public static abstract class a implements Runnable {
        private String mDescription;
        private int mId;

        public a(int i, String str) {
            this.mId = i;
            this.mDescription = str;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && this.mId == ((a) obj).mId;
        }

        public int hashCode() {
            return this.mId;
        }

        protected abstract void onCallback();

        @Override // java.lang.Runnable
        public final void run() {
            onCallback();
        }
    }

    private aq(Context context) {
        this.f1043a = context.getSharedPreferences("mipush_oc_normal", 0);
        this.b = context.getSharedPreferences("mipush_oc_custom", 0);
        this.f9317c = context.getSharedPreferences("mipush_oc_update_cache", 0);
        this.f1042a = context;
    }

    public synchronized void a(a aVar) {
        if (!this.f1044a.contains(aVar)) {
            this.f1044a.add(aVar);
        }
    }

    void b() {
        com.xiaomi.channel.commonutils.logger.c.c("OC_Callback : receive new oc data");
        HashSet hashSet = new HashSet();
        synchronized (this) {
            hashSet.addAll(this.f1044a);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            a aVar = (a) it2.next();
            if (aVar != null) {
                aVar.run();
            }
        }
        hashSet.clear();
    }

    public void c() {
        if (!com.xiaomi.push.k.m655a(this.f1042a)) {
            com.xiaomi.channel.commonutils.logger.c.m19a("OnlineConfig", "not xmsf package, not schedule report");
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (!this.f9317c.contains("oc_report_start_time")) {
                this.f9317c.edit().putLong("oc_report_start_time", currentTimeMillis).apply();
            }
            long j = (currentTimeMillis - this.f9317c.getLong("oc_last_schedule_report_time", 0L)) / 1000;
            com.xiaomi.push.ah.a(this.f1042a).b(new ap(this.f1042a), (j <= 0 || j >= 1296000) ? 10 : (int) (1296000 - j));
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.b("OnlineConfig", "init oc report error", e2.getMessage());
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized void m762a() {
        this.f1044a.clear();
    }

    public static aq a(Context context) {
        if (a == null) {
            synchronized (aq.class) {
                if (a == null) {
                    a = new aq(context);
                }
            }
        }
        return a;
    }

    private void b(List<Pair<ia, Integer>> list) {
        if (!com.xiaomi.push.k.m655a(this.f1042a)) {
            com.xiaomi.channel.commonutils.logger.c.m19a("OnlineConfig", "not xmsf package, not report normal config");
        } else {
            if (com.xiaomi.push.ab.a(list)) {
                return;
            }
            a(2, list, m761a(list) ? 1 : 0);
        }
    }

    public void a(List<Pair<ia, Integer>> list, List<Pair<Integer, Object>> list2) {
        if (com.xiaomi.push.k.m655a(this.f1042a)) {
            try {
                int i = this.f9317c.getInt("oc_normal_count", 0);
                if (i == Integer.MAX_VALUE) {
                    com.xiaomi.channel.commonutils.logger.c.c("OnlineConfig", "update normal count error, count is max");
                }
                this.f9317c.edit().putInt("oc_normal_count", i + 1).apply();
                SharedPreferences.Editor edit = this.f9317c.edit();
                int i2 = this.f1043a.getInt(a(ia.MISC_CONFIG), 0);
                int i3 = this.f1043a.getInt(a(ia.PLUGIN_CONFIG), 0);
                edit.putInt("oc_old_misc_version", i2);
                edit.putInt("oc_old_plugin_version", i3);
                edit.apply();
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.c.b("OnlineConfig", "update normal cache error", e2.getMessage());
            }
        }
        if (!com.xiaomi.push.ab.a(list) && !com.xiaomi.push.ab.a(list2)) {
            SharedPreferences.Editor edit2 = this.f1043a.edit();
            edit2.clear();
            for (Pair<ia, Integer> pair : list) {
                Object obj = pair.first;
                if (obj != null && pair.second != null) {
                    edit2.putInt(a((ia) obj), ((Integer) pair.second).intValue());
                }
            }
            for (Pair<Integer, Object> pair2 : list2) {
                Object obj2 = pair2.first;
                if (obj2 != null && pair2.second != null) {
                    a(edit2, pair2, a(((Integer) obj2).intValue()));
                }
            }
            edit2.apply();
            b(list);
            return;
        }
        com.xiaomi.channel.commonutils.logger.c.m16a("OnlineConfig", "not update oc, because versions or configs are empty");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* renamed from: a, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m763a(java.util.List<android.util.Pair<java.lang.Integer, java.lang.Object>> r9) {
        /*
            r8 = this;
            java.lang.String r0 = "OnlineConfig"
            java.lang.String r1 = "oc_custom_count"
            android.content.Context r2 = r8.f1042a
            boolean r2 = com.xiaomi.push.k.m655a(r2)
            r3 = 0
            if (r2 == 0) goto L5c
            r2 = 1
            r4 = 0
            android.content.SharedPreferences r5 = r8.f9317c     // Catch: java.lang.Exception -> L44
            int r5 = r5.getInt(r1, r4)     // Catch: java.lang.Exception -> L44
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 != r6) goto L1f
            java.lang.String r6 = "update custom count error, count is max"
            com.xiaomi.channel.commonutils.logger.c.c(r0, r6)     // Catch: java.lang.Exception -> L44
        L1f:
            android.content.SharedPreferences r6 = r8.f9317c     // Catch: java.lang.Exception -> L44
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch: java.lang.Exception -> L44
            int r5 = r5 + r2
            android.content.SharedPreferences$Editor r1 = r6.putInt(r1, r5)     // Catch: java.lang.Exception -> L44
            r1.apply()     // Catch: java.lang.Exception -> L44
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L44
            r1.<init>(r9)     // Catch: java.lang.Exception -> L44
            android.content.SharedPreferences r5 = r8.b     // Catch: java.lang.Exception -> L3f
            java.util.Map r5 = r5.getAll()     // Catch: java.lang.Exception -> L3f
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Exception -> L3f
            r6.<init>(r5)     // Catch: java.lang.Exception -> L3f
            r3 = r1
            goto L5d
        L3f:
            r5 = move-exception
            r7 = r5
            r5 = r1
            r1 = r7
            goto L46
        L44:
            r1 = move-exception
            r5 = r3
        L46:
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r4] = r0
            java.lang.String r0 = "update custom cache error"
            r6[r2] = r0
            r0 = 2
            java.lang.String r1 = r1.getMessage()
            r6[r0] = r1
            com.xiaomi.channel.commonutils.logger.c.b(r6)
            r6 = r3
            r3 = r5
            goto L5d
        L5c:
            r6 = r3
        L5d:
            boolean r0 = com.xiaomi.push.ab.a(r9)
            if (r0 == 0) goto L64
            return
        L64:
            android.content.SharedPreferences r0 = r8.b
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.util.Iterator r9 = r9.iterator()
        L6e:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L95
            java.lang.Object r1 = r9.next()
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r2 = r1.first
            if (r2 != 0) goto L7f
            goto L6e
        L7f:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.String r2 = r8.a(r2)
            java.lang.Object r4 = r1.second
            if (r4 != 0) goto L91
            r0.remove(r2)
            goto L6e
        L91:
            r8.a(r0, r1, r2)
            goto L6e
        L95:
            r0.apply()
            r8.a(r3, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.aq.m763a(java.util.List):void");
    }

    private void a(List<Pair<Integer, Object>> list, Map<String, ?> map) {
        if (!com.xiaomi.push.k.m655a(this.f1042a)) {
            com.xiaomi.channel.commonutils.logger.c.m19a("OnlineConfig", "not xmsf package, not report custom config");
            return;
        }
        if (com.xiaomi.push.ab.a(list) || map == null || map.isEmpty()) {
            return;
        }
        try {
            String m757a = m757a(a((Map<String, ?>) new HashMap(this.b.getAll())));
            String m757a2 = m757a(a(map));
            String m757a3 = m757a(list);
            this.f9317c.edit().putString("oc_custom_config_md5", m757a).apply();
            int i = TextUtils.equals(m757a3, m757a) ? 1 : 0;
            if (TextUtils.equals(m757a2, m757a3)) {
                return;
            }
            a(3, (List<Pair<ia, Integer>>) null, i);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.b("OnlineConfig", "prepare custom report error", e2.getMessage());
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private String m757a(List<Pair<Integer, Object>> list) {
        return com.xiaomi.push.bl.a(m758a(list).toString());
    }

    private Pair<Integer, Object> a(List<Pair<Integer, Object>> list) {
        for (Pair<Integer, Object> pair : list) {
            Object obj = pair.first;
            if (obj != null && ((Integer) obj).intValue() == hz.AppIsInstalledList.a()) {
                return pair;
            }
        }
        return null;
    }

    private Object a(Pair<Integer, Object> pair) {
        String[] split = ((String) pair.second).split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        Arrays.sort(split);
        return com.xiaomi.push.bm.a(split, Constants.ACCEPT_TIME_SEPARATOR_SP);
    }

    private static List<Pair<Integer, Object>> a(Map<String, ?> map) {
        ArrayList arrayList = new ArrayList();
        if (map != null && !map.isEmpty()) {
            try {
                for (Map.Entry<String, ?> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key.startsWith("oc_")) {
                        Integer valueOf = Integer.valueOf(Integer.parseInt(key.substring(3)));
                        Object value = entry.getValue();
                        if (valueOf.intValue() == hz.AppIsInstalledList.a()) {
                            value = com.xiaomi.push.bj.b((String) value);
                        }
                        arrayList.add(new Pair(valueOf, value));
                    }
                }
            } catch (NumberFormatException e2) {
                com.xiaomi.channel.commonutils.logger.c.b("OnlineConfig", "convert list error", e2.getMessage());
            }
        }
        return arrayList;
    }

    /* renamed from: a, reason: collision with other method in class */
    private List<Pair<Integer, Object>> m758a(List<Pair<Integer, Object>> list) {
        if (com.xiaomi.push.ab.a(list)) {
            return list;
        }
        try {
            Pair<Integer, Object> a2 = a(list);
            list.remove(a2);
            list.add(new Pair<>(Integer.valueOf(hz.AppIsInstalledList.a()), a(a2)));
            Collections.sort(list, new Comparator<Pair<Integer, Object>>() { // from class: com.xiaomi.push.service.aq.1
                @Override // java.util.Comparator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public int compare(Pair<Integer, Object> pair, Pair<Integer, Object> pair2) {
                    return Integer.compare(((Integer) pair.first).intValue(), ((Integer) pair2.first).intValue());
                }
            });
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.b("OnlineConfig", "sort config error", e2.getMessage());
        }
        return list;
    }

    /* renamed from: a, reason: collision with other method in class */
    private boolean m761a(List<Pair<ia, Integer>> list) {
        if (com.xiaomi.push.ab.a(list)) {
            return false;
        }
        try {
            for (Pair<ia, Integer> pair : list) {
                Object obj = pair.first;
                if (obj != null && pair.second != null && this.f1043a.getInt(a((ia) obj), 0) != ((Integer) pair.second).intValue()) {
                    return false;
                }
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.b("OnlineConfig", "compare version error", e2.getMessage());
        }
        return true;
    }

    public void a(int i, List<Pair<ia, Integer>> list, int i2) {
        aq aqVar;
        try {
            HashMap hashMap = new HashMap();
            long currentTimeMillis = System.currentTimeMillis();
            hashMap.put("uuid", a());
            try {
                if (this.f9317c != null) {
                    JSONObject m759a = m759a(i);
                    int i3 = this.f9317c.getInt("oc_request_count", 0);
                    int i4 = this.f9317c.getInt("oc_normal_count", 0);
                    int i5 = this.f9317c.getInt("oc_custom_count", 0);
                    try {
                        long j = this.f9317c.getLong("oc_report_start_time", 0L);
                        hashMap.put("oc_data", m759a.toString());
                        hashMap.put("oc_request_count", Integer.valueOf(i3));
                        hashMap.put("oc_normal_count", Integer.valueOf(i4));
                        hashMap.put("oc_custom_count", Integer.valueOf(i5));
                        hashMap.put("oc_start_time", Long.valueOf(j));
                        hashMap.put("oc_end_time", Long.valueOf(currentTimeMillis));
                        if (i == 0) {
                            hashMap.put("oc_report_type", 0);
                            aqVar = this;
                            aqVar.m760a((Map<String, Object>) hashMap);
                        } else {
                            aqVar = this;
                            if (i == 3) {
                                hashMap.put("oc_report_type", 1);
                                aqVar.a(hashMap, i2);
                            } else {
                                if (i != 2) {
                                    return;
                                }
                                hashMap.put("oc_report_type", 1);
                                aqVar.a(hashMap, list, i2);
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        com.xiaomi.channel.commonutils.logger.c.b("OnlineConfig", "report oc error", e.getMessage());
                        return;
                    }
                } else {
                    aqVar = this;
                }
                fw.a().a("oc_update", hashMap);
                SharedPreferences sharedPreferences = aqVar.f9317c;
                if (sharedPreferences != null) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    long j2 = aqVar.f9317c.getLong("oc_last_schedule_report_time", 0L);
                    edit.clear();
                    edit.putLong("oc_report_start_time", currentTimeMillis);
                    edit.putLong("oc_last_schedule_report_time", j2);
                    edit.apply();
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private void m760a(Map<String, Object> map) {
        SharedPreferences sharedPreferences;
        if (map == null || this.f1043a == null || (sharedPreferences = this.f9317c) == null) {
            return;
        }
        String string = sharedPreferences.getString("oc_custom_config_md5", "");
        int i = this.f1043a.getInt(a(ia.MISC_CONFIG), 0);
        int i2 = this.f1043a.getInt(a(ia.PLUGIN_CONFIG), 0);
        map.put("oc_custom_config_md5", string);
        map.put("oc_local_misc_version", Integer.valueOf(i));
        map.put("oc_local_plugin_version", Integer.valueOf(i2));
    }

    private void a(Map<String, Object> map, List<Pair<ia, Integer>> list, int i) {
        SharedPreferences sharedPreferences;
        Object obj;
        if (map == null || com.xiaomi.push.ab.a(list) || this.f1043a == null || (sharedPreferences = this.f9317c) == null) {
            return;
        }
        try {
            int i2 = sharedPreferences.getInt("oc_old_misc_version", 0);
            int i3 = this.f9317c.getInt("oc_old_plugin_version", 0);
            int i4 = this.f1043a.getInt(a(ia.MISC_CONFIG), 0);
            int i5 = this.f1043a.getInt(a(ia.PLUGIN_CONFIG), 0);
            int i6 = -1;
            int i7 = -1;
            for (Pair<ia, Integer> pair : list) {
                Object obj2 = pair.first;
                if (obj2 != null && (obj = pair.second) != null) {
                    if (obj2 == ia.MISC_CONFIG) {
                        i6 = ((Integer) obj).intValue();
                    } else if (obj2 == ia.PLUGIN_CONFIG) {
                        i7 = ((Integer) obj).intValue();
                    }
                }
            }
            map.put("oc_update_type", "normal");
            map.put("oc_old_misc_version", Integer.valueOf(i2));
            map.put("oc_old_plugin_version", Integer.valueOf(i3));
            map.put("oc_local_misc_version", Integer.valueOf(i4));
            map.put("oc_local_plugin_version", Integer.valueOf(i5));
            map.put("oc_new_misc_version", Integer.valueOf(i6));
            map.put("oc_new_plugin_version", Integer.valueOf(i7));
            map.put("oc_update_result", Integer.valueOf(i));
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.b("OnlineConfig", "add normal update report param error", e2.getMessage());
        }
    }

    private void a(Map<String, Object> map, int i) {
        SharedPreferences sharedPreferences;
        if (map == null || (sharedPreferences = this.f9317c) == null) {
            return;
        }
        String string = sharedPreferences.getString("oc_custom_config_md5", "");
        map.put("oc_update_type", MonitorConstants.CUSTOM);
        map.put("oc_custom_config_md5", string);
        map.put("oc_update_result", Integer.valueOf(i));
    }

    /* renamed from: a, reason: collision with other method in class */
    private JSONObject m759a(int i) {
        Map emptyMap = Collections.emptyMap();
        if (i == 3) {
            if (this.b != null) {
                emptyMap = new HashMap(this.b.getAll());
            }
        } else if (this.f1043a != null) {
            emptyMap = new HashMap(this.f1043a.getAll());
        }
        if (emptyMap != null && !emptyMap.isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : emptyMap.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (str != null && value != null) {
                    try {
                        jSONObject.put(str, value);
                    } catch (JSONException e2) {
                        com.xiaomi.channel.commonutils.logger.c.b("OnlineConfig", "put JSON error", e2.getMessage());
                    }
                }
            }
            return jSONObject;
        }
        return new JSONObject();
    }

    private String a() {
        String string = this.f1042a.getSharedPreferences("mipush_account", 0).getString("uuid", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String[] split = string.split("@");
        if (split.length > 0) {
            return split[0];
        }
        return null;
    }

    private void a(SharedPreferences.Editor editor, Pair<Integer, Object> pair, String str) {
        Object obj = pair.second;
        if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            editor.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str.equals(a(hz.AppIsInstalledList.a()))) {
                editor.putString(str, com.xiaomi.push.bj.a(str2));
                return;
            } else {
                editor.putString(str, str2);
                return;
            }
        }
        if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    public int a(int i, int i2) {
        try {
            String a2 = a(i);
            if (this.b.contains(a2)) {
                return this.b.getInt(a2, 0);
            }
            return this.f1043a.contains(a2) ? this.f1043a.getInt(a2, 0) : i2;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.m15a(i + " oc int error " + e2.getMessage());
            return i2;
        }
    }

    public long a(int i, long j) {
        try {
            String a2 = a(i);
            if (this.b.contains(a2)) {
                return this.b.getLong(a2, 0L);
            }
            return this.f1043a.contains(a2) ? this.f1043a.getLong(a2, 0L) : j;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.m15a(i + " oc long error " + e2.getMessage());
            return j;
        }
    }

    public String a(int i, String str) {
        try {
            String a2 = a(i);
            if (this.b.contains(a2)) {
                return this.b.getString(a2, null);
            }
            return this.f1043a.contains(a2) ? this.f1043a.getString(a2, null) : str;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.m15a(i + " oc string error " + e2.getMessage());
            return str;
        }
    }

    public boolean a(int i, boolean z) {
        try {
            String a2 = a(i);
            if (this.b.contains(a2)) {
                return this.b.getBoolean(a2, false);
            }
            return this.f1043a.contains(a2) ? this.f1043a.getBoolean(a2, false) : z;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.m15a(i + " oc boolean error " + e2.getMessage());
            return z;
        }
    }

    public int a(ia iaVar, int i) {
        try {
            return this.f1043a.getInt(a(iaVar), i);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.m15a(iaVar + " version error " + e2.getMessage());
            return i;
        }
    }

    private String a(int i) {
        return e.a.a.a.a.j("oc_", i);
    }

    private String a(ia iaVar) {
        StringBuilder M = e.a.a.a.a.M("oc_version_");
        M.append(iaVar.a());
        return M.toString();
    }
}
