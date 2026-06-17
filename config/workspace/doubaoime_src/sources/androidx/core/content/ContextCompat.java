package androidx.core.content;

import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.BuildCompat;
import androidx.core.os.ExecutorCompat;
import androidx.core.util.ObjectsCompat;
import com.bytedance.crash.dumper.Scraps;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.concurrent.Executor;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class ContextCompat {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sLock = new Object();
    private static final Object sSync = new Object();
    private static TypedValue sTempValue;

    @RequiresApi(16)
    static class Api16Impl {
        private Api16Impl() {
        }

        @DoNotInline
        static void startActivities(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        @DoNotInline
        static void startActivity(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    @RequiresApi(19)
    static class Api19Impl {
        private Api19Impl() {
        }

        @DoNotInline
        static File[] getExternalCacheDirs(Context context) {
            return context.getExternalCacheDirs();
        }

        @DoNotInline
        static File[] getExternalFilesDirs(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        @DoNotInline
        static File[] getObbDirs(Context context) {
            return context.getObbDirs();
        }
    }

    @RequiresApi(21)
    static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        static File getCodeCacheDir(Context context) {
            return context.getCodeCacheDir();
        }

        @DoNotInline
        static Drawable getDrawable(Context context, int i) {
            return context.getDrawable(i);
        }

        @DoNotInline
        static File getNoBackupFilesDir(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    @RequiresApi(23)
    static class Api23Impl {
        private Api23Impl() {
        }

        @DoNotInline
        static int getColor(Context context, int i) {
            return context.getColor(i);
        }

        @DoNotInline
        static <T> T getSystemService(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        @DoNotInline
        static String getSystemServiceName(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    @RequiresApi(24)
    static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        static Context createDeviceProtectedStorageContext(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        @DoNotInline
        static File getDataDir(Context context) {
            return context.getDataDir();
        }

        @DoNotInline
        static boolean isDeviceProtectedStorage(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    @RequiresApi(26)
    static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        static Intent registerReceiver(Context context, @Nullable BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            return ((i & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1) : context.registerReceiver(broadcastReceiver, intentFilter, ContextCompat.obtainAndCheckReceiverPermission(context), handler);
        }

        @DoNotInline
        static ComponentName startForegroundService(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    @RequiresApi(28)
    static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        static Executor getMainExecutor(Context context) {
            return context.getMainExecutor();
        }
    }

    @RequiresApi(30)
    static class Api30Impl {
        private Api30Impl() {
        }

        @DoNotInline
        static String getAttributionTag(Context context) {
            return context.getAttributionTag();
        }
    }

    @RequiresApi(33)
    static class Api33Impl {
        private Api33Impl() {
        }

        @DoNotInline
        static Intent registerReceiver(Context context, @Nullable BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
        }
    }

    private static final class LegacyServiceMapHolder {
        static final HashMap<Class<?>, String> SERVICES;

        static {
            HashMap<Class<?>, String> hashMap = new HashMap<>();
            SERVICES = hashMap;
            hashMap.put(SubscriptionManager.class, "telephony_subscription_service");
            hashMap.put(UsageStatsManager.class, "usagestats");
            hashMap.put(AppWidgetManager.class, "appwidget");
            hashMap.put(BatteryManager.class, "batterymanager");
            hashMap.put(CameraManager.class, "camera");
            hashMap.put(JobScheduler.class, "jobscheduler");
            hashMap.put(LauncherApps.class, "launcherapps");
            hashMap.put(MediaProjectionManager.class, "media_projection");
            hashMap.put(MediaSessionManager.class, "media_session");
            hashMap.put(RestrictionsManager.class, "restrictions");
            hashMap.put(TelecomManager.class, "telecom");
            hashMap.put(TvInputManager.class, "tv_input");
            hashMap.put(AppOpsManager.class, "appops");
            hashMap.put(CaptioningManager.class, "captioning");
            hashMap.put(ConsumerIrManager.class, "consumer_ir");
            hashMap.put(PrintManager.class, "print");
            hashMap.put(BluetoothManager.class, "bluetooth");
            hashMap.put(DisplayManager.class, "display");
            hashMap.put(UserManager.class, "user");
            hashMap.put(InputManager.class, "input");
            hashMap.put(MediaRouter.class, "media_router");
            hashMap.put(NsdManager.class, "servicediscovery");
            hashMap.put(AccessibilityManager.class, "accessibility");
            hashMap.put(AccountManager.class, "account");
            hashMap.put(ActivityManager.class, "activity");
            hashMap.put(AlarmManager.class, NotificationCompat.CATEGORY_ALARM);
            hashMap.put(AudioManager.class, "audio");
            hashMap.put(ClipboardManager.class, "clipboard");
            hashMap.put(ConnectivityManager.class, "connectivity");
            hashMap.put(DevicePolicyManager.class, "device_policy");
            hashMap.put(DownloadManager.class, "download");
            hashMap.put(DropBoxManager.class, "dropbox");
            hashMap.put(InputMethodManager.class, "input_method");
            hashMap.put(KeyguardManager.class, "keyguard");
            hashMap.put(LayoutInflater.class, "layout_inflater");
            hashMap.put(LocationManager.class, "location");
            hashMap.put(NfcManager.class, "nfc");
            hashMap.put(NotificationManager.class, RemoteMessageConst.NOTIFICATION);
            hashMap.put(PowerManager.class, "power");
            hashMap.put(SearchManager.class, "search");
            hashMap.put(SensorManager.class, "sensor");
            hashMap.put(StorageManager.class, Scraps.STORAGE);
            hashMap.put(TelephonyManager.class, "phone");
            hashMap.put(TextServicesManager.class, "textservices");
            hashMap.put(UiModeManager.class, "uimode");
            hashMap.put(UsbManager.class, "usb");
            hashMap.put(Vibrator.class, "vibrator");
            hashMap.put(WallpaperManager.class, "wallpaper");
            hashMap.put(WifiP2pManager.class, "wifip2p");
            hashMap.put(WifiManager.class, "wifi");
            hashMap.put(WindowManager.class, "window");
        }

        private LegacyServiceMapHolder() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface RegisterReceiverFlags {
    }

    protected ContextCompat() {
    }

    @OptIn(markerClass = {BuildCompat.PrereleaseSdkCheck.class})
    public static int checkSelfPermission(@NonNull Context context, @NonNull String str) {
        ObjectsCompat.requireNonNull(str, "permission must be non-null");
        return (BuildCompat.isAtLeastT() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : NotificationManagerCompat.from(context).areNotificationsEnabled() ? 0 : -1;
    }

    @Nullable
    public static Context createDeviceProtectedStorageContext(@NonNull Context context) {
        return Api24Impl.createDeviceProtectedStorageContext(context);
    }

    private static File createFilesDir(File file) {
        synchronized (sSync) {
            if (!file.exists()) {
                if (file.mkdirs()) {
                    return file;
                }
                Log.w(TAG, "Unable to create files subdir " + file.getPath());
            }
            return file;
        }
    }

    @Nullable
    public static String getAttributionTag(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getAttributionTag(context);
        }
        return null;
    }

    @NonNull
    public static File getCodeCacheDir(@NonNull Context context) {
        return Api21Impl.getCodeCacheDir(context);
    }

    @ColorInt
    public static int getColor(@NonNull Context context, @ColorRes int i) {
        return Api23Impl.getColor(context, i);
    }

    @Nullable
    public static ColorStateList getColorStateList(@NonNull Context context, @ColorRes int i) {
        return ResourcesCompat.getColorStateList(context.getResources(), i, context.getTheme());
    }

    @Nullable
    public static File getDataDir(@NonNull Context context) {
        return Api24Impl.getDataDir(context);
    }

    @Nullable
    public static Drawable getDrawable(@NonNull Context context, @DrawableRes int i) {
        return Api21Impl.getDrawable(context, i);
    }

    @NonNull
    public static File[] getExternalCacheDirs(@NonNull Context context) {
        return Api19Impl.getExternalCacheDirs(context);
    }

    @NonNull
    public static File[] getExternalFilesDirs(@NonNull Context context, @Nullable String str) {
        return Api19Impl.getExternalFilesDirs(context, str);
    }

    @NonNull
    public static Executor getMainExecutor(@NonNull Context context) {
        return Build.VERSION.SDK_INT >= 28 ? Api28Impl.getMainExecutor(context) : ExecutorCompat.create(new Handler(context.getMainLooper()));
    }

    @Nullable
    public static File getNoBackupFilesDir(@NonNull Context context) {
        return Api21Impl.getNoBackupFilesDir(context);
    }

    @NonNull
    public static File[] getObbDirs(@NonNull Context context) {
        return Api19Impl.getObbDirs(context);
    }

    @Nullable
    public static <T> T getSystemService(@NonNull Context context, @NonNull Class<T> cls) {
        return (T) Api23Impl.getSystemService(context, cls);
    }

    @Nullable
    public static String getSystemServiceName(@NonNull Context context, @NonNull Class<?> cls) {
        return Api23Impl.getSystemServiceName(context, cls);
    }

    public static boolean isDeviceProtectedStorage(@NonNull Context context) {
        return Api24Impl.isDeviceProtectedStorage(context);
    }

    static String obtainAndCheckReceiverPermission(Context context) {
        String c2 = e.a.a.a.a.c(context, new StringBuilder(), DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX);
        if (PermissionChecker.checkSelfPermission(context, c2) == 0) {
            return c2;
        }
        throw new RuntimeException(e.a.a.a.a.t("Permission ", c2, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    @Nullable
    public static Intent registerReceiver(@NonNull Context context, @Nullable BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter, int i) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i);
    }

    public static boolean startActivities(@NonNull Context context, @NonNull Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static void startActivity(@NonNull Context context, @NonNull Intent intent, @Nullable Bundle bundle) {
        Api16Impl.startActivity(context, intent, bundle);
    }

    public static void startForegroundService(@NonNull Context context, @NonNull Intent intent) {
        Api26Impl.startForegroundService(context, intent);
    }

    @Nullable
    @OptIn(markerClass = {BuildCompat.PrereleaseSdkCheck.class})
    public static Intent registerReceiver(@NonNull Context context, @Nullable BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter, @Nullable String str, @Nullable Handler handler, int i) {
        int i2 = i & 1;
        if (i2 != 0 && (i & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i2 != 0) {
            i |= 2;
        }
        int i3 = i;
        int i4 = i3 & 2;
        if (i4 == 0 && (i3 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i4 == 0 || (i3 & 4) == 0) {
            return BuildCompat.isAtLeastT() ? Api33Impl.registerReceiver(context, broadcastReceiver, intentFilter, str, handler, i3) : Api26Impl.registerReceiver(context, broadcastReceiver, intentFilter, str, handler, i3);
        }
        throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
    }

    public static boolean startActivities(@NonNull Context context, @NonNull Intent[] intentArr, @Nullable Bundle bundle) {
        Api16Impl.startActivities(context, intentArr, bundle);
        return true;
    }
}
