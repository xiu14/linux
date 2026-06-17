package e.a.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.net.Uri;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.Fragment;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.r.j;
import com.bytedance.android.input.speech.view.o;
import com.bytedance.common.utility.Logger;
import com.bytedance.feedbackerlib.manager.F;
import com.bytedance.push.g0.f;
import com.huawei.hms.support.log.HMSLog;
import com.obric.common.oea.foundation.graphics.smoothcorner.b.e;
import com.vivo.push.util.t;
import com.xiaomi.channel.commonutils.logger.c;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.s.c.l;
import org.json.JSONObject;

/* compiled from: outline */
/* loaded from: classes.dex */
public class a {
    public static String A(String str, boolean z) {
        return str + z;
    }

    public static Object A0(int i, HashMap hashMap) {
        return hashMap.get(new Integer(i));
    }

    public static String B(StringBuilder sb) {
        sb.append(System.currentTimeMillis());
        return sb.toString();
    }

    public static void B0(StringBuilder sb, int i, String str) {
        sb.append(i);
        j.i(str, sb.toString());
    }

    public static String C(StringBuilder sb, int i, char c2) {
        sb.append(i);
        sb.append(c2);
        return sb.toString();
    }

    public static void C0(StringBuilder sb, int i, String str) {
        sb.append(i);
        j.m(str, sb.toString());
    }

