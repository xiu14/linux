package com.bytedance.android.input.common;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class b {
    public static final byte[] a(byte[] bArr, int i, int i2, int i3) {
        kotlin.s.c.l.f(bArr, "pcmData");
        try {
            long length = bArr.length;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeBytes("RIFF");
            dataOutputStream.writeInt(Integer.reverseBytes((int) ((44 + length) - 8)));
            dataOutputStream.writeBytes("WAVE");
            dataOutputStream.writeBytes("fmt ");
            dataOutputStream.writeInt(Integer.reverseBytes(16));
            dataOutputStream.writeShort(Short.reverseBytes((short) 1));
            dataOutputStream.writeShort(Short.reverseBytes((short) i2));
            dataOutputStream.writeInt(Integer.reverseBytes(i));
            dataOutputStream.writeInt(Integer.reverseBytes(((i * i2) * i3) / 8));
            dataOutputStream.writeShort(Short.reverseBytes((short) ((i2 * i3) / 8)));
            dataOutputStream.writeShort(Short.reverseBytes((short) i3));
            dataOutputStream.writeBytes(RemoteMessageConst.DATA);
            dataOutputStream.writeInt(Integer.reverseBytes((int) length));
            dataOutputStream.write(bArr);
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            com.bytedance.android.input.r.j.j("AudioConvert", "pcmToWav conversion failed: " + e2);
            return null;
        }
    }
}
