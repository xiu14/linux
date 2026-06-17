package com.google.gson.internal;

import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* loaded from: classes2.dex */
final class B extends Writer {
    private final Appendable a;
    private final a b = new a(null);

    private static class a implements CharSequence {
        private char[] a;
        private String b;

        a(A a) {
        }

        void a(char[] cArr) {
            this.a = cArr;
            this.b = null;
        }

        @Override // java.lang.CharSequence
        public char charAt(int i) {
            return this.a[i];
        }

        @Override // java.lang.CharSequence
        public int length() {
            return this.a.length;
        }

        @Override // java.lang.CharSequence
        public CharSequence subSequence(int i, int i2) {
            return new String(this.a, i, i2 - i);
        }

        @Override // java.lang.CharSequence
        public String toString() {
            if (this.b == null) {
                this.b = new String(this.a);
            }
            return this.b;
        }
    }

    B(Appendable appendable) {
        this.a = appendable;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) throws IOException {
        this.a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        this.b.a(cArr);
        this.a.append(this.b, i, i2 + i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Appendable append(CharSequence charSequence) throws IOException {
        this.a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) throws IOException {
        this.a.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        this.a.append((char) i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        this.a.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        Objects.requireNonNull(str);
        this.a.append(str, i, i2 + i);
    }
}
