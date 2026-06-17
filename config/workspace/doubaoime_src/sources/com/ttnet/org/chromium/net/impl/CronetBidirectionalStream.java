package com.ttnet.org.chromium.net.impl;

import androidx.annotation.VisibleForTesting;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

@VisibleForTesting
/* loaded from: classes2.dex */
public class CronetBidirectionalStream extends com.ttnet.org.chromium.net.j {
    private J a;

    private static ArrayList<Map.Entry<String, String>> a(String[] strArr) {
        ArrayList<Map.Entry<String, String>> arrayList = new ArrayList<>(strArr.length / 2);
        for (int i = 0; i < strArr.length; i += 2) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry(strArr[i], strArr[i + 1]));
        }
        return arrayList;
    }

    @CalledByNative
    private void onCanceled() {
        throw null;
    }

    @CalledByNative
    private void onError(int i, int i2, int i3, String str, long j) {
        J j2 = this.a;
        if (j2 != null) {
            j2.f(j);
        }
        if (i == 10 || i == 3) {
            new D(e.a.a.a.a.s("Exception in BidirectionalStream: ", str), i, i2, i3);
            throw null;
        }
        new C0761a(e.a.a.a.a.s("Exception in BidirectionalStream: ", str), i, i2);
        throw null;
    }

    @CalledByNative
    private void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15, String str, long j16) {
        throw null;
    }

    @CalledByNative
    private void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        int i4;
        this.a.f(j);
        if (byteBuffer.position() != i2 || byteBuffer.limit() != i3) {
            new C0764d("ByteBuffer modified externally during read", null);
            throw null;
        }
        if (i < 0 || (i4 = i2 + i) > i3) {
            new C0764d("Invalid number of bytes read", null);
            throw null;
        }
        byteBuffer.position(i4);
        throw null;
    }

    @CalledByNative
    private void onResponseHeadersReceived(int i, String str, String[] strArr, long j) {
        try {
            try {
                this.a = new J(Arrays.asList(null), i, "", a(strArr), false, str, null, j);
                throw null;
            } catch (Exception unused) {
                new C0764d("Cannot prepare ResponseInfo", null);
                throw null;
            }
        } catch (Exception unused2) {
        }
    }

    @CalledByNative
    private void onResponseTrailersReceived(String[] strArr) {
        a(strArr);
        throw null;
    }

    @CalledByNative
    private void onStreamReady(boolean z) {
        throw null;
    }

    @CalledByNative
    private void onWritevCompleted(ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z) {
        throw null;
    }
}
