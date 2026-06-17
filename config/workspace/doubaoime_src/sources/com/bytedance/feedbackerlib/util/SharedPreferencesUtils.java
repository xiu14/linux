package com.bytedance.feedbackerlib.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.feedbackerlib.Feedbacker;
import com.bytedance.feedbackerlib.matisse.internal.entity.Item;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class SharedPreferencesUtils {
    private static SharedPreferences a;

    public enum BOOLEAN_CACHE {
        ORIGIN_ENABLED("feedbacker_origin_enabled"),
        HAS_DENIED_OVERLAY_PERMISSION("feedbacker_has_denied_overlay_permission"),
        HIDE_FLOAT_WINDOW("feedbacker_hide_float_window");

        private String mFieldName;

        BOOLEAN_CACHE(@NonNull String str) {
            this.mFieldName = str;
            if (TextUtils.isEmpty(str)) {
                this.mFieldName = "feedbacker_boolean_unknown";
            }
        }

        public boolean get(boolean z) {
            return !SharedPreferencesUtils.c() ? z : SharedPreferencesUtils.a.getBoolean(this.mFieldName, z);
        }

        public void put(boolean z) {
            if (SharedPreferencesUtils.c()) {
                SharedPreferencesUtils.a.edit().putBoolean(this.mFieldName, z).commit();
            }
        }
    }

    public enum LONG_CACHE {
        LAST_SSO_TIMESTAMP("feedbacker_last_sso_timestamp"),
        DURATION_PROCESS_ALIVE("feedbacker_duration_process_alive"),
        APP_VERSION("feedbacker_app_version");

        private String mFieldName;

        LONG_CACHE(@NonNull String str) {
            this.mFieldName = str;
            if (TextUtils.isEmpty(str)) {
                this.mFieldName = "feedbacker_long_unknown";
            }
        }

        public long get(long j) {
            return !SharedPreferencesUtils.c() ? j : SharedPreferencesUtils.a.getLong(this.mFieldName, j);
        }

        public void put(long j) {
            if (SharedPreferencesUtils.c()) {
                SharedPreferencesUtils.a.edit().putLong(this.mFieldName, j).commit();
            }
        }
    }

    public enum STRING_CACHE {
        TYPE("feedbacker_type"),
        RECURRENCE("feedbacker_recurrence"),
        CLASSIFICATION("feedbacker_classification"),
        PRIORI("feedbacker_priori"),
        ADVICE("feedbacker_advice"),
        CUSTOM("feedbacker_custom"),
        REMARK("feedbacker_remark"),
        SSO_EMAIL("feedbacker_sso_email"),
        MEDIA_URI_STRING("feedbacker_media_uri_string"),
        QUESTION_CACHE("feedbacker_question_cache"),
        Other_CACHE("feedbacker_other_cache"),
        FEEDBACK_LOCALE("feedbacker_feedback_locale"),
        USER_ACCESS_TOKEN("feedbacker_user_access_token"),
        EMPLOYEE_ID("feedbacker_employee_id");

        private String mFieldName;

        class a extends com.google.gson.u.a<List<a>> {
            a(STRING_CACHE string_cache) {
            }
        }

        class b extends com.google.gson.u.a<List<String>> {
            b(STRING_CACHE string_cache) {
            }
        }

        STRING_CACHE(@NonNull String str) {
            this.mFieldName = str;
            if (TextUtils.isEmpty(str)) {
                this.mFieldName = "feedbacker_string_unknown";
            }
        }

        public String get(@Nullable String str) {
            return !SharedPreferencesUtils.c() ? str : SharedPreferencesUtils.a.getString(this.mFieldName, str);
        }

        public List<Item> getItemList() {
            String str = get("");
            if (TextUtils.isEmpty(str)) {
                return new ArrayList();
            }
            Gson gson = new Gson();
            try {
                List<a> list = (List) gson.d(str, new a(this).e());
                ArrayList arrayList = new ArrayList();
                for (a aVar : list) {
                    Item item = new Item(aVar.a, aVar.b, aVar.f4976c, aVar.f4977d, aVar.f4979f);
                    item.f4853c = Uri.parse(aVar.f4978e);
                    arrayList.add(item);
                }
                return arrayList;
            } catch (Throwable unused) {
                List list2 = (List) gson.d(str, new b(this).e());
                if (list2 == null || Feedbacker.getApplicationContext() == null) {
                    return new ArrayList();
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new Item(Feedbacker.getApplicationContext(), Uri.parse((String) it2.next())));
                }
                return arrayList2;
            }
        }

        public void put(String str) {
            if (SharedPreferencesUtils.c()) {
                SharedPreferencesUtils.a.edit().putString(this.mFieldName, str).commit();
            }
        }

        public void putItemList(List<Item> list) {
            if (list == null) {
                return;
            }
            Gson gson = new Gson();
            ArrayList arrayList = new ArrayList();
            Iterator<Item> it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    arrayList.add(new a(it2.next()));
                } catch (Throwable unused) {
                }
            }
            put(gson.j(arrayList));
        }
    }

    public static class a {
        public final long a;
        public final String b;

        /* renamed from: c, reason: collision with root package name */
        public final long f4976c;

        /* renamed from: d, reason: collision with root package name */
        public final long f4977d;

        /* renamed from: e, reason: collision with root package name */
        public final String f4978e;

        /* renamed from: f, reason: collision with root package name */
        public final String f4979f;

        public a(Item item) {
            this.a = item.a;
            this.b = item.b;
            this.f4976c = item.f4854d;
            this.f4977d = item.f4855e;
            this.f4978e = item.f4853c.toString();
            this.f4979f = item.f4856f;
        }
    }

    public static synchronized void b(@NonNull Context context) {
        synchronized (SharedPreferencesUtils.class) {
            Context applicationContext = context.getApplicationContext();
            if (a == null) {
                a = applicationContext.getSharedPreferences("com.bytedance.feedbacker.feedbacker_cache", 0);
            }
            String a2 = h.a(context);
            if (!TextUtils.isEmpty(a2) && a2.endsWith(":feedbacker")) {
                LONG_CACHE long_cache = LONG_CACHE.LAST_SSO_TIMESTAMP;
                if (long_cache.get(-1L) < 0) {
                    long_cache.put(System.currentTimeMillis());
                }
            }
        }
    }

    public static synchronized boolean c() {
        boolean z;
        synchronized (SharedPreferencesUtils.class) {
            z = a != null;
        }
        return z;
    }
}
