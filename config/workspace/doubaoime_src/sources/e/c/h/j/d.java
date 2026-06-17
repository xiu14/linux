package e.c.h.j;

import e.c.c.d.h;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes2.dex */
public class d {
    private int a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f9930c;

    /* renamed from: d, reason: collision with root package name */
    private int f9931d;

    /* renamed from: e, reason: collision with root package name */
    private final com.facebook.common.memory.a f9932e;

    public d(com.facebook.common.memory.a aVar) {
        Objects.requireNonNull(aVar);
        this.f9932e = aVar;
        this.a = 0;
        this.f9930c = -1;
    }

    private boolean a(InputStream inputStream) {
        int i;
        int read;
        int i2 = this.f9930c;
        while (this.a != -1 && (read = inputStream.read()) != -1) {
            try {
                int i3 = this.b + 1;
                this.b = i3;
                switch (this.a) {
                    case 0:
                    case 4:
                    case 6:
                        if (i3 == 13 && read != 86) {
                            this.a = -1;
                            break;
                        } else if (i3 == 14 && read != 80) {
                            this.a = -1;
                            break;
                        } else if (i3 == 15 && read != 56) {
                            this.a = -1;
                            break;
                        } else if (i3 == 16 && read != 88) {
                            this.a = -1;
                            break;
                        } else if (i3 == 21 && (read & 2) != 2) {
                            this.a = -1;
                            break;
                        } else if (read != 65) {
                            break;
                        } else {
                            this.a = 1;
                            break;
                        }
                        break;
                    case 1:
                        if (read != 78) {
                            this.a = 0;
                            break;
                        } else {
                            this.a = 2;
                            break;
                        }
                    case 2:
                        if (read != 73) {
                            if (read != 77) {
                                this.a = 0;
                                break;
                            } else {
                                this.a = 5;
                                break;
                            }
                        } else {
                            this.a = 3;
                            break;
                        }
                    case 3:
                        if (read != 77) {
                            this.a = 0;
                            break;
                        } else {
                            this.a = 4;
                            break;
                        }
                    case 5:
                        if (read != 70) {
                            this.a = 0;
                            break;
                        } else {
                            this.a = 6;
                            this.f9931d = i3;
                            this.f9930c++;
                            break;
                        }
                }
            } catch (IOException e2) {
                h.j(e2);
                throw new RuntimeException(e2);
            }
        }
        return (this.a == -1 || (i = this.f9930c) == i2 || i <= 0) ? false : true;
    }

    public int b() {
        return this.f9931d;
    }

    public int c() {
        return this.f9930c;
    }

    public boolean d(com.facebook.imagepipeline.image.f fVar) {
        if (this.a == -1 || fVar.I() <= this.b) {
            return false;
        }
        com.facebook.common.memory.f fVar2 = new com.facebook.common.memory.f(fVar.A(), this.f9932e.get(16384), this.f9932e);
        try {
            try {
                com.bytedance.feedbackerlib.a.M0(fVar2, this.b);
                return a(fVar2);
            } catch (IOException e2) {
                h.j(e2);
                throw new RuntimeException(e2);
            }
        } finally {
            e.c.c.d.a.b(fVar2);
        }
    }
}
