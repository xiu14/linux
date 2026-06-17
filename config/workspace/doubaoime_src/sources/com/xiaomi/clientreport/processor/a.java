package com.xiaomi.clientreport.processor;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.aa;
import com.xiaomi.push.bm;
import com.xiaomi.push.bw;
import com.xiaomi.push.i;
import com.xiaomi.push.y;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes2.dex */
public class a implements IEventProcessor {
    protected Context a;

    /* renamed from: a, reason: collision with other field name */
    private HashMap<String, ArrayList<com.xiaomi.clientreport.data.a>> f20a;

    public a(Context context) {
        a(context);
    }

    public void a(Context context) {
        this.a = context;
    }

    @Override // com.xiaomi.clientreport.processor.d
    public void b() {
        HashMap<String, ArrayList<com.xiaomi.clientreport.data.a>> hashMap = this.f20a;
        if (hashMap == null) {
            return;
        }
        if (hashMap.size() > 0) {
            Iterator<String> it2 = this.f20a.keySet().iterator();
            while (it2.hasNext()) {
                ArrayList<com.xiaomi.clientreport.data.a> arrayList = this.f20a.get(it2.next());
                if (arrayList != null && arrayList.size() > 0) {
                    com.xiaomi.clientreport.data.a[] aVarArr = new com.xiaomi.clientreport.data.a[arrayList.size()];
                    arrayList.toArray(aVarArr);
                    m30a(aVarArr);
                }
            }
        }
        this.f20a.clear();
    }