    public static String D(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static void D0(StringBuilder sb, int i, String str) {
        sb.append(i);
        Logger.d(str, sb.toString());
    }

    public static String E(StringBuilder sb, long j, char c2) {
        sb.append(j);
        sb.append(c2);
        return sb.toString();
    }

    public static void E0(StringBuilder sb, int i, String str, int i2, String str2) {
        sb.append(i);
        com.ss.android.socialbase.downloader.logger.Logger.taskDebug(str, i2, str2, sb.toString());
    }

    public static String F(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static void F0(StringBuilder sb, int i, String str, int i2, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static String G(StringBuilder sb, String str, char c2) {
        sb.append(str);
        sb.append(c2);
        return sb.toString();
    }

    public static void G0(StringBuilder sb, String str, char c2, String str2) {
        sb.append(str);
        sb.append(c2);
        sb.append(str2);
    }

    public static String H(StringBuilder sb, String str, char c2, char c3) {
        sb.append(str);
        sb.append(c2);
        sb.append(c3);
        return sb.toString();
    }

    public static void H0(StringBuilder sb, String str, String str2) {
        sb.append(str);
        j.i(str2, sb.toString());
    }

    public static int I(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static void I0(StringBuilder sb, String str, String str2) {
        sb.append(str);
        Logger.d(str2, sb.toString());
    }

    public static String J(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static void J0(StringBuilder sb, String str, String str2) {
        sb.append(str);
        f.c(str2, sb.toString());
    }

    public static String K(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static void K0(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static String L(StringBuilder sb, boolean z, char c2) {
        sb.append(z);
        sb.append(c2);
        return sb.toString();
    }

    public static Object L0(IAppGlobals.a aVar, int i, String str, String str2) {
        String string = aVar.getContext().getString(i);
        l.e(string, str);
        Object f2 = SettingsConfigNext.f(string);
        l.d(f2, str2);
        return f2;
    }

    public static StringBuilder M(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static void M0(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static StringBuilder N(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static void N0(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        j.i(str, sb.toString());
    }

    public static StringBuilder O(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static void O0(Throwable th, StringBuilder sb, IAppGlobals.a aVar, String str) {
        sb.append(kotlin.a.d(th));
        aVar.e(str, sb.toString());
    }

    public static StringBuilder P(String str, int i, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    public static void P0(Throwable th, StringBuilder sb, String str) {
        sb.append(kotlin.a.d(th));
        j.j(str, sb.toString());
    }

    public static StringBuilder Q(String str, long j, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static boolean Q0(File file, String str) {
        return new File(file, str).exists();
    }

    public static StringBuilder R(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        return sb;
    }

    public static boolean R0(String str) {
        return new File(str).exists();
    }

    public static StringBuilder S(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static boolean S0(String str, String str2) {
        return str.toLowerCase(Locale.getDefault()).contains(str2);
    }

    public static int T(Rect rect, Canvas canvas, Rect rect2, String str) {
        l.c(rect);
        canvas.clipRect(rect2);
        return str.length();
    }

    public static boolean T0(Locale locale, String str, String str2) {
        l.e(locale, str);
        return l.a(locale.getLanguage(), str2);
    }

    public static StringBuilder U(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StackTraceElement[] U0() {
        return new Throwable().getStackTrace();
    }

    public static StringBuilder V(String str, String str2, String str3, int i, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(i);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder W(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static StringBuilder X(String str, boolean z, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(z);
        sb.append(str2);
        return sb;
    }

    public static ArrayList Y(ArrayList arrayList, String str, ArrayList arrayList2, String str2) {
        ArrayList arrayList3 = new ArrayList();
        arrayList.add(str);
        arrayList2.add(str2);
        return arrayList3;
    }

    public static ArrayList Z(Map map, String str, com.bytedance.lego.init.model.f fVar) {
        map.put(str, fVar);
        return new ArrayList();
    }

    public static float a(float f2, float f3, float f4, float f5) {
        return ((f2 - f3) * f4) + f5;
    }

    public static JSONObject a0(String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, str2);
        jSONObject.put(str3, str4);
        return jSONObject;
    }

    public static float b(e eVar, Path path, float f2, e eVar2) {
        path.lineTo(f2, eVar.d());
        return eVar2.c();
    }

    public static void b0() {
        o.f3179f = new o();
    }

    public static String c(Context context, StringBuilder sb, String str) {
        sb.append(context.getPackageName());
        sb.append(str);
        return sb.toString();
    }

    public static void c0(long j, JSONObject jSONObject, String str) {
        jSONObject.put(str, String.valueOf(com.bytedance.feedbackerlib.a.o0(j)));
    }

    public static String d(IAppGlobals.a aVar, int i) {
        return aVar.getContext().getResources().getString(i);
    }

    public static void d0(Exception exc, StringBuilder sb, IAppGlobals.a aVar, String str) {
        sb.append(exc.getMessage());
        aVar.e(str, sb.toString());
    }

    public static String e(IAppGlobals.a aVar, int i, String str) {
        String string = aVar.getContext().getString(i);
        l.e(string, str);
        return string;
    }

    public static int e0(String str, int i, float f2) {
        Resources system = Resources.getSystem();
        l.e(system, str);
        return kotlin.t.a.a(TypedValue.applyDimension(i, f2, system.getDisplayMetrics()));
    }

    public static String f(F f2, String str, StringBuilder sb) {
        sb.append(f2.f(str));
        return sb.toString();
    }

    public static void f0(Exception exc, StringBuilder sb, String str) {
        sb.append(exc.getMessage());
        j.j(str, sb.toString());
    }

    public static String g(com.google.gson.stream.a aVar, StringBuilder sb) {
        sb.append(aVar.x());
        return sb.toString();
    }

    public static void g0(Exception exc, StringBuilder sb, String str) {
        sb.append(exc.getMessage());
        HMSLog.e(str, sb.toString());
    }

    public static String h(File file, String str) {
        return com.bytedance.android.input.k.b.a.C0(new File(file, str));
    }

    public static void h0(Exception exc, StringBuilder sb, String str) {
        sb.append(exc.getMessage());
        t.a(str, sb.toString());
    }

    public static String i(String str, char c2) {
        return str + c2;
    }

    public static void i0(String str, int i, String str2) {
        Log.d(str2, str + i);
    }

    public static String j(String str, int i) {
        return str + i;
    }

    public static void j0(String str, int i, String str2) {
        j.i(str2, str + i);
    }

    public static String k(String str, int i, String str2) {
        return str + i + str2;
    }

    public static void k0(String str, int i, String str2) {
        j.m(str2, str + i);
    }

    public static String l(String str, int i, String str2, int i2) {
        return str + i + str2 + i2;
    }

    public static void l0(String str, int i, String str2) {
        HMSLog.i(str2, str + i);
    }

    public static float m(String str, int i, float f2) {
        Resources system = Resources.getSystem();
        l.e(system, str);
        return TypedValue.applyDimension(i, f2, system.getDisplayMetrics());
    }

    public static void m0(String str, int i, String str2, int i2, String str3) {
        j.i(str3, str + i + str2 + i2);
    }

    public static String n(String str, long j) {
        return str + j;
    }

    public static void n0(String str, Exception exc, String str2) {
        j.i(str2, str + exc);
    }

    public static String o(String str, Uri uri) {
        return str + uri;
    }

    public static void o0(String str, Exception exc, String str2) {
        j.j(str2, str + exc);
    }

    public static String p(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static int p0(String str, int i, int i2) {
        return (str.hashCode() + i) * i2;
    }

    public static String q(String str, Object obj) {
        return str + obj;
    }

    public static void q0(String str, String str2, IAppLog.a aVar, String str3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, str2);
        aVar.t(str3, jSONObject);
    }

    public static String r(String str, Object obj) {
        return (str + obj).toString();
    }

    public static void r0(String str, String str2, String str3) {
        j.i(str3, str + str2);
    }

    public static String s(String str, String str2) {
        return str + str2;
    }

    public static void s0(String str, String str2, String str3) {
        Logger.d(str3, str + str2);
    }

    public static String t(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static void t0(String str, String str2, String str3, String str4, String str5) {
        j.i(str5, str + str2 + str3 + str4);
    }

    public static String u(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static void u0(String str, String str2, String str3, String str4, String str5, String str6) {
        l.f(str, str2);
        l.f(str3, str4);
        l.f(str5, str6);
    }

    public static String v(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static void v0(String str, Throwable th, String str2) {
        j.j(str2, str + th);
    }

    public static String w(String str, Throwable th) {
        return str + th;
    }

    public static void w0(String str, Throwable th, String str2) {
        c.c(str2, str + th);
    }

    public static int x(float f2, int i, int i2) {
        return (Float.hashCode(f2) + i) * i2;
    }

    public static void x0(String str, ArrayList arrayList) {
        arrayList.add(new com.bytedance.android.input.fragment.custom_symbol.l.a(str));
    }

    public static String y(String str, Type type) {
        return str + type;
    }

    public static void y0(String str, boolean z, String str2) {
        j.i(str2, str + z);
    }

    public static String z(String str, org.threeten.bp.temporal.e eVar) {
        return str + eVar;
    }

    public static void z0(StringBuilder sb, int i, String str) {
        sb.append(i);
        Log.d(str, sb.toString());
    }
}
