package com.huawei.hianalytics.log.f;

import android.text.TextUtils;
import com.bytedance.common.wschannel.WsConstants;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.vivo.push.PushClient;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class f implements e {
    f() {
    }

    @Override // com.huawei.hianalytics.log.f.e
    public com.huawei.hianalytics.log.f.a.b a(String str, String str2) {
        String str3;
        com.huawei.hianalytics.log.f.a.b bVar = new com.huawei.hianalytics.log.f.a.b();
        File[] listFiles = new File(str).listFiles();
        if (listFiles == null || listFiles.length <= 0) {
            str3 = "not has send file";
        } else {
            File file = listFiles[0];
            if (file.length() <= 5242880) {
                String a = a(file, "MD5");
                String a2 = a(file, "SHA-256");
                String valueOf = String.valueOf(file.length());
                com.huawei.hianalytics.log.f.a.a aVar = new com.huawei.hianalytics.log.f.a.a(a, valueOf, a2);
                ArrayList arrayList = new ArrayList();
                arrayList.add(aVar);
                bVar.a("0");
                bVar.b(file.getName());
                bVar.a(arrayList);
                bVar.c(valueOf);
                bVar.d(str2);
                bVar.e(valueOf);
                bVar.f(PushClient.DEFAULT_REQUEST_ID);
                bVar.g("0");
                bVar.h("others");
                return bVar;
            }
            str3 = "send file ,file length full！";
        }
        com.huawei.hianalytics.g.b.d("SendManagerImpl", str3);
        return null;
    }

    public String a(File file, String str) {
        String str2;
        String str3;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Throwable th) {
                th = th;
            }
            try {
                MappedByteBuffer map = fileInputStream.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, file.length());
                MessageDigest messageDigest = MessageDigest.getInstance(str);
                messageDigest.update(map);
                str3 = new BigInteger(1, messageDigest.digest()).toString(16);
                com.huawei.hianalytics.log.e.d.a(1, fileInputStream);
            } catch (IOException unused) {
                fileInputStream2 = fileInputStream;
                str2 = "getMd5ByFile : file input stream Exception!";
                com.huawei.hianalytics.g.b.d("SendManagerImpl", str2);
                com.huawei.hianalytics.log.e.d.a(1, fileInputStream2);
                str3 = "";
                return str3;
            } catch (NoSuchAlgorithmException unused2) {
                fileInputStream2 = fileInputStream;
                str2 = "getMd5ByFile : No such algorithm!";
                com.huawei.hianalytics.g.b.d("SendManagerImpl", str2);
                com.huawei.hianalytics.log.e.d.a(1, fileInputStream2);
                str3 = "";
                return str3;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                com.huawei.hianalytics.log.e.d.a(1, fileInputStream2);
                throw th;
            }
        } catch (IOException unused3) {
        } catch (NoSuchAlgorithmException unused4) {
        }
        return str3;
    }

    @Override // com.huawei.hianalytics.log.f.e
    public String a(String str, com.huawei.hianalytics.log.f.a.b bVar) {
        if (bVar == null || TextUtils.isEmpty(str)) {
            com.huawei.hianalytics.g.b.d("SendManagerImpl", "commonbody is empty or fileinfo is null!");
            return "";
        }
        List<com.huawei.hianalytics.log.f.a.a> c2 = bVar.c();
        JSONArray jSONArray = new JSONArray();
        for (com.huawei.hianalytics.log.f.a.a aVar : c2) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fileMd5", aVar.c());
            jSONObject.put("fileSha256", aVar.b());
            jSONObject.put("fileSize", aVar.a());
            jSONArray.put(jSONObject);
        }
        return String.format(Locale.getDefault(), "%s=%s&%s=%s&%s=%s&%s=%s&%s=%s&%s=%s&%s=%s&%s=%s&%s=%s", e.a.a.a.a.s(str, "&logType"), bVar.a(), "fileName", bVar.b(), "fileHashList", jSONArray, "fileSize", bVar.d(), "encryptKey", bVar.e(), "patchSize", bVar.f(), "patchNum", bVar.g(), "patchVer", bVar.h(), "others", bVar.i());
    }

    @Override // com.huawei.hianalytics.log.f.e
    public List<com.huawei.hianalytics.log.f.a.c> a(JSONArray jSONArray, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String optString = jSONObject.optString("method");
            String optString2 = jSONObject.optString("uploadUrl");
            JSONObject optJSONObject = jSONObject.optJSONObject("headers");
            com.huawei.hianalytics.log.f.a.c cVar = new com.huawei.hianalytics.log.f.a.c(optString2, optString, str);
            cVar.a("Authorization", optJSONObject.optString("Authorization"));
            cVar.a("x-amz-content-sha256", optJSONObject.optString("x-amz-content-sha256"));
            cVar.a("x-amz-date", optJSONObject.optString("x-amz-date"));
            cVar.a(WsConstants.KEY_CONNECTION, optJSONObject.optString(WsConstants.KEY_CONNECTION));
            cVar.a(DownloadConstants.HOST, optJSONObject.optString(DownloadConstants.HOST));
            cVar.a("Content-MD5", optJSONObject.optString("Content-MD5"));
            cVar.a(DownloadHelper.CONTENT_TYPE, optJSONObject.optString(DownloadHelper.CONTENT_TYPE));
            cVar.a("user-agent", optJSONObject.optString("user-agent"));
            arrayList.add(cVar);
        }
        return arrayList;
    }
}
