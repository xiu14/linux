package com.bytedance.push.event.sync.g;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.push.C;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class k extends com.bytedance.push.event.sync.g.a {

    class a implements Runnable {

        /* renamed from: com.bytedance.push.event.sync.g.k$a$a, reason: collision with other inner class name */
        class RunnableC0299a implements Runnable {
            final /* synthetic */ JSONObject a;

            RunnableC0299a(JSONObject jSONObject) {
                this.a = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.push.event.sync.d iSignalReporter = ((C) C.a()).t().getISignalReporter();
                k kVar = k.this;
                com.bytedance.push.settings.A.a.b bVar = kVar.a;
                Objects.requireNonNull(kVar);
                ((com.bytedance.push.event.sync.f) iSignalReporter).n(bVar, "ringtones_info", k.this.b, this.a);
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVar = k.this;
            AudioManager audioManager = (AudioManager) com.ss.android.message.a.a().getSystemService("audio");
            Objects.requireNonNull(kVar);
            JSONObject jSONObject = new JSONObject();
            if (audioManager != null) {
                kVar.add(jSONObject, "cur_call_voice", audioManager.getStreamVolume(0));
                kVar.add(jSONObject, "max_call_voice", audioManager.getStreamMaxVolume(0));
                kVar.add(jSONObject, "cur_ring_voice", audioManager.getStreamVolume(2));
                kVar.add(jSONObject, "max_ring_voice", audioManager.getStreamMaxVolume(2));
                kVar.add(jSONObject, "cur_music_voice", audioManager.getStreamVolume(3));
                kVar.add(jSONObject, "max_music_voice", audioManager.getStreamMaxVolume(3));
                kVar.add(jSONObject, "cur_alarm_voice", audioManager.getStreamVolume(4));
                kVar.add(jSONObject, "max_alarm_voice", audioManager.getStreamMaxVolume(4));
                kVar.add(jSONObject, "cur_notification_voice", audioManager.getStreamVolume(5));
                kVar.add(jSONObject, "max_notification_voice", audioManager.getStreamMaxVolume(5));
                kVar.add(jSONObject, "ring_mode", audioManager.getRingerMode());
            }
            com.ss.android.message.e.e().f(new RunnableC0299a(jSONObject), 0L);
        }
    }

    @Override // com.bytedance.push.event.sync.g.a
    String n() {
        return "ringtones_info";
    }

    @Override // com.bytedance.push.event.sync.g.a
    public void p(String str, com.bytedance.push.settings.A.a.b bVar) {
        super.p(str, bVar);
        new Handler(Looper.getMainLooper()).post(new a());
    }
}
