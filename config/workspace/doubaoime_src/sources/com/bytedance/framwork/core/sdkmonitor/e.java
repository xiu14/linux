package com.bytedance.framwork.core.sdkmonitor;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.huawei.hms.framework.common.BundleUtil;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.vivo.push.PushClient;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;
import java.util.zip.Deflater;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public class e {
    private static String a;

    public static byte[] a(String str, byte[] bArr, MonitorNetUtil$CompressType monitorNetUtil$CompressType, String str2, boolean z) throws Throwable {
        String str3;
        String str4;
        byte[] bArr2;
        String str5 = null;
        if (str == null) {
            return null;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        if (MonitorNetUtil$CompressType.GZIP == monitorNetUtil$CompressType && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                bArr = byteArrayOutputStream.toByteArray();
                str5 = DownloadHelper.GZIP;
            } catch (Throwable unused) {
                gZIPOutputStream.close();
                return null;
            }
        } else if (MonitorNetUtil$CompressType.DEFLATER == monitorNetUtil$CompressType && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(8192);
            Deflater deflater = new Deflater();
            deflater.setInput(bArr);
            deflater.finish();
            byte[] bArr3 = new byte[8192];
            while (!deflater.finished()) {
                byteArrayOutputStream2.write(bArr3, 0, deflater.deflate(bArr3));
            }
            deflater.end();
            bArr = byteArrayOutputStream2.toByteArray();
            str5 = "deflate";
        }
        byte[] bArr4 = bArr;
        String str6 = str5;
        if (!z) {
            return b(str, bArr4, str2, str6, "POST", true, false);
        }
        byte[] a2 = EncryptorUtil.a(bArr4, bArr4.length);
        if (a2 != null) {
            str3 = e.a.a.a.a.s(str, "&tt_data=a");
            bArr2 = a2;
            str4 = "application/octet-stream;tt-data=a";
        } else {
            str3 = str;
            str4 = str2;
            bArr2 = bArr4;
        }
        return b(str3, bArr2, str4, str6, "POST", true, true);
    }

    public static byte[] b(String str, byte[] bArr, String str2, String str3, String str4, boolean z, boolean z2) throws Throwable {
        Throwable th;
        HttpURLConnection httpURLConnection;
        byte[] f2;
        Throwable th2;
        DataOutputStream dataOutputStream;
        InputStream inputStream = null;
        try {
            LinkedList<Pair> linkedList = new LinkedList();
            httpURLConnection = (HttpURLConnection) (z2 ? new URL(e.b.f.a.a.a.g(str, linkedList)) : new URL(str)).openConnection();
            if (z2) {
                try {
                    if (!linkedList.isEmpty()) {
                        for (Pair pair : linkedList) {
                            if (pair != null) {
                                httpURLConnection.setRequestProperty((String) pair.first, (String) pair.second);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            if (z) {
                httpURLConnection.setDoOutput(true);
            } else {
                httpURLConnection.setDoOutput(false);
            }
            if (str2 != null) {
                httpURLConnection.setRequestProperty(DownloadHelper.CONTENT_TYPE, str2);
            }
            if (str3 != null) {
                httpURLConnection.setRequestProperty(DownloadHelper.CONTENT_ENCODING, str3);
            }
            httpURLConnection.setRequestProperty(DownloadHelper.ACCEPT_ENCODING, DownloadHelper.GZIP);
            httpURLConnection.setRequestProperty("Version-Code", PushClient.DEFAULT_REQUEST_ID);
            httpURLConnection.setRequestMethod(str4);
            if (bArr != null && bArr.length > 0) {
                try {
                    dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    try {
                        dataOutputStream.write(bArr);
                        dataOutputStream.flush();
                        try {
                            dataOutputStream.close();
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        if (dataOutputStream != null) {
                            try {
                                dataOutputStream.close();
                            } catch (Throwable unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    dataOutputStream = null;
                }
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200) {
                throw new d(responseCode, httpURLConnection.getResponseMessage());
            }
            InputStream inputStream2 = httpURLConnection.getInputStream();
            try {
                String contentEncoding = httpURLConnection.getContentEncoding();
                if (TextUtils.isEmpty(contentEncoding) || !contentEncoding.equalsIgnoreCase(DownloadHelper.GZIP)) {
                    f2 = f(inputStream2);
                } else {
                    try {
                        GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream2);
                        try {
                            f2 = f(gZIPInputStream);
                            try {
                                gZIPInputStream.close();
                            } catch (Throwable unused3) {
                            }
                        } catch (Throwable th6) {
                            th2 = th6;
                            inputStream = gZIPInputStream;
                            if (inputStream == null) {
                                throw th2;
                            }
                            try {
                                inputStream.close();
                                throw th2;
                            } catch (Throwable unused4) {
                                throw th2;
                            }
                        }
                    } catch (Throwable th7) {
                        th2 = th7;
                    }
                }
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (Throwable unused5) {
                    }
                }
                try {
                    httpURLConnection.disconnect();
                } catch (Exception unused6) {
                }
                return f2;
            } catch (Throwable th8) {
                th = th8;
                inputStream = inputStream2;
                throw th;
            }
        } catch (Throwable th9) {
            th = th9;
            httpURLConnection = null;
        }
    }

    public static MonitorNetUtil$NetworkType c(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (1 == type) {
                    return MonitorNetUtil$NetworkType.WIFI;
                }
                if (type != 0) {
                    return MonitorNetUtil$NetworkType.MOBILE;
                }
                switch (((TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return MonitorNetUtil$NetworkType.MOBILE_3G;
                    case 4:
                    case 7:
                    case 11:
                    default:
                        return MonitorNetUtil$NetworkType.MOBILE;
                    case 13:
                        return MonitorNetUtil$NetworkType.MOBILE_4G;
                }
            }
            return MonitorNetUtil$NetworkType.NONE;
        } catch (Throwable unused) {
            return MonitorNetUtil$NetworkType.MOBILE;
        }
    }

    public static String d(Context context) {
        if (a == null) {
            String replace = com.bytedance.framwork.core.sdklib.util.b.a().replace(context.getPackageName(), "p").replace(Constants.COLON_SEPARATOR, BundleUtil.UNDERLINE_TAG);
            a = replace;
            a = replace.replace(".", BundleUtil.UNDERLINE_TAG);
        }
        return a;
    }

    public static boolean e(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static byte[] f(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
