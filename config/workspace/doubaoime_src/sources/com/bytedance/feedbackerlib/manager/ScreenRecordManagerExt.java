package com.bytedance.feedbackerlib.manager;

import android.content.Context;
import android.hardware.display.VirtualDisplay;
import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.media.MediaPlayer;
import android.media.projection.MediaProjection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.feedbackerlib.activity.TranslucentOnePixelActivity;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;

@RequiresApi(api = 16)
/* loaded from: classes.dex */
class ScreenRecordManagerExt {
    private static volatile ScreenRecordManagerExt A;
    private final String a;
    private final Context b;

    /* renamed from: c, reason: collision with root package name */
    private final HandlerThread f4806c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f4807d;

    /* renamed from: e, reason: collision with root package name */
    private final HandlerThread f4808e;

    /* renamed from: f, reason: collision with root package name */
    private final Handler f4809f;

    /* renamed from: g, reason: collision with root package name */
    private int f4810g;
    private int h;
    private final int i;
    private MediaProjection j;
    private RecordState k;
    private f l;
    private VirtualDisplay m;
    private AudioRecord n;
    private MediaCodec o;
    private MediaCodec p;
    private MediaMuxer q;
    private Surface r;
    private MediaFormat s;
    private MediaFormat t;
    private int u;
    private int v;
    private String w;
    private long x;
    private boolean y = false;
    private boolean z = false;

    private enum RecordState {
        STOPPED,
        STARTED
    }

