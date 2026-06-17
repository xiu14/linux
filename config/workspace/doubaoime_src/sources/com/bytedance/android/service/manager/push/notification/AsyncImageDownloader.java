package com.bytedance.android.service.manager.push.notification;

import android.graphics.Bitmap;
import com.bytedance.push.O.a;
import com.bytedance.push.O.c;

/* loaded from: classes.dex */
public interface AsyncImageDownloader extends a {
    void asyncDownloadImage(c cVar, ImageDownloadCallback imageDownloadCallback);

    @Override // com.bytedance.push.O.a
    /* synthetic */ Bitmap downloadImage(c cVar);
}
