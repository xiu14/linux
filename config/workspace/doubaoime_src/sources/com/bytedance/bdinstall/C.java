package com.bytedance.bdinstall;

import com.bytedance.frameworks.encryptor.EncryptorUtil;

/* loaded from: classes.dex */
public interface C {

    public static class a implements C {
        @Override // com.bytedance.bdinstall.C
        public byte[] a(byte[] bArr, int i) {
            try {
                return EncryptorUtil.a(bArr, i);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    byte[] a(byte[] bArr, int i);
}
