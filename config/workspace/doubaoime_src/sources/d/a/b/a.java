package d.a.b;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.activity.SettingsActivityNext;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common_biz.permission.PermissionRequestActivity;
import com.bytedance.android.input.r.j;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.ug.sdk.pangolin.PangolinSDK;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import kotlin.collections.g;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class a {
    public static void a(boolean z, @NonNull String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean b(Context context, String str) {
        return ContextCompat.checkSelfPermission(context, str) == 0;
    }

    public static String c(IAppGlobals iAppGlobals) {
        if (iAppGlobals.getContext() == null) {
            return "official";
        }
        String channel = PangolinSDK.getChannel(iAppGlobals.getContext());
        l.e(channel, "getChannel(context)");
        iAppGlobals.j("IAppGlobals", "pangoChannel=" + channel);
        return channel.length() == 0 ? "official" : channel;
    }

    public static String d() {
        BufferedReader bufferedReader;
        Throwable th;
        String readLine;
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader("/proc/" + Process.myPid() + "/cmdline"));
                try {
                    readLine = bufferedReader.readLine();
                } catch (Exception unused) {
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 == null) {
                        return "";
                    }
                    bufferedReader2.close();
                    return "";
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused3) {
                return "";
            }
        } catch (Exception unused4) {
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
        if (TextUtils.isEmpty(readLine)) {
            bufferedReader.close();
            return "";
        }
        String trim = readLine.trim();
        try {
            bufferedReader.close();
        } catch (IOException unused5) {
        }
        return trim;
    }

    public static String e() {
        Throwable th;
        BufferedReader bufferedReader;
        Exception exc;
        String str;
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            e.a.a.a.a.r0("getProcessName sCurProcessName: ", processName, "ProcessUtil");
            return processName;
        }
        BufferedReader bufferedReader2 = null;
        r0 = null;
        String str2 = null;
        bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader("/proc/" + Process.myPid() + "/cmdline"));
            } catch (Exception e2) {
                exc = e2;
                str = null;
            }
        } catch (Throwable th2) {
            BufferedReader bufferedReader3 = bufferedReader2;
            th = th2;
            bufferedReader = bufferedReader3;
        }
        try {
            String readLine = bufferedReader.readLine();
            if (!TextUtils.isEmpty(readLine)) {
                str2 = readLine.trim();
                j.i("ProcessUtil", "getProcessName sCurProcessName: " + str2);
            }
            try {
                bufferedReader.close();
                return str2;
            } catch (IOException e3) {
                e3.printStackTrace();
                return str2;
            }
        } catch (Exception e4) {
            exc = e4;
            str = str2;
            bufferedReader2 = bufferedReader;
            exc.printStackTrace();
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            return str;
        } catch (Throwable th3) {
            th = th3;
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static final String f(Throwable th, int i) {
        l.g(th, "$this$getSimpleStackTrace");
        try {
            l.g(th, "$this$getThrowableStackTrace");
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            StringBuffer buffer = stringWriter.getBuffer();
            l.b(buffer, "stringWriter.buffer");
            String stringBuffer = buffer.toString();
            l.b(stringBuffer, "buffer.toString()");
            List J2 = kotlin.text.a.J(stringBuffer, new String[]{"\n"}, false, 0, 6, null);
            if (i <= 0) {
                return stringBuffer;
            }
            int i2 = 0;
            String str = "";
            for (Object obj : J2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    g.b0();
                    throw null;
                }
                String str2 = (String) obj;
                if (i > i2) {
                    str = str + str2 + "\n";
                }
                i2 = i3;
            }
            return str;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean g(IAppGlobals iAppGlobals) {
        String channel;
        if (!iAppGlobals.F() && (channel = PangolinSDK.getChannel(iAppGlobals.getContext())) != null) {
            channel.length();
        }
        return true;
    }

    public static boolean h(IAppGlobals iAppGlobals) {
        return !iAppGlobals.F() && kotlin.text.a.d("official", "local_test", false, 2, null);
    }

    public static boolean i(Context context) {
        return context.getPackageName().equals(e());
    }

    public static final boolean j() {
        Looper mainLooper = Looper.getMainLooper();
        l.b(mainLooper, "Looper.getMainLooper()");
        return l.a(mainLooper.getThread(), Thread.currentThread());
    }

    public static String k(int i) {
        switch (i) {
            case 1:
                return WsConstants.KEY_CONNECTION_ERROR;
            case 2:
                return "int";
            case 3:
                return TypedValues.Custom.S_FLOAT;
            case 4:
                return TypedValues.Custom.S_STRING;
            case 5:
                return "iso8601";
            case 6:
                return "true";
            case 7:
                return "false";
            case 8:
                return "null";
            case 9:
                return SettingsActivityNext.SETTINGS_SOURCE_NEW;
            case 10:
                return "(";
            case 11:
                return ")";
            case 12:
                return "{";
            case 13:
                return "}";
            case 14:
                return "[";
            case 15:
                return "]";
            case 16:
                return Constants.ACCEPT_TIME_SEPARATOR_SP;
            case 17:
                return Constants.COLON_SEPARATOR;
            case 18:
                return "ident";
            case 19:
            default:
                return "Unknown";
            case 20:
                return "EOF";
            case 21:
                return "Set";
            case 22:
                return "TreeSet";
            case 23:
                return "undefined";
        }
    }

    public static final <T> com.bytedance.android.input.basic.b.a<T> l(T t) {
        l.f(t, "defaultValue");
        return new com.bytedance.android.input.basic.b.a<>(t);
    }

    public static boolean m(Context context, String str, int i, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("permission_code", i);
        bundle.putInt("request_type", 1);
        bundle.putString("request_permission", str);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("tip_title", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            bundle.putString("tip_desc", str3);
        }
        Intent intent = new Intent(context, (Class<?>) PermissionRequestActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("key_bundle", bundle);
        intent.addFlags(65536);
        context.startActivity(intent);
        return true;
    }

    public static final <T> void n(b<T> bVar, T t) {
        l.g(bVar, "$this$value");
        bVar.b(t);
    }

    public static Object o(kotlin.s.b.a aVar, String str, kotlin.s.b.l lVar, kotlin.s.b.a aVar2, int i) {
        String str2 = (i & 2) != 0 ? "tryExtensions" : null;
        int i2 = i & 8;
        l.f(aVar, "normalLogic");
        l.f(str2, "catchTag");
        l.f(lVar, "throwableLogic");
        try {
            return aVar.invoke();
        } finally {
        }
    }
}
