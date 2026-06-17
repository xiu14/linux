package com.bytedance.feedbackerlib.manager;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.widget.Toast;
import androidx.annotation.NonNull;
import com.bytedance.feedbackerlib.manager.ScreenRecordManagerExt;
import com.bytedance.feedbackerlib.manager.ScreenRecordManagerExt.f.b;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
class B extends MediaCodec.Callback {
    private long a = -1;
    final /* synthetic */ ScreenRecordManagerExt b;

    B(ScreenRecordManagerExt screenRecordManagerExt) {
        this.b = screenRecordManagerExt;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(@NonNull MediaCodec mediaCodec, @NonNull MediaCodec.CodecException codecException) {
        StringBuilder M = e.a.a.a.a.M("mVideoEncoder callback error: ");
        M.append(codecException.toString());
        com.bytedance.feedbackerlib.a.R("ScreenRecordManagerExt record", M.toString());
        this.b.O();
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(@NonNull MediaCodec mediaCodec, int i) {
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(@NonNull MediaCodec mediaCodec, int i, @NonNull MediaCodec.BufferInfo bufferInfo) {
        int i2;
        ScreenRecordManagerExt.f fVar;
        int i3 = bufferInfo.flags;
        if (((i3 & 1) == 1 || i3 == 0) && this.b.L()) {
            if (this.a == -1) {
                this.a = bufferInfo.presentationTimeUs;
            }
            bufferInfo.presentationTimeUs -= this.a;
            ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i);
            if (outputBuffer != null) {
                outputBuffer.position(bufferInfo.offset);
                outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                MediaMuxer mediaMuxer = this.b.q;
                i2 = this.b.u;
                mediaMuxer.writeSampleData(i2, outputBuffer, bufferInfo);
                fVar = this.b.l;
                long j = bufferInfo.presentationTimeUs / 1000;
                Objects.requireNonNull(fVar);
                com.bytedance.feedbackerlib.util.k.a(fVar.new b(j));
                if (bufferInfo.presentationTimeUs / 1000 >= 30000) {
                    this.b.O();
                }
            }
        }
        mediaCodec.releaseOutputBuffer(i, false);
        if ((bufferInfo.flags & 4) == 4) {
            this.b.O();
            Toast.makeText(this.b.b, "视频流终结，停止录屏", 0).show();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(@NonNull MediaCodec mediaCodec, @NonNull MediaFormat mediaFormat) {
        this.b.s = mediaFormat;
        if (ScreenRecordManagerExt.r(this.b)) {
            return;
        }
        this.b.O();
    }
}
