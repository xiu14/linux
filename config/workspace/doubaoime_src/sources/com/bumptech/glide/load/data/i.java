package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import com.ss.android.socialbase.downloader.file.DownloadFileUtils;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public class i extends l<ParcelFileDescriptor> {
    public i(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public Class<ParcelFileDescriptor> a() {
        return ParcelFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.data.l
    protected void c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // com.bumptech.glide.load.data.l
    protected ParcelFileDescriptor f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, DownloadFileUtils.MODE_READ);
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor.getParcelFileDescriptor();
        }
        throw new FileNotFoundException(e.a.a.a.a.o("FileDescriptor is null for: ", uri));
    }
}
