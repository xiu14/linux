package com.vivo.push.g;

import android.content.Context;
import android.security.KeyPairGeneratorSpec;
import android.text.TextUtils;
import android.util.Base64;
import com.vivo.push.util.t;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.UnrecoverableEntryException;
import java.util.Calendar;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes2.dex */
public final class c implements a {
    private PrivateKey a = null;
    private PublicKey b = null;

    /* renamed from: c, reason: collision with root package name */
    private KeyStore f8818c;

    /* renamed from: d, reason: collision with root package name */
    private X500Principal f8819d;

    /* renamed from: e, reason: collision with root package name */
    private Context f8820e;

    public c(Context context) {
        this.f8820e = context;
        a(context);
    }

    private synchronized void a(Context context) {
        try {
            b();
            if (!b("PushRsaKeyAlias")) {
                b(context);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            t.a("RsaSecurity", "init error" + e2.getMessage());
        }
    }

    private void b(Context context) {
        try {
            if (context == null) {
                t.d("RsaSecurity", " generateRSAKeyPairSign context == null ");
                return;
            }
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 999);
            KeyPairGeneratorSpec build = new KeyPairGeneratorSpec.Builder(context.getApplicationContext()).setAlias("PushRsaKeyAlias").setSubject(this.f8819d).setSerialNumber(BigInteger.valueOf(1337L)).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build();
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            keyPairGenerator.initialize(build);
            keyPairGenerator.generateKeyPair();
        } catch (Exception e2) {
            e2.printStackTrace();
            e.a.a.a.a.h0(e2, new StringBuilder("generateRSAKeyPairSign error"), "RsaSecurity");
        }
    }

    private PrivateKey c(Context context) {
        PrivateKey privateKey;
        try {
            privateKey = this.a;
        } catch (Exception e2) {
            e2.printStackTrace();
            e.a.a.a.a.h0(e2, new StringBuilder("getPrivateKeySigin error"), "RsaSecurity");
        }
        if (privateKey != null) {
            return privateKey;
        }
        if (context == null) {
            t.d("RsaSecurity", " getPrivateKeySigin context == null ");
            return null;
        }
        KeyStore.Entry d2 = d(context);
        if (d2 instanceof KeyStore.PrivateKeyEntry) {
            PrivateKey privateKey2 = ((KeyStore.PrivateKeyEntry) d2).getPrivateKey();
            this.a = privateKey2;
            return privateKey2;
        }
        return null;
    }

    private KeyStore.Entry d(Context context) throws UnrecoverableEntryException, NoSuchAlgorithmException, KeyStoreException {
        try {
            if (context == null) {
                t.d("RsaSecurity", " getPrivateKeySigin context == null ");
                return null;
            }
            if (!b("PushRsaKeyAlias")) {
                b(context);
            }
            return this.f8818c.getEntry("PushRsaKeyAlias", null);
        } catch (Exception e2) {
            b(context);
            KeyStore.Entry entry = this.f8818c.getEntry("PushRsaKeyAlias", null);
            e2.printStackTrace();
            e.a.a.a.a.h0(e2, new StringBuilder("getPrivateKeySigin error"), "RsaSecurity");
            return entry;
        }
    }

    @Override // com.vivo.push.g.a
    public final String a(String str) {
        try {
            if (TextUtils.isEmpty(str) || c(this.f8820e) == null) {
                return null;
            }
            byte[] bytes = str.getBytes("UTF-8");
            PrivateKey c2 = c(this.f8820e);
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initSign(c2);
            signature.update(bytes);
            String encodeToString = Base64.encodeToString(signature.sign(), 2);
            t.d("RsaSecurity", str.hashCode() + " = " + encodeToString);
            return encodeToString;
        } catch (Exception e2) {
            e2.printStackTrace();
            e.a.a.a.a.h0(e2, new StringBuilder("signClientSDK error"), "RsaSecurity");
            return null;
        }
    }

    private boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (this.f8818c == null) {
                b();
            }
            return this.f8818c.containsAlias(str);
        } catch (Exception e2) {
            e2.printStackTrace();
            e.a.a.a.a.h0(e2, new StringBuilder("getPrivateKeySigin error"), "RsaSecurity");
            return false;
        }
    }

    @Override // com.vivo.push.g.a
    public final boolean a(byte[] bArr, PublicKey publicKey, byte[] bArr2) {
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(publicKey);
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (Exception e2) {
            e2.printStackTrace();
            e.a.a.a.a.h0(e2, new StringBuilder("verifyClientSDK error"), "RsaSecurity");
            return false;
        }
    }

    private void b() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.f8818c = keyStore;
            keyStore.load(null);
            this.f8819d = new X500Principal("CN=Push SDK, OU=VIVO, O=VIVO PUSH, C=CN");
        } catch (Exception e2) {
            e2.printStackTrace();
            e.a.a.a.a.h0(e2, new StringBuilder("initKeyStore error"), "RsaSecurity");
        }
    }

    @Override // com.vivo.push.g.a
    public final PublicKey a() {
        try {
            PublicKey publicKey = this.b;
            if (publicKey != null) {
                return publicKey;
            }
            KeyStore.Entry d2 = d(this.f8820e);
            if (!(d2 instanceof KeyStore.PrivateKeyEntry)) {
                return null;
            }
            PublicKey publicKey2 = ((KeyStore.PrivateKeyEntry) d2).getCertificate().getPublicKey();
            this.b = publicKey2;
            return publicKey2;
        } catch (Exception e2) {
            e2.printStackTrace();
            e.a.a.a.a.h0(e2, new StringBuilder("getPublicKeySign error"), "RsaSecurity");
            return null;
        }
    }
}
