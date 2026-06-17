package com.ss.ugc.effectplatform.algorithm;

import android.content.Context;
import android.content.res.AssetManager;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.ugc.effectplatform.util.i;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.g;
import kotlin.h;
import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.c.m;
import kotlin.s.c.z;

/* loaded from: classes2.dex */
public final class e {
    private final d.a.a.b<String, String> a = new d.a.a.b<>(true);
    private final d.a.a.b<String, Boolean> b = new d.a.a.b<>(true);

    /* renamed from: c, reason: collision with root package name */
    private final d.a.a.b<String, String> f8439c = new d.a.a.b<>(true);

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<String> f8440d = g.c("algo_ggl1pqhlhmg7p");

    /* renamed from: e, reason: collision with root package name */
    private final Object f8441e;

    static final class a extends m implements l<String, o> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.b = str;
        }

        @Override // kotlin.s.b.l
        public o invoke(String str) {
            kotlin.s.c.l.g(str, "it");
            e.this.b.put(this.b, Boolean.TRUE);
            return o.a;
        }
    }

    static final class b extends m implements l<String, o> {
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z f8442c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, z zVar) {
            super(1);
            this.b = str;
            this.f8442c = zVar;
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object, java.lang.String] */
        @Override // kotlin.s.b.l
        public o invoke(String str) {
            String str2 = str;
            kotlin.s.c.l.g(str2, DownloadConstants.PATH_KEY);
            e.this.f8439c.put(this.b, str2);
            this.f8442c.a = str2;
            return o.a;
        }
    }

    public e(Object obj, String str, boolean z) {
        this.f8441e = obj;
    }

    private final boolean h(String str, l<? super String, o> lVar) {
        Object J2;
        try {
            J2 = str.substring(0, kotlin.text.a.w(str, "/", 0, false, 6, null));
            kotlin.s.c.l.b(J2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        if (J2 instanceof h.a) {
            J2 = "";
        }
        String str2 = (String) J2;
        if (kotlin.text.a.K(str2, "tt", false, 2, null)) {
            StringBuilder M = e.a.a.a.a.M("algo");
            String substring = str2.substring(2, str2.length());
            kotlin.s.c.l.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            M.append(substring);
            str2 = M.toString();
        }
        StringBuilder M2 = e.a.a.a.a.M("model");
        M2.append(str2.length() > 0 ? '/' + str2 : "");
        String sb = M2.toString();
        List<String> g2 = g(sb);
        i iVar = i.f8543c;
        String d2 = i.d(str);
        d.a.e.a aVar = d.a.e.a.b;
        String a2 = d.a.e.a.a(d2);
        if (g2 != null) {
            for (String str3 : g2) {
                i iVar2 = i.f8543c;
                if (kotlin.s.c.l.a(i.d(str3), a2)) {
                    lVar.invoke("asset://" + sb + '/' + str3);
                    return true;
                }
            }
        }
        return false;
    }

    private final bytekn.foundation.io.file.b i(String str) {
        if (!(this.f8441e instanceof Context) || k(str)) {
            return null;
        }
        Object obj = this.f8441e;
        if (obj == null) {
            throw new kotlin.l("null cannot be cast to non-null type android.content.Context");
        }
        Context applicationContext = ((Context) obj).getApplicationContext();
        kotlin.s.c.l.b(applicationContext, "(appContext as Context).applicationContext");
        AssetManager assets = applicationContext.getAssets();
        i iVar = i.f8543c;
        i.d(str);
        bytekn.foundation.io.file.b bVar = new bytekn.foundation.io.file.b();
        InputStream open = assets.open(str, 2);
        kotlin.s.c.l.b(open, "assetManager.open(fileNa…Manager.ACCESS_STREAMING)");
        kotlin.s.c.l.g(open, "<set-?>");
        bVar.a = open;
        return bVar;
    }

    private final boolean k(String str) {
        d.a.c.b.b.a("JKL", "[Model][BuiltIn][ignore built in model switch is CLOSED]");
        return false;
    }

    public final boolean c(String str) {
        Object J2;
        String str2;
        kotlin.s.c.l.g(str, "nameStr");
        StringBuilder sb = new StringBuilder();
        String str3 = "model";
        kotlin.s.c.l.g("model", "$this$joinFileSeperator");
        bytekn.foundation.io.file.c cVar = bytekn.foundation.io.file.c.b;
        if (!kotlin.text.a.g("model", cVar.i(), false, 2, null)) {
            StringBuilder M = e.a.a.a.a.M("model");
            M.append(cVar.i());
            str3 = M.toString();
        }
        sb.append(str3);
        String str4 = this.a.get(str);
        if (str4 == null) {
            try {
                J2 = str.substring(0, kotlin.text.a.w(str, "/", 0, false, 6, null));
                kotlin.s.c.l.b(J2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            } catch (Throwable th) {
                J2 = r.J(th);
            }
            if (J2 instanceof h.a) {
                J2 = "";
            }
            String str5 = (String) J2;
            if (kotlin.text.a.K(str5, "tt", false, 2, null)) {
                StringBuilder M2 = e.a.a.a.a.M("algo");
                String substring = str5.substring(2, str5.length());
                kotlin.s.c.l.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                M2.append(substring);
                str2 = kotlin.text.a.E(str, str5, M2.toString(), false, 4, null);
            } else {
                str2 = str;
            }
            i iVar = i.f8543c;
            String d2 = i.d(str);
            d.a.e.a aVar = d.a.e.a.b;
            str4 = kotlin.text.a.E(str2, d2, d.a.e.a.a(d2), false, 4, null);
            this.a.put(str, str4);
        }
        sb.append(str4);
        return e(sb.toString());
    }

    public final boolean d(String str) {
        kotlin.s.c.l.g(str, "nameStr");
        Boolean bool = this.b.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        if (h(str, new a(str))) {
            return true;
        }
        boolean e2 = e("model/" + str);
        this.b.put(str, Boolean.valueOf(e2));
        return e2;
    }

    public final boolean e(String str) {
        kotlin.s.c.l.g(str, "fileName");
        if (k(str)) {
            return false;
        }
        try {
            bytekn.foundation.io.file.b i = i(str);
            boolean z = i != null;
            if (i != null) {
                bytekn.foundation.io.file.c.b.b(i);
            }
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String f(String str) {
        kotlin.s.c.l.g(str, "nameStr");
        String str2 = this.f8439c.get(str);
        if (str2 != null) {
            return str2;
        }
        z zVar = new z();
        zVar.a = "";
        h(str, new b(str, zVar));
        if (!kotlin.text.a.s((String) zVar.a)) {
            return (String) zVar.a;
        }
        String s = e.a.a.a.a.s("asset://model/", str);
        this.f8439c.put(str, s);
        return s;
    }

    public final List<String> g(String str) {
        kotlin.s.c.l.g(str, "filePath");
        Object obj = this.f8441e;
        if (!(obj instanceof Context)) {
            return null;
        }
        try {
            Context applicationContext = ((Context) obj).getApplicationContext();
            kotlin.s.c.l.b(applicationContext, "appContext.applicationContext");
            String[] list = applicationContext.getAssets().list(str);
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (String str2 : list) {
                kotlin.s.c.l.b(str2, "it");
                if (!k(str2)) {
                    arrayList.add(str2);
                }
            }
            return g.e0(arrayList);
        } catch (Exception e2) {
            d.a.c.b.b.b("effect_platform", "error in list file: " + str, e2);
            return null;
        }
    }

    public final String j(String str) {
        kotlin.s.c.l.g(str, "filePath");
        if (!(this.f8441e instanceof Context) || k(str)) {
            return null;
        }
        try {
            Context applicationContext = ((Context) this.f8441e).getApplicationContext();
            kotlin.s.c.l.b(applicationContext, "appContext.applicationContext");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(applicationContext.getAssets().open(str)));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        String sb2 = sb.toString();
                        r.E(bufferedReader, null);
                        return sb2;
                    }
                    sb.append(readLine);
                }
            } finally {
            }
        } catch (Exception unused) {
            d.a.c.b.b.a("effect_platform", "AssetUtils#loadJson::jsonFilePath=" + str + ", file not exists");
            return null;
        }
    }
}
