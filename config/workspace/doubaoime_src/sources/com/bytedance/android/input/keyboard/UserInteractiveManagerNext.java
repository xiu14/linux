package com.bytedance.android.input.keyboard;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.provider.Settings;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.common.VibrationController;
import com.bytedance.android.input.keyboard.UserInteractiveManagerNext;
import com.bytedance.android.input.keyboard.vibrate.entity.VibrateIntensity;
import com.bytedance.android.input.keyboard.vibrate.entity.VibrateKeyType;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class UserInteractiveManagerNext {
    public static final UserInteractiveManagerNext a = new UserInteractiveManagerNext();
    private static boolean b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f2522c;

    /* renamed from: d, reason: collision with root package name */
    private static int f2523d;

    /* renamed from: e, reason: collision with root package name */
    private static VibrateIntensity f2524e;

    /* renamed from: f, reason: collision with root package name */
    private static ThreadPoolExecutor f2525f;

    /* renamed from: g, reason: collision with root package name */
    private static final AudioManager f2526g;
    private static final Vibrator h;

    public enum KeySound {
        NONE,
        FUNCTION,
        KEYBOARD,
        ENTRANCE,
        DELETE
    }

    public enum KeyVibrate {
        NONE(new kotlin.g(0L, 0)),
        STANDARD(new kotlin.g(25L, 172)),
        FUNCTION(new kotlin.g(15L, 168)),
        LONG_PRESS(new kotlin.g(25L, 172)),
        CONFIRM(new kotlin.g(25L, 172));

        private final kotlin.g<Long, Integer> value;

        KeyVibrate(kotlin.g gVar) {
            this.value = gVar;
        }

        public final kotlin.g<Long, Integer> getValue() {
            return this.value;
        }
    }

    public static final class a extends SettingsConfigNext.b {
        final /* synthetic */ Context a;

        a(Context context) {
            this.a = context;
        }

        @Override // com.bytedance.android.input.common.SettingsConfigNext.b
        public void onReset() {
            UserInteractiveManagerNext userInteractiveManagerNext = UserInteractiveManagerNext.a;
            String string = this.a.getResources().getString(C0838R.string.enable_key_sound);
            kotlin.s.c.l.e(string, "resources.getString(R.string.enable_key_sound)");
            Object f2 = SettingsConfigNext.f(string);
            kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Boolean");
            userInteractiveManagerNext.i(((Boolean) f2).booleanValue());
            String string2 = this.a.getResources().getString(C0838R.string.key_sound_volume);
            kotlin.s.c.l.e(string2, "resources.getString(R.string.key_sound_volume)");
            Object f3 = SettingsConfigNext.f(string2);
            kotlin.s.c.l.d(f3, "null cannot be cast to non-null type kotlin.Int");
            userInteractiveManagerNext.j(((Integer) f3).intValue());
            String string3 = this.a.getResources().getString(C0838R.string.enable_key_vibrate);
            kotlin.s.c.l.e(string3, "resources.getString(R.string.enable_key_vibrate)");
            Object f4 = SettingsConfigNext.f(string3);
            kotlin.s.c.l.d(f4, "null cannot be cast to non-null type kotlin.Boolean");
            userInteractiveManagerNext.k(((Boolean) f4).booleanValue());
            VibrateIntensity.a aVar = VibrateIntensity.Companion;
            String string4 = this.a.getResources().getString(C0838R.string.key_vibrate_intensity);
            kotlin.s.c.l.e(string4, "resources.getString(R.st…ng.key_vibrate_intensity)");
            Object f5 = SettingsConfigNext.f(string4);
            kotlin.s.c.l.d(f5, "null cannot be cast to non-null type kotlin.String");
            userInteractiveManagerNext.l(aVar.c((String) f5));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.bytedance.android.input.common.SettingsConfigNext.b
        public <T> void onSettingsConfigChanged(String str, T t) {
            kotlin.s.c.l.f(str, "key");
            if (kotlin.s.c.l.a(str, this.a.getResources().getString(C0838R.string.enable_key_sound))) {
                UserInteractiveManagerNext userInteractiveManagerNext = UserInteractiveManagerNext.a;
                kotlin.s.c.l.d(t, "null cannot be cast to non-null type kotlin.Boolean");
                userInteractiveManagerNext.i(((Boolean) t).booleanValue());
                return;
            }
            if (kotlin.s.c.l.a(str, this.a.getResources().getString(C0838R.string.enable_key_vibrate))) {
                UserInteractiveManagerNext userInteractiveManagerNext2 = UserInteractiveManagerNext.a;
                kotlin.s.c.l.d(t, "null cannot be cast to non-null type kotlin.Boolean");
                userInteractiveManagerNext2.k(((Boolean) t).booleanValue());
            } else if (kotlin.s.c.l.a(str, this.a.getResources().getString(C0838R.string.key_sound_volume))) {
                UserInteractiveManagerNext userInteractiveManagerNext3 = UserInteractiveManagerNext.a;
                kotlin.s.c.l.d(t, "null cannot be cast to non-null type kotlin.Int");
                userInteractiveManagerNext3.j(((Integer) t).intValue());
            } else if (kotlin.s.c.l.a(str, this.a.getResources().getString(C0838R.string.key_vibrate_intensity))) {
                UserInteractiveManagerNext userInteractiveManagerNext4 = UserInteractiveManagerNext.a;
                VibrateIntensity.a aVar = VibrateIntensity.Companion;
                kotlin.s.c.l.d(t, "null cannot be cast to non-null type kotlin.String");
                userInteractiveManagerNext4.l(aVar.c((String) t));
            }
        }
    }

    static {
        Vibrator vibrator;
        VibrateIntensity.a aVar = VibrateIntensity.Companion;
        f2524e = aVar.b();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 2000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        f2525f = threadPoolExecutor;
        kotlin.s.c.l.c(threadPoolExecutor);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        Context context = IAppGlobals.a.getContext();
        Object systemService = context.getSystemService("audio");
        kotlin.s.c.l.d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        f2526g = (AudioManager) systemService;
        if (Build.VERSION.SDK_INT >= 31) {
            Object systemService2 = context.getSystemService("vibrator_manager");
            kotlin.s.c.l.d(systemService2, "null cannot be cast to non-null type android.os.VibratorManager");
            vibrator = ((VibratorManager) systemService2).getDefaultVibrator();
            kotlin.s.c.l.e(vibrator, "{\n                (getSy…ultVibrator\n            }");
        } else {
            Object systemService3 = context.getSystemService("vibrator");
            kotlin.s.c.l.d(systemService3, "null cannot be cast to non-null type android.os.Vibrator");
            vibrator = (Vibrator) systemService3;
        }
        h = vibrator;
        SettingsConfigNext.a.j(new a(context));
        String string = context.getResources().getString(C0838R.string.enable_key_sound);
        kotlin.s.c.l.e(string, "resources.getString(R.string.enable_key_sound)");
        Object f2 = SettingsConfigNext.f(string);
        kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Boolean");
        b = ((Boolean) f2).booleanValue();
        String string2 = context.getResources().getString(C0838R.string.key_sound_volume);
        kotlin.s.c.l.e(string2, "resources.getString(R.string.key_sound_volume)");
        Object f3 = SettingsConfigNext.f(string2);
        kotlin.s.c.l.d(f3, "null cannot be cast to non-null type kotlin.Int");
        f2523d = ((Integer) f3).intValue();
        String string3 = context.getResources().getString(C0838R.string.enable_key_vibrate);
        kotlin.s.c.l.e(string3, "resources.getString(R.string.enable_key_vibrate)");
        Object f4 = SettingsConfigNext.f(string3);
        kotlin.s.c.l.d(f4, "null cannot be cast to non-null type kotlin.Boolean");
        f2522c = ((Boolean) f4).booleanValue();
        String string4 = context.getResources().getString(C0838R.string.key_vibrate_intensity);
        kotlin.s.c.l.e(string4, "resources.getString(R.st…ng.key_vibrate_intensity)");
        Object f5 = SettingsConfigNext.f(string4);
        kotlin.s.c.l.d(f5, "null cannot be cast to non-null type kotlin.String");
        f2524e = aVar.c((String) f5);
    }

    private UserInteractiveManagerNext() {
    }

    public static void d(KeySound keySound) {
        kotlin.s.c.l.f(keySound, "$keySound");
        float f2 = f2523d / 100.0f;
        kotlin.s.c.l.f(keySound, "keySound");
        AudioManager audioManager = f2526g;
        int i = 0;
        if (audioManager.getRingerMode() != 2) {
            return;
        }
        int ordinal = keySound.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                i = 5;
            } else if (ordinal == 3) {
                i = 8;
            } else if (ordinal != 4) {
                return;
            } else {
                i = 7;
            }
        }
        audioManager.playSoundEffect(i, f2);
    }

    public static void e(VibrationController.VibrationType vibrationType) {
        kotlin.s.c.l.f(vibrationType, "$vibrationType");
        VibrationController vibrationController = VibrationController.a;
        VibrationController.b(IAppGlobals.a.getContext(), vibrationType, VibrateIntensity.Companion.a(f2524e));
    }

    public static void f(KeyVibrate keyVibrate) {
        VibrateKeyType vibrateKeyType;
        kotlin.s.c.l.f(keyVibrate, "$keyVibrate");
        com.bytedance.android.input.keyboard.u.a aVar = com.bytedance.android.input.keyboard.u.a.a;
        int ordinal = keyVibrate.ordinal();
        if (ordinal == 0) {
            vibrateKeyType = VibrateKeyType.NONE;
        } else if (ordinal == 1) {
            vibrateKeyType = VibrateKeyType.STANDARD;
        } else if (ordinal == 2) {
            vibrateKeyType = VibrateKeyType.FUNCTION;
        } else if (ordinal == 3) {
            vibrateKeyType = VibrateKeyType.LONG_PRESS;
        } else {
            if (ordinal != 4) {
                throw new kotlin.f();
            }
            vibrateKeyType = VibrateKeyType.CONFIRM;
        }
        aVar.b(vibrateKeyType, new com.bytedance.android.input.keyboard.vibrate.entity.a(f2522c, f2524e, false, 4), null);
    }

    public final void a() {
        com.bytedance.android.input.r.j.i("UserInteractiveManagerNext", "clickVibrate");
        Vibrator vibrator = h;
        vibrator.cancel();
        if (Build.VERSION.SDK_INT >= 29) {
            vibrator.vibrate(VibrationEffect.createPredefined(0));
        } else {
            vibrator.vibrate(VibrationEffect.createWaveform(new long[]{0, 50}, -1));
        }
    }

    public final void b() {
        com.bytedance.android.input.r.j.i("UserInteractiveManagerNext", "doubleClickVibrate");
        Vibrator vibrator = h;
        vibrator.cancel();
        if (Build.VERSION.SDK_INT >= 29) {
            vibrator.vibrate(VibrationEffect.createPredefined(1));
        } else {
            vibrator.vibrate(VibrationEffect.createWaveform(new long[]{0, 50, 50, 50}, -1));
        }
    }

    public final boolean c() {
        return f2526g.getRingerMode() != 2;
    }

    public final void g(final KeySound keySound, final KeyVibrate keyVibrate, final VibrationController.VibrationType vibrationType, boolean z) {
        Object J2;
        kotlin.s.c.l.f(keySound, "keySound");
        kotlin.s.c.l.f(keyVibrate, "keyVibrate");
        kotlin.s.c.l.f(vibrationType, "vibrationType");
        if (keySound != KeySound.NONE && b) {
            Runnable runnable = new Runnable() { // from class: com.bytedance.android.input.keyboard.i
                @Override // java.lang.Runnable
                public final void run() {
                    UserInteractiveManagerNext.d(UserInteractiveManagerNext.KeySound.this);
                }
            };
            ThreadPoolExecutor threadPoolExecutor = f2525f;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.submit(runnable);
            }
        }
        IAppGlobals.a aVar = IAppGlobals.a;
        if (!aVar.F()) {
            if (keyVibrate == KeyVibrate.NONE || !f2522c) {
                return;
            }
            Runnable runnable2 = new Runnable() { // from class: com.bytedance.android.input.keyboard.k
                @Override // java.lang.Runnable
                public final void run() {
                    UserInteractiveManagerNext.f(UserInteractiveManagerNext.KeyVibrate.this);
                }
            };
            ThreadPoolExecutor threadPoolExecutor2 = f2525f;
            if (threadPoolExecutor2 != null) {
                threadPoolExecutor2.submit(runnable2);
                return;
            }
            return;
        }
        boolean z2 = false;
        if (z) {
            Context context = aVar.getContext();
            kotlin.s.c.l.f(context, "appContext");
            int i = 3;
            try {
                i = Settings.System.getInt(context.getContentResolver(), "haptic_feedback_intensity", 3);
                J2 = kotlin.o.a;
            } catch (Throwable th) {
                J2 = com.prolificinteractive.materialcalendarview.r.J(th);
            }
            Throwable b2 = kotlin.h.b(J2);
            if (b2 != null) {
                IAppGlobals.a.e("[Vibrate]-Utils", e.a.a.a.a.w("System.ObricSystemVibrateEnabled exception = ", b2));
            }
            if (i != 0) {
                z2 = true;
            }
        }
        if (keyVibrate != KeyVibrate.NONE) {
            if (f2522c || z2) {
                Runnable runnable3 = new Runnable() { // from class: com.bytedance.android.input.keyboard.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        UserInteractiveManagerNext.e(VibrationController.VibrationType.this);
                    }
                };
                ThreadPoolExecutor threadPoolExecutor3 = f2525f;
                if (threadPoolExecutor3 != null) {
                    threadPoolExecutor3.submit(runnable3);
                }
            }
        }
    }

    public final void h(KeySound keySound, float f2) {
        int i;
        kotlin.s.c.l.f(keySound, "keySound");
        if (c()) {
            return;
        }
        AudioManager audioManager = f2526g;
        int ordinal = keySound.ordinal();
        if (ordinal == 1) {
            i = 0;
        } else if (ordinal == 2) {
            i = 5;
        } else if (ordinal == 3) {
            i = 8;
        } else if (ordinal != 4) {
            return;
        } else {
            i = 7;
        }
        audioManager.playSoundEffect(i, f2);
    }

    public final void i(boolean z) {
        b = z;
    }

    public final void j(int i) {
        f2523d = i;
    }

    public final void k(boolean z) {
        f2522c = z;
    }

    public final void l(VibrateIntensity vibrateIntensity) {
        kotlin.s.c.l.f(vibrateIntensity, "<set-?>");
        f2524e = vibrateIntensity;
    }
}
