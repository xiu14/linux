package com.prolificinteractive.materialcalendarview;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.provider.Settings;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Window;
import android.webkit.WebSettings;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.location.LocationRequestCompat;
import bytekn.foundation.encryption.e;
import bytekn.foundation.io.file.ContentEncoding;
import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.ss.ugc.effectplatform.task.StrategyCacheClearTask$RequestResourceInfo;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.KeyPairGenerator;
import java.security.spec.ECGenParameterSpec;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.h;
import kotlin.r.f;
import kotlin.s.c.D;
import kotlin.s.c.InterfaceC0784d;
import kotlinx.coroutines.C0814l;
import kotlinx.coroutines.C0824u;
import kotlinx.coroutines.C0825v;
import kotlinx.coroutines.E;
import kotlinx.coroutines.F;
import kotlinx.coroutines.G;
import kotlinx.coroutines.InterfaceC0817m0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.N;
import kotlinx.coroutines.N0.x;
import kotlinx.coroutines.U;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.w;
import kotlinx.coroutines.p0;
import kotlinx.coroutines.s0;
import ms.bd.c.g2;
import ms.bd.c.m2;
import ms.bd.c.y2;

/* loaded from: classes2.dex */
public final class r {
    public static long a;
    public static long b;

    /* renamed from: c, reason: collision with root package name */
    public static long f8224c;

    /* renamed from: d, reason: collision with root package name */
    public static long f8225d;

    /* renamed from: e, reason: collision with root package name */
    public static String f8226e;

    /* renamed from: f, reason: collision with root package name */
    public static String f8227f;

    /* renamed from: g, reason: collision with root package name */
    public static int f8228g;
    public static boolean h;
    public static String i;
    public static int j;
    public static int k;
    public static String l;

