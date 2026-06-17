package com.bumptech.glide.load.j;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class k implements i {
    private final Map<String, List<j>> b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Map<String, String> f1710c;

    public static final class a {
        private static final String b;

        /* renamed from: c, reason: collision with root package name */
        private static final Map<String, List<j>> f1711c;
        private Map<String, List<j>> a = f1711c;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i = 0; i < length; i++) {
                    char charAt = property.charAt(i);
                    if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                        sb.append(charAt);
                    } else {
                        sb.append('?');
                    }
                }
                property = sb.toString();
            }
            b = property;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put(DownloadConstants.USER_AGENT, Collections.singletonList(new b(property)));
            }
            f1711c = Collections.unmodifiableMap(hashMap);
        }

        public k a() {
            return new k(this.a);
        }
    }

    static final class b implements j {

        @NonNull
        private final String a;

        b(@NonNull String str) {
            this.a = str;
        }

        @Override // com.bumptech.glide.load.j.j
        public String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return e.a.a.a.a.H(e.a.a.a.a.M("StringHeaderFactory{value='"), this.a, '\'', '}');
        }
    }

    k(Map<String, List<j>> map) {
        this.b = Collections.unmodifiableMap(map);
    }

    private Map<String, String> a() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<j>> entry : this.b.entrySet()) {
            List<j> value = entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = value.size();
            for (int i = 0; i < size; i++) {
                String a2 = value.get(i).a();
                if (!TextUtils.isEmpty(a2)) {
                    sb.append(a2);
                    if (i != value.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                hashMap.put(entry.getKey(), sb2);
            }
        }
        return hashMap;
    }

    @Override // com.bumptech.glide.load.j.i
    public Map<String, String> d() {
        if (this.f1710c == null) {
            synchronized (this) {
                if (this.f1710c == null) {
                    this.f1710c = Collections.unmodifiableMap(a());
                }
            }
        }
        return this.f1710c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.b.equals(((k) obj).b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("LazyHeaders{headers=");
        M.append(this.b);
        M.append('}');
        return M.toString();
    }
}