    class a implements Runnable {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.bytedance.feedbackerlib.a.R("ScreenRecordManagerExt record", "startRecordAfterPermissionGranted is invoked");
                com.bytedance.feedbackerlib.a.i0(this.a, "startRecordAfterPermissionGranted is invoked", new String[0]);
                ScreenRecordManagerExt.F(ScreenRecordManagerExt.this, this.a);
                if (ScreenRecordManagerExt.G(ScreenRecordManagerExt.this) && ScreenRecordManagerExt.H(ScreenRecordManagerExt.this) && ScreenRecordManagerExt.I(ScreenRecordManagerExt.this)) {
                    ScreenRecordManagerExt.J(ScreenRecordManagerExt.this);
                    ScreenRecordManagerExt.d(ScreenRecordManagerExt.this);
                    return;
                }
                com.bytedance.feedbackerlib.a.R("ScreenRecordManagerExt record", "createAndPrepareVideoEncoder() is " + ScreenRecordManagerExt.G(ScreenRecordManagerExt.this) + ", createAndPrepareAudioEncoder() is " + ScreenRecordManagerExt.H(ScreenRecordManagerExt.this) + ", createAndPrepareAudioRecord() is " + ScreenRecordManagerExt.I(ScreenRecordManagerExt.this));
                com.bytedance.feedbackerlib.a.i0(this.a, "startRecordAfterPermissionGranted is invoked", "createAndPrepareVideoEncoder() is " + ScreenRecordManagerExt.G(ScreenRecordManagerExt.this) + ", createAndPrepareAudioEncoder() is " + ScreenRecordManagerExt.H(ScreenRecordManagerExt.this) + ", createAndPrepareAudioRecord() is " + ScreenRecordManagerExt.I(ScreenRecordManagerExt.this));
                ScreenRecordManagerExt.this.O();
            } catch (MediaCodec.CodecException e2) {
                if (!ScreenRecordManagerExt.this.z) {
                    ScreenRecordManagerExt.this.z = true;
                    ScreenRecordManagerExt.this.f4810g = TypedValues.Custom.TYPE_INT;
                    ScreenRecordManagerExt.this.h = 1600;
                    ScreenRecordManagerExt.this.N(this.a);
                    return;
                }
                StringBuilder M = e.a.a.a.a.M("startRecordAfterPermissionGranted failed: ");
                M.append(e2.toString());
                com.bytedance.feedbackerlib.a.R("ScreenRecordManagerExt record", M.toString());
                String str = this.a;
                StringBuilder M2 = e.a.a.a.a.M("startRecordAfterPermissionGranted failed: ");
                M2.append(e2.toString());
                com.bytedance.feedbackerlib.a.i0(str, M2.toString(), new String[0]);
                com.bytedance.feedbackerlib.a.s("ScreenRecordManagerExt", "startRecordAfterPermissionGranted failed", e2);
                ScreenRecordManagerExt.this.O();
            } catch (SecurityException e3) {
                if (!ScreenRecordManagerExt.this.y) {
                    ScreenRecordManagerExt.this.y = true;
                    com.bytedance.feedbackerlib.model.g.e(ScreenRecordManagerExt.this.b).h();
                    ScreenRecordManagerExt.h(ScreenRecordManagerExt.this, this.a);
                    return;
                }
                StringBuilder M3 = e.a.a.a.a.M("startRecordAfterPermissionGranted failed: ");
                M3.append(e3.toString());
                com.bytedance.feedbackerlib.a.R("ScreenRecordManagerExt record", M3.toString());
                String str2 = this.a;
                StringBuilder M4 = e.a.a.a.a.M("startRecordAfterPermissionGranted failed: ");
                M4.append(e3.toString());
                com.bytedance.feedbackerlib.a.i0(str2, M4.toString(), new String[0]);
                com.bytedance.feedbackerlib.a.s("ScreenRecordManagerExt", "startRecordAfterPermissionGranted failed", e3);
                ScreenRecordManagerExt.this.O();
            } catch (Throwable th) {
                StringBuilder M5 = e.a.a.a.a.M("startRecordAfterPermissionGranted failed: ");
                M5.append(th.toString());
                com.bytedance.feedbackerlib.a.R("ScreenRecordManagerExt record", M5.toString());
                String str3 = this.a;
                StringBuilder M6 = e.a.a.a.a.M("startRecordAfterPermissionGranted failed: ");
                M6.append(th.toString());
                com.bytedance.feedbackerlib.a.i0(str3, M6.toString(), new String[0]);
                com.bytedance.feedbackerlib.a.s("ScreenRecordManagerExt", "startRecordAfterPermissionGranted failed", th);
                ScreenRecordManagerExt.this.O();
            }
        }
    }

    class b extends Handler {
        b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ScreenRecordManagerExt.s(ScreenRecordManagerExt.this, (e) message.obj);
            } else {
                if (i != 5) {
                    return;
                }
                ScreenRecordManagerExt.t(ScreenRecordManagerExt.this);
            }
        }
    }

    class c extends Handler {
        private long a;

        class a implements Runnable {
            final /* synthetic */ ByteBuffer a;
            final /* synthetic */ MediaCodec.BufferInfo b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f4811c;

            a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i) {
                this.a = byteBuffer;
                this.b = bufferInfo;
                this.f4811c = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (ScreenRecordManagerExt.this.k != RecordState.STARTED) {
                    return;
                }
                if (ScreenRecordManagerExt.this.L()) {
                    ScreenRecordManagerExt.this.q.writeSampleData(ScreenRecordManagerExt.this.v, this.a, this.b);
                }
                Message obtain = Message.obtain();
                obtain.what = 6;
                obtain.arg1 = this.f4811c;
                ScreenRecordManagerExt.this.f4809f.sendMessage(obtain);
            }
        }

        class b implements Runnable {
            final /* synthetic */ MediaFormat a;

            b(MediaFormat mediaFormat) {
                this.a = mediaFormat;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (ScreenRecordManagerExt.this.k != RecordState.STARTED) {
                    return;
                }
                ScreenRecordManagerExt.this.t = this.a;
                if (ScreenRecordManagerExt.r(ScreenRecordManagerExt.this)) {
                    return;
                }
                ScreenRecordManagerExt.this.O();
            }
        }

        /* renamed from: com.bytedance.feedbackerlib.manager.ScreenRecordManagerExt$c$c, reason: collision with other inner class name */
        class RunnableC0228c implements Runnable {
            RunnableC0228c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ScreenRecordManagerExt.C(ScreenRecordManagerExt.this);
            }
        }

        c(Looper looper) {
            super(looper);
            this.a = 0L;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 6) {
                                return;
                            }
                            ScreenRecordManagerExt.this.p.releaseOutputBuffer(message.arg1, false);
                            return;
                        }
                        if (ScreenRecordManagerExt.this.p != null) {
                            ScreenRecordManagerExt.this.p.stop();
                            ScreenRecordManagerExt.this.p.release();
                            ScreenRecordManagerExt.v(ScreenRecordManagerExt.this, null);
                        }
                        if (ScreenRecordManagerExt.this.n != null) {
                            ScreenRecordManagerExt.this.n.release();
                            ScreenRecordManagerExt.x(ScreenRecordManagerExt.this, null);
                        }
                        ScreenRecordManagerExt.this.f4809f.removeMessages(1);
                        ScreenRecordManagerExt.this.f4809f.removeMessages(3);
                        ScreenRecordManagerExt.this.f4809f.removeMessages(2);
                        ScreenRecordManagerExt.this.f4809f.removeMessages(4);
                        ScreenRecordManagerExt.this.f4809f.removeMessages(6);
                        ScreenRecordManagerExt.this.f4807d.post(new RunnableC0228c());
                        return;
                    }
                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                    int dequeueOutputBuffer = ScreenRecordManagerExt.this.p.dequeueOutputBuffer(bufferInfo, 0L);
                    if (dequeueOutputBuffer < 0) {
                        if (dequeueOutputBuffer != -2) {
                            sendEmptyMessage(1);
                            return;
                        }
                        ScreenRecordManagerExt.this.f4807d.post(new b(ScreenRecordManagerExt.this.p.getOutputFormat()));
                        sendEmptyMessage(3);
                        return;
                    }
                    int i2 = bufferInfo.flags;
                    if ((i2 & 4) == 4) {
                        ScreenRecordManagerExt.this.O();
                        ScreenRecordManagerExt.this.p.releaseOutputBuffer(dequeueOutputBuffer, false);
                        return;
                    }
                    if (i2 == 0 || (i2 & 1) == 1) {
                        ByteBuffer outputBuffer = ScreenRecordManagerExt.this.p.getOutputBuffer(dequeueOutputBuffer);
                        if (outputBuffer != null) {
                            outputBuffer.position(bufferInfo.offset);
                            outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                            ScreenRecordManagerExt.this.f4807d.post(new a(outputBuffer, bufferInfo, dequeueOutputBuffer));
                        } else {
                            ScreenRecordManagerExt.this.p.releaseOutputBuffer(dequeueOutputBuffer, false);
                        }
                    }
                    sendEmptyMessage(3);
                    return;
                }
                this.a = 0L;
            }
            int dequeueInputBuffer = ScreenRecordManagerExt.this.p.dequeueInputBuffer(0L);
            if (dequeueInputBuffer >= 0) {
                ByteBuffer inputBuffer = ScreenRecordManagerExt.this.p.getInputBuffer(dequeueInputBuffer);
                if (inputBuffer != null) {
                    int position = inputBuffer.position();
                    int read = ScreenRecordManagerExt.this.n.read(inputBuffer, inputBuffer.limit() - position);
                    if (read > 0) {
                        ScreenRecordManagerExt.this.p.queueInputBuffer(dequeueInputBuffer, position, read, this.a, 1);
                        this.a += (((read << 3) >> 4) * 1000000) / 44100;
                        sendEmptyMessage(3);
                        return;
                    }
                }
            } else {
                ScreenRecordManagerExt.this.O();
            }
            sendEmptyMessage(1);
        }
    }

    static class d extends Exception {
        d(@Nullable String str) {
            super(str);
        }
    }

    public interface e {
        void a();

        void b(long j);

        void c(long j, @Nullable Uri uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    class f implements e {

        @NonNull
        private e a;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.a.a();
            }
        }

        class b implements Runnable {
            final /* synthetic */ long a;

            b(long j) {
                this.a = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.a.b(this.a);
            }
        }

        class c implements Runnable {
            final /* synthetic */ long a;
            final /* synthetic */ Uri b;

            c(long j, Uri uri) {
                this.a = j;
                this.b = uri;
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.a.c(this.a, this.b);
            }
        }

        f(@NonNull ScreenRecordManagerExt screenRecordManagerExt, e eVar) {
            this.a = eVar;
        }

        @Override // com.bytedance.feedbackerlib.manager.ScreenRecordManagerExt.e
        public void a() {
            com.bytedance.feedbackerlib.util.k.a(new a());
        }

        @Override // com.bytedance.feedbackerlib.manager.ScreenRecordManagerExt.e
        public void b(long j) {
            com.bytedance.feedbackerlib.util.k.a(new b(j));
        }

        @Override // com.bytedance.feedbackerlib.manager.ScreenRecordManagerExt.e
        public void c(long j, @Nullable Uri uri) {
            com.bytedance.feedbackerlib.util.k.a(new c(j, uri));
        }
    }

    @RequiresApi(api = 21)
    private ScreenRecordManagerExt(@NonNull Context context) throws d {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        File file = Build.VERSION.SDK_INT >= 29 ? new File(applicationContext.getFilesDir(), "ScreenRecord") : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!file.exists() || !file.isDirectory()) {
            throw new d("创建录屏存储路径失败");
        }
        this.a = file.getPath();
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        if (windowManager == null) {
            throw new d("获取WindowManager失败");
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        this.i = displayMetrics.densityDpi;
        int i = displayMetrics.heightPixels;
        this.f4810g = displayMetrics.widthPixels;
        this.h = i;
        HandlerThread handlerThread = new HandlerThread("screen_record_ext_handler_thread");
        this.f4806c = handlerThread;
        handlerThread.start();
        this.f4807d = new b(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("audio_process_handler_thread");
        this.f4808e = handlerThread2;
        handlerThread2.start();
        this.f4809f = new c(handlerThread2.getLooper());
        this.k = RecordState.STOPPED;
    }

    static void C(ScreenRecordManagerExt screenRecordManagerExt) {
        if (screenRecordManagerExt.k != RecordState.STARTED) {
            return;
        }
        MediaMuxer mediaMuxer = screenRecordManagerExt.q;
        long j = -1;
        if (mediaMuxer != null) {
            mediaMuxer.stop();
            screenRecordManagerExt.q.release();
            screenRecordManagerExt.q = null;
            String str = screenRecordManagerExt.w;
            int i = com.bytedance.feedbackerlib.util.f.b;
            MediaPlayer mediaPlayer = new MediaPlayer();
            try {
                mediaPlayer.reset();
            } catch (Throwable unused) {
            }
            try {
                try {
                    mediaPlayer.setDataSource(str);
                    mediaPlayer.prepare();
                    j = mediaPlayer.getDuration();
                } finally {
                    try {
                        mediaPlayer.reset();
                    } catch (Throwable unused2) {
                    }
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            screenRecordManagerExt.l.c(j, com.bytedance.feedbackerlib.util.f.e(screenRecordManagerExt.b, new File(screenRecordManagerExt.w), System.currentTimeMillis(), screenRecordManagerExt.f4810g, screenRecordManagerExt.h, j));
        } else {
            f fVar = screenRecordManagerExt.l;
            if (fVar != null) {
                fVar.c(-1L, null);
            }
        }
        screenRecordManagerExt.l = null;
        screenRecordManagerExt.w = null;
        screenRecordManagerExt.x = 0L;
        screenRecordManagerExt.k = RecordState.STOPPED;
    }

    static void F(ScreenRecordManagerExt screenRecordManagerExt, String str) {
        Objects.requireNonNull(screenRecordManagerExt);
        com.bytedance.feedbackerlib.a.R("ScreenRecordManagerExt record", "prepareVirtualDisplay is invoked");
        com.bytedance.feedbackerlib.a.i0(str, "prepareVirtualDisplay is invoked", new String[0]);
        screenRecordManagerExt.m = screenRecordManagerExt.j.createVirtualDisplay("feedbackerlib_screen_record_manager_ext", screenRecordManagerExt.f4810g, screenRecordManagerExt.h, screenRecordManagerExt.i, 1, null, null, null);
    }

    static boolean G(ScreenRecordManagerExt screenRecordManagerExt) {
        Objects.requireNonNull(screenRecordManagerExt);
        try {
            screenRecordManagerExt.o = MediaCodec.createEncoderByType("video/avc");
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", screenRecordManagerExt.f4810g, screenRecordManagerExt.h);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", 12582912);
            createVideoFormat.setInteger("frame-rate", 30);
            createVideoFormat.setInteger("i-frame-interval", 1);
            screenRecordManagerExt.o.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            screenRecordManagerExt.r = screenRecordManagerExt.o.createInputSurface();
            screenRecordManagerExt.o.setCallback(new B(screenRecordManagerExt));
            screenRecordManagerExt.o.start();
            return true;
        } catch (IOException e2) {
            com.bytedance.feedbackerlib.a.s("ScreenRecordManagerExt", "createAndPrepareVideoEncoder: create VideoEncoder failed", e2);
            screenRecordManagerExt.o = null;
            return false;
        }
    }

    static boolean H(ScreenRecordManagerExt screenRecordManagerExt) {
        Objects.requireNonNull(screenRecordManagerExt);
        try {
            screenRecordManagerExt.p = MediaCodec.createEncoderByType("audio/mp4a-latm");
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 44100, 1);
            createAudioFormat.setInteger("aac-profile", 1);
            createAudioFormat.setInteger("bitrate", 320);
            screenRecordManagerExt.p.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            screenRecordManagerExt.p.start();
            return true;
        } catch (IOException e2) {
            StringBuilder M = e.a.a.a.a.M("createAndPrepareAudioEncoder failed: ");
            M.append(e2.toString());
            com.bytedance.feedbackerlib.a.R("ScreenRecordManagerExt record", M.toString());
            com.bytedance.feedbackerlib.a.s("ScreenRecordManagerExt", "createAndPrepareAudioEncoder failed", e2);
            screenRecordManagerExt.p = null;
            return false;
        }
    }

    static boolean I(ScreenRecordManagerExt screenRecordManagerExt) {
        Objects.requireNonNull(screenRecordManagerExt);
        int minBufferSize = AudioRecord.getMinBufferSize(44100, 16, 2);
        if (minBufferSize <= 0) {
            com.bytedance.feedbackerlib.a.R("ScreenRecordManagerExt record", "startRecordInner: 获取minBuffer失败");
            Log.e("ScreenRecordManagerExt", "startRecordInner: 获取minBuffer失败");
            return false;
        }
        AudioRecord audioRecord = new AudioRecord(1, 44100, 16, 2, minBufferSize * 2);
        screenRecordManagerExt.n = audioRecord;
        if (audioRecord.getState() != 0) {
            screenRecordManagerExt.n.startRecording();
            return true;
        }
        com.bytedance.feedbackerlib.a.R("ScreenRecordManagerExt record", "startRecordInner: 创建AudioRecord失败");
        Log.e("ScreenRecordManagerExt", "startRecordInner: 创建AudioRecord失败");
        screenRecordManagerExt.n = null;
        return false;
    }

    static void J(ScreenRecordManagerExt screenRecordManagerExt) {
        screenRecordManagerExt.m.setSurface(screenRecordManagerExt.r);
    }

    @RequiresApi(api = 21)
    public static ScreenRecordManagerExt K(@NonNull Context context) throws d {
        if (A == null) {
            synchronized (ScreenRecordManagerExt.class) {
                if (A == null) {
                    A = new ScreenRecordManagerExt(context);
                }
            }
        }
        return A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean L() {
        return (this.u == -1 || this.v == -1 || this.s == null || this.t == null || this.q == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 21)
    public void N(String str) {
        a aVar = new a(str);
        if (Looper.myLooper() == this.f4806c.getLooper()) {
            aVar.run();
        } else {
            this.f4807d.post(aVar);
        }
    }

    static /* synthetic */ f b(ScreenRecordManagerExt screenRecordManagerExt, f fVar) {
        screenRecordManagerExt.l = null;
        return null;
    }

    static void d(ScreenRecordManagerExt screenRecordManagerExt) {
        screenRecordManagerExt.f4809f.sendEmptyMessage(2);
    }

    static void h(ScreenRecordManagerExt screenRecordManagerExt, String str) {
        TranslucentOnePixelActivity.l(screenRecordManagerExt.b, new A(screenRecordManagerExt, str), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.RECORD_AUDIO"});
    }

    static boolean r(ScreenRecordManagerExt screenRecordManagerExt) {
        if (screenRecordManagerExt.s == null || screenRecordManagerExt.t == null) {
            Log.d("ScreenRecordManagerExt", "createAndPrepareMediaMuxerIfReady: outputFormat not ready");
            return true;
        }
        StringBuilder M = e.a.a.a.a.M("screen_record_");
        M.append(System.currentTimeMillis());
        M.append(".mp4");
        screenRecordManagerExt.w = e.a.a.a.a.K(new StringBuilder(), screenRecordManagerExt.a, "/", M.toString());
        try {
            MediaMuxer mediaMuxer = new MediaMuxer(screenRecordManagerExt.w, 0);
            screenRecordManagerExt.q = mediaMuxer;
            screenRecordManagerExt.u = mediaMuxer.addTrack(screenRecordManagerExt.s);
            screenRecordManagerExt.v = screenRecordManagerExt.q.addTrack(screenRecordManagerExt.t);
            screenRecordManagerExt.q.start();
            screenRecordManagerExt.x = System.currentTimeMillis();
        } catch (IOException e2) {
            com.bytedance.feedbackerlib.a.s("ScreenRecordManagerExt", "createAndPrepareMediaMuxerIfReady: create MediaMuxer failed", e2);
            screenRecordManagerExt.q = null;
            screenRecordManagerExt.w = null;
        }
        if (screenRecordManagerExt.L()) {
            f fVar = screenRecordManagerExt.l;
            Objects.requireNonNull(fVar);
            com.bytedance.feedbackerlib.util.k.a(fVar.new a());
            return true;
        }
        Log.e("ScreenRecordManagerExt", "createAndPrepareMediaMuxerIfReady: 创建MediaMuxer失败");
        screenRecordManagerExt.q = null;
        screenRecordManagerExt.w = null;
        screenRecordManagerExt.u = -1;
        screenRecordManagerExt.v = -1;
        screenRecordManagerExt.x = 0L;
        return false;
    }

    static void s(ScreenRecordManagerExt screenRecordManagerExt, e eVar) {
        Objects.requireNonNull(screenRecordManagerExt);
        com.bytedance.feedbackerlib.a.R("ScreenRecordManagerExt record", "startRecordInner start");
        StringBuilder sb = new StringBuilder();
        sb.append("record->");
        String B = e.a.a.a.a.B(sb);
        com.bytedance.feedbackerlib.a.i0(B, "startRecordInner start", new String[0]);
        screenRecordManagerExt.l = new f(screenRecordManagerExt, eVar);
        if (screenRecordManagerExt.k != RecordState.STOPPED) {
            com.bytedance.feedbackerlib.a.R("ScreenRecordManagerExt record", "handleMessage: 调用了startRecord，但是当前状态并不是Stopped");
            com.bytedance.feedbackerlib.a.i0(B, "handleMessage: 调用了startRecord，但是当前状态并不是Stopped", new String[0]);
            Log.e("ScreenRecordManagerExt", "handleMessage: 调用了startRecord，但是当前状态并不是Stopped");
            screenRecordManagerExt.l.c(-1L, null);
            screenRecordManagerExt.l = null;
            return;
        }
        screenRecordManagerExt.k = RecordState.STARTED;
        if (screenRecordManagerExt.j == null) {
            TranslucentOnePixelActivity.l(screenRecordManagerExt.b, new A(screenRecordManagerExt, B), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.RECORD_AUDIO"});
        } else {
            screenRecordManagerExt.N(B);
        }
    }

    static void t(ScreenRecordManagerExt screenRecordManagerExt) {
        if (screenRecordManagerExt.k != RecordState.STARTED) {
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 4;
        screenRecordManagerExt.f4809f.sendMessageAtFrontOfQueue(obtain);
        MediaCodec mediaCodec = screenRecordManagerExt.o;
        if (mediaCodec != null) {
            mediaCodec.stop();
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.set(0, 0, 0L, 4);
        ByteBuffer allocate = ByteBuffer.allocate(0);
        if (screenRecordManagerExt.L()) {
            screenRecordManagerExt.q.writeSampleData(screenRecordManagerExt.u, allocate, bufferInfo);
            screenRecordManagerExt.q.writeSampleData(screenRecordManagerExt.v, allocate, bufferInfo);
        }
        screenRecordManagerExt.u = -1;
        screenRecordManagerExt.v = -1;
        screenRecordManagerExt.s = null;
        screenRecordManagerExt.t = null;
        VirtualDisplay virtualDisplay = screenRecordManagerExt.m;
        if (virtualDisplay != null) {
            virtualDisplay.setSurface(null);
            screenRecordManagerExt.m.release();
            screenRecordManagerExt.m = null;
        }
        Surface surface = screenRecordManagerExt.r;
        if (surface != null) {
            surface.release();
            screenRecordManagerExt.r = null;
        }
        MediaCodec mediaCodec2 = screenRecordManagerExt.o;
        if (mediaCodec2 != null) {
            mediaCodec2.release();
            screenRecordManagerExt.o = null;
        }
    }

    static /* synthetic */ MediaCodec v(ScreenRecordManagerExt screenRecordManagerExt, MediaCodec mediaCodec) {
        screenRecordManagerExt.p = null;
        return null;
    }

    static /* synthetic */ AudioRecord x(ScreenRecordManagerExt screenRecordManagerExt, AudioRecord audioRecord) {
        screenRecordManagerExt.n = null;
        return null;
    }

    void M(@NonNull e eVar) {
        Message obtain = Message.obtain();
        obtain.what = 0;
        obtain.obj = eVar;
        this.f4807d.sendMessage(obtain);
    }

    void O() {
        if (System.currentTimeMillis() - this.x > 1200) {
            this.f4807d.sendEmptyMessage(5);
        } else {
            this.f4807d.sendEmptyMessageDelayed(5, 1200L);
        }
    }
}
