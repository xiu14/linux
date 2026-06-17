package com.bytedance.android.input.basic.recognition.api;

import android.annotation.SuppressLint;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import kotlin.h;
import kotlin.reflect.i;
import kotlin.s.c.A;
import kotlin.s.c.g;
import kotlin.s.c.l;
import kotlin.s.c.m;
import kotlin.s.c.o;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: e, reason: collision with root package name */
    public static final C0057a f2075e;

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ i<Object>[] f2076f;
    private final com.bytedance.android.input.basic.b.a a;
    private final com.bytedance.android.input.basic.b.a b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bytedance.android.input.basic.b.a f2077c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlin.text.i f2078d;

    /* renamed from: com.bytedance.android.input.basic.recognition.api.a$a, reason: collision with other inner class name */
    public static final class C0057a {

        /* renamed from: com.bytedance.android.input.basic.recognition.api.a$a$a, reason: collision with other inner class name */
        public static final class C0058a extends a {
            C0058a(String str) {
                super(str);
            }
        }

        public C0057a(g gVar) {
        }

        @SuppressLint({"[ByDesign7.2]WeakEncryptionOrHashingAlgorithm"})
        public final a a(String str) {
            Object J2;
            l.f(str, DBDefinition.PACKAGE_NAME);
            C0058a c0058a = new C0058a(str);
            try {
                byte[] bytes = str.getBytes(kotlin.text.c.a);
                l.e(bytes, "this as java.lang.String).getBytes(charset)");
                byte[] digest = MessageDigest.getInstance("MD5").digest(bytes);
                StringBuilder sb = new StringBuilder();
                l.e(digest, "digest");
                for (byte b : digest) {
                    String format = String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(b & 255)}, 1));
                    l.e(format, "format(format, *args)");
                    sb.append(format);
                }
                J2 = sb.toString();
            } catch (Throwable th) {
                J2 = r.J(th);
            }
            if (J2 instanceof h.a) {
                J2 = "";
            }
            c0058a.h((String) J2);
            return c0058a;
        }
    }

    public static final class b {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            Objects.requireNonNull((b) obj);
            return l.a(null, null) && l.a(null, null);
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            return "ConversationItem(isSelf=false, role=null, text=null, isSystem=false)";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class c extends m implements kotlin.s.b.l<b, Boolean> {
        public static final c a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public Boolean invoke(b bVar) {
            l.f(bVar, "it");
            return Boolean.TRUE;
        }
    }

    static final class d extends m implements kotlin.s.b.l<b, CharSequence> {
        public static final d a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public CharSequence invoke(b bVar) {
            l.f(bVar, "it");
            return "null:null";
        }
    }

    static {
        o oVar = new o(a.class, "conversationId", "getConversationId()Ljava/lang/String;", 0);
        A.e(oVar);
        o oVar2 = new o(a.class, "conversationTitle", "getConversationTitle()Ljava/lang/String;", 0);
        A.e(oVar2);
        o oVar3 = new o(a.class, "conversationList", "getConversationList()Ljava/util/List;", 0);
        A.e(oVar3);
        f2076f = new i[]{oVar, oVar2, oVar3};
        f2075e = new C0057a(null);
    }

    public a(String str) {
        l.f(str, DBDefinition.PACKAGE_NAME);
        this.a = d.a.b.a.l("");
        this.b = d.a.b.a.l("他人");
        this.f2077c = d.a.b.a.l(kotlin.collections.l.a);
        this.f2078d = new kotlin.text.i("[\\s\\S]+\\([1-9]\\d*\\)");
        new LinkedHashMap();
    }

    public static /* synthetic */ String b(a aVar, kotlin.s.b.l lVar, int i, Object obj) {
        return aVar.a((i & 1) != 0 ? c.a : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a(kotlin.s.b.l<? super b, Boolean> lVar) {
        l.f(lVar, "predicate");
        List<b> d2 = d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : d2) {
            if (lVar.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return kotlin.collections.g.C(arrayList, "\n", null, null, 0, null, d.a, 30, null);
    }

    public String c() {
        return (String) this.a.b(f2076f[0]);
    }

    public final List<b> d() {
        return (List) this.f2077c.b(f2076f[2]);
    }

    public final String e() {
        return (String) this.b.b(f2076f[1]);
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && l.a(c(), ((a) obj).c());
    }

    public final boolean f() {
        List<b> d2 = d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : d2) {
            Objects.requireNonNull((b) obj);
            arrayList.add(obj);
        }
        return arrayList.isEmpty();
    }

    public boolean g() {
        return this.f2078d.d(e());
    }

    protected void h(String str) {
        l.f(str, "<set-?>");
        this.a.a(this, f2076f[0], str);
    }

    public int hashCode() {
        return c().hashCode();
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("conversationId = ");
        M.append(c());
        M.append("\n            conversationTitle = ");
        M.append(e());
        M.append("\n            conversationList = ");
        M.append(b(this, null, 1, null));
        return kotlin.text.a.W(M.toString());
    }
}
