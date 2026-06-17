package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.ss.android.socialbase.downloader.file.DownloadFileUtils;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a extends l<AssetFileDescriptor> {
    public a(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public Class<AssetFileDescriptor> a() {
        return AssetFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.data.l
    protected void c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // com.bumptech.glide.load.data.l
    protected AssetFileDescriptor f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, DownloadFileUtils.MODE_READ);
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new FileNotFoundException(e.a.a.a.a.o("FileDescriptor is null for: ", uri));
    }
}
