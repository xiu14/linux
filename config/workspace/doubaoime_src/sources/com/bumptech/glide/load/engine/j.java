package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* loaded from: classes.dex */
public abstract class j {
    public static final j a = new a();
    public static final j b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final j f1647c = new c();

    class a extends j {
        a() {
        }

        @Override // com.bumptech.glide.load.engine.j
        public boolean a() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.j
        public boolean b() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.j
        public boolean c(DataSource dataSource) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.j
        public boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    class b extends j {
        b() {
        }

        @Override // com.bumptech.glide.load.engine.j
        public boolean a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.j
        public boolean b() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.j
        public boolean c(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        @Override // com.bumptech.glide.load.engine.j
        public boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    class c extends j {
        c() {
        }

        @Override // com.bumptech.glide.load.engine.j
        public boolean a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.j
        public boolean b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.j
        public boolean c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // com.bumptech.glide.load.engine.j
        public boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(DataSource dataSource);

    public abstract boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy);
}
