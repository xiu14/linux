package com.bytedance.android.input.keyboard;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.util.SparseBooleanArray;
import com.bytedance.android.input.basic.IAppGlobals;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class r implements SoundPool.OnLoadCompleteListener {

    /* renamed from: d, reason: collision with root package name */
    private static AudioManager f2779d;

    /* renamed from: e, reason: collision with root package name */
    private static r f2780e;
    private SoundPool a;
    private SparseBooleanArray b;

    /* renamed from: c, reason: collision with root package name */
    private ThreadPoolExecutor f2781c;

    private r() {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        Context context = aVar.getContext();
        f2779d = (AudioManager) context.getSystemService("audio");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 2000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        this.f2781c = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        SoundPool soundPool = new SoundPool(5, 1, 0);
        this.a = soundPool;
        soundPool.setOnLoadCompleteListener(this);
        new HashMap(10);
        this.b = new SparseBooleanArray(10);
        Objects.requireNonNull(aVar);
        d.a.b.a.b(aVar.getContext(), "android.permission.WRITE_SETTINGS");
    }

    public static r a() {
        if (f2780e == null) {
            f2780e = new r();
        }
        return f2780e;
    }

    public void b() {
        try {
            if (f2779d == null) {
                IAppGlobals.a aVar = IAppGlobals.a;
                Objects.requireNonNull(aVar);
                f2779d = (AudioManager) aVar.getContext().getSystemService("audio");
            }
            AudioManager audioManager = f2779d;
            if (audioManager != null) {
                if (audioManager.getRingerMode() != 2) {
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.media.SoundPool.OnLoadCompleteListener
    public void onLoadComplete(SoundPool soundPool, int i, int i2) {
        if (i2 == 0) {
            this.b.put(i, true);
        } else {
            this.b.put(i, false);
        }
    }
}
