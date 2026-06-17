package com.bytedance.android.input.speech;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.util.Base64;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.common.asr.api.IAsr;
import com.bytedance.android.input.editor.SelectionTracker;
import com.bytedance.android.input.environment.api.IEnvironment;
import com.bytedance.android.input.llm.LLMRequest;
import com.bytedance.android.input.m.a;
import com.bytedance.android.input.network.api.IRecommends;
import com.bytedance.android.input.speech.constants.SpeechRecognitionType;
import com.bytedance.crash.general.RomInfo;
import com.bytedance.retrofit2.N;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonToken;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.message.log.PushLog;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.io.FileWalkDirection;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.C0800f0;
import kotlinx.coroutines.S;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AsrContext {
    private static CopyOnWriteArrayList<a> A = null;
    private static a B = null;
    private static final int C;
    private static SpeechRecognitionType D = null;
    private static boolean E = false;
    private static String b = "";

    /* renamed from: c, reason: collision with root package name */
    private static String f3045c = "";

    /* renamed from: d, reason: collision with root package name */
    private static int f3046d;
    private static final Gson i;
    private static volatile String j;
    private static boolean k;
    private static boolean l;
    private static boolean m;
    private static int n;
    private static String o;
    private static int p;
    private static boolean q;
    private static boolean r;
    private static boolean s;
    private static boolean t;
    private static int u;
    private static int v;
    private static int w;
    private static int x;
    private static int y;
    private static CopyOnWriteArrayList<a> z;
    public static final AsrContext a = new AsrContext();

    /* renamed from: e, reason: collision with root package name */
    private static final List<JSONObject> f3047e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private static List<b> f3048f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private static List<String> f3049g = new ArrayList();
    private static String h = "";

    private static final class JsonArrayTypeAdapter extends TypeAdapter<JSONArray> {
        @Override // com.google.gson.TypeAdapter
        public JSONArray b(com.google.gson.stream.a aVar) {
            kotlin.s.c.l.f(aVar, "in");
            if (aVar.c0() == JsonToken.NULL) {
                aVar.S();
                return null;
            }
            try {
                return new JSONArray(com.google.gson.n.a(aVar).toString());
            } catch (Exception e2) {
                AsrContext asrContext = AsrContext.a;
                com.bytedance.android.input.r.j.k("Asr-Flow-AsrContext", "Failed to parse JSONArray from json reader", e2);
                return null;
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void c(com.google.gson.stream.b bVar, JSONArray jSONArray) {
            JSONArray jSONArray2 = jSONArray;
            kotlin.s.c.l.f(bVar, "out");
            if (jSONArray2 == null) {
                bVar.D();
            } else {
                bVar.x(jSONArray2.toString());
            }
        }
    }

    private static final class JsonObjectTypeAdapter extends TypeAdapter<JSONObject> {
        @Override // com.google.gson.TypeAdapter
        public JSONObject b(com.google.gson.stream.a aVar) {
            kotlin.s.c.l.f(aVar, "in");
            if (aVar.c0() == JsonToken.NULL) {
                aVar.S();
                return null;
            }
            try {
                return new JSONObject(com.google.gson.n.a(aVar).toString());
            } catch (Exception e2) {
                AsrContext asrContext = AsrContext.a;
                com.bytedance.android.input.r.j.k("Asr-Flow-AsrContext", "Failed to parse JSONObject from json reader", e2);
                return null;
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void c(com.google.gson.stream.b bVar, JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            kotlin.s.c.l.f(bVar, "out");
            if (jSONObject2 == null) {
                bVar.D();
            } else {
                bVar.x(jSONObject2.toString());
            }
        }
    }

    public static final class b {
        private final String a;
        private String b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f3055c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f3056d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f3057e;

        /* renamed from: f, reason: collision with root package name */
        private String f3058f;

        public b(String str, String str2, boolean z, boolean z2, boolean z3, String str3, int i) {
            z = (i & 4) != 0 ? false : z;
            z2 = (i & 8) != 0 ? false : z2;
            z3 = (i & 16) != 0 ? false : z3;
            String str4 = (i & 32) != 0 ? "" : null;
            e.a.a.a.a.u0(str, "id", str2, "content", str4, "mForceFrom");
            this.a = str;
            this.b = str2;
            this.f3055c = z;
            this.f3056d = z2;
            this.f3057e = z3;
            this.f3058f = str4;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public final boolean c() {
            return this.f3056d;
        }

        public final String d() {
            return this.f3058f;
        }

        public final boolean e() {
            return this.f3057e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.s.c.l.a(this.a, bVar.a) && kotlin.s.c.l.a(this.b, bVar.b) && this.f3055c == bVar.f3055c && this.f3056d == bVar.f3056d && this.f3057e == bVar.f3057e && kotlin.s.c.l.a(this.f3058f, bVar.f3058f);
        }

        public final boolean f() {
            return this.f3055c;
        }

        public final void g(String str) {
            kotlin.s.c.l.f(str, "<set-?>");
            this.b = str;
        }

        public final void h(boolean z) {
            this.f3056d = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int p0 = e.a.a.a.a.p0(this.b, this.a.hashCode() * 31, 31);
            boolean z = this.f3055c;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (p0 + i) * 31;
            boolean z2 = this.f3056d;
            int i3 = z2;
            if (z2 != 0) {
                i3 = 1;
            }
            int i4 = (i2 + i3) * 31;
            boolean z3 = this.f3057e;
            return this.f3058f.hashCode() + ((i4 + (z3 ? 1 : z3 ? 1 : 0)) * 31);
        }

        public final void i(String str) {
            kotlin.s.c.l.f(str, "<set-?>");
            this.f3058f = str;
        }

        public final void j(boolean z) {
            this.f3057e = z;
        }

        public final void k(boolean z) {
            this.f3055c = z;
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("AsrRecordInfo(id=");
            M.append(this.a);
            M.append(", content=");
            M.append(this.b);
            M.append(", mOneAsrBack=");
            M.append(this.f3055c);
            M.append(", mAllAsrBack=");
            M.append(this.f3056d);
            M.append(", mForceStopNoWait=");
            M.append(this.f3057e);
            M.append(", mForceFrom=");
            return e.a.a.a.a.G(M, this.f3058f, ')');
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.speech.AsrContext$loadFeedbackListFromFile$1", f = "AsrContext.kt", l = {}, m = "invokeSuspend")
    static final class c extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.G, kotlin.r.d<? super kotlin.o>, Object> {

        static final class a extends kotlin.s.c.m implements kotlin.s.b.l<File, Boolean> {
            public static final a a = new a();

            a() {
                super(1);
            }

            @Override // kotlin.s.b.l
            public Boolean invoke(File file) {
                File file2 = file;
                kotlin.s.c.l.f(file2, "it");
                return Boolean.valueOf(file2.isFile() && kotlin.text.a.i(kotlin.io.b.b(file2), "pcm", true));
            }
        }

        public static final class b extends com.google.gson.u.a<ArrayList<a>> {
            b() {
            }
        }

        c(kotlin.r.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            return new c(dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(kotlinx.coroutines.G g2, kotlin.r.d<? super kotlin.o> dVar) {
            return new c(dVar).invokeSuspend(kotlin.o.a);
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            try {
                AsrContext asrContext = AsrContext.a;
                File file = new File(asrContext.y());
                AsrContext asrContext2 = AsrContext.a;
                com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", "AsrFeedbackInfo file = " + asrContext.y() + ", exist?: " + file.exists());
                if (file.exists()) {
                    com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", "AsrFeedbackInfo file exist: " + file.getAbsolutePath());
                    byte[] d2 = kotlin.io.b.d(file);
                    if (!(d2.length == 0)) {
                        com.bytedance.android.input.common.u.f fVar = com.bytedance.android.input.common.u.f.a;
                        kotlin.s.c.l.f(d2, RemoteMessageConst.DATA);
                        ArrayList arrayList = (ArrayList) AsrContext.i.d(new String(com.bytedance.android.input.common.u.f.a(d2), kotlin.text.c.a), new b().e());
                        if (arrayList != null) {
                            synchronized (AsrContext.z) {
                                AsrContext.z.clear();
                                AsrContext.z.addAll(arrayList);
                            }
                            com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", "AsrFeedbackInfo list loaded. New count: " + AsrContext.z.size());
                        }
                    }
                }
            } catch (com.google.gson.r e2) {
                AsrContext asrContext3 = AsrContext.a;
                com.bytedance.android.input.r.j.k("Asr-Flow-AsrContext", "Failed to parse AsrFeedbackInfo list from JSON.", e2);
                File file2 = new File(AsrContext.a.y());
                if (file2.exists()) {
                    file2.delete();
                }
            } catch (Exception e3) {
                AsrContext asrContext4 = AsrContext.a;
                com.bytedance.android.input.r.j.k("Asr-Flow-AsrContext", "Failed to load AsrFeedbackInfo list.", e3);
            }
            IEnvironment.a aVar = IEnvironment.a;
            Objects.requireNonNull(aVar);
            File file3 = new File(aVar.k());
            if (!file3.exists() || !file3.isDirectory()) {
                com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", "feedback voice folder not exists");
                return kotlin.o.a;
            }
            kotlin.s.c.l.f(file3, "<this>");
            FileWalkDirection fileWalkDirection = FileWalkDirection.TOP_DOWN;
            kotlin.s.c.l.f(file3, "<this>");
            kotlin.s.c.l.f(fileWalkDirection, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION);
            List<File> h = kotlin.x.h.h(kotlin.x.h.b(new kotlin.io.f(file3, fileWalkDirection), a.a));
            if (h.isEmpty()) {
                com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", "feedback没有找到 .pcm 文件");
                return kotlin.o.a;
            }
            for (File file4 : h) {
                Iterator it2 = AsrContext.z.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (AsrContext.a.E(((a) obj2).n()).equals(file4.getAbsolutePath())) {
                        break;
                    }
                }
                a aVar2 = (a) obj2;
                AsrContext asrContext5 = AsrContext.a;
                StringBuilder M = e.a.a.a.a.M("找文件: ");
                M.append(file4.getAbsolutePath());
                M.append(",info ");
                M.append(aVar2);
                com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", M.toString());
                if (aVar2 == null) {
                    StringBuilder M2 = e.a.a.a.a.M("feedback 找到文件: ");
                    M2.append(file4.getAbsolutePath());
                    com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", M2.toString());
                    if (file4.delete()) {
                        StringBuilder M3 = e.a.a.a.a.M("feedback 已删除: ");
                        M3.append(file4.getAbsolutePath());
                        com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", M3.toString());
                    } else {
                        StringBuilder M4 = e.a.a.a.a.M("feedback 删除失败: ");
                        M4.append(file4.getAbsolutePath());
                        com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", M4.toString());
                    }
                }
            }
            return kotlin.o.a;
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.speech.AsrContext$persistFeedbackList$1", f = "AsrContext.kt", l = {}, m = "invokeSuspend")
    static final class d extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.G, kotlin.r.d<? super kotlin.o>, Object> {
        d(kotlin.r.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            return new d(dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(kotlinx.coroutines.G g2, kotlin.r.d<? super kotlin.o> dVar) {
            new d(dVar);
            kotlin.o oVar = kotlin.o.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            com.prolificinteractive.materialcalendarview.r.k0(oVar);
            AsrContext.a.S();
            return oVar;
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            AsrContext.a.S();
            return kotlin.o.a;
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.speech.AsrContext$reportAsrContent$1", f = "AsrContext.kt", l = {}, m = "invokeSuspend")
    static final class e extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.G, kotlin.r.d<? super kotlin.o>, Object> {
        final /* synthetic */ com.google.gson.l a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(com.google.gson.l lVar, kotlin.r.d<? super e> dVar) {
            super(2, dVar);
            this.a = lVar;
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            return new e(this.a, dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(kotlinx.coroutines.G g2, kotlin.r.d<? super kotlin.o> dVar) {
            e eVar = new e(this.a, dVar);
            kotlin.o oVar = kotlin.o.a;
            eVar.invokeSuspend(oVar);
            return oVar;
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            try {
                N<String> execute = IRecommends.a.i().request(this.a, true).execute();
                AsrContext asrContext = AsrContext.a;
                com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", "requestAsrRecord, response is " + execute.a());
            } catch (Exception e2) {
                AsrContext asrContext2 = AsrContext.a;
                e.a.a.a.a.o0("requestAsrRecord, e = ", e2, "Asr-Flow-AsrContext");
            }
            return kotlin.o.a;
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.speech.AsrContext$reportUserExpImprovementData$1$1", f = "AsrContext.kt", l = {}, m = "invokeSuspend")
    static final class f extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.G, kotlin.r.d<? super kotlin.o>, Object> {
        final /* synthetic */ com.google.gson.l a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(com.google.gson.l lVar, kotlin.r.d<? super f> dVar) {
            super(2, dVar);
            this.a = lVar;
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            return new f(this.a, dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(kotlinx.coroutines.G g2, kotlin.r.d<? super kotlin.o> dVar) {
            f fVar = new f(this.a, dVar);
            kotlin.o oVar = kotlin.o.a;
            fVar.invokeSuspend(oVar);
            return oVar;
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            try {
                N execute = com.bytedance.android.input.k.b.a.E0(IRecommends.a.k(), this.a, false, 2, null).execute();
                AsrContext asrContext = AsrContext.a;
                com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", "reportUserExpImprovementData, response is " + ((String) execute.a()));
            } catch (Exception e2) {
                AsrContext asrContext2 = AsrContext.a;
                e.a.a.a.a.o0("reportUserExpImprovementData, e = ", e2, "Asr-Flow-AsrContext");
            }
            return kotlin.o.a;
        }
    }

    static {
        com.google.gson.d dVar = new com.google.gson.d();
        dVar.d(JSONObject.class, new JsonObjectTypeAdapter());
        dVar.d(JSONArray.class, new JsonArrayTypeAdapter());
        Gson c2 = dVar.c();
        kotlin.s.c.l.e(c2, "GsonBuilder()\n        .r…pter())\n        .create()");
        i = c2;
        j = "";
        o = "";
        p = -1;
        z = new CopyOnWriteArrayList<>();
        A = new CopyOnWriteArrayList<>();
        C = 30;
        D = SpeechRecognitionType.DEFAULT;
    }

    private AsrContext() {
    }

    private final String A() {
        LinkProperties linkProperties;
        List<LinkAddress> linkAddresses;
        LinkAddress linkAddress;
        InetAddress address;
        Context context = IAppGlobals.a.getContext();
        Object systemService = context.getApplicationContext().getSystemService("wifi");
        kotlin.s.c.l.d(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        int ipAddress = ((WifiManager) systemService).getConnectionInfo().getIpAddress();
        if (ipAddress != 0) {
            String format = String.format("%d.%d.%d.%d", Arrays.copyOf(new Object[]{Integer.valueOf(ipAddress & 255), Integer.valueOf((ipAddress >> 8) & 255), Integer.valueOf((ipAddress >> 16) & 255), Integer.valueOf((ipAddress >> 24) & 255)}, 4));
            kotlin.s.c.l.e(format, "format(format, *args)");
            return format;
        }
        Object systemService2 = context.getSystemService("connectivity");
        kotlin.s.c.l.d(systemService2, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService2;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        String str = null;
        if (activeNetwork != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null && (linkAddresses = linkProperties.getLinkAddresses()) != null && (linkAddress = (LinkAddress) kotlin.collections.g.u(linkAddresses)) != null && (address = linkAddress.getAddress()) != null) {
            str = address.getHostAddress();
        }
        return str == null ? "0.0.0.0" : str;
    }

    private final void I(String str) {
        IAppGlobals.a.j("Asr-Flow-AsrContext", str);
    }

    private final void J(String str) {
        IAppGlobals.a.x("Asr-Flow-AsrContext", str);
    }

    private final void K(String str) {
        if (str.length() == 0) {
            return;
        }
        int length = str.length();
        kotlin.w.b h2 = kotlin.w.h.h(kotlin.w.h.i(0, length), 2000);
        int a2 = h2.a();
        int b2 = h2.b();
        int c2 = h2.c();
        if ((c2 <= 0 || a2 > b2) && (c2 >= 0 || b2 > a2)) {
            return;
        }
        while (true) {
            String substring = str.substring(a2, Math.min(a2 + 2000, length));
            kotlin.s.c.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", substring);
            if (a2 == b2) {
                return;
            } else {
                a2 += c2;
            }
        }
    }

    private final boolean L(String str, String str2) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        File file = new File(str);
        File file2 = new File(str2);
        com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", "moveFile oldPath = " + str + ", newPath = " + str2);
        boolean z2 = false;
        if (file.exists()) {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    fileOutputStream = new FileOutputStream(file2);
                } finally {
                }
            } catch (IOException e2) {
                com.bytedance.android.input.r.j.k("Asr-Flow-AsrContext", e.a.a.a.a.u("moveFile Failed to move file from ", str, " to ", str2), e2);
                if (file2.exists()) {
                    file2.delete();
                }
            }
            try {
                com.prolificinteractive.materialcalendarview.r.H(fileInputStream, fileOutputStream, 0, 2);
                com.prolificinteractive.materialcalendarview.r.E(fileOutputStream, null);
                com.prolificinteractive.materialcalendarview.r.E(fileInputStream, null);
                file.delete();
                z2 = true;
                e.a.a.a.a.y0("moveFile isSuccess = ", z2, "Asr-Flow-AsrContext");
            } finally {
            }
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S() {
        List Z;
        try {
            synchronized (z) {
                Z = kotlin.collections.g.Z(z, C);
            }
            if (Z.isEmpty()) {
                return;
            }
            String j2 = i.j(Z);
            File file = new File(y());
            com.bytedance.android.input.common.u.f fVar = com.bytedance.android.input.common.u.f.a;
            kotlin.s.c.l.e(j2, "jsonString");
            byte[] bytes = j2.getBytes(kotlin.text.c.a);
            kotlin.s.c.l.e(bytes, "this as java.lang.String).getBytes(charset)");
            kotlin.io.b.e(file, com.bytedance.android.input.common.u.f.a(bytes));
            com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", "AsrFeedbackInfo list persisted successfully. Count: " + Z.size());
        } catch (Exception e2) {
            com.bytedance.android.input.r.j.k("Asr-Flow-AsrContext", "Failed to persist AsrFeedbackInfo list.", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0135, code lost:
    
        r1 = com.bytedance.android.input.speech.AsrContext.z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0137, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0138, code lost:
    
        com.bytedance.android.input.speech.AsrContext.z.clear();
        com.bytedance.android.input.speech.AsrContext.z.addAll(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0142, code lost:
    
        monitor-exit(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(com.bytedance.android.input.speech.AsrContext r8) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.speech.AsrContext.c(com.bytedance.android.input.speech.AsrContext):void");
    }

    private final void n() {
        f3048f.clear();
        f3049g.clear();
        h = "";
        r = false;
    }

    private final void q(String str) {
        File file = new File(E(str));
        com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", "deleteVoiceFile fileName = " + str);
        if (!file.exists()) {
            com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", "feedback = " + file + " 文件不存在");
            return;
        }
        try {
            if (file.delete()) {
                com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", "feedback = " + file + " 文件删除成功");
            } else {
                com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", "feedback = " + file + " 文件删除失败");
            }
        } catch (Exception e2) {
            com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", "feedback = " + file + " 文件删除异常 it=" + e2);
        }
    }

    public final CopyOnWriteArrayList<a> B() {
        return A;
    }

    public final void C(JSONObject jSONObject) {
        if (jSONObject != null) {
            jSONObject.put("modify", u);
        }
        if (jSONObject != null) {
            jSONObject.put("modify_add", w);
        }
        if (jSONObject != null) {
            jSONObject.put("modify_delete", v);
        }
        if (jSONObject != null) {
            jSONObject.put("modify_replace", x);
        }
        if (jSONObject != null) {
            jSONObject.put("modify_enter", y);
        }
        u = 0;
        w = 0;
        v = 0;
        x = 0;
        y = 0;
    }

    public final SpeechRecognitionType D() {
        return D;
    }

    public final String E(String str) {
        kotlin.s.c.l.f(str, "fileName");
        StringBuilder sb = new StringBuilder();
        IEnvironment.a aVar = IEnvironment.a;
        Objects.requireNonNull(aVar);
        sb.append(aVar.k());
        sb.append(str);
        return sb.toString();
    }

    public final boolean F() {
        return q;
    }

    public final boolean G() {
        int i2 = f3046d & 15;
        return i2 == 3 || i2 == 2;
    }

    public final void H() {
        C0795d.l(C0800f0.a, S.b(), null, new c(null), 2, null);
    }

    public final void M() {
        C0795d.l(C0800f0.a, S.b(), null, new d(null), 2, null);
    }

    public final void N(int i2) {
        boolean booleanValue = ((Boolean) e.a.a.a.a.L0(IAppGlobals.a, C0838R.string.enable_report_inputdata, "IAppGlobals.context.getS….enable_report_inputdata)", "null cannot be cast to non-null type kotlin.Boolean")).booleanValue();
        e.a.a.a.a.y0("reportAsrContent, isEnableReportData = ", booleanValue, "Asr-Flow-AsrContext");
        if (!booleanValue) {
            n();
            return;
        }
        if (f3048f.isEmpty()) {
            n();
            return;
        }
        com.google.gson.f fVar = new com.google.gson.f();
        Iterator<b> it2 = f3048f.iterator();
        int i3 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            b next = it2.next();
            if (!(next.a().length() == 0)) {
                com.google.gson.l lVar = new com.google.gson.l();
                lVar.g("id", next.b());
                lVar.g("content", next.a());
                lVar.f("one_on_screen", Integer.valueOf(next.f() ? 1 : 2));
                lVar.f("all_on_screen", Integer.valueOf(next.c() ? 1 : 2));
                lVar.f("force_over", Integer.valueOf(next.e() ? 1 : 2));
                lVar.g("force_over_type", next.d());
                fVar.d(lVar);
                i3 += next.a().length();
            }
        }
        if (i3 == 0 || i3 > 500) {
            n();
            return;
        }
        String k2 = com.bytedance.android.input.speech.view.l.a.k();
        kotlin.s.c.l.f(k2, "result");
        f3049g.add(k2);
        com.google.gson.f fVar2 = new com.google.gson.f();
        int i4 = 0;
        for (String str : f3049g) {
            fVar2.f(str);
            i4 += str.length();
        }
        if (i2 == 1 && fVar2.size() > 1) {
            fVar2.f(h);
            i4 += h.length();
        }
        if (i4 > 1000) {
            n();
            return;
        }
        com.google.gson.l lVar2 = new com.google.gson.l();
        IAppLog.a aVar = IAppLog.a;
        Objects.requireNonNull(aVar);
        lVar2.g("did", aVar.getDeviceId());
        lVar2.d("tasks", fVar);
        lVar2.d("send_content", fVar2);
        lVar2.f("send_type", Integer.valueOf(i2));
        com.google.gson.l lVar3 = new com.google.gson.l();
        String substring = b.substring(0, b.length() <= 64 ? b.length() : 64);
        kotlin.s.c.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        lVar3.g("app_name", substring);
        lVar3.g("indextype", f3045c);
        lVar3.f("punctuation_status", Integer.valueOf(r ? 5 : 6));
        lVar2.d("send_before", lVar3);
        com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", "requestAsrRecord, asrRecordInfo is " + lVar2);
        C0795d.b(C0800f0.a, S.b(), null, new e(lVar2, null), 2, null);
        n();
    }

    public final void O() {
        if (f3048f.isEmpty()) {
            return;
        }
        a.C0084a c2 = com.bytedance.android.input.m.a.c(true);
        if (c2.b()) {
            com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", "reportAsrGlobalMetrics, allText isAtLimit, SKIP reportAsrGlobalMetrics");
            return;
        }
        if (c2.a().length() == 0) {
            com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", "reportAsrGlobalMetrics, allText.text is empty, SKIP reportAsrGlobalMetrics");
            return;
        }
        String a2 = c2.a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_input_send", 0);
        jSONObject.put("send_text", a2);
        jSONObject.put(Constants.PACKAGE_NAME, b);
        JSONArray jSONArray = new JSONArray();
        for (b bVar : f3048f) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("text", bVar.a());
            jSONObject2.put("is_interim", !bVar.c());
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("asr_results", jSONArray);
        if (d.a.b.a.h(IAppGlobals.a)) {
            StringBuilder sb = new StringBuilder();
            sb.append("reportAsrGlobalMetrics, jsonObject = ");
            sb.append(jSONObject);
            sb.append(", packageName = ");
            e.a.a.a.a.H0(sb, b, "Asr-Flow-AsrContext");
        }
        IAsr a3 = IAsr.a.a(IAsr.Type.SDK);
        if (a3 != null) {
            a3.g(jSONObject);
        }
    }

    public final void P(String str) {
        kotlin.s.c.l.f(str, "inputInfo");
        IAppGlobals.a aVar = IAppGlobals.a;
        boolean booleanValue = ((Boolean) e.a.a.a.a.L0(aVar, C0838R.string.enable_report_inputdata, "IAppGlobals.context.getS….enable_report_inputdata)", "null cannot be cast to non-null type kotlin.Boolean")).booleanValue();
        e.a.a.a.a.y0("reportUserExpImprovementData, isEnableReportData = ", booleanValue, "Asr-Flow-AsrContext");
        if (booleanValue) {
            try {
                com.google.gson.l lVar = new com.google.gson.l();
                IAppLog.a aVar2 = IAppLog.a;
                Objects.requireNonNull(aVar2);
                lVar.g("did", aVar2.getDeviceId());
                lVar.g("app_version", "1.3.9");
                lVar.f("report_time", Long.valueOf(System.currentTimeMillis()));
                lVar.g(RomInfo.KEY_OS_TYPE, "android");
                lVar.g("app_channel", d.a.b.a.c(aVar));
                lVar.g(RomInfo.KEY_ROM_OS_VERSION, Build.VERSION.RELEASE);
                lVar.f("sdk_int", Integer.valueOf(Build.VERSION.SDK_INT));
                lVar.g("manufacturer", Build.MANUFACTURER);
                lVar.g("model", Build.MODEL);
                lVar.g("user_app", aVar.H());
                lVar.d("region", LLMRequest.a.h());
                lVar.g("content", str);
                com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", "reportUserExpImprovementData, UserExpInfo is " + lVar + ", inputInfo len= " + str.length());
                C0795d.b(C0800f0.a, S.b(), null, new f(lVar, null), 2, null);
            } catch (Throwable th) {
                com.prolificinteractive.materialcalendarview.r.J(th);
            }
        }
    }

    public final void Q() {
        if (E) {
            com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", "asrGlobalMetricsReseted, SKIP resetAsrGlobalMetrics");
            return;
        }
        com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", "resetAsrGlobalMetrics");
        IAsr a2 = IAsr.a.a(IAsr.Type.SDK);
        if (a2 != null) {
            a2.h();
        }
    }

    public final void R() {
        J("resetSpeechRecognitionType");
        D = SpeechRecognitionType.DEFAULT;
    }

    public final void T(int i2, boolean z2) {
        if (f3048f.isEmpty()) {
            return;
        }
        if (i2 == 1) {
            ((b) kotlin.collections.g.D(f3048f)).k(z2);
        } else {
            if (i2 != 2) {
                return;
            }
            ((b) kotlin.collections.g.D(f3048f)).h(z2);
        }
    }

    public final void U(boolean z2) {
        E = z2;
    }

    public final void V(boolean z2) {
        e.a.a.a.a.y0("requestAsrRecord, setAsrTextPunctHaveDelete ", z2, "Asr-Flow-AsrContext");
        r = z2;
    }

    public final void W(boolean z2) {
        l = z2;
    }

    public final void X(int i2, int i3) {
        int d2;
        com.bytedance.android.input.speech.view.l lVar = com.bytedance.android.input.speech.view.l.a;
        int h2 = lVar.h();
        int i4 = i2 - h2;
        int i5 = i3 - h2;
        if (o.length() == 0) {
            p = lVar.d(i4, i5);
        } else if (p != -1 && p != (d2 = lVar.d(i4, i5))) {
            p = -1;
            e.a.a.a.a.j0("setDeleteTextNBestIndex: ", d2, "Asr-Flow-AsrContext");
        }
        boolean s2 = lVar.s(i2, i3);
        if (o.length() == 0) {
            q = s2;
        } else if (q) {
            q = s2;
        }
        if (s2) {
            s = true;
        }
        StringBuilder O = e.a.a.a.a.O("[delete]: setDeleteTextNBestIndex: ", i2, ", ", i3, ", mDeleteTextNBestIndex = ");
        O.append(p);
        O.append(", mDeleteText = ");
        O.append(q);
        com.bytedance.android.input.r.j.m("Asr-Flow-AsrContext", O.toString());
    }

    public final void Y(int i2) {
        Object obj;
        CopyOnWriteArrayList<a> copyOnWriteArrayList = A;
        if (i2 < 0 || i2 >= copyOnWriteArrayList.size()) {
            com.bytedance.android.input.r.j.r("Asr-Flow-AsrContext", "setFeedbackItemSubmitted called with invalid index: " + i2);
            return;
        }
        a aVar = copyOnWriteArrayList.get(i2);
        aVar.u(true);
        synchronized (z) {
            Iterator<T> it2 = z.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (kotlin.s.c.l.a(((a) obj).l(), aVar.l())) {
                        break;
                    }
                }
            }
            a aVar2 = (a) obj;
            if (aVar2 != null) {
                aVar2.u(true);
            }
        }
        StringBuilder N = e.a.a.a.a.N("Feedback item at index ", i2, " (startTime: ");
        N.append(aVar.l());
        N.append(") marked as submitted.");
        com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", N.toString());
    }

    public final void Z(boolean z2, String str) {
        kotlin.s.c.l.f(str, "from");
        com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", "requestAsrRecord, setForceStop " + z2 + ", " + str + ", " + f3048f.isEmpty());
        if (f3048f.isEmpty()) {
            return;
        }
        ((b) kotlin.collections.g.D(f3048f)).j(z2);
        ((b) kotlin.collections.g.D(f3048f)).i(str);
    }

    public final void a0(String str, int i2) {
        String str2;
        int i3;
        kotlin.s.c.l.f(str, DBDefinition.PACKAGE_NAME);
        b = str;
        int i4 = i2 & 15;
        if (i4 == 1) {
            int i5 = i2 & 4080;
            if (i5 == 32) {
                str2 = "TYPE_TEXT_VARIATION_EMAIL_ADDRESS";
            } else if (i5 == 128 || i5 == 144 || i5 == 224) {
                str2 = "TYPE_TEXT_VARIATION_PASSWORD";
            } else if (i5 == 16) {
                str2 = "TYPE_TEXT_VARIATION_URI";
            }
            f3045c = str2;
            k = (i4 == 1 || (i3 = i2 & 4080) == 32 || i3 == 128 || i3 == 144 || i3 == 224 || i3 == 16) ? false : true;
            f3046d = i2;
            e.a.a.a.a.N0(e.a.a.a.a.V("packageName: ", str, ", inputType: ", i2, ", isTextInputType: "), k, "Asr-Flow-AsrContext");
        }
        str2 = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? "UNKNOWN_TYPE" : "TYPE_CLASS_DATETIME" : "TYPE_CLASS_PHONE" : "TYPE_CLASS_NUMBER" : "TYPE_CLASS_TEXT";
        f3045c = str2;
        k = (i4 == 1 || (i3 = i2 & 4080) == 32 || i3 == 128 || i3 == 144 || i3 == 224 || i3 == 16) ? false : true;
        f3046d = i2;
        e.a.a.a.a.N0(e.a.a.a.a.V("packageName: ", str, ", inputType: ", i2, ", isTextInputType: "), k, "Asr-Flow-AsrContext");
    }

    public final void b0(SpeechRecognitionType speechRecognitionType) {
        kotlin.s.c.l.f(speechRecognitionType, "speechRecognitionType");
        if (D == SpeechRecognitionType.DEFAULT) {
            StringBuilder M = e.a.a.a.a.M("setSpeechRecognitionType origin type = DEFAULT current type = ");
            M.append(speechRecognitionType.name());
            J(M.toString());
            D = speechRecognitionType;
            return;
        }
        if (D == speechRecognitionType) {
            StringBuilder M2 = e.a.a.a.a.M("setSpeechRecognitionType origin type = ");
            M2.append(D.name());
            M2.append(" current = ");
            M2.append(speechRecognitionType.name());
            I(M2.toString());
            return;
        }
        StringBuilder M3 = e.a.a.a.a.M("setSpeechRecognitionType switch type origin = ");
        M3.append(D.name());
        M3.append(" current = ");
        M3.append(speechRecognitionType.name());
        J(M3.toString());
        D = SpeechRecognitionType.ON_OFF;
    }

    public final void c0(boolean z2) {
        m = z2;
        e.a.a.a.a.y0("setUseVoiceInput: ", z2, "Asr-Flow-AsrContext");
    }

    public final void d0(String str, String str2) {
        a aVar;
        kotlin.s.c.l.f(str, "result");
        kotlin.s.c.l.f(str2, "voiceFile");
        if ((str2.length() == 0) || (aVar = B) == null) {
            return;
        }
        aVar.x(str);
        aVar.z(str2);
        aVar.f().put("online_result", aVar.j());
        aVar.f().put("offline_result", aVar.i());
        aVar.f().put(DBDefinition.TASK_ID, aVar.m());
        aVar.f().put("startTime", aVar.l());
        aVar.f().put("file", aVar.n());
        CopyOnWriteArrayList<a> copyOnWriteArrayList = z;
        int size = copyOnWriteArrayList.size();
        AsrContext asrContext = a;
        if (size >= C) {
            asrContext.q(copyOnWriteArrayList.remove(z.size() - 1).n());
        }
        copyOnWriteArrayList.add(0, aVar);
        asrContext.K("feedback = " + aVar);
    }

    public final void e(String str, String str2) {
        kotlin.s.c.l.f(str, "id");
        kotlin.s.c.l.f(str2, "content");
        f3048f.add(new b(str, str2, false, false, false, null, 60));
        a aVar = B;
        if (aVar != null) {
            aVar.y(str);
        }
        StringBuilder M = e.a.a.a.a.M("addAsrRecordContent last ");
        M.append(kotlin.collections.g.D(f3048f));
        com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", M.toString());
    }

    public final void e0(int i2, int i3, boolean z2) {
        CopyOnWriteArrayList<a> copyOnWriteArrayList = A;
        if (i2 < 0 || i2 >= copyOnWriteArrayList.size()) {
            return;
        }
        if (i3 == 1) {
            if (z2) {
                copyOnWriteArrayList.get(i2).f().put("before_context", copyOnWriteArrayList.get(i2).c());
                return;
            } else {
                copyOnWriteArrayList.get(i2).f().remove("before_context");
                return;
            }
        }
        if (i3 == 2) {
            if (z2) {
                copyOnWriteArrayList.get(i2).f().put("after_context", copyOnWriteArrayList.get(i2).b());
                return;
            } else {
                copyOnWriteArrayList.get(i2).f().remove("after_context");
                return;
            }
        }
        if (i3 == 3) {
            if (z2) {
                copyOnWriteArrayList.get(i2).f().put("chat", copyOnWriteArrayList.get(i2).e());
                return;
            } else {
                copyOnWriteArrayList.get(i2).f().remove("chat");
                return;
            }
        }
        if (i3 == 4) {
            if (z2) {
                copyOnWriteArrayList.get(i2).f().put("hotwords", copyOnWriteArrayList.get(i2).p());
                return;
            } else {
                copyOnWriteArrayList.get(i2).f().remove("hotwords");
                return;
            }
        }
        if (i3 != 5) {
            return;
        }
        if (z2) {
            copyOnWriteArrayList.get(i2).f().put("modify_pair_info", copyOnWriteArrayList.get(i2).h());
        } else {
            copyOnWriteArrayList.get(i2).f().remove("modify_pair_info");
        }
    }

    public final void f(String str) {
        kotlin.s.c.l.f(str, "result");
        f3049g.add(str);
    }

    public final void f0(String str, boolean z2, boolean z3) {
        a aVar;
        kotlin.s.c.l.f(str, "content");
        if (f3048f.isEmpty()) {
            I("mAsrContentList is null");
        } else {
            ((b) kotlin.collections.g.D(f3048f)).g(str);
        }
        h = com.bytedance.android.input.common.g.a();
        if (!z2) {
            a aVar2 = B;
            if (aVar2 != null) {
                aVar2.w(str);
            }
        } else if (z3 && (aVar = B) != null) {
            aVar.v(aVar.i() + str);
        }
        if (f3048f.isEmpty()) {
            return;
        }
        StringBuilder M = e.a.a.a.a.M("updateAsrRecordContent last ");
        M.append(kotlin.collections.g.D(f3048f));
        I(M.toString());
    }

    public final void g(int i2) {
        n += i2;
        e.a.a.a.a.B0(e.a.a.a.a.M("[delete]: addDeleteCounts: mDeleteCounts = "), n, "Asr-Flow-AsrContext");
    }

    public final void g0() {
        String asrUsrDictInfo = KeyboardJni.getKeyboardJni().getAsrUsrDictInfo();
        kotlin.s.c.l.e(asrUsrDictInfo, "getKeyboardJni().asrUsrDictInfo");
        j = asrUsrDictInfo;
        e.a.a.a.a.H0(e.a.a.a.a.M("update asr usr dict info: "), j, "Asr-Flow-AsrContext");
    }

    public final void h(String str) {
        kotlin.s.c.l.f(str, "deleteText");
        o = str + o;
        if (s && !t) {
            u++;
            v++;
            t = true;
        }
        StringBuilder U = e.a.a.a.a.U("[delete]: setDeleteText: ", str, ", mDelText: ");
        U.append(o);
        U.append(", mDeleteTextSubInAsr: ");
        U.append(s);
        U.append(", mDeleteModifyHaveAdd: ");
        U.append(t);
        U.append(", mAsrTextModify = ");
        U.append(u);
        U.append(", mAsrTextModifyDelete = ");
        e.a.a.a.a.B0(U, v, "Asr-Flow-AsrContext");
    }

    public final void h0(boolean z2) {
        if (!k || (!l && !z2)) {
            o();
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", m ? "asr_input" : "user_input");
        String GetHansOrHant = KeyboardJni.GetHansOrHant(1, com.bytedance.android.input.m.a.c(true).a());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("cursor_position", com.bytedance.android.input.m.a.m(true).length());
        jSONObject2.put("text", GetHansOrHant);
        jSONObject.put(RemoteMessageConst.DATA, jSONObject2.toString());
        jSONObject.put(CrashHianalyticsData.TIME, String.valueOf(System.currentTimeMillis()));
        jSONObject.put("app_apk_name", b);
        List<JSONObject> list = f3047e;
        list.add(jSONObject);
        if (list.size() > 20) {
            list.remove(0);
        }
        com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", "add chatHistory: " + jSONObject);
        o();
    }

    public final void i(int i2, String str, String str2, String str3, String str4, String str5) {
        kotlin.s.c.l.f(str, "did");
        kotlin.s.c.l.f(str2, "versionName");
        kotlin.s.c.l.f(str3, "buildTime");
        kotlin.s.c.l.f(str4, "reportTime");
        kotlin.s.c.l.f(str5, PushLog.KEY_CATEGORY);
        CopyOnWriteArrayList<a> copyOnWriteArrayList = A;
        if (i2 < 0 || i2 >= copyOnWriteArrayList.size()) {
            return;
        }
        copyOnWriteArrayList.get(i2).f().put(PushLog.KEY_CATEGORY, str5);
        copyOnWriteArrayList.get(i2).f().put("did", str);
        copyOnWriteArrayList.get(i2).f().put("versionName", str2);
        copyOnWriteArrayList.get(i2).f().put("buildTime", str3);
        copyOnWriteArrayList.get(i2).f().put("report_time", str4);
    }

    public final void i0() {
        kotlin.g<String, String> j0 = j0(false);
        String a2 = j0.a();
        String b2 = j0.b();
        String localDateTime = LocalDateTime.now().toString();
        kotlin.s.c.l.e(localDateTime, "now().toString()");
        JSONArray jSONArray = null;
        a aVar = new a(null, null, null, null, localDateTime, null, null, null, null, null, null, jSONArray, jSONArray, null, null, false, 65519);
        B = aVar;
        if (aVar != null) {
            aVar.s(a2);
        }
        a aVar2 = B;
        if (aVar2 != null) {
            aVar2.r(b2);
        }
        com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", "updateChatHistoryBeforeStartAsr");
        h0(true);
    }

    public final void j(SelectionTracker.ActionType actionType, boolean z2) {
        kotlin.s.c.l.f(actionType, "action");
        int ordinal = actionType.ordinal();
        if (ordinal == 2) {
            if (o.length() == 0) {
                u++;
                if (z2) {
                    x++;
                } else {
                    w++;
                }
            } else {
                v--;
                x++;
            }
        } else if (ordinal == 7) {
            u++;
            y++;
        }
        StringBuilder M = e.a.a.a.a.M("[delete]: addModifyAsr: mAsrTextModify = ");
        M.append(u);
        M.append(", mAsrTextModifyAdd = ");
        M.append(w);
        M.append(" mAsrTextModifyDelete = ");
        M.append(v);
        M.append(" mAsrTextModifyReplace = ");
        M.append(x);
        M.append(" mAsrTextModifyEnter = ");
        e.a.a.a.a.B0(M, y, "Asr-Flow-AsrContext");
    }

    public final kotlin.g<String, String> j0(boolean z2) {
        String m2 = com.bytedance.android.input.m.a.m(z2);
        String k2 = com.bytedance.android.input.m.a.k(z2);
        com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", "updateContextInfo");
        return new kotlin.g<>(m2, k2);
    }

    public final void k(int i2, String str) {
        kotlin.s.c.l.f(str, "id");
        CopyOnWriteArrayList<a> copyOnWriteArrayList = A;
        if (i2 < 0 || i2 >= copyOnWriteArrayList.size()) {
            return;
        }
        copyOnWriteArrayList.get(i2).f().put("record_id", str);
        copyOnWriteArrayList.get(i2).f().put("audio_file_key", str);
    }

    public final void l(int i2, String str) {
        kotlin.s.c.l.f(str, "result");
        CopyOnWriteArrayList<a> copyOnWriteArrayList = A;
        if (i2 < 0 || i2 >= copyOnWriteArrayList.size()) {
            return;
        }
        copyOnWriteArrayList.get(i2).f().put("content", str);
    }

    public final boolean m() {
        if (!f3048f.isEmpty()) {
            return ((b) kotlin.collections.g.D(f3048f)).c();
        }
        com.bytedance.android.input.r.j.j("Asr-Flow-AsrContext", "allAsrBack, mAsrContentList isEmpty");
        return false;
    }

    public final void o() {
        l = false;
        m = false;
    }

    public final void p() {
        n = 0;
        com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", "clearDeleteCounts");
        o = "";
        p = -1;
        q = false;
        s = false;
        t = false;
        com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", "[delete]: clearDeleteText");
    }

    public final boolean r() {
        String b2;
        String c2;
        a aVar = B;
        if ((aVar == null || (c2 = aVar.c()) == null || c2.length() != 0) ? false : true) {
            a aVar2 = B;
            if ((aVar2 == null || (b2 = aVar2.b()) == null || b2.length() != 0) ? false : true) {
                return true;
            }
        }
        return false;
    }

    public final List<JSONObject> s() {
        return f3047e;
    }

    public final String t() {
        JSONObject f2;
        JSONObject f3;
        ArrayList<String> d2;
        JSONObject jSONObject = new JSONObject();
        StringBuilder M = e.a.a.a.a.M("feedback startTime: ");
        a aVar = B;
        e.a.a.a.a.H0(M, aVar != null ? aVar.l() : null, "Asr-Flow-AsrContext");
        try {
            List<JSONObject> list = f3047e;
            if (list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                kotlin.s.c.l.f("语音实时context", "from");
                String string = IAppGlobals.a.getContext().getString(C0838R.string.enable_cloud_use_partial_input);
                kotlin.s.c.l.e(string, "IAppGlobals.context.getS…_cloud_use_partial_input)");
                Object f4 = SettingsConfigNext.f(string);
                kotlin.s.c.l.d(f4, "null cannot be cast to non-null type kotlin.Boolean");
                Boolean bool = (Boolean) f4;
                com.bytedance.android.input.r.j.i("CloudConfig", "isSupportCoundUsePartialInput, from=语音实时context state: " + bool.booleanValue());
                if (bool.booleanValue()) {
                    int size = list.size();
                    while (true) {
                        size--;
                        if (-1 >= size) {
                            break;
                        }
                        List<JSONObject> list2 = f3047e;
                        jSONArray.put(list2.get(size));
                        String string2 = new JSONObject(list2.get(size).getString(RemoteMessageConst.DATA)).getString("text");
                        a aVar2 = B;
                        if (aVar2 != null && (d2 = aVar2.d()) != null) {
                            d2.add(string2);
                        }
                        com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", "feedback mChatHistoryList[" + size + "]: " + string2);
                    }
                }
                jSONObject.put("chat", jSONArray);
                a aVar3 = B;
                if (aVar3 != null) {
                    aVar3.t(jSONArray);
                }
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                AsrContext asrContext = a;
                jSONObject2.put("ip", asrContext.A());
                jSONObject.put("loc_info", jSONObject2);
                a aVar4 = B;
                if (aVar4 != null && (f3 = aVar4.f()) != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("ip", asrContext.A());
                    f3.put("loc_info", jSONObject3);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("app_apk_name", b);
            jSONObject4.put("input_type", f3045c);
            jSONObject.put("ime_info", jSONObject4);
            a aVar5 = B;
            if (aVar5 != null && (f2 = aVar5.f()) != null) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("app_apk_name", b);
                jSONObject5.put("input_type", f3045c);
                f2.put("ime_info", jSONObject5);
            }
            K("contextInfo: " + jSONObject);
            String jSONObject6 = jSONObject.toString();
            kotlin.s.c.l.e(jSONObject6, "contextInfo.toString()");
            byte[] bytes = jSONObject6.getBytes(kotlin.text.c.a);
            kotlin.s.c.l.e(bytes, "this as java.lang.String).getBytes(charset)");
            String encodeToString = Base64.encodeToString(bytes, 0);
            com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", "contextInfoBase64: " + encodeToString);
            kotlin.s.c.l.e(encodeToString, "contextInfoBase64");
            return encodeToString;
        } catch (Exception e3) {
            com.bytedance.android.input.r.j.j("Asr-Flow-AsrContext", e3.getMessage());
            e3.printStackTrace();
            return "";
        }
    }

    public final int u() {
        return n;
    }

    public final String v() {
        return o;
    }

    public final int w() {
        return p;
    }

    public final String x(int i2) {
        CopyOnWriteArrayList<a> copyOnWriteArrayList = A;
        if (i2 < 0 || i2 >= copyOnWriteArrayList.size()) {
            StringBuilder N = e.a.a.a.a.N("getFeedbackInfoBase64 index is invalid, index: ", i2, ", list size: ");
            N.append(copyOnWriteArrayList.size());
            com.bytedance.android.input.r.j.j("Asr-Flow-AsrContext", N.toString());
            return "";
        }
        String jSONObject = copyOnWriteArrayList.get(i2).f().toString();
        kotlin.s.c.l.e(jSONObject, "tempFeedbackInfoListShow…x].contextInfo.toString()");
        String encodeEncrpty = KeyboardJni.getKeyboardJni().encodeEncrpty(jSONObject);
        kotlin.s.c.l.e(encodeEncrpty, "bugDesc");
        return encodeEncrpty;
    }

    public final String y() {
        StringBuilder sb = new StringBuilder();
        IEnvironment.a aVar = IEnvironment.a;
        Objects.requireNonNull(aVar);
        sb.append(aVar.j());
        sb.append("voice_feedback_info.json");
        return sb.toString();
    }

    public final CopyOnWriteArrayList<a> z() {
        Object obj;
        CopyOnWriteArrayList<a> copyOnWriteArrayList = A;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : copyOnWriteArrayList) {
            a aVar = (a) obj2;
            Iterator<T> it2 = z.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (kotlin.s.c.l.a(aVar.n(), ((a) obj).n())) {
                    break;
                }
            }
            if (obj == null) {
                arrayList.add(obj2);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            a.q(((a) it3.next()).n());
        }
        copyOnWriteArrayList.clear();
        CopyOnWriteArrayList<a> copyOnWriteArrayList2 = z;
        CopyOnWriteArrayList<a> copyOnWriteArrayList3 = A;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g.e(copyOnWriteArrayList2, 10));
        for (a aVar2 : copyOnWriteArrayList2) {
            kotlin.s.c.l.e(aVar2, "it");
            arrayList2.add(Boolean.valueOf(copyOnWriteArrayList3.add(a.a(aVar2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 65535))));
        }
        return copyOnWriteArrayList3;
    }

    public static final class a {

        @SerializedName("a")
        private String a;

        @SerializedName(com.heytap.mcssdk.liquid.b.a)
        private String b;

        /* renamed from: c, reason: collision with root package name */
        @SerializedName("c")
        private String f3050c;

        /* renamed from: d, reason: collision with root package name */
        @SerializedName("d")
        private String f3051d;

        /* renamed from: e, reason: collision with root package name */
        @SerializedName("e")
        private String f3052e;

        /* renamed from: f, reason: collision with root package name */
        @SerializedName("f")
        private String f3053f;

        /* renamed from: g, reason: collision with root package name */
        @SerializedName("g")
        private String f3054g;

        @SerializedName("h")
        private String h;

        @SerializedName("i")
        private final ArrayList<String> i;

        @SerializedName("j")
        private String j;

        @SerializedName("k")
        private String k;

        @SerializedName("l")
        private JSONArray l;

        @SerializedName("m")
        private JSONArray m;

        @SerializedName("n")
        private JSONObject n;

        @SerializedName("o")
        private final JSONObject o;

        @SerializedName("p")
        private boolean p;

        public a() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 65535);
        }

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ArrayList<String> arrayList, String str9, String str10, JSONArray jSONArray, JSONArray jSONArray2, JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
            kotlin.s.c.l.f(str, "onlineResult");
            kotlin.s.c.l.f(str2, "offlineResult");
            kotlin.s.c.l.f(str3, "showResult");
            kotlin.s.c.l.f(str4, DBDefinition.TASK_ID);
            kotlin.s.c.l.f(str5, "startTime");
            kotlin.s.c.l.f(str6, "beforeContext");
            kotlin.s.c.l.f(str7, "afterContext");
            kotlin.s.c.l.f(str8, "voiceFilePath");
            kotlin.s.c.l.f(arrayList, "chatHistory");
            kotlin.s.c.l.f(str9, "wordHistory");
            kotlin.s.c.l.f(str10, "modifyHistory");
            kotlin.s.c.l.f(jSONArray, "chatHistoryJson");
            kotlin.s.c.l.f(jSONArray2, "wordHistoryJson");
            kotlin.s.c.l.f(jSONObject, "modifyHistoryJson");
            kotlin.s.c.l.f(jSONObject2, "contextInfo");
            this.a = str;
            this.b = str2;
            this.f3050c = str3;
            this.f3051d = str4;
            this.f3052e = str5;
            this.f3053f = str6;
            this.f3054g = str7;
            this.h = str8;
            this.i = arrayList;
            this.j = str9;
            this.k = str10;
            this.l = jSONArray;
            this.m = jSONArray2;
            this.n = jSONObject;
            this.o = jSONObject2;
            this.p = z;
        }

        public static a a(a aVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ArrayList arrayList, String str9, String str10, JSONArray jSONArray, JSONArray jSONArray2, JSONObject jSONObject, JSONObject jSONObject2, boolean z, int i) {
            String str11 = (i & 1) != 0 ? aVar.a : null;
            String str12 = (i & 2) != 0 ? aVar.b : null;
            String str13 = (i & 4) != 0 ? aVar.f3050c : null;
            String str14 = (i & 8) != 0 ? aVar.f3051d : null;
            String str15 = (i & 16) != 0 ? aVar.f3052e : null;
            String str16 = (i & 32) != 0 ? aVar.f3053f : null;
            String str17 = (i & 64) != 0 ? aVar.f3054g : null;
            String str18 = (i & 128) != 0 ? aVar.h : null;
            ArrayList<String> arrayList2 = (i & 256) != 0 ? aVar.i : null;
            String str19 = (i & 512) != 0 ? aVar.j : null;
            String str20 = (i & 1024) != 0 ? aVar.k : null;
            JSONArray jSONArray3 = (i & 2048) != 0 ? aVar.l : null;
            JSONArray jSONArray4 = (i & 4096) != 0 ? aVar.m : null;
            JSONObject jSONObject3 = (i & 8192) != 0 ? aVar.n : null;
            JSONObject jSONObject4 = (i & 16384) != 0 ? aVar.o : null;
            boolean z2 = (i & 32768) != 0 ? aVar.p : z;
            kotlin.s.c.l.f(str11, "onlineResult");
            kotlin.s.c.l.f(str12, "offlineResult");
            kotlin.s.c.l.f(str13, "showResult");
            kotlin.s.c.l.f(str14, DBDefinition.TASK_ID);
            kotlin.s.c.l.f(str15, "startTime");
            kotlin.s.c.l.f(str16, "beforeContext");
            kotlin.s.c.l.f(str17, "afterContext");
            kotlin.s.c.l.f(str18, "voiceFilePath");
            kotlin.s.c.l.f(arrayList2, "chatHistory");
            kotlin.s.c.l.f(str19, "wordHistory");
            kotlin.s.c.l.f(str20, "modifyHistory");
            kotlin.s.c.l.f(jSONArray3, "chatHistoryJson");
            kotlin.s.c.l.f(jSONArray4, "wordHistoryJson");
            kotlin.s.c.l.f(jSONObject3, "modifyHistoryJson");
            kotlin.s.c.l.f(jSONObject4, "contextInfo");
            return new a(str11, str12, str13, str14, str15, str16, str17, str18, arrayList2, str19, str20, jSONArray3, jSONArray4, jSONObject3, jSONObject4, z2);
        }

        public final String b() {
            return this.f3054g;
        }

        public final String c() {
            return this.f3053f;
        }

        public final ArrayList<String> d() {
            return this.i;
        }

        public final JSONArray e() {
            return this.l;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.s.c.l.a(this.a, aVar.a) && kotlin.s.c.l.a(this.b, aVar.b) && kotlin.s.c.l.a(this.f3050c, aVar.f3050c) && kotlin.s.c.l.a(this.f3051d, aVar.f3051d) && kotlin.s.c.l.a(this.f3052e, aVar.f3052e) && kotlin.s.c.l.a(this.f3053f, aVar.f3053f) && kotlin.s.c.l.a(this.f3054g, aVar.f3054g) && kotlin.s.c.l.a(this.h, aVar.h) && kotlin.s.c.l.a(this.i, aVar.i) && kotlin.s.c.l.a(this.j, aVar.j) && kotlin.s.c.l.a(this.k, aVar.k) && kotlin.s.c.l.a(this.l, aVar.l) && kotlin.s.c.l.a(this.m, aVar.m) && kotlin.s.c.l.a(this.n, aVar.n) && kotlin.s.c.l.a(this.o, aVar.o) && this.p == aVar.p;
        }

        public final JSONObject f() {
            return this.o;
        }

        public final String g() {
            return this.k;
        }

        public final JSONObject h() {
            return this.n;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = (this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + e.a.a.a.a.p0(this.k, e.a.a.a.a.p0(this.j, (this.i.hashCode() + e.a.a.a.a.p0(this.h, e.a.a.a.a.p0(this.f3054g, e.a.a.a.a.p0(this.f3053f, e.a.a.a.a.p0(this.f3052e, e.a.a.a.a.p0(this.f3051d, e.a.a.a.a.p0(this.f3050c, e.a.a.a.a.p0(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31, 31), 31)) * 31)) * 31)) * 31)) * 31;
            boolean z = this.p;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public final String i() {
            return this.b;
        }

        public final String j() {
            return this.a;
        }

        public final String k() {
            return this.f3050c;
        }

        public final String l() {
            return this.f3052e;
        }

        public final String m() {
            return this.f3051d;
        }

        public final String n() {
            return this.h;
        }

        public final String o() {
            return this.j;
        }

        public final JSONArray p() {
            return this.m;
        }

        public final boolean q() {
            return this.p;
        }

        public final void r(String str) {
            kotlin.s.c.l.f(str, "<set-?>");
            this.f3054g = str;
        }

        public final void s(String str) {
            kotlin.s.c.l.f(str, "<set-?>");
            this.f3053f = str;
        }

        public final void t(JSONArray jSONArray) {
            kotlin.s.c.l.f(jSONArray, "<set-?>");
            this.l = jSONArray;
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("AsrFeedbackInfo(onlineResult=");
            M.append(this.a);
            M.append(", offlineResult=");
            M.append(this.b);
            M.append(", showResult=");
            M.append(this.f3050c);
            M.append(", taskId=");
            M.append(this.f3051d);
            M.append(", startTime=");
            M.append(this.f3052e);
            M.append(", beforeContext=");
            M.append(this.f3053f);
            M.append(", afterContext=");
            M.append(this.f3054g);
            M.append(", voiceFilePath=");
            M.append(this.h);
            M.append(", chatHistory=");
            M.append(this.i);
            M.append(", wordHistory=");
            M.append(this.j);
            M.append(", modifyHistory=");
            M.append(this.k);
            M.append(", chatHistoryJson=");
            M.append(this.l);
            M.append(", wordHistoryJson=");
            M.append(this.m);
            M.append(", modifyHistoryJson=");
            M.append(this.n);
            M.append(", contextInfo=");
            M.append(this.o);
            M.append(", isFeedbackSubmitted=");
            return e.a.a.a.a.L(M, this.p, ')');
        }

        public final void u(boolean z) {
            this.p = z;
        }

        public final void v(String str) {
            kotlin.s.c.l.f(str, "<set-?>");
            this.b = str;
        }

        public final void w(String str) {
            kotlin.s.c.l.f(str, "<set-?>");
            this.a = str;
        }

        public final void x(String str) {
            kotlin.s.c.l.f(str, "<set-?>");
            this.f3050c = str;
        }

        public final void y(String str) {
            kotlin.s.c.l.f(str, "<set-?>");
            this.f3051d = str;
        }

        public final void z(String str) {
            kotlin.s.c.l.f(str, "<set-?>");
            this.h = str;
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ArrayList arrayList, String str9, String str10, JSONArray jSONArray, JSONArray jSONArray2, JSONObject jSONObject, JSONObject jSONObject2, boolean z, int i) {
            this((i & 1) != 0 ? "" : null, (i & 2) != 0 ? "" : null, (i & 4) != 0 ? "" : null, (i & 8) != 0 ? "" : null, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : null, (i & 64) != 0 ? "" : null, (i & 128) != 0 ? "" : null, (i & 256) != 0 ? new ArrayList() : null, (i & 512) != 0 ? "" : null, (i & 1024) == 0 ? null : "", (i & 2048) != 0 ? new JSONArray() : null, (i & 4096) != 0 ? new JSONArray() : null, (i & 8192) != 0 ? new JSONObject() : null, (i & 16384) != 0 ? new JSONObject() : null, (i & 32768) != 0 ? false : z);
        }
    }
}
