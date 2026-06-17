package com.bytedance.android.input.speech;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import com.bytedance.android.input.basic.IAppGlobals;
import java.util.Objects;

/* loaded from: classes.dex */
public final class G {
    private int a;
    private boolean b;

    /* renamed from: d, reason: collision with root package name */
    private int f3076d;

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.e f3075c = kotlin.a.c(a.a);

    /* renamed from: e, reason: collision with root package name */
    private final kotlin.e f3077e = kotlin.a.c(new b());

    /* renamed from: f, reason: collision with root package name */
    private final AudioManager.OnAudioFocusChangeListener f3078f = new AudioManager.OnAudioFocusChangeListener() { // from class: com.bytedance.android.input.speech.p
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i) {
            G.d(G.this, i);
        }
    };

    static final class a extends kotlin.s.c.m implements kotlin.s.b.a<AudioManager> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public AudioManager invoke() {
            IAppGlobals.a aVar = IAppGlobals.a;
            Objects.requireNonNull(aVar);
            Object systemService = aVar.getContext().getSystemService("audio");
            kotlin.s.c.l.d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            return (AudioManager) systemService;
        }
    }

    static final class b extends kotlin.s.c.m implements kotlin.s.b.a<AudioFocusRequest> {
        b() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public AudioFocusRequest invoke() {
            return new AudioFocusRequest.Builder(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(14).setContentType(2).build()).setAcceptsDelayedFocusGain(true).setWillPauseWhenDucked(true).setOnAudioFocusChangeListener(G.this.f3078f).build();
        }
    }

    private final AudioManager b() {
        return (AudioManager) this.f3075c.getValue();
    }

    public static void d(G g2, int i) {
        kotlin.s.c.l.f(g2, "this$0");
        com.bytedance.android.input.r.j.m("Asr-MusicControl", "mOnAudioFocusChangeListener: focusChange=" + i);
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        if (aVar.F()) {
            if (i == -3) {
                g2.b = true;
            } else {
                if (i != 1) {
                    return;
                }
                g2.b = false;
            }
        }
    }

    public final boolean c() {
        return this.b;
    }

    public final void e() {
        this.b = false;
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        if (aVar.F()) {
            AudioManager b2 = b();
            Object value = this.f3077e.getValue();
            kotlin.s.c.l.e(value, "<get-mFocusRequest>(...)");
            b2.requestAudioFocus((AudioFocusRequest) value);
        }
        if (b().isMusicActive()) {
            int streamVolume = b().getStreamVolume(3);
            this.f3076d = streamVolume;
            if (streamVolume != 0) {
                com.bytedance.android.input.r.j.m("Asr-MusicControl", "StartAsr");
                this.a = 1;
                b().adjustStreamVolume(3, -100, 0);
            }
        }
    }

    public final void f() {
        int i = this.a;
        if (i == 1) {
            com.bytedance.android.input.r.j.m("Asr-MusicControl", "StopAsr: abandonAudioFocus(music resume)");
            b().adjustStreamVolume(3, 100, 0);
        } else if (i == 2 && this.f3076d > 0) {
            b().setStreamVolume(3, this.f3076d, 0);
        }
        this.a = 0;
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        if (aVar.F()) {
            AudioManager b2 = b();
            Object value = this.f3077e.getValue();
            kotlin.s.c.l.e(value, "<get-mFocusRequest>(...)");
            b2.abandonAudioFocusRequest((AudioFocusRequest) value);
        }
    }
}
