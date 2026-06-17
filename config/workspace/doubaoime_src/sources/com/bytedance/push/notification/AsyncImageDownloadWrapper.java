package com.bytedance.push.notification;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.bytedance.android.service.manager.push.notification.AsyncImageDownloader;
import com.bytedance.android.service.manager.push.notification.ImageDownloadCallback;

/* loaded from: classes2.dex */
public class AsyncImageDownloadWrapper implements AsyncImageDownloader, Handler.Callback {
    private Handler mHandler;
    private final com.bytedance.push.O.a mImageDownloader;

    class a implements Runnable {
        final /* synthetic */ com.bytedance.push.O.c a;
        final /* synthetic */ ImageDownloadCallback b;

        /* renamed from: com.bytedance.push.notification.AsyncImageDownloadWrapper$a$a, reason: collision with other inner class name */
        class RunnableC0302a implements Runnable {
            final /* synthetic */ Bitmap a;

            RunnableC0302a(Bitmap bitmap) {
                this.a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                Bitmap bitmap = this.a;
                if (bitmap == null || bitmap.isRecycled()) {
                    a.this.b.onFailed();
                } else {
                    a.this.b.onSuccess(this.a);
                }
            }
        }

        a(com.bytedance.push.O.c cVar, ImageDownloadCallback imageDownloadCallback) {
            this.a = cVar;
            this.b = imageDownloadCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmap;
            try {
                bitmap = AsyncImageDownloadWrapper.this.mImageDownloader.downloadImage(this.a);
            } catch (Throwable th) {
                th.printStackTrace();
                bitmap = null;
            }
            AsyncImageDownloadWrapper.this.mHandler.post(new RunnableC0302a(bitmap));
        }
    }

    public AsyncImageDownloadWrapper(com.bytedance.push.O.a aVar) {
        this.mImageDownloader = aVar;
    }

    @Override // com.bytedance.android.service.manager.push.notification.AsyncImageDownloader
    public void asyncDownloadImage(com.bytedance.push.O.c cVar, ImageDownloadCallback imageDownloadCallback) {
        if (this.mHandler == null) {
            this.mHandler = new Handler(Looper.getMainLooper(), this);
        }
        com.bytedance.common.push.d.b(new a(cVar, imageDownloadCallback));
    }

    @Override // com.bytedance.android.service.manager.push.notification.AsyncImageDownloader, com.bytedance.push.O.a
    @Nullable
    public Bitmap downloadImage(com.bytedance.push.O.c cVar) {
        return this.mImageDownloader.downloadImage(cVar);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return false;
    }
}
