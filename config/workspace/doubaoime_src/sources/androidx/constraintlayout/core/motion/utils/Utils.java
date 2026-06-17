package androidx.constraintlayout.core.motion.utils;

import com.xiaomi.mipush.sdk.Constants;
import e.a.a.a.a;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/* loaded from: classes.dex */
public class Utils {
    static DebugHandle ourHandle;

    public interface DebugHandle {
        void message(String str);
    }

    private static int clamp(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static void log(String str, String str2) {
        System.out.println(str + " : " + str2);
    }

    public static void logStack(String str, int i) {
        StackTraceElement[] U0 = a.U0();
        int min = Math.min(i, U0.length - 1);
        String str2 = " ";
        for (int i2 = 1; i2 <= min; i2++) {
            StackTraceElement stackTraceElement = U0[i2];
            StringBuilder M = a.M(".(");
            M.append(U0[i2].getFileName());
            M.append(Constants.COLON_SEPARATOR);
            M.append(U0[i2].getLineNumber());
            M.append(") ");
            M.append(U0[i2].getMethodName());
            String sb = M.toString();
            str2 = a.s(str2, " ");
            System.out.println(str + str2 + sb + str2);
        }
    }

    public static void loge(String str, String str2) {
        System.err.println(str + " : " + str2);
    }

    public static int rgbaTocColor(float f2, float f3, float f4, float f5) {
        int clamp = clamp((int) (f2 * 255.0f));
        int clamp2 = clamp((int) (f3 * 255.0f));
        return (clamp << 16) | (clamp((int) (f5 * 255.0f)) << 24) | (clamp2 << 8) | clamp((int) (f4 * 255.0f));
    }

    public static void setDebugHandle(DebugHandle debugHandle) {
        ourHandle = debugHandle;
    }

    public static void socketSend(String str) {
        try {
            OutputStream outputStream = new Socket("127.0.0.1", 5327).getOutputStream();
            outputStream.write(str.getBytes());
            outputStream.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public int getInterpolatedColor(float[] fArr) {
        return (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }

    public static void log(String str) {
        StackTraceElement stackTraceElement = a.U0()[1];
        String substring = (stackTraceElement.getMethodName() + "                  ").substring(0, 17);
        String substring2 = "    ".substring(Integer.toString(stackTraceElement.getLineNumber()).length());
        StringBuilder M = a.M(".(");
        M.append(stackTraceElement.getFileName());
        M.append(Constants.COLON_SEPARATOR);
        M.append(stackTraceElement.getLineNumber());
        M.append(")");
        M.append(substring2);
        M.append(substring);
        String sb = M.toString();
        System.out.println(sb + " " + str);
        DebugHandle debugHandle = ourHandle;
        if (debugHandle != null) {
            debugHandle.message(sb + " " + str);
        }
    }
}
