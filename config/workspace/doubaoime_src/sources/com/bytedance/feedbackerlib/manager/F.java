package com.bytedance.feedbackerlib.manager;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.feedbackerlib.Feedbacker;
import com.bytedance.feedbackerlib.model.b;
import com.ss.android.socialbase.downloader.segment.Segment;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class F {

    /* renamed from: e, reason: collision with root package name */
    private static final Map<String, F> f4803e = new HashMap();
    private final Context a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<b> f4804c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private com.bytedance.feedbackerlib.model.j.d f4805d;

    class a implements b.r {
        a() {
        }

        @Override // com.bytedance.feedbackerlib.model.b.r
        public void a(int i, String str) {
            if (i == 1) {
                return;
            }
            F.this.f4805d = com.bytedance.feedbackerlib.model.b.F().G(F.this.b);
            synchronized (F.this.f4804c) {
                Iterator it2 = F.this.f4804c.iterator();
                while (it2.hasNext()) {
                    ((b) it2.next()).a();
                }
            }
        }
    }

    public interface b {
        void a();
    }

    private F(@NonNull Context context, @NonNull String str) {
        this.a = context.getApplicationContext();
        this.b = str;
        com.bytedance.feedbackerlib.model.j.d G = com.bytedance.feedbackerlib.model.b.F().G(str);
        this.f4805d = G;
        if (G == null) {
            String h = h(e.a.a.a.a.t("default_translation_", str, ".json"));
            h = TextUtils.isEmpty(h) ? h("default_translation_en.json") : h;
            com.bytedance.feedbackerlib.model.j.d dVar = null;
            if (h != null) {
                try {
                    dVar = com.bytedance.feedbackerlib.model.j.d.b(h);
                } catch (Throwable unused) {
                }
            }
            this.f4805d = dVar;
            i();
        }
    }

    public static synchronized F d() {
        F f2;
        synchronized (F.class) {
            String e2 = e();
            Map<String, F> map = f4803e;
            if (map.get(e2) == null) {
                map.put(e2, new F(Feedbacker.getApplicationContext(), e2));
            }
            f2 = map.get(e2);
        }
        return f2;
    }

    @NonNull
    public static synchronized String e() {
        synchronized (F.class) {
            String language = Locale.getDefault().getLanguage();
            if (TextUtils.isEmpty(language)) {
                return Segment.JsonKey.END;
            }
            if ("zh".equals(language)) {
                language = "zh-CN";
            }
            return language;
        }
    }

    private String h(@NonNull String str) {
        try {
            InputStream open = this.a.getAssets().open(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = open.read(bArr);
                if (read <= 0) {
                    return byteArrayOutputStream.toString("UTF-8");
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    public String f(@NonNull String str) {
        com.bytedance.feedbackerlib.model.j.d dVar = this.f4805d;
        Map<String, String> map = dVar == null ? null : dVar.a;
        String str2 = map != null ? map.get(str) : null;
        return TextUtils.isEmpty(str2) ? "no translation" : str2;
    }

    public com.bytedance.feedbackerlib.model.j.d g() {
        return this.f4805d;
    }

    public void i() {
        com.bytedance.feedbackerlib.model.b.F().T(this.b, new a());
    }

    public void j(@NonNull b bVar) {
        synchronized (this.f4804c) {
            this.f4804c.add(bVar);
        }
    }

    public void k(@NonNull b bVar) {
        synchronized (this.f4804c) {
            this.f4804c.remove(bVar);
        }
    }
}
