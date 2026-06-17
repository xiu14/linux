package com.bytedance.services.apm.api;

import com.bytedance.news.common.service.manager.IService;
import java.io.File;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface IHttpService extends IService {
    g buildMultipartUpload(String str, String str2, boolean z) throws Exception;

    g buildMultipartUpload(String str, String str2, boolean z, Map<String, String> map) throws Exception;

    c doGet(String str, Map<String, String> map) throws Exception;

    c doPost(String str, byte[] bArr, Map<String, String> map) throws Exception;

    c uploadFiles(String str, List<File> list, Map<String, String> map) throws Exception;
}
