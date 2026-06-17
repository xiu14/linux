package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import com.facebook.imagepipeline.request.ImageRequest;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import com.ss.android.socialbase.downloader.file.DownloadFileUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class C extends E {

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f6527d = {DBDefinition.ID, "_data"};

    /* renamed from: c, reason: collision with root package name */
    private final ContentResolver f6528c;

    public C(Executor executor, com.facebook.common.memory.h hVar, ContentResolver contentResolver) {
        super(executor, hVar);
        this.f6528c = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.E
    protected com.facebook.imagepipeline.image.f d(ImageRequest imageRequest) throws IOException {
        InputStream createInputStream;
        Uri v = imageRequest.v();
        if (com.facebook.common.util.c.d(v)) {
            if (v.toString().endsWith("/photo")) {
                createInputStream = this.f6528c.openInputStream(v);
            } else if (v.toString().endsWith("/display_photo")) {
                try {
                    createInputStream = this.f6528c.openAssetFileDescriptor(v, DownloadFileUtils.MODE_READ).createInputStream();
                } catch (IOException unused) {
                    throw new IOException(e.a.a.a.a.o("Contact photo does not exist: ", v));
                }
            } else {
                InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.f6528c, v);
                if (openContactPhotoInputStream == null) {
                    throw new IOException(e.a.a.a.a.o("Contact photo does not exist: ", v));
                }
                createInputStream = openContactPhotoInputStream;
            }
            return c(createInputStream, -1);
        }
        if (com.facebook.common.util.c.c(v)) {
            Cursor query = this.f6528c.query(v, f6527d, null, null, null);
            com.facebook.imagepipeline.image.f fVar = null;
            if (query != null) {
                try {
                    if (query.getCount() != 0) {
                        query.moveToFirst();
                        String string = query.getString(query.getColumnIndex("_data"));
                        if (string != null) {
                            fVar = c(new FileInputStream(this.f6528c.openFileDescriptor(v, DownloadFileUtils.MODE_READ).getFileDescriptor()), (int) new File(string).length());
                        }
                    }
                } catch (FileNotFoundException unused2) {
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
                query.close();
            }
            if (fVar != null) {
                return fVar;
            }
        }
        return c(this.f6528c.openInputStream(v), -1);
    }

    @Override // com.facebook.imagepipeline.producers.E
    protected String e() {
        return "LocalContentUriFetchProducer";
    }
}
