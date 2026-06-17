package e.i.b.c.b;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.provider.Settings;
import androidx.annotation.RawRes;
import androidx.annotation.RequiresApi;
import java.util.concurrent.ConcurrentHashMap;

@RequiresApi(24)
/* loaded from: classes2.dex */
public final class l {
    private static SoundPool a;

    /* renamed from: e, reason: collision with root package name */
    public static final l f10018e = new l();
    private static final ConcurrentHashMap<Integer, Integer> b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static final ConcurrentHashMap.KeySetView<Integer, Boolean> f10016c = ConcurrentHashMap.newKeySet();

    /* renamed from: d, reason: collision with root package name */
    private static final Object f10017d = new Object();

    private l() {
    }

    private final void c() {
        if (a == null) {
            synchronized (f10017d) {
                if (a == null) {
                    e.i.b.f.e.b.a("OUISoundEffectHelper", "init soundPool");
                    SoundPool build = new SoundPool.Builder().setMaxStreams(5).setAudioAttributes(new AudioAttributes.Builder().setUsage(13).setContentType(4).build()).build();
                    a = build;
                    if (build != null) {
                        build.setOnLoadCompleteListener(k.a);
                    }
                }
            }
        }
    }

    public final void d(Context context, int... iArr) {
        kotlin.s.c.l.f(context, "context");
        kotlin.s.c.l.f(iArr, "soundResIds");
        try {
            c();
            int length = iArr.length;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                i++;
                ConcurrentHashMap<Integer, Integer> concurrentHashMap = b;
                if (!concurrentHashMap.containsKey(Integer.valueOf(i2))) {
                    SoundPool soundPool = a;
                    Integer valueOf = soundPool != null ? Integer.valueOf(soundPool.load(context.getApplicationContext(), i2, 1)) : null;
                    if (valueOf != null) {
                        concurrentHashMap.put(Integer.valueOf(i2), valueOf);
                        e.i.b.f.e.b.a("OUISoundEffectHelper", "start load, resId=" + i2 + ", 分配的 soundId=" + valueOf);
                    }
                }
            }
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("load failed, resIds=");
            kotlin.s.c.l.f(iArr, "<this>");
            kotlin.s.c.l.f(", ", "separator");
            kotlin.s.c.l.f("", "prefix");
            kotlin.s.c.l.f("", "postfix");
            kotlin.s.c.l.f("...", "truncated");
            StringBuilder sb2 = new StringBuilder();
            kotlin.s.c.l.f(iArr, "<this>");
            kotlin.s.c.l.f(sb2, "buffer");
            kotlin.s.c.l.f(", ", "separator");
            kotlin.s.c.l.f("", "prefix");
            kotlin.s.c.l.f("", "postfix");
            kotlin.s.c.l.f("...", "truncated");
            sb2.append((CharSequence) "");
            int i3 = 0;
            for (int i4 : iArr) {
                i3++;
                if (i3 > 1) {
                    sb2.append((CharSequence) ", ");
                }
                sb2.append((CharSequence) String.valueOf(i4));
            }
            sb2.append((CharSequence) "");
            String sb3 = sb2.toString();
            kotlin.s.c.l.e(sb3, "joinTo(StringBuilder(), …ed, transform).toString()");
            sb.append(sb3);
            e.i.b.f.e.b.c("OUISoundEffectHelper", sb.toString(), e2);
        }
    }

    public final void e(Context context, @RawRes int i) {
        int i2;
        SoundPool soundPool;
        if (context == null) {
            e.i.b.f.e.b.f("OUISoundEffectHelper", "can't play, context is null");
            return;
        }
        try {
            i2 = Settings.System.getInt(context.getContentResolver(), "sound_effects_enabled", 0);
        } catch (Exception e2) {
            e.i.b.f.e.b.c("OUISoundEffectHelper", "get sound effect enabled failed", e2);
            i2 = 0;
        }
        if (i2 == 0) {
            return;
        }
        try {
            c();
            if (f10016c.contains(Integer.valueOf(i))) {
                Integer num = b.get(Integer.valueOf(i));
                if (num != null && (soundPool = a) != null) {
                    kotlin.s.c.l.e(num, "soundId");
                    soundPool.play(num.intValue(), 1.0f, 1.0f, 1, 0, 1.0f);
                }
            } else if (b.containsKey(Integer.valueOf(i))) {
                e.i.b.f.e.b.a("OUISoundEffectHelper", "loading: resId=" + i);
            } else {
                e.i.b.f.e.b.f("OUISoundEffectHelper", "not loaded, start now: resId=" + i);
                d(context, i);
            }
        } catch (Exception e3) {
            e.i.b.f.e.b.c("OUISoundEffectHelper", "play failed, resId=" + i, e3);
        }
    }

    public final void f() {
        e.i.b.f.e.b.a("OUISoundEffectHelper", "release");
        SoundPool soundPool = a;
        if (soundPool != null) {
            soundPool.release();
        }
        a = null;
        b.clear();
        f10016c.clear();
    }
}
