package com.bytedance.android.input.speech;

import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.os.Build;
import androidx.annotation.RequiresApi;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class K {
    private AudioRecord a;

    /* renamed from: d, reason: collision with root package name */
    private c f3095d;

    /* renamed from: e, reason: collision with root package name */
    private AudioManager f3096e;

    /* renamed from: f, reason: collision with root package name */
    private FileOutputStream f3097f;
    private volatile com.bytedance.android.input.speech.L.b j;
    private Thread b = null;

    /* renamed from: c, reason: collision with root package name */
    private int f3094c = 0;

    /* renamed from: g, reason: collision with root package name */
    private String f3098g = "";
    private final BluetoothManager h = new BluetoothManager();
    String i = "phone";

    private final class b extends Thread {
        b(a aVar) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean z;
            y yVar = y.a;
            y.b("[Android][asr][recorder] work start");
            if (!K.c(K.this)) {
                com.bytedance.android.input.r.j.r("Asr-StreamRecorder", "create audio error");
                AsrManager.a.m(false);
                return;
            }
            com.bytedance.android.input.r.j.m("Asr-StreamRecorder", "start recorder begin");
            if (K.this.a == null) {
                com.bytedance.android.input.r.j.j("Asr-StreamRecorder", "recorder is null");
                K.this.s("recorder_is_null", 0);
                AsrManager.a.m(false);
                return;
            }
            K.g(K.this);
            y.b("[Android][asr][recorder] startRecording begin");
            K.this.a.startRecording();
            y.b("[Android][asr][recorder] startRecording end");
            long currentTimeMillis = System.currentTimeMillis();
            if (K.this.a.getRecordingState() != 3) {
                StringBuilder M = e.a.a.a.a.M("recorder start error, current state = ");
                M.append(K.this.a.getRecordingState());
                com.bytedance.android.input.r.j.j("Asr-StreamRecorder", M.toString());
                K.this.a.stop();
                K k = K.this;
                k.s("recorder_start_error", Integer.valueOf(k.a.getRecordingState()));
                AsrManager.a.m(false);
                return;
            }
            if (K.this.j != null) {
                K.this.j.onStartRecord();
                K.i(K.this, null);
            }
            Objects.requireNonNull(K.this);
            byte[] bArr = new byte[640];
            int i = 0;
            int i2 = 0;
            boolean z2 = true;
            while (true) {
                if (isInterrupted() || i < 0) {
                    break;
                }
                AudioRecord audioRecord = K.this.a;
                Objects.requireNonNull(K.this);
                i = audioRecord.read(bArr, 0, 640);
                if (i > 0 && !isInterrupted()) {
                    if (z2) {
                        y yVar2 = y.a;
                        y.b("[Android][asr][recorder] first voice data");
                        z2 = false;
                    }
                    if (i2 >= 0) {
                        int i3 = 0;
                        while (true) {
                            Objects.requireNonNull(K.this);
                            if (i3 >= 640) {
                                z = false;
                                break;
                            } else {
                                if (bArr[i3] != 0) {
                                    z = true;
                                    break;
                                }
                                i3++;
                            }
                        }
                        if (!z) {
                            i2 += i;
                            StringBuilder sb = new StringBuilder();
                            sb.append("nread = ");
                            sb.append(i);
                            sb.append(" haveData = ");
                            sb.append(z);
                            sb.append(" voiceBegin = ");
                            e.a.a.a.a.B0(sb, i2, "Asr-StreamRecorder");
                            if (i2 >= 96000) {
                                com.bytedance.android.input.r.j.m("Asr-StreamRecorder", "no voice end");
                                K.this.s("voice_is_zero", Integer.valueOf((int) (System.currentTimeMillis() - currentTimeMillis)));
                                AsrManager.a.m(true);
                                break;
                            }
                        } else {
                            y yVar3 = y.a;
                            y.b("[Android][asr][recorder] valid voice data");
                            i2 = -1;
                        }
                    }
                    AsrManager.a.w(bArr, i);
                    K.j(K.this, bArr, i);
                } else if (i < 0) {
                    com.bytedance.android.input.r.j.j("Asr-StreamRecorder", "Recorder error = " + i);
                } else {
                    StringBuilder N = e.a.a.a.a.N("Recorder is nread = ", i, " interrupted = ");
                    N.append(isInterrupted());
                    com.bytedance.android.input.r.j.j("Asr-StreamRecorder", N.toString());
                }
            }
            K.this.a.stop();
            K.this.a.release();
            K.f(K.this, null);
            if (K.this.h.b()) {
                try {
                    K.this.f3096e.setBluetoothScoOn(false);
                } catch (Exception unused) {
                }
                try {
                    K.this.f3096e.stopBluetoothSco();
                } catch (Exception unused2) {
                }
            }
            K.this.o();
            com.bytedance.android.input.r.j.m("Asr-StreamRecorder", "end recorder");
        }
    }

    @RequiresApi(api = 24)
    public class c extends AudioManager.AudioRecordingCallback {
        public c() {
        }

        @Override // android.media.AudioManager.AudioRecordingCallback
        public void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
            super.onRecordingConfigChanged(list);
            super.onRecordingConfigChanged(list);
            int size = list.size();
            e.a.a.a.a.k0("onRecordingConfigChanged recorder activeSize = ", size, "Asr-StreamRecorder");
            if (size <= 1) {
                if (size == 1) {
                    StringBuilder M = e.a.a.a.a.M("onRecordingConfigChanged current recorder sessionId = ");
                    M.append(list.get(0).getClientAudioSessionId());
                    com.bytedance.android.input.r.j.m("Asr-StreamRecorder", M.toString());
                    return;
                }
                return;
            }
            for (int i = 0; i < size; i++) {
                AudioRecordingConfiguration audioRecordingConfiguration = list.get(i);
                int i2 = Build.VERSION.SDK_INT;
                boolean isClientSilenced = i2 >= 29 ? audioRecordingConfiguration.isClientSilenced() : false;
                StringBuilder N = e.a.a.a.a.N("onRecordingConfigChanged recorder i = ", i, " sessionId = ");
                N.append(audioRecordingConfiguration.getClientAudioSessionId());
                N.append(", isSilenced = ");
                N.append(isClientSilenced);
                com.bytedance.android.input.r.j.m("Asr-StreamRecorder", N.toString());
                if (K.this.a != null && audioRecordingConfiguration.getClientAudioSessionId() == K.this.a.getAudioSessionId() && i2 >= 29) {
                    if (isClientSilenced) {
                        com.bytedance.android.input.r.j.m("Asr-StreamRecorder", "Recorder is silenced");
                        K.this.s("system_set_silenced", 0);
                        AsrManager.a.m(true);
                    } else {
                        com.bytedance.android.input.r.j.m("Asr-StreamRecorder", "Recorder is cancel silenced");
                    }
                }
            }
            if (K.this.a != null) {
                AsrManager.a.k();
            }
        }
    }

    public K() {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        this.f3096e = (AudioManager) aVar.getContext().getSystemService("audio");
        c cVar = new c();
        this.f3095d = cVar;
        this.f3096e.registerAudioRecordingCallback(cVar, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean c(com.bytedance.android.input.speech.K r13) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.speech.K.c(com.bytedance.android.input.speech.K):boolean");
    }

    static /* synthetic */ AudioRecord f(K k, AudioRecord audioRecord) {
        k.a = null;
        return null;
    }

    static void g(K k) {
        Objects.requireNonNull(k);
        try {
            k.f3097f = new FileOutputStream(new File(AsrContext.a.E("lastRecording.pcm")));
        } catch (IOException e2) {
            com.bytedance.android.input.r.j.j("Asr-StreamRecorder", e2.getMessage());
        }
    }

    static /* synthetic */ com.bytedance.android.input.speech.L.b i(K k, com.bytedance.android.input.speech.L.b bVar) {
        k.j = null;
        return null;
    }

    static void j(K k, byte[] bArr, int i) {
        Objects.requireNonNull(k);
        try {
            FileOutputStream fileOutputStream = k.f3097f;
            if (fileOutputStream != null) {
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (IOException e2) {
            com.bytedance.android.input.r.j.j("Asr-StreamRecorder", e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        try {
            FileOutputStream fileOutputStream = this.f3097f;
            if (fileOutputStream != null) {
                fileOutputStream.flush();
                this.f3097f.close();
                this.f3097f = null;
            }
            if (this.f3098g.isEmpty()) {
                com.bytedance.android.input.r.j.j("Asr-StreamRecorder", "mFileOutputName is null");
                return;
            }
            AsrContext asrContext = AsrContext.a;
            File file = new File(asrContext.E(this.f3098g));
            File file2 = new File(asrContext.E("lastRecording.pcm"));
            if (!file2.exists()) {
                com.bytedance.android.input.r.j.j("Asr-StreamRecorder", "oldFile not exist");
                return;
            }
            if (!file2.renameTo(file)) {
                com.bytedance.android.input.r.j.i("Asr-StreamRecorder", "文件名修改失败！");
                return;
            }
            com.bytedance.android.input.r.j.i("Asr-StreamRecorder", file + "文件名修改成功！");
        } catch (IOException e2) {
            com.bytedance.android.input.r.j.j("Asr-StreamRecorder", e2.getMessage());
        }
    }

    public boolean a() {
        Thread thread = this.b;
        if (thread != null && thread.isAlive() && !this.b.isInterrupted()) {
            com.bytedance.android.input.r.j.r("Asr-StreamRecorder", "Already start!");
            return true;
        }
        y yVar = y.a;
        y.b("[Android][asr][recorder] init start");
        if (!n()) {
            return false;
        }
        Thread thread2 = this.b;
        if (thread2 != null) {
            if (thread2.isAlive() && this.b.isInterrupted()) {
                com.bytedance.android.input.r.j.r("Asr-StreamRecorder", "Not stop now");
                s("work_is_alive", 0);
                return false;
            }
            this.b = null;
        }
        this.f3098g = "";
        b bVar = new b(null);
        this.b = bVar;
        bVar.start();
        y.b("[Android][asr][recorder] init end");
        com.bytedance.android.input.r.j.m("Asr-StreamRecorder", "Stream Recorder Started.");
        return true;
    }

    public void b() {
        Thread thread = this.b;
        if (thread == null) {
            com.bytedance.android.input.r.j.r("Asr-StreamRecorder", "Not start yet!");
        } else {
            thread.interrupt();
            com.bytedance.android.input.r.j.m("Asr-StreamRecorder", "Stream Recorder Stopped.");
        }
    }

    public void m(com.bytedance.android.input.speech.L.b bVar) {
        this.j = bVar;
    }

    boolean n() {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        boolean z = true;
        if (aVar.F()) {
            com.bytedance.android.input.r.j.m("Asr-StreamRecorder", "obric, no need to check audio is available");
            return true;
        }
        AudioManager audioManager = this.f3096e;
        if (audioManager == null) {
            s("audio_manager_null", 0);
            return false;
        }
        int mode = audioManager.getMode();
        if (mode == 2 || mode == 3) {
            com.bytedance.android.input.r.j.j("Asr-StreamRecorder", "Failed: AudioManager.MODE_IN_CAL || MODE_IN_COMMUNICATION");
            s("in_call", Integer.valueOf(mode));
            z = false;
        }
        return z;
    }

    String p() {
        return this.f3098g;
    }

    public boolean q() {
        Thread thread = this.b;
        return (thread == null || !thread.isAlive() || this.b.isInterrupted()) ? false : true;
    }

    void r(String str) {
        this.f3098g = str;
        if (str.isEmpty()) {
            this.f3098g = UUID.randomUUID().toString();
        }
        this.f3098g = e.a.a.a.a.J(new StringBuilder(), this.f3098g, ".pcm");
        if (this.f3097f == null) {
            com.bytedance.android.input.r.j.i("Asr-StreamRecorder", "onStartSuccess, mFileOutputStream is null");
            o();
        }
    }

    void s(String str, Integer num) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason", str);
            jSONObject.put("err_code", num);
            IAppLog.a aVar = IAppLog.a;
            Objects.requireNonNull(aVar);
            aVar.t("input_voiceinput_record_error", jSONObject);
        } catch (JSONException e2) {
            com.bytedance.android.input.r.j.j("Asr-StreamRecorder", "throw exception when put json: " + e2);
        }
    }
}
