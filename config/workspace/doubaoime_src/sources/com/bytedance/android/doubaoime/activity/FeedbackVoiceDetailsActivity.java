package com.bytedance.android.doubaoime.activity;

import android.R;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.IdRes;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.common.views.ScrollableOListItemGeneral;
import com.bytedance.android.input.speech.AsrContext;
import com.obric.oui.button.OButton;
import com.obric.oui.forms.OFormItem;
import com.obric.oui.forms.OInputView;
import com.obric.oui.oswitch.OSwitch;
import java.io.File;
import java.io.FileInputStream;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.C0800f0;

/* loaded from: classes.dex */
public final class FeedbackVoiceDetailsActivity extends FragmentActivity {
    public static final /* synthetic */ int l = 0;
    private int a = -1;
    private OSwitch b;

    /* renamed from: c, reason: collision with root package name */
    private OSwitch f1909c;

    /* renamed from: d, reason: collision with root package name */
    private OSwitch f1910d;

    /* renamed from: e, reason: collision with root package name */
    private OSwitch f1911e;

    /* renamed from: f, reason: collision with root package name */
    private AudioTrack f1912f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1913g;
    private Thread h;
    private ImageView i;
    private int j;
    private String k;

    private final OSwitch j(@IdRes int i) {
        final ScrollableOListItemGeneral scrollableOListItemGeneral = (ScrollableOListItemGeneral) findViewById(i);
        OSwitch oSwitch = new OSwitch(this, null, 0, 6);
        final CharSequence q = scrollableOListItemGeneral.q();
        oSwitch.setChecked(true);
        oSwitch.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.doubaoime.activity.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScrollableOListItemGeneral scrollableOListItemGeneral2 = ScrollableOListItemGeneral.this;
                CharSequence charSequence = q;
                int i2 = FeedbackVoiceDetailsActivity.l;
                kotlin.s.c.l.d(view, "null cannot be cast to non-null type com.obric.oui.oswitch.OSwitch");
                if (!((OSwitch) view).isChecked()) {
                    charSequence = "";
                }
                scrollableOListItemGeneral2.setSubTitleString(charSequence);
            }
        });
        scrollableOListItemGeneral.setTrailingView(oSwitch);
        return oSwitch;
    }

    public static void l(FeedbackVoiceDetailsActivity feedbackVoiceDetailsActivity) {
        kotlin.s.c.l.f(feedbackVoiceDetailsActivity, "this$0");
        ImageView imageView = feedbackVoiceDetailsActivity.i;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.ic_media_pause);
        }
    }

    public static void m(FeedbackVoiceDetailsActivity feedbackVoiceDetailsActivity) {
        kotlin.s.c.l.f(feedbackVoiceDetailsActivity, "this$0");
        ImageView imageView = feedbackVoiceDetailsActivity.i;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.ic_media_play);
        }
    }

    public static void n(final FeedbackVoiceDetailsActivity feedbackVoiceDetailsActivity, View view) {
        kotlin.s.c.l.f(feedbackVoiceDetailsActivity, "this$0");
        boolean z = feedbackVoiceDetailsActivity.f1913g;
        if (z) {
            if (z) {
                feedbackVoiceDetailsActivity.f1913g = false;
                AudioTrack audioTrack = feedbackVoiceDetailsActivity.f1912f;
                if (audioTrack != null) {
                    audioTrack.pause();
                }
                Thread thread = feedbackVoiceDetailsActivity.h;
                if (thread != null) {
                    thread.interrupt();
                }
                feedbackVoiceDetailsActivity.h = null;
                feedbackVoiceDetailsActivity.runOnUiThread(new Runnable() { // from class: com.bytedance.android.doubaoime.activity.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        FeedbackVoiceDetailsActivity.m(FeedbackVoiceDetailsActivity.this);
                    }
                });
                return;
            }
            return;
        }
        AsrContext asrContext = AsrContext.a;
        AsrContext asrContext2 = AsrContext.a;
        AsrContext.a aVar = (AsrContext.a) kotlin.collections.g.z(asrContext2.B(), feedbackVoiceDetailsActivity.a);
        String n = aVar != null ? aVar.n() : null;
        if (n == null || n.length() == 0) {
            com.obric.oui.toast.a.p.a(feedbackVoiceDetailsActivity, "无音频文件", 80);
            return;
        }
        final String E = asrContext2.E(n);
        if (!e.a.a.a.a.R0(E)) {
            com.obric.oui.toast.a.p.a(feedbackVoiceDetailsActivity, "音频文件不存在", 80);
            return;
        }
        if (!kotlin.s.c.l.a(feedbackVoiceDetailsActivity.k, E)) {
            feedbackVoiceDetailsActivity.j = 0;
            feedbackVoiceDetailsActivity.k = E;
        }
        if (feedbackVoiceDetailsActivity.f1913g) {
            return;
        }
        if (feedbackVoiceDetailsActivity.f1912f == null) {
            int minBufferSize = AudioTrack.getMinBufferSize(16000, 4, 2);
            if (minBufferSize == -2 || minBufferSize == -1) {
                com.bytedance.android.input.r.j.j("FeedbackVoiceDetailsActivity", "AudioTrack.getMinBufferSize failed");
                com.obric.oui.toast.a.p.a(feedbackVoiceDetailsActivity, "无法播放音频", 80);
                return;
            }
            feedbackVoiceDetailsActivity.f1912f = new AudioTrack.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(16000).setChannelMask(4).build()).setBufferSizeInBytes(minBufferSize).setTransferMode(1).build();
        }
        Thread thread2 = new Thread(new Runnable() { // from class: com.bytedance.android.doubaoime.activity.u
            @Override // java.lang.Runnable
            public final void run() {
                FeedbackVoiceDetailsActivity.q(E, feedbackVoiceDetailsActivity);
            }
        });
        feedbackVoiceDetailsActivity.h = thread2;
        thread2.start();
    }

    public static void o(FeedbackVoiceDetailsActivity feedbackVoiceDetailsActivity) {
        kotlin.s.c.l.f(feedbackVoiceDetailsActivity, "this$0");
        ImageView imageView = feedbackVoiceDetailsActivity.i;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.ic_media_play);
        }
        feedbackVoiceDetailsActivity.j = 0;
    }

    public static void p(FeedbackVoiceDetailsActivity feedbackVoiceDetailsActivity) {
        kotlin.s.c.l.f(feedbackVoiceDetailsActivity, "this$0");
        ImageView imageView = feedbackVoiceDetailsActivity.i;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.ic_media_play);
        }
        feedbackVoiceDetailsActivity.j = 0;
    }

    public static void q(String str, final FeedbackVoiceDetailsActivity feedbackVoiceDetailsActivity) {
        kotlin.s.c.l.f(str, "$filePath");
        kotlin.s.c.l.f(feedbackVoiceDetailsActivity, "this$0");
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            fileInputStream.skip(feedbackVoiceDetailsActivity.j);
            AudioTrack audioTrack = feedbackVoiceDetailsActivity.f1912f;
            kotlin.s.c.l.c(audioTrack);
            byte[] bArr = new byte[audioTrack.getBufferSizeInFrames()];
            AudioTrack audioTrack2 = feedbackVoiceDetailsActivity.f1912f;
            if (audioTrack2 != null) {
                audioTrack2.play();
            }
            feedbackVoiceDetailsActivity.f1913g = true;
            feedbackVoiceDetailsActivity.runOnUiThread(new Runnable() { // from class: com.bytedance.android.doubaoime.activity.m
                @Override // java.lang.Runnable
                public final void run() {
                    FeedbackVoiceDetailsActivity.l(FeedbackVoiceDetailsActivity.this);
                }
            });
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1 || !feedbackVoiceDetailsActivity.f1913g) {
                    break;
                }
                AudioTrack audioTrack3 = feedbackVoiceDetailsActivity.f1912f;
                if (audioTrack3 != null) {
                    audioTrack3.write(bArr, 0, read);
                }
                feedbackVoiceDetailsActivity.j += read;
            }
            if (feedbackVoiceDetailsActivity.f1913g) {
                feedbackVoiceDetailsActivity.runOnUiThread(new Runnable() { // from class: com.bytedance.android.doubaoime.activity.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        FeedbackVoiceDetailsActivity.o(FeedbackVoiceDetailsActivity.this);
                    }
                });
                feedbackVoiceDetailsActivity.f1913g = false;
            }
        } catch (Exception e2) {
            com.bytedance.android.input.r.j.j("FeedbackVoiceDetailsActivity", "Playback error： " + e2);
            feedbackVoiceDetailsActivity.runOnUiThread(new Runnable() { // from class: com.bytedance.android.doubaoime.activity.s
                @Override // java.lang.Runnable
                public final void run() {
                    FeedbackVoiceDetailsActivity.p(FeedbackVoiceDetailsActivity.this);
                }
            });
            feedbackVoiceDetailsActivity.f1913g = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [T, java.lang.String] */
    public static void r(FeedbackVoiceDetailsActivity feedbackVoiceDetailsActivity, View view) {
        kotlin.s.c.l.f(feedbackVoiceDetailsActivity, "this$0");
        kotlin.s.c.l.d(view, "null cannot be cast to non-null type com.obric.oui.button.OButton");
        OButton oButton = (OButton) view;
        OInputView a = ((OFormItem) feedbackVoiceDetailsActivity.findViewById(C0838R.id.feedback_content)).a();
        String valueOf = String.valueOf(a != null ? a.B() : null);
        AsrContext asrContext = AsrContext.a;
        AsrContext asrContext2 = AsrContext.a;
        asrContext2.l(feedbackVoiceDetailsActivity.a, valueOf);
        int i = feedbackVoiceDetailsActivity.a;
        OSwitch oSwitch = feedbackVoiceDetailsActivity.b;
        asrContext2.e0(i, 1, oSwitch != null ? oSwitch.isChecked() : false);
        int i2 = feedbackVoiceDetailsActivity.a;
        OSwitch oSwitch2 = feedbackVoiceDetailsActivity.f1909c;
        asrContext2.e0(i2, 2, oSwitch2 != null ? oSwitch2.isChecked() : false);
        int i3 = feedbackVoiceDetailsActivity.a;
        OSwitch oSwitch3 = feedbackVoiceDetailsActivity.f1910d;
        asrContext2.e0(i3, 3, oSwitch3 != null ? oSwitch3.isChecked() : false);
        asrContext2.e0(feedbackVoiceDetailsActivity.a, 4, false);
        asrContext2.e0(feedbackVoiceDetailsActivity.a, 5, false);
        String uuid = UUID.randomUUID().toString();
        kotlin.s.c.l.e(uuid, "randomUUID().toString()");
        asrContext2.k(feedbackVoiceDetailsActivity.a, uuid);
        OSwitch oSwitch4 = feedbackVoiceDetailsActivity.f1911e;
        boolean isChecked = oSwitch4 != null ? oSwitch4.isChecked() : false;
        kotlin.s.c.z zVar = new kotlin.s.c.z();
        zVar.a = "";
        if (isChecked) {
            zVar.a = asrContext2.E(asrContext2.B().get(feedbackVoiceDetailsActivity.a).n());
        }
        IAppLog.a aVar = IAppLog.a;
        Objects.requireNonNull(aVar);
        String deviceId = aVar.getDeviceId();
        Objects.requireNonNull(IAppGlobals.a);
        String localDateTime = LocalDateTime.now().toString();
        kotlin.s.c.l.e(localDateTime, "now().toString()");
        asrContext2.i(feedbackVoiceDetailsActivity.a, deviceId, "1.3.9.6", "20260528.1605", localDateTime, "voice_input_android");
        String x = asrContext2.x(feedbackVoiceDetailsActivity.a);
        StringBuilder U = e.a.a.a.a.U("Commit button clicked, uuid = ", uuid, ", filePath = ");
        U.append((String) zVar.a);
        U.append(", feedback bugDesc = ");
        U.append(x);
        com.bytedance.android.input.r.j.m("FeedbackVoiceDetailsActivity", U.toString());
        oButton.setText(feedbackVoiceDetailsActivity.getString(C0838R.string.committing));
        oButton.setEnabled(false);
        C0795d.b(C0800f0.a, kotlinx.coroutines.S.b(), null, new P(zVar, uuid, x, isChecked, feedbackVoiceDetailsActivity, oButton, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x029d  */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onCreate(android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.doubaoime.activity.FeedbackVoiceDetailsActivity.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f1913g = false;
        AudioTrack audioTrack = this.f1912f;
        if (audioTrack != null && audioTrack.getState() == 1) {
            try {
                audioTrack.stop();
                audioTrack.release();
            } catch (Exception e2) {
                e.a.a.a.a.o0("AudioTrack stop/release error： ", e2, "FeedbackVoiceDetailsActivity");
            }
        }
        this.f1912f = null;
        Thread thread = this.h;
        if (thread != null) {
            thread.interrupt();
        }
        this.h = null;
    }
}