    public static final void A(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            StringBuilder Q = e.a.a.a.a.Q("size=", j2, " offset=");
            Q.append(j3);
            Q.append(" byteCount=");
            Q.append(j4);
            throw new ArrayIndexOutOfBoundsException(Q.toString());
        }
    }

    public static final void B(int i2) {
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException(e.a.a.a.a.j("Expected positive parallelism level, but got ", i2).toString());
        }
    }

    public static int C(Context context, String str, int i2, int i3) {
        try {
            return context.checkPermission(str, i2, i3);
        } catch (RuntimeException unused) {
            return -1;
        }
    }

    public static /* synthetic */ boolean D(w wVar, Throwable th, int i2, Object obj) {
        int i3 = i2 & 1;
        return wVar.k(null);
    }

    public static final void E(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                kotlin.a.a(th, th2);
            }
        }
    }

    public static final String F(com.ss.ugc.effectplatform.bridge.network.a aVar) {
        kotlin.s.c.l.g(aVar, "$this$convertToString");
        if (!aVar.available()) {
            return "";
        }
        bytekn.foundation.io.file.a aVar2 = new bytekn.foundation.io.file.a(32);
        byte[] bArr = new byte[1024];
        int read = aVar.read(bArr, 0, 1024);
        while (read >= 0) {
            aVar2.d(bArr, 0, read);
            read = aVar.read(bArr, 0, 1024);
        }
        aVar.close();
        return com.ss.ugc.effectplatform.util.a.a(aVar2.c(), ContentEncoding.Utf8);
    }

    public static final long G(InputStream inputStream, OutputStream outputStream, int i2) {
        kotlin.s.c.l.f(inputStream, "<this>");
        kotlin.s.c.l.f(outputStream, "out");
        byte[] bArr = new byte[i2];
        int read = inputStream.read(bArr);
        long j2 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j2 += read;
            read = inputStream.read(bArr);
        }
        return j2;
    }

    public static /* synthetic */ long H(InputStream inputStream, OutputStream outputStream, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 8192;
        }
        return G(inputStream, outputStream, i2);
    }

    public static final <R> Object I(kotlin.s.b.p<? super G, ? super kotlin.r.d<? super R>, ? extends Object> pVar, kotlin.r.d<? super R> dVar) {
        kotlinx.coroutines.N0.v vVar = new kotlinx.coroutines.N0.v(dVar.getContext(), dVar);
        Object j0 = j0(vVar, vVar, pVar);
        if (j0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            kotlin.s.c.l.f(dVar, TypedValues.AttributesType.S_FRAME);
        }
        return j0;
    }

    public static final Object J(Throwable th) {
        kotlin.s.c.l.f(th, "exception");
        return new h.a(th);
    }

    public static final Object K(long j2, kotlin.r.d<? super kotlin.o> dVar) {
        if (j2 <= 0) {
            return kotlin.o.a;
        }
        C0814l c0814l = new C0814l(kotlin.coroutines.intrinsics.a.d(dVar), 1);
        c0814l.v();
        if (j2 < LocationRequestCompat.PASSIVE_INTERVAL) {
            N(c0814l.getContext()).o(j2, c0814l);
        }
        Object u = c0814l.u();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (u == coroutineSingletons) {
            kotlin.s.c.l.f(dVar, TypedValues.AttributesType.S_FRAME);
        }
        return u == coroutineSingletons ? u : kotlin.o.a;
    }

    public static <R> R L(f.b bVar, R r, kotlin.s.b.p<? super R, ? super f.b, ? extends R> pVar) {
        kotlin.s.c.l.f(pVar, "operation");
        return pVar.invoke(r, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E extends f.b> E M(f.b bVar, f.c<E> cVar) {
        kotlin.s.c.l.f(cVar, "key");
        if (!kotlin.s.c.l.a(bVar.getKey(), cVar)) {
            return null;
        }
        kotlin.s.c.l.d(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
        return bVar;
    }

    public static final N N(kotlin.r.f fVar) {
        f.b bVar = fVar.get(kotlin.r.e.F);
        N n = bVar instanceof N ? (N) bVar : null;
        return n == null ? K.a() : n;
    }

    public static final <T> Class<T> O(kotlin.reflect.c<T> cVar) {
        kotlin.s.c.l.f(cVar, "<this>");
        Class<T> cls = (Class<T>) ((InterfaceC0784d) cVar).a();
        kotlin.s.c.l.d(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return cls;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final <T> Class<T> P(kotlin.reflect.c<T> cVar) {
        kotlin.s.c.l.f(cVar, "<this>");
        Class<T> cls = (Class<T>) ((InterfaceC0784d) cVar).a();
        if (!cls.isPrimitive()) {
            kotlin.s.c.l.d(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    cls = (Class<T>) Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    cls = (Class<T>) Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    cls = (Class<T>) Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    cls = (Class<T>) Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    cls = (Class<T>) Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    cls = (Class<T>) Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
                    cls = (Class<T>) Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals(TypedValues.Custom.S_FLOAT)) {
                    cls = (Class<T>) Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    cls = (Class<T>) Short.class;
                    break;
                }
                break;
        }
        kotlin.s.c.l.d(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return cls;
    }

    public static final String Q(ModelInfo modelInfo) {
        kotlin.s.c.l.g(modelInfo, "$this$getMD5");
        ExtendedUrlModel file_url = modelInfo.getFile_url();
        if (file_url != null) {
            return file_url.getUri();
        }
        return null;
    }

    public static com.ss.android.g.e.b R() {
        return (com.ss.android.g.e.b) com.ss.android.ug.bus.b.a(com.ss.android.g.e.b.class);
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Object;)TS; */
    public static final kotlinx.coroutines.N0.w S(Object obj) {
        x xVar;
        xVar = kotlinx.coroutines.N0.e.a;
        if (obj == xVar) {
            throw new IllegalStateException("Does not contain segment".toString());
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (kotlinx.coroutines.N0.w) obj;
    }

    public static final void T(kotlin.r.f fVar, Throwable th) {
        try {
            E e2 = (E) fVar.get(E.G);
            if (e2 != null) {
                e2.handleException(fVar, th);
            } else {
                F.a(fVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                kotlin.a.a(runtimeException, th);
                th = runtimeException;
            }
            F.a(fVar, th);
        }
    }

    public static /* synthetic */ U U(InterfaceC0817m0 interfaceC0817m0, boolean z, boolean z2, kotlin.s.b.l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return interfaceC0817m0.p(z, z2, lVar);
    }

    public static U V(long j2, Runnable runnable, kotlin.r.f fVar) {
        return K.a().A(j2, runnable, fVar);
    }

    public static final boolean W(G g2) {
        InterfaceC0817m0 interfaceC0817m0 = (InterfaceC0817m0) g2.getCoroutineContext().get(InterfaceC0817m0.H);
        if (interfaceC0817m0 != null) {
            return interfaceC0817m0.a();
        }
        return true;
    }

    public static boolean X() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static /* synthetic */ Object Y(kotlinx.coroutines.P0.c cVar, Object obj, kotlin.r.d dVar, int i2, Object obj2) {
        int i3 = i2 & 1;
        return cVar.b(null, dVar);
    }

    public static kotlin.r.f Z(f.b bVar, f.c<?> cVar) {
        kotlin.s.c.l.f(cVar, "key");
        return kotlin.s.c.l.a(bVar.getKey(), cVar) ? kotlin.r.g.a : bVar;
    }

    public static kotlinx.coroutines.channels.e a(int i2, BufferOverflow bufferOverflow, kotlin.s.b.l lVar, int i3) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        if ((i3 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        int i4 = i3 & 4;
        if (i2 == -2) {
            return new kotlinx.coroutines.channels.d(bufferOverflow == BufferOverflow.SUSPEND ? kotlinx.coroutines.channels.e.I.a() : 1, bufferOverflow, null);
        }
        if (i2 != -1) {
            return i2 != 0 ? i2 != Integer.MAX_VALUE ? (i2 == 1 && bufferOverflow == BufferOverflow.DROP_OLDEST) ? new kotlinx.coroutines.channels.l(null) : new kotlinx.coroutines.channels.d(i2, bufferOverflow, null) : new kotlinx.coroutines.channels.m(null) : bufferOverflow == BufferOverflow.SUSPEND ? new kotlinx.coroutines.channels.u(null) : new kotlinx.coroutines.channels.d(1, bufferOverflow, null);
        }
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            return new kotlinx.coroutines.channels.l(null);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
    }

    public static final void a0(com.ss.ugc.effectplatform.i.a aVar, boolean z, EffectConfig effectConfig, Effect effect, String str, String str2, String str3, Map<String, ? extends Object> map, String str4) {
        kotlin.s.c.l.g(aVar, "$this$mobModelDownload");
        kotlin.s.c.l.g(effectConfig, "config");
        kotlin.s.c.l.g(effect, StrategyCacheClearTask$RequestResourceInfo.TYPE_EFFECT);
        kotlin.s.c.l.g(str, "modelName");
        kotlin.s.c.l.g(str3, "modelType");
        kotlin.s.c.l.g(map, "extraMap");
        kotlin.g[] gVarArr = new kotlin.g[7];
        String c2 = effectConfig.c();
        if (c2 == null) {
            c2 = "";
        }
        gVarArr[0] = new kotlin.g("app_id", c2);
        gVarArr[1] = new kotlin.g("access_key", "");
        gVarArr[2] = new kotlin.g("effect_id", effect.getEffect_id());
        gVarArr[3] = new kotlin.g("panel", effect.getPanel());
        gVarArr[4] = new kotlin.g("model_name", str);
        gVarArr[5] = new kotlin.g("resource_type", str3);
        if (str2 == null) {
            str2 = "";
        }
        gVarArr[6] = new kotlin.g("model_version", str2);
        Map<String, ? extends Object> L = kotlin.collections.g.L(gVarArr);
        L.putAll(map);
        if (!z) {
            if (str4 == null) {
                str4 = "";
            }
            L.put("error_msg", str4);
        }
        aVar.a("model_download_success_rate", !z ? 1 : 0, L);
    }

    public static final G b(kotlin.r.f fVar) {
        if (fVar.get(InterfaceC0817m0.H) == null) {
            fVar = fVar.plus(new p0(null));
        }
        return new kotlinx.coroutines.N0.g(fVar);
    }

    public static final void b0(com.ss.ugc.effectplatform.i.a aVar, boolean z, EffectConfig effectConfig, String str, String str2) {
        kotlin.s.c.l.g(aVar, "$this$mobModelFind");
        kotlin.s.c.l.g(effectConfig, "config");
        kotlin.s.c.l.g(str, "modelName");
        kotlin.g[] gVarArr = new kotlin.g[3];
        String c2 = effectConfig.c();
        if (c2 == null) {
            c2 = "";
        }
        gVarArr[0] = new kotlin.g("app_id", c2);
        gVarArr[1] = new kotlin.g("access_key", "");
        gVarArr[2] = new kotlin.g("model_name", str);
        Map<String, ? extends Object> L = kotlin.collections.g.L(gVarArr);
        if (!z) {
            if (str2 == null) {
                str2 = "";
            }
            L.put("error_msg", str2);
        }
        aVar.a("find_model_success_rate", !z ? 1 : 0, L);
    }

    public static int c(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService((String) y2.a(16777217, 0, 0L, "1dd8ab", new byte[]{48, 105, 0, 73, 76}));
        if (powerManager == null) {
            return 0;
        }
        if (!powerManager.isInteractive()) {
            return 1;
        }
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService((String) y2.a(16777217, 0, 0L, "3b46b2", new byte[]{41, 101, 94, 69, 72, 36, 34, 71}));
        if (keyguardManager == null) {
            return 0;
        }
        return keyguardManager.inKeyguardRestrictedInputMode() ? 2 : 3;
    }

    public static boolean c0(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static String d() {
        String str;
        int i2;
        TimeZone timeZone;
        try {
            timeZone = TimeZone.getDefault();
            str = timeZone.getID();
        } catch (Throwable unused) {
            str = null;
        }
        try {
            i2 = ((timeZone.getRawOffset() / 60) / 60) / 1000;
        } catch (Throwable unused2) {
            i2 = 0;
            StringBuilder M = e.a.a.a.a.M(str);
            M.append((String) y2.a(16777217, 0, 0L, "2d520d", new byte[]{111}));
            M.append(i2);
            return M.toString();
        }
        StringBuilder M2 = e.a.a.a.a.M(str);
        M2.append((String) y2.a(16777217, 0, 0L, "2d520d", new byte[]{111}));
        M2.append(i2);
        return M2.toString();
    }

    public static kotlin.r.f d0(f.b bVar, kotlin.r.f fVar) {
        kotlin.s.c.l.f(fVar, "context");
        return f.a.a(bVar, fVar);
    }

    public static String e(Context context) {
        if (context != null) {
            try {
                new DisplayMetrics();
                f8228g = context.getResources().getDisplayMetrics().densityDpi;
            } catch (Throwable unused) {
            }
        }
        return "" + f8228g;
    }

    public static final Object e0(Object obj, E e2) {
        if (obj == null) {
            return e2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e2);
        return arrayList;
    }

    public static String f(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return null;
        }
        cursor.moveToFirst();
        int columnIndex = cursor.getColumnIndex((String) y2.a(16777217, 0, 0L, "5ecce4", new byte[]{50, 102, 28, 2, 95}));
        String string = columnIndex > 0 ? cursor.getString(columnIndex) : null;
        int columnIndex2 = cursor.getColumnIndex((String) y2.a(16777217, 0, 0L, "10f417", new byte[]{35, 61, 17, 69}));
        if (columnIndex2 > 0) {
            cursor.getInt(columnIndex2);
        }
        int columnIndex3 = cursor.getColumnIndex((String) y2.a(16777217, 0, 0L, "2f8a7f", new byte[]{38, 124, 91, 28, 26, 116, 53}));
        if (columnIndex3 > 0) {
            cursor.getLong(columnIndex3);
        }
        return string;
    }

    public static void f0(Runnable runnable) {
        com.bytedance.common.model.c c2;
        com.bytedance.common.g.b.b e2 = com.bytedance.common.g.a.c().e();
        if ((e2 == null || (c2 = e2.c()) == null) ? false : c2.o.optAnr()) {
            com.ss.android.message.e.e().f(runnable, 0L);
        } else {
            runnable.run();
        }
    }

    public static HashMap g() {
        HashMap hashMap = new HashMap();
        hashMap.put((String) y2.a(16777217, 0, 0L, "6113f2", new byte[]{118}), Build.MODEL);
        hashMap.put((String) y2.a(16777217, 0, 0L, "8c1c1c", new byte[]{123}), Build.BRAND);
        hashMap.put((String) y2.a(16777217, 0, 0L, "3ac863", new byte[]{113}), Build.BOARD);
        hashMap.put((String) y2.a(16777217, 0, 0L, "d6b827", new byte[]{33}), Build.VERSION.RELEASE);
        hashMap.put((String) y2.a(16777217, 0, 0L, "f774e2", new byte[]{34}), Build.DISPLAY);
        hashMap.put((String) y2.a(16777217, 0, 0L, "59cabd", new byte[]{114}), Build.HARDWARE);
        hashMap.put((String) y2.a(16777217, 0, 0L, "f2f4ec", new byte[]{32}), Build.FINGERPRINT);
        return hashMap;
    }

    public static final <T> Object g0(Object obj, kotlin.r.d<? super T> dVar) {
        return obj instanceof C0824u ? J(((C0824u) obj).a) : obj;
    }

    public static LinkedHashMap h(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException((String) y2.a(16777217, 0, 0L, "529df1", new byte[]{117}));
        }
        int capacity = byteBuffer.capacity() - 24;
        if (capacity < 8) {
            throw new IllegalArgumentException((String) y2.a(16777217, 0, 0L, "be92d1", new byte[]{39}));
        }
        byteBuffer.capacity();
        if (capacity > byteBuffer.capacity()) {
            throw new IllegalArgumentException((String) y2.a(16777217, 0, 0L, "525fe2", new byte[]{113}));
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(capacity);
            byteBuffer.position(8);
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(0);
            byteBuffer.limit(limit);
            byteBuffer.position(position);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (slice.hasRemaining()) {
                if (slice.remaining() < 8) {
                    throw new ms.bd.c.e((String) y2.a(16777217, 0, 0L, "67c975", new byte[]{113}));
                }
                long j2 = slice.getLong();
                if (j2 < 4 || j2 > 2147483647L) {
                    throw new ms.bd.c.e((String) y2.a(16777217, 0, 0L, "b461d2", new byte[]{36}));
                }
                int i2 = (int) j2;
                int position2 = slice.position() + i2;
                if (i2 > slice.remaining()) {
                    throw new ms.bd.c.e((String) y2.a(16777217, 0, 0L, "5dc56b", new byte[]{124}));
                }
                Integer valueOf = Integer.valueOf(slice.getInt());
                int i3 = i2 - 4;
                if (i3 < 0) {
                    throw new IllegalArgumentException((String) y2.a(16777217, 0, 0L, "624185", new byte[]{117}));
                }
                int limit2 = slice.limit();
                int position3 = slice.position();
                int i4 = i3 + position3;
                if (i4 < position3 || i4 > limit2) {
                    throw new BufferUnderflowException();
                }
                slice.limit(i4);
                try {
                    ByteBuffer slice2 = slice.slice();
                    slice2.order(slice.order());
                    slice.position(i4);
                    slice.limit(limit2);
                    linkedHashMap.put(valueOf, slice2);
                    slice.position(position2);
                } catch (Throwable th) {
                    slice.limit(limit2);
                    throw th;
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            byteBuffer.position(0);
            byteBuffer.limit(limit);
            byteBuffer.position(position);
            throw th2;
        }
    }

    public static final int h0(int i2) {
        return ((i2 & 255) << 24) | (((-16777216) & i2) >>> 24) | ((16711680 & i2) >>> 8) | ((65280 & i2) << 8);
    }

    public static ms.bd.c.d i(FileChannel fileChannel) {
        long size = fileChannel.size();
        if (size < 22) {
            throw new IOException((String) y2.a(16777217, 0, 0L, "8620b0", new byte[]{120, 101}));
        }
        long j2 = size - 22;
        long min = Math.min(j2, 65535L);
        int i2 = 0;
        while (true) {
            long j3 = i2;
            if (j3 > min) {
                throw new IOException((String) y2.a(16777217, 0, 0L, "976e4c", new byte[]{121, 101}));
            }
            long j4 = j2 - j3;
            ByteBuffer allocate = ByteBuffer.allocate(4);
            fileChannel.position(j4);
            fileChannel.read(allocate);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            if (allocate.getInt(0) == 101010256) {
                ByteBuffer allocate2 = ByteBuffer.allocate(2);
                fileChannel.position(j4 + 20);
                fileChannel.read(allocate2);
                allocate2.order(byteOrder);
                short s = allocate2.getShort(0);
                if (s == i2) {
                    ByteBuffer allocate3 = ByteBuffer.allocate(4);
                    allocate3.order(byteOrder);
                    fileChannel.position((fileChannel.size() - s) - 6);
                    fileChannel.read(allocate3);
                    long j5 = allocate3.getInt(0);
                    if (j5 < 32) {
                        throw new ms.bd.c.e((String) y2.a(16777217, 0, 0L, "d16e3e", new byte[]{44}));
                    }
                    fileChannel.position(j5 - 24);
                    ByteBuffer allocate4 = ByteBuffer.allocate(24);
                    fileChannel.read(allocate4);
                    allocate4.order(byteOrder);
                    if (allocate4.getLong(8) == 2334950737559900225L && allocate4.getLong(16) == 3617552046287187010L) {
                        long j6 = allocate4.getLong(0);
                        if (j6 >= allocate4.capacity() && j6 <= 2147483639) {
                            int i3 = (int) (8 + j6);
                            long j7 = j5 - i3;
                            if (j7 >= 0) {
                                fileChannel.position(j7);
                                ByteBuffer allocate5 = ByteBuffer.allocate(i3);
                                fileChannel.read(allocate5);
                                allocate5.order(byteOrder);
                                if (allocate5.getLong(0) == j6) {
                                    return new ms.bd.c.d(allocate5, Long.valueOf(j7));
                                }
                            }
                        }
                    }
                    return null;
                }
            }
            i2++;
        }
    }

    public static final long i0(long j2) {
        return ((j2 & 255) << 56) | (((-72057594037927936L) & j2) >>> 56) | ((71776119061217280L & j2) >>> 40) | ((280375465082880L & j2) >>> 24) | ((1095216660480L & j2) >>> 8) | ((4278190080L & j2) << 8) | ((16711680 & j2) << 24) | ((65280 & j2) << 40);
    }

    public static g2 j(Context context, String str) {
        Field field;
        Object obj;
        Class<?>[] interfaces;
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService((String) y2.a(16777217, 0, 0L, "5f1f8f", new byte[]{40, 107, 65, 19, 19, 120, 57, 73}));
            if (locationManager == null) {
                return new g2(-10, "", "", null);
            }
            Field[] declaredFields = locationManager.getClass().getDeclaredFields();
            if (declaredFields == null) {
                return new g2(-20, "", "", null);
            }
            int length = declaredFields.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    field = null;
                    obj = null;
                    break;
                }
                field = declaredFields[i2];
                field.setAccessible(true);
                try {
                    obj = field.get(locationManager);
                    if (obj != null && !(obj instanceof String) && (interfaces = obj.getClass().getInterfaces()) != null && interfaces.length != 0 && str.equals(interfaces[0].getName())) {
                        break;
                    }
                    i2++;
                } catch (IllegalAccessException unused) {
                    return new g2(-21, "", "", null);
                }
            }
            return obj == null ? new g2(-22, "", "", null) : new g2(obj instanceof Proxy ? 1 : 0, field.getName(), obj.getClass().getName(), null);
        } catch (Throwable unused2) {
            return new g2(-11, "", "", null);
        }
    }

    public static final <T, R> Object j0(kotlinx.coroutines.N0.v<? super T> vVar, R r, kotlin.s.b.p<? super R, ? super kotlin.r.d<? super T>, ? extends Object> pVar) {
        Object c0824u;
        Object c0;
        try {
            D.c(pVar, 2);
            c0824u = pVar.invoke(r, vVar);
        } catch (Throwable th) {
            c0824u = new C0824u(th, false, 2);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (c0824u == coroutineSingletons || (c0 = vVar.c0(c0824u)) == s0.b) {
            return coroutineSingletons;
        }
        if (c0 instanceof C0824u) {
            throw ((C0824u) c0).a;
        }
        return s0.g(c0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x01dd, code lost:
    
        if (r14 != null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01df, code lost:
    
        r14.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01d8, code lost:
    
        if (r14 != null) goto L121;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void k(android.content.Context r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prolificinteractive.materialcalendarview.r.k(android.content.Context, java.lang.String):void");
    }

    public static final void k0(Object obj) {
        if (obj instanceof h.a) {
            throw ((h.a) obj).a;
        }
    }

    public static void l(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final <T> Object l0(Object obj, kotlin.s.b.l<? super Throwable, kotlin.o> lVar) {
        Throwable b2 = kotlin.h.b(obj);
        return b2 == null ? lVar != null ? new C0825v(obj, lVar) : obj : new C0824u(b2, false, 2);
    }

    public static void m(String str, Object... objArr) {
    }

    public static String m0(Bundle bundle) {
        if (bundle == null) {
            return "null";
        }
        Set<String> keySet = bundle.keySet();
        if (keySet == null) {
            return "empty";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : keySet) {
            StringBuilder S = e.a.a.a.a.S(str, Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            S.append(bundle.get(str));
            S.append("\n");
            sb.append(S.toString());
        }
        return sb.toString();
    }

    public static boolean n(String str) {
        if (o(str, true)) {
            return true;
        }
        return o(str, false);
    }

    public static /* synthetic */ void n0(kotlinx.coroutines.P0.c cVar, Object obj, int i2, Object obj2) {
        int i3 = i2 & 1;
        cVar.c(null);
    }

    public static boolean o(String str, boolean z) {
        int i2 = Build.VERSION.SDK_INT;
        Date date = new Date();
        KeyGenParameterSpec.Builder keyValidityStart = new KeyGenParameterSpec.Builder(str, 12).setAlgorithmParameterSpec(new ECGenParameterSpec((String) y2.a(16777217, 0, 0L, "4ecc1d", new byte[]{54, 98, 19, 7, 92, 38, 97, 86, 99}))).setDigests((String) y2.a(16777217, 0, 0L, "7aa5db", new byte[]{21, 75, 51, 12, 9, 32, 98}), (String) y2.a(16777217, 0, 0L, "33391d", new byte[]{17, 25, 97, 0, 93, 43, 100}), (String) y2.a(16777217, 0, 0L, "4074da", new byte[]{22, 26, 101, 13, 14, 39, 101})).setKeyValidityStart(date);
        keyValidityStart.setAttestationChallenge(date.toString().getBytes());
        Context context = m2.b.a;
        PackageManager packageManager = context == null ? null : context.getPackageManager();
        if (z && i2 >= 31 && packageManager != null && packageManager.hasSystemFeature((String) y2.a(16777217, 0, 0L, "6f0326", new byte[]{38, 106, 71, 85, 2, 40, 49, 9, 114, 108, 33, 112, 84, 70, 31, 36, 123, 67, 100, 117, 46, 103, 70, 120, 4, 37, 10, 70, 117, 119, 34, 119, 87, 70, 25, 40, 58, 73}))) {
            keyValidityStart.setDevicePropertiesAttestationIncluded(true);
        }
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance((String) y2.a(16777217, 0, 0L, "e9a771", new byte[]{81, 24}), (String) y2.a(16777217, 0, 0L, "b632f6", new byte[]{82, 58, 68, 84, 86, 40, 101, 60, 103, 123, 64, 32, 79, 84, 92}));
            keyPairGenerator.initialize(keyValidityStart.build());
            keyPairGenerator.generateKeyPair();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean o0(Effect effect) {
        kotlin.s.c.l.g(effect, "$this$verifySign");
        String extra = effect.getExtra();
        if (extra == null) {
            extra = "";
        }
        byte[] a2 = com.ss.ugc.effectplatform.g.a.a(effect.getId() + "swv2naghkXiK5usX" + extra);
        kotlin.s.c.l.g(a2, "$this$md5");
        e.a aVar = bytekn.foundation.encryption.e.k;
        kotlin.s.c.l.g(a2, "$this$hash");
        kotlin.s.c.l.g(aVar, "algo");
        boolean a3 = kotlin.s.c.l.a(bytekn.foundation.encryption.a.a(aVar.a(a2)), effect.getExtra_tag());
        if (!a3) {
            d.a.c.b.b.b("EffectEx", effect.getEffect_id() + " verify failed", null);
        }
        return a3;
    }

    public static boolean p(boolean z, Window window) {
        try {
            Class<?> cls = window.getClass();
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i2 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Class<?> cls3 = Integer.TYPE;
            Method method = cls.getMethod("setExtraFlags", cls3, cls3);
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(z ? i2 : 0);
            objArr[1] = Integer.valueOf(i2);
            method.invoke(window, objArr);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static boolean q(String... strArr) {
        try {
            Context context = m2.b.a;
            for (String str : strArr) {
                if (context.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte[] r(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i2 = 0; i2 < length; i2 += 2) {
            bArr[i2 / 2] = (byte) (Character.digit(str.charAt(i2 + 1), 16) + (Character.digit(str.charAt(i2), 16) << 4));
        }
        return bArr;
    }

    public static boolean s() {
        return q((String) y2.a(16777217, 0, 0L, "b657fc", new byte[]{114, 58, 66, 81, 86, 125, 101, 89, 116, 98, 97, 57, 79, 80, 74, 125, 110, 25, 42, 70, 80, 23, 99, 112, 106, 75, 86, 62, 66, 78, 76, 7, 114, 98, 109, 81}));
    }

    public static String t(Context context) {
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "default_input_method");
            return !TextUtils.isEmpty(string) ? string.contains("/") ? string.split("/")[0] : string : "null_";
        } catch (Throwable th) {
            try {
                return "null_" + th.getMessage();
            } catch (Throwable unused) {
                return "null_";
            }
        }
    }

    public static synchronized String u(Context context) {
        synchronized (r.class) {
            String str = l;
            if (str != null) {
                return str;
            }
            String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
            l = defaultUserAgent;
            return defaultUserAgent;
        }
    }

    public static final boolean v(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        kotlin.s.c.l.g(bArr, "a");
        kotlin.s.c.l.g(bArr2, com.heytap.mcssdk.liquid.b.a);
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static final void w(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        kotlin.s.c.l.g(bArr, "src");
        kotlin.s.c.l.g(bArr2, "dest");
        System.arraycopy(bArr, i2, bArr2, i3, i4);
    }

    public static final Boolean x(boolean z) {
        return Boolean.valueOf(z);
    }

    public static void y(G g2, CancellationException cancellationException, int i2) {
        int i3 = i2 & 1;
        InterfaceC0817m0 interfaceC0817m0 = (InterfaceC0817m0) g2.getCoroutineContext().get(InterfaceC0817m0.H);
        if (interfaceC0817m0 != null) {
            interfaceC0817m0.d(null);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + g2).toString());
    }

    public static /* synthetic */ void z(InterfaceC0817m0 interfaceC0817m0, CancellationException cancellationException, int i2, Object obj) {
        int i3 = i2 & 1;
        interfaceC0817m0.d(null);
    }
}
