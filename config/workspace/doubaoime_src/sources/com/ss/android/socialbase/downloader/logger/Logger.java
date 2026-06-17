package com.ss.android.socialbase.downloader.logger;

import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import e.a.a.a.a;

/* loaded from: classes2.dex */
public class Logger {
    public static final boolean DEBUG = false;
    private static final String DOWNLOAD_TAG_PREFIX = "Downloader-";
    private static final String TAG = "DownloaderLogger";
    private static final String TAG_GLOBAL_FORMAT = "[Downloader|Global|%s]";
    private static final String TAG_TASK_FORMAT = "[Downloader|%d|%s]";
    private static int mLevel = 4;
    private static ILogWritter sLogWritter;

    public static abstract class ILogWritter {
        public void logD(String str, String str2) {
        }

        public void logE(String str, String str2) {
        }

        public void logE(String str, String str2, Throwable th) {
        }

        public void logI(String str, String str2) {
        }

        public void logI(String str, String str2, Throwable th) {
        }

        public void logK(String str, String str2) {
        }

        public void logV(String str, String str2) {
        }

        public void logW(String str, String str2) {
        }

        public void logW(String str, String str2, Throwable th) {
        }
    }

    public static void alertErrorInfo(String str) {
        if (debug()) {
            throw new IllegalStateException(str);
        }
    }

    public static void d(String str) {
        d(TAG, str);
    }

    public static boolean debug() {
        return mLevel <= 3;
    }

    public static String downloaderTag(String str) {
        return !TextUtils.isEmpty(str) ? a.s(DOWNLOAD_TAG_PREFIX, str) : TAG;
    }

    public static void e(String str) {
        e(TAG, str);
    }

    public static int getLogLevel() {
        return mLevel;
    }

    private static String getSimpleClassName(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf < 0 ? str : str.substring(lastIndexOf + 1);
    }

    public static void globalDebug(String str, String str2, String str3) {
        if (isLoggerParamsValid(str, str2, str3)) {
            String format = String.format(TAG_GLOBAL_FORMAT, str);
            String t = a.t(str2, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, str3);
            if (mLevel <= 3) {
                Log.d(format, t);
            }
            ILogWritter iLogWritter = sLogWritter;
            if (iLogWritter != null) {
                iLogWritter.logD(format, t);
            }
        }
    }

    public static void globalError(String str, String str2, String str3) {
        if (isLoggerParamsValid(str, str2, str3)) {
            String format = String.format(TAG_GLOBAL_FORMAT, str);
            String t = a.t(str2, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, str3);
            if (mLevel <= 6) {
                Log.d(format, t);
            }
            ILogWritter iLogWritter = sLogWritter;
            if (iLogWritter != null) {
                iLogWritter.logD(format, t);
            }
        }
    }

    public static void i(String str) {
        i(TAG, str);
    }

    private static boolean isLoggerParamsValid(String str, String str2, String str3) {
        return (str == null || str2 == null || str3 == null) ? false : true;
    }

    public static void k(String str) {
        k(TAG, str);
    }

    public static void registerLogHandler(ILogWritter iLogWritter) {
        sLogWritter = iLogWritter;
    }

    public static void setLogLevel(int i) {
        mLevel = i;
    }

    public static void st(String str, int i) {
        try {
            throw new Exception();
        } catch (Exception e2) {
            StackTraceElement[] stackTrace = e2.getStackTrace();
            StringBuilder sb = new StringBuilder();
            for (int i2 = 1; i2 < Math.min(i, stackTrace.length); i2++) {
                if (i2 > 1) {
                    sb.append("\n");
                }
                sb.append(getSimpleClassName(stackTrace[i2].getClassName()));
                sb.append(".");
                sb.append(stackTrace[i2].getMethodName());
            }
            v(downloaderTag(str), sb.toString());
        }
    }

    public static void taskDebug(String str, int i, String str2, String str3) {
        if (isLoggerParamsValid(str, str2, str3)) {
            String format = String.format(TAG_TASK_FORMAT, Integer.valueOf(i), str);
            String t = a.t(str2, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, str3);
            if (mLevel <= 3) {
                Log.d(format, t);
            }
            ILogWritter iLogWritter = sLogWritter;
            if (iLogWritter != null) {
                iLogWritter.logD(format, t);
            }
        }
    }