    @Override // com.xiaomi.clientreport.processor.IEventProcessor
    public String bytesToString(byte[] bArr) {
        byte[] a;
        if (bArr != null && bArr.length >= 1) {
            if (!com.xiaomi.clientreport.manager.a.a(this.a).m26a().isEventEncrypted()) {
                return bm.b(bArr);
            }
            String a2 = bw.a(this.a);
            if (!TextUtils.isEmpty(a2) && (a = bw.a(a2)) != null && a.length > 0) {
                try {
                    return bm.b(Base64.decode(i.a(a, bArr), 2));
                } catch (InvalidAlgorithmParameterException e2) {
                    com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
                } catch (InvalidKeyException e3) {
                    com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e3);
                } catch (NoSuchAlgorithmException e4) {
                    com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e4);
                } catch (BadPaddingException e5) {
                    com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e5);
                } catch (IllegalBlockSizeException e6) {
                    com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e6);
                } catch (NoSuchPaddingException e7) {
                    com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e7);
                }
            }
        }
        return null;
    }

    @Override // com.xiaomi.clientreport.processor.IEventProcessor
    public void setEventMap(HashMap<String, ArrayList<com.xiaomi.clientreport.data.a>> hashMap) {
        this.f20a = hashMap;
    }

    @Override // com.xiaomi.clientreport.processor.IEventProcessor
    public byte[] stringToBytes(String str) {
        byte[] a;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!com.xiaomi.clientreport.manager.a.a(this.a).m26a().isEventEncrypted()) {
            return bm.m134a(str);
        }
        String a2 = bw.a(this.a);
        byte[] m134a = bm.m134a(str);
        if (!TextUtils.isEmpty(a2) && m134a != null && m134a.length > 1 && (a = bw.a(a2)) != null) {
            try {
                if (a.length > 1) {
                    return i.b(a, Base64.encode(m134a, 2));
                }
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
            }
        }
        return null;
    }

    public static String a(com.xiaomi.clientreport.data.a aVar) {
        return String.valueOf(aVar.production);
    }

    public void a(List<String> list) {
        bw.a(this.a, list);
    }

    @Override // com.xiaomi.clientreport.processor.c
    public void a() {
        int i;
        bw.a(this.a, NotificationCompat.CATEGORY_EVENT, "eventUploading");
        File[] m142a = bw.m142a(this.a, "eventUploading");
        if (m142a == null || m142a.length <= 0) {
            return;
        }
        int length = m142a.length;
        FileLock fileLock = null;
        RandomAccessFile randomAccessFile = null;
        File file = null;
        while (i < length) {
            File file2 = m142a[i];
            if (file2 == null) {
                if (fileLock != null && fileLock.isValid()) {
                    try {
                        fileLock.release();
                    } catch (IOException e2) {
                        com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
                    }
                }
                y.a(randomAccessFile);
                i = file == null ? i + 1 : 0;
                file.delete();
            } else {
                try {
                    try {
                    } catch (Exception e3) {
                        e = e3;
                    }
                    if (file2.length() > 5242880) {
                        com.xiaomi.channel.commonutils.logger.c.d("eventData read from cache file failed because " + file2.getName() + " is too big, length " + file2.length());
                        a(file2.getName(), Formatter.formatFileSize(this.a, file2.length()));
                        file2.delete();
                        if (fileLock != null && fileLock.isValid()) {
                            try {
                                fileLock.release();
                            } catch (IOException e4) {
                                com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e4);
                            }
                        }
                        y.a(randomAccessFile);
                        if (file == null) {
                        }
                        file.delete();
                    } else {
                        String absolutePath = file2.getAbsolutePath();
                        File file3 = new File(absolutePath + ".lock");
                        try {
                            y.m850a(file3);
                            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file3, "rw");
                            try {
                                fileLock = randomAccessFile2.getChannel().lock();
                                a(a(absolutePath));
                                file2.delete();
                                if (fileLock != null && fileLock.isValid()) {
                                    try {
                                        fileLock.release();
                                    } catch (IOException e5) {
                                        com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e5);
                                    }
                                }
                                y.a(randomAccessFile2);
                                file3.delete();
                                randomAccessFile = randomAccessFile2;
                                file = file3;
                            } catch (Exception e6) {
                                e = e6;
                                randomAccessFile = randomAccessFile2;
                                file = file3;
                                com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e);
                                if (fileLock != null && fileLock.isValid()) {
                                    try {
                                        fileLock.release();
                                    } catch (IOException e7) {
                                        com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e7);
                                    }
                                }
                                y.a(randomAccessFile);
                                if (file == null) {
                                }
                                file.delete();
                            } catch (Throwable th) {
                                th = th;
                                randomAccessFile = randomAccessFile2;
                                file = file3;
                                if (fileLock != null && fileLock.isValid()) {
                                    try {
                                        fileLock.release();
                                    } catch (IOException e8) {
                                        com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e8);
                                    }
                                }
                                y.a(randomAccessFile);
                                if (file != null) {
                                    file.delete();
                                    throw th;
                                }
                                throw th;
                            }
                        } catch (Exception e9) {
                            e = e9;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
    }

    private String b(com.xiaomi.clientreport.data.a aVar) {
        File file = new File(this.a.getFilesDir(), NotificationCompat.CATEGORY_EVENT);
        String a = a(aVar);
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsolutePath());
        String J2 = e.a.a.a.a.J(sb, File.separator, a);
        for (int i = 0; i < 100; i++) {
            String j = e.a.a.a.a.j(J2, i);
            if (bw.m141a(this.a, j)) {
                return j;
            }
        }
        return null;
    }

    private void a(String str, String str2) {
        EventClientReport a = com.xiaomi.clientreport.manager.a.a(this.a).a(5001, e.a.a.a.a.u("24:", str, Constants.ACCEPT_TIME_SEPARATOR_SP, str2));
        ArrayList arrayList = new ArrayList();
        arrayList.add(a.toJsonString());
        a(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
    
        com.xiaomi.channel.commonutils.logger.c.d("eventData read from cache file failed cause lengthBuffer < 1 || lengthBuffer > 4K");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<java.lang.String> a(java.lang.String r9) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 4
            byte[] r2 = new byte[r1]
            byte[] r3 = new byte[r1]
            r4 = 0
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
        L15:
            int r9 = r5.read(r2)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            r4 = -1
            if (r9 != r4) goto L1d
            goto L6e
        L1d:
            java.lang.String r6 = "eventData read from cache file failed because magicNumber error"
            if (r9 == r1) goto L25
            com.xiaomi.channel.commonutils.logger.c.d(r6)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            goto L6e
        L25:
            int r9 = com.xiaomi.push.aa.a(r2)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            r7 = -573785174(0xffffffffddccbbaa, float:-1.84407149E18)
            if (r9 == r7) goto L32
            com.xiaomi.channel.commonutils.logger.c.d(r6)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            goto L6e
        L32:
            int r9 = r5.read(r3)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            if (r9 != r4) goto L39
            goto L6e
        L39:
            if (r9 == r1) goto L41
            java.lang.String r9 = "eventData read from cache file failed cause lengthBuffer error"
            com.xiaomi.channel.commonutils.logger.c.d(r9)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            goto L6e
        L41:
            int r9 = com.xiaomi.push.aa.a(r3)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            r4 = 1
            if (r9 < r4) goto L69
            r4 = 4096(0x1000, float:5.74E-42)
            if (r9 <= r4) goto L4d
            goto L69
        L4d:
            byte[] r4 = new byte[r9]     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            int r6 = r5.read(r4)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            if (r6 == r9) goto L5b
            java.lang.String r9 = "eventData read from cache file failed cause buffer size not equal length"
            com.xiaomi.channel.commonutils.logger.c.d(r9)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            goto L6e
        L5b:
            java.lang.String r9 = r8.bytesToString(r4)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            boolean r4 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            if (r4 != 0) goto L15
            r0.add(r9)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            goto L15
        L69:
            java.lang.String r9 = "eventData read from cache file failed cause lengthBuffer < 1 || lengthBuffer > 4K"
            com.xiaomi.channel.commonutils.logger.c.d(r9)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
        L6e:
            com.xiaomi.push.y.a(r5)
            goto L81
        L72:
            r9 = move-exception
            r4 = r5
            goto L82
        L75:
            r9 = move-exception
            r4 = r5
            goto L7b
        L78:
            r9 = move-exception
            goto L82
        L7a:
            r9 = move-exception
        L7b:
            com.xiaomi.channel.commonutils.logger.c.m18a(r9)     // Catch: java.lang.Throwable -> L78
            com.xiaomi.push.y.a(r4)
        L81:
            return r0
        L82:
            com.xiaomi.push.y.a(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.clientreport.processor.a.a(java.lang.String):java.util.List");
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m30a(com.xiaomi.clientreport.data.a[] aVarArr) {
        if (aVarArr == null || aVarArr.length == 0 || aVarArr[0] == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("event data write to cache file failed because data null");
            return;
        }
        do {
            aVarArr = a(aVarArr);
            if (aVarArr == null || aVarArr.length <= 0) {
                return;
            }
        } while (aVarArr[0] != null);
    }

    private com.xiaomi.clientreport.data.a[] a(com.xiaomi.clientreport.data.a[] aVarArr) {
        FileLock fileLock;
        RandomAccessFile randomAccessFile;
        BufferedOutputStream bufferedOutputStream;
        String b = b(aVarArr[0]);
        BufferedOutputStream bufferedOutputStream2 = null;
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        try {
            File file = new File(b + ".lock");
            y.m850a(file);
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileLock = randomAccessFile.getChannel().lock();
            } catch (Exception e2) {
                e = e2;
                fileLock = null;
                bufferedOutputStream = null;
            } catch (Throwable th) {
                th = th;
                fileLock = null;
            }
        } catch (Exception e3) {
            e = e3;
            fileLock = null;
            randomAccessFile = null;
            bufferedOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileLock = null;
            randomAccessFile = null;
        }
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(b), true));
            try {
                try {
                    int i = 0;
                    for (com.xiaomi.clientreport.data.a aVar : aVarArr) {
                        if (aVar != null) {
                            byte[] stringToBytes = stringToBytes(aVar.toJsonString());
                            if (stringToBytes != null && stringToBytes.length >= 1 && stringToBytes.length <= 4096) {
                                if (!bw.m141a(this.a, b)) {
                                    int length = aVarArr.length - i;
                                    com.xiaomi.clientreport.data.a[] aVarArr2 = new com.xiaomi.clientreport.data.a[length];
                                    System.arraycopy(aVarArr, i, aVarArr2, 0, length);
                                    y.a(bufferedOutputStream);
                                    a(randomAccessFile, fileLock);
                                    return aVarArr2;
                                }
                                bufferedOutputStream.write(aa.a(-573785174));
                                bufferedOutputStream.write(aa.a(stringToBytes.length));
                                bufferedOutputStream.write(stringToBytes);
                                bufferedOutputStream.flush();
                                i++;
                            }
                            com.xiaomi.channel.commonutils.logger.c.d("event data throw a invalid item ");
                        }
                    }
                } catch (Exception e4) {
                    e = e4;
                    com.xiaomi.channel.commonutils.logger.c.a("event data write to cache file failed cause exception", e);
                    y.a(bufferedOutputStream);
                    a(randomAccessFile, fileLock);
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream2 = bufferedOutputStream;
                y.a(bufferedOutputStream2);
                a(randomAccessFile, fileLock);
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            bufferedOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            y.a(bufferedOutputStream2);
            a(randomAccessFile, fileLock);
            throw th;
        }
        y.a(bufferedOutputStream);
        a(randomAccessFile, fileLock);
        return null;
    }

    private void a(RandomAccessFile randomAccessFile, FileLock fileLock) {
        if (fileLock != null && fileLock.isValid()) {
            try {
                fileLock.release();
            } catch (IOException e2) {
                com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
            }
        }
        y.a(randomAccessFile);
    }

    @Override // com.xiaomi.clientreport.processor.d
    /* renamed from: a, reason: collision with other method in class */
    public void mo29a(com.xiaomi.clientreport.data.a aVar) {
        if ((aVar instanceof EventClientReport) && this.f20a != null) {
            EventClientReport eventClientReport = (EventClientReport) aVar;
            String a = a((com.xiaomi.clientreport.data.a) eventClientReport);
            ArrayList<com.xiaomi.clientreport.data.a> arrayList = this.f20a.get(a);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(eventClientReport);
            this.f20a.put(a, arrayList);
        }
    }
}
