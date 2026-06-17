package androidx.constraintlayout.motion.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.xiaomi.mipush.sdk.Constants;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.CharBuffer;

@SuppressLint({"LogConditional"})
/* loaded from: classes.dex */
public class Debug {
    public static void dumpLayoutParams(ViewGroup viewGroup, String str) {
        StackTraceElement stackTraceElement = e.a.a.a.a.U0()[1];
        StringBuilder M = e.a.a.a.a.M(".(");
        M.append(stackTraceElement.getFileName());
        M.append(Constants.COLON_SEPARATOR);
        M.append(stackTraceElement.getLineNumber());
        M.append(") ");
        M.append(str);
        M.append("  ");
        String sb = M.toString();
        int childCount = viewGroup.getChildCount();
        System.out.println(str + " children " + childCount);
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            PrintStream printStream = System.out;
            StringBuilder S = e.a.a.a.a.S(sb, "     ");
            S.append(getName(childAt));
            printStream.println(S.toString());
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            for (Field field : layoutParams.getClass().getFields()) {
                try {
                    Object obj = field.get(layoutParams);
                    if (field.getName().contains("To") && !obj.toString().equals("-1")) {
                        System.out.println(sb + "       " + field.getName() + " " + obj);
                    }
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    public static void dumpPoc(Object obj) {
        StackTraceElement stackTraceElement = e.a.a.a.a.U0()[1];
        StringBuilder M = e.a.a.a.a.M(".(");
        M.append(stackTraceElement.getFileName());
        M.append(Constants.COLON_SEPARATOR);
        M.append(stackTraceElement.getLineNumber());
        M.append(")");
        String sb = M.toString();
        Class<?> cls = obj.getClass();
        PrintStream printStream = System.out;
        StringBuilder S = e.a.a.a.a.S(sb, "------------- ");
        S.append(cls.getName());
        S.append(" --------------------");
        printStream.println(S.toString());
        for (Field field : cls.getFields()) {
            try {
                Object obj2 = field.get(obj);
                if (field.getName().startsWith("layout_constraint") && ((!(obj2 instanceof Integer) || !obj2.toString().equals("-1")) && ((!(obj2 instanceof Integer) || !obj2.toString().equals("0")) && ((!(obj2 instanceof Float) || !obj2.toString().equals("1.0")) && (!(obj2 instanceof Float) || !obj2.toString().equals("0.5")))))) {
                    System.out.println(sb + "    " + field.getName() + " " + obj2);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        PrintStream printStream2 = System.out;
        StringBuilder S2 = e.a.a.a.a.S(sb, "------------- ");
        S2.append(cls.getSimpleName());
        S2.append(" --------------------");
        printStream2.println(S2.toString());
    }

    public static String getActionType(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        for (Field field : MotionEvent.class.getFields()) {
            try {
                if (Modifier.isStatic(field.getModifiers()) && field.getType().equals(Integer.TYPE) && field.getInt(null) == action) {
                    return field.getName();
                }
            } catch (IllegalAccessException unused) {
            }
        }
        return "---";
    }

    public static String getCallFrom(int i) {
        StackTraceElement stackTraceElement = e.a.a.a.a.U0()[i + 2];
        StringBuilder M = e.a.a.a.a.M(".(");
        M.append(stackTraceElement.getFileName());
        M.append(Constants.COLON_SEPARATOR);
        M.append(stackTraceElement.getLineNumber());
        M.append(")");
        return M.toString();
    }

    public static String getLoc() {
        StackTraceElement stackTraceElement = e.a.a.a.a.U0()[1];
        StringBuilder M = e.a.a.a.a.M(".(");
        M.append(stackTraceElement.getFileName());
        M.append(Constants.COLON_SEPARATOR);
        M.append(stackTraceElement.getLineNumber());
        M.append(") ");
        M.append(stackTraceElement.getMethodName());
        M.append("()");
        return M.toString();
    }

    public static String getLocation() {
        StackTraceElement stackTraceElement = e.a.a.a.a.U0()[1];
        StringBuilder M = e.a.a.a.a.M(".(");
        M.append(stackTraceElement.getFileName());
        M.append(Constants.COLON_SEPARATOR);
        M.append(stackTraceElement.getLineNumber());
        M.append(")");
        return M.toString();
    }

    public static String getLocation2() {
        StackTraceElement stackTraceElement = e.a.a.a.a.U0()[2];
        StringBuilder M = e.a.a.a.a.M(".(");
        M.append(stackTraceElement.getFileName());
        M.append(Constants.COLON_SEPARATOR);
        M.append(stackTraceElement.getLineNumber());
        M.append(")");
        return M.toString();
    }

    public static String getName(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }

    public static String getState(MotionLayout motionLayout, int i) {
        return getState(motionLayout, i, -1);
    }

    public static void logStack(String str, String str2, int i) {
        StackTraceElement[] U0 = e.a.a.a.a.U0();
        int min = Math.min(i, U0.length - 1);
        String str3 = " ";
        for (int i2 = 1; i2 <= min; i2++) {
            StackTraceElement stackTraceElement = U0[i2];
            StringBuilder M = e.a.a.a.a.M(".(");
            M.append(U0[i2].getFileName());
            M.append(Constants.COLON_SEPARATOR);
            M.append(U0[i2].getLineNumber());
            M.append(") ");
            M.append(U0[i2].getMethodName());
            String sb = M.toString();
            str3 = e.a.a.a.a.s(str3, " ");
            Log.v(str, str2 + str3 + sb + str3);
        }
    }

    public static void printStack(String str, int i) {
        StackTraceElement[] U0 = e.a.a.a.a.U0();
        int min = Math.min(i, U0.length - 1);
        String str2 = " ";
        for (int i2 = 1; i2 <= min; i2++) {
            StackTraceElement stackTraceElement = U0[i2];
            StringBuilder M = e.a.a.a.a.M(".(");
            M.append(U0[i2].getFileName());
            M.append(Constants.COLON_SEPARATOR);
            M.append(U0[i2].getLineNumber());
            M.append(") ");
            String sb = M.toString();
            str2 = e.a.a.a.a.s(str2, " ");
            System.out.println(str + str2 + sb + str2);
        }
    }

    public static String getState(MotionLayout motionLayout, int i, int i2) {
        int length;
        if (i == -1) {
            return "UNDEFINED";
        }
        String resourceEntryName = motionLayout.getContext().getResources().getResourceEntryName(i);
        if (i2 == -1) {
            return resourceEntryName;
        }
        if (resourceEntryName.length() > i2) {
            resourceEntryName = resourceEntryName.replaceAll("([^_])[aeiou]+", "$1");
        }
        if (resourceEntryName.length() <= i2 || (length = resourceEntryName.replaceAll("[^_]", "").length()) <= 0) {
            return resourceEntryName;
        }
        return resourceEntryName.replaceAll(CharBuffer.allocate((resourceEntryName.length() - i2) / length).toString().replace((char) 0, '.') + BundleUtil.UNDERLINE_TAG, BundleUtil.UNDERLINE_TAG);
    }

    public static String getName(Context context, int i) {
        if (i == -1) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            return e.a.a.a.a.j("?", i);
        }
    }

    public static String getName(Context context, int[] iArr) {
        String str;
        try {
            String str2 = iArr.length + "[";
            int i = 0;
            while (i < iArr.length) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(i == 0 ? "" : " ");
                String sb2 = sb.toString();
                try {
                    str = context.getResources().getResourceEntryName(iArr[i]);
                } catch (Resources.NotFoundException unused) {
                    str = "? " + iArr[i] + " ";
                }
                str2 = sb2 + str;
                i++;
            }
            return str2 + "]";
        } catch (Exception e2) {
            Log.v("DEBUG", e2.toString());
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }

    public static void dumpLayoutParams(ViewGroup.LayoutParams layoutParams, String str) {
        StackTraceElement stackTraceElement = e.a.a.a.a.U0()[1];
        StringBuilder M = e.a.a.a.a.M(".(");
        M.append(stackTraceElement.getFileName());
        M.append(Constants.COLON_SEPARATOR);
        M.append(stackTraceElement.getLineNumber());
        M.append(") ");
        M.append(str);
        M.append("  ");
        String sb = M.toString();
        PrintStream printStream = System.out;
        StringBuilder U = e.a.a.a.a.U(" >>>>>>>>>>>>>>>>>>. dump ", sb, "  ");
        U.append(layoutParams.getClass().getName());
        printStream.println(U.toString());
        for (Field field : layoutParams.getClass().getFields()) {
            try {
                Object obj = field.get(layoutParams);
                String name = field.getName();
                if (name.contains("To") && !obj.toString().equals("-1")) {
                    System.out.println(sb + "       " + name + " " + obj);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        System.out.println(" <<<<<<<<<<<<<<<<< dump " + sb);
    }
}