    public static void taskError(String str, int i, String str2, String str3) {
        if (isLoggerParamsValid(str, str2, str3)) {
            String format = String.format(TAG_TASK_FORMAT, Integer.valueOf(i), str);
            String t = a.t(str2, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, str3);
            if (mLevel <= 6) {
                Log.d(format, t);
            }
            ILogWritter iLogWritter = sLogWritter;
            if (iLogWritter != null) {
                iLogWritter.logD(format, t);
            }
        }
    }

    public static void throwException(Throwable th) {
        if (th == null) {
            return;
        }
        th.printStackTrace();
        if (debug()) {
            throw new RuntimeException("Error! Now in debug, we alert to you to correct it !", th);
        }
    }

    public static void v(String str) {
        v(TAG, str);
    }

    public static void w(String str) {
        w(TAG, str);
    }

    public static void d(String str, String str2) {
        if (str2 == null) {
            return;
        }
        if (mLevel <= 3) {
            Log.d(downloaderTag(str), str2);
        }
        ILogWritter iLogWritter = sLogWritter;
        if (iLogWritter != null) {
            iLogWritter.logD(downloaderTag(str), str2);
        }
    }

    public static void e(String str, String str2) {
        if (str2 == null) {
            return;
        }
        if (mLevel <= 6) {
            Log.e(downloaderTag(str), str2);
        }
        ILogWritter iLogWritter = sLogWritter;
        if (iLogWritter != null) {
            iLogWritter.logE(downloaderTag(str), str2);
        }
    }

    public static void i(String str, String str2) {
        if (str2 == null) {
            return;
        }
        if (mLevel <= 4) {
            Log.i(downloaderTag(str), str2);
        }
        ILogWritter iLogWritter = sLogWritter;
        if (iLogWritter != null) {
            iLogWritter.logI(downloaderTag(str), str2);
        }
    }

    public static void k(String str, String str2) {
        if (mLevel <= 3) {
            Log.d(downloaderTag(str), str2);
        }
        ILogWritter iLogWritter = sLogWritter;
        if (iLogWritter != null) {
            iLogWritter.logK(downloaderTag(str), str2);
        }
    }

    public static void v(String str, String str2) {
        if (str2 == null) {
            return;
        }
        if (mLevel <= 2) {
            Log.v(str, str2);
        }
        ILogWritter iLogWritter = sLogWritter;
        if (iLogWritter != null) {
            iLogWritter.logV(downloaderTag(str), str2);
        }
    }

    public static void w(String str, String str2) {
        if (str2 == null) {
            return;
        }
        if (mLevel <= 5) {
            Log.w(downloaderTag(str), str2);
        }
        ILogWritter iLogWritter = sLogWritter;
        if (iLogWritter != null) {
            iLogWritter.logW(downloaderTag(str), str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (str2 == null && th == null) {
            return;
        }
        if (mLevel <= 3) {
            Log.d(downloaderTag(str), str2, th);
        }
        ILogWritter iLogWritter = sLogWritter;
        if (iLogWritter != null) {
            iLogWritter.logD(downloaderTag(str), str2 + th);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (str2 == null && th == null) {
            return;
        }
        if (mLevel <= 6) {
            Log.e(downloaderTag(str), str2, th);
        }
        ILogWritter iLogWritter = sLogWritter;
        if (iLogWritter != null) {
            iLogWritter.logE(downloaderTag(str), str2, th);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (str2 == null && th == null) {
            return;
        }
        if (mLevel <= 4) {
            Log.i(downloaderTag(str), str2, th);
        }
        ILogWritter iLogWritter = sLogWritter;
        if (iLogWritter != null) {
            iLogWritter.logI(downloaderTag(str), str2, th);
        }
    }

    public static void v(String str, String str2, Throwable th) {
        if (str2 == null && th == null) {
            return;
        }
        if (mLevel <= 2) {
            Log.v(str, str2, th);
        }
        ILogWritter iLogWritter = sLogWritter;
        if (iLogWritter != null) {
            iLogWritter.logV(downloaderTag(str), str2 + th);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (str2 == null && th == null) {
            return;
        }
        if (mLevel <= 5) {
            Log.w(downloaderTag(str), str2, th);
        }
        ILogWritter iLogWritter = sLogWritter;
        if (iLogWritter != null) {
            iLogWritter.logW(downloaderTag(str), str2, th);
        }
    }
}
