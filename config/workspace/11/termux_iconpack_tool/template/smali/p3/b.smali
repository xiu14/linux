.class public Lp3/b;
.super Lp3/a;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final A:Ljava/lang/Long;

.field public final B:Lcom/google/android/gms/internal/play_billing/zzbl;

.field public final a:Ljava/lang/Object;

.field public volatile b:I

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Landroid/os/Handler;

.field public volatile f:Lp3/i0;

.field public final g:Landroid/content/Context;

.field public final h:Lu2/c;

.field public volatile i:Lcom/google/android/gms/internal/play_billing/zzam;

.field public volatile j:Lp3/x;

.field public k:Z

.field public l:I

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:Z

.field public w:Z

.field public final x:Lk6/f;

.field public final y:Z

.field public z:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>(Lk6/f;Landroid/content/Context;La1/h;)V
    .locals 5

    .line 39
    const-string p3, "BillingClient"

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lp3/b;->a:Ljava/lang/Object;

    const/4 v0, 0x0

    iput v0, p0, Lp3/b;->b:I

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Lp3/b;->e:Landroid/os/Handler;

    iput v0, p0, Lp3/b;->l:I

    new-instance v1, Ljava/util/Random;

    .line 42
    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    invoke-virtual {v1}, Ljava/util/Random;->nextLong()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iput-object v3, p0, Lp3/b;->A:Ljava/lang/Long;

    .line 43
    sget-object v3, Lcom/google/android/gms/internal/play_billing/zzaz;->a:Lcom/google/android/gms/internal/play_billing/zzbl;

    .line 44
    iput-object v3, p0, Lp3/b;->B:Lcom/google/android/gms/internal/play_billing/zzbl;

    const-string v3, "8.0.0"

    iput-object v3, p0, Lp3/b;->c:Ljava/lang/String;

    .line 45
    invoke-static {}, Lp3/b;->z()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lp3/b;->d:Ljava/lang/String;

    .line 46
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    iput-object p2, p0, Lp3/b;->g:Landroid/content/Context;

    .line 47
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzis;->D()Lcom/google/android/gms/internal/play_billing/zziq;

    move-result-object p2

    .line 48
    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    iget-object v4, p2, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 49
    check-cast v4, Lcom/google/android/gms/internal/play_billing/zzis;

    invoke-static {v4}, Lcom/google/android/gms/internal/play_billing/zzis;->B(Lcom/google/android/gms/internal/play_billing/zzis;)V

    if-eqz v3, :cond_0

    .line 50
    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    iget-object v4, p2, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 51
    check-cast v4, Lcom/google/android/gms/internal/play_billing/zzis;

    invoke-static {v4, v3}, Lcom/google/android/gms/internal/play_billing/zzis;->C(Lcom/google/android/gms/internal/play_billing/zzis;Ljava/lang/String;)V

    .line 52
    :cond_0
    iget-object v3, p0, Lp3/b;->g:Landroid/content/Context;

    .line 53
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    .line 54
    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    iget-object v4, p2, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 55
    check-cast v4, Lcom/google/android/gms/internal/play_billing/zzis;

    invoke-static {v4, v3}, Lcom/google/android/gms/internal/play_billing/zzis;->z(Lcom/google/android/gms/internal/play_billing/zzis;Ljava/lang/String;)V

    .line 56
    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    iget-object v3, p2, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 57
    check-cast v3, Lcom/google/android/gms/internal/play_billing/zzis;

    invoke-static {v3, v1, v2}, Lcom/google/android/gms/internal/play_billing/zzis;->w(Lcom/google/android/gms/internal/play_billing/zzis;J)V

    .line 58
    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    iget-object v1, p2, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 59
    check-cast v1, Lcom/google/android/gms/internal/play_billing/zzis;

    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/zzis;->A(Lcom/google/android/gms/internal/play_billing/zzis;)V

    .line 60
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 61
    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    iget-object v2, p2, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 62
    check-cast v2, Lcom/google/android/gms/internal/play_billing/zzis;

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/play_billing/zzis;->t(Lcom/google/android/gms/internal/play_billing/zzis;I)V

    .line 63
    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/zziq;->i()V

    :try_start_0
    iget-object v1, p0, Lp3/b;->g:Landroid/content/Context;

    .line 64
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    iget-object v2, p0, Lp3/b;->g:Landroid/content/Context;

    .line 65
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 66
    invoke-virtual {v1, v2, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 67
    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    iget-object v1, p2, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 68
    check-cast v1, Lcom/google/android/gms/internal/play_billing/zzis;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/play_billing/zzis;->u(Lcom/google/android/gms/internal/play_billing/zzis;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 69
    const-string v1, "Error getting app version code."

    .line 70
    invoke-static {p3, v1, v0}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 71
    :goto_0
    iget-object v0, p0, Lp3/b;->g:Landroid/content/Context;

    .line 72
    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/zzfe;->e()Lcom/google/android/gms/internal/play_billing/zzfi;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/zzis;

    new-instance v1, Lu2/c;

    .line 73
    invoke-direct {v1, v0, p2}, Lu2/c;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/play_billing/zzis;)V

    iput-object v1, p0, Lp3/b;->h:Lu2/c;

    const-string p2, "Billing client should have a valid listener but the provided is null."

    .line 74
    invoke-static {p3, p2}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p2, Lp3/i0;

    iget-object p3, p0, Lp3/b;->g:Landroid/content/Context;

    const/4 v0, 0x0

    iget-object v1, p0, Lp3/b;->h:Lu2/c;

    .line 75
    invoke-direct {p2, p3, v0, v1}, Lp3/i0;-><init>(Landroid/content/Context;Lp3/o;Lu2/c;)V

    iput-object p2, p0, Lp3/b;->f:Lp3/i0;

    iput-object p1, p0, Lp3/b;->x:Lk6/f;

    iget-object p1, p0, Lp3/b;->g:Landroid/content/Context;

    .line 76
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lk6/f;Landroid/content/Context;Lp3/o;La1/h;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p4, Ljava/lang/Object;

    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lp3/b;->a:Ljava/lang/Object;

    const/4 p4, 0x0

    iput p4, p0, Lp3/b;->b:I

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lp3/b;->e:Landroid/os/Handler;

    iput p4, p0, Lp3/b;->l:I

    new-instance v0, Ljava/util/Random;

    .line 3
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iput-object v2, p0, Lp3/b;->A:Ljava/lang/Long;

    .line 4
    sget-object v2, Lcom/google/android/gms/internal/play_billing/zzaz;->a:Lcom/google/android/gms/internal/play_billing/zzbl;

    .line 5
    iput-object v2, p0, Lp3/b;->B:Lcom/google/android/gms/internal/play_billing/zzbl;

    const-string v2, "8.0.0"

    iput-object v2, p0, Lp3/b;->c:Ljava/lang/String;

    .line 6
    invoke-static {}, Lp3/b;->z()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lp3/b;->d:Ljava/lang/String;

    .line 7
    const-string v3, "BillingClient"

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    iput-object p2, p0, Lp3/b;->g:Landroid/content/Context;

    .line 8
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzis;->D()Lcom/google/android/gms/internal/play_billing/zziq;

    move-result-object p2

    .line 9
    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    iget-object v4, p2, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 10
    check-cast v4, Lcom/google/android/gms/internal/play_billing/zzis;

    invoke-static {v4}, Lcom/google/android/gms/internal/play_billing/zzis;->B(Lcom/google/android/gms/internal/play_billing/zzis;)V

    if-eqz v2, :cond_0

    .line 11
    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    iget-object v4, p2, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 12
    check-cast v4, Lcom/google/android/gms/internal/play_billing/zzis;

    invoke-static {v4, v2}, Lcom/google/android/gms/internal/play_billing/zzis;->C(Lcom/google/android/gms/internal/play_billing/zzis;Ljava/lang/String;)V

    .line 13
    :cond_0
    iget-object v2, p0, Lp3/b;->g:Landroid/content/Context;

    .line 14
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 15
    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    iget-object v4, p2, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 16
    check-cast v4, Lcom/google/android/gms/internal/play_billing/zzis;

    invoke-static {v4, v2}, Lcom/google/android/gms/internal/play_billing/zzis;->z(Lcom/google/android/gms/internal/play_billing/zzis;Ljava/lang/String;)V

    .line 17
    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    iget-object v2, p2, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 18
    check-cast v2, Lcom/google/android/gms/internal/play_billing/zzis;

    invoke-static {v2, v0, v1}, Lcom/google/android/gms/internal/play_billing/zzis;->w(Lcom/google/android/gms/internal/play_billing/zzis;J)V

    .line 19
    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    iget-object v0, p2, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 20
    check-cast v0, Lcom/google/android/gms/internal/play_billing/zzis;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/zzis;->A(Lcom/google/android/gms/internal/play_billing/zzis;)V

    .line 21
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 22
    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    iget-object v1, p2, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 23
    check-cast v1, Lcom/google/android/gms/internal/play_billing/zzis;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/play_billing/zzis;->t(Lcom/google/android/gms/internal/play_billing/zzis;I)V

    .line 24
    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/zziq;->i()V

    :try_start_0
    iget-object v0, p0, Lp3/b;->g:Landroid/content/Context;

    .line 25
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v1, p0, Lp3/b;->g:Landroid/content/Context;

    .line 26
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 27
    invoke-virtual {v0, v1, p4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 28
    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    iget-object v1, p2, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 29
    check-cast v1, Lcom/google/android/gms/internal/play_billing/zzis;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/play_billing/zzis;->u(Lcom/google/android/gms/internal/play_billing/zzis;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 30
    const-string v1, "Error getting app version code."

    .line 31
    invoke-static {v3, v1, v0}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 32
    :goto_0
    iget-object v0, p0, Lp3/b;->g:Landroid/content/Context;

    .line 33
    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/zzfe;->e()Lcom/google/android/gms/internal/play_billing/zzfi;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/zzis;

    new-instance v1, Lu2/c;

    .line 34
    invoke-direct {v1, v0, p2}, Lu2/c;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/play_billing/zzis;)V

    iput-object v1, p0, Lp3/b;->h:Lu2/c;

    if-nez p3, :cond_1

    .line 35
    const-string p2, "Billing client should have a valid listener but the provided is null."

    .line 36
    invoke-static {v3, p2}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    new-instance p2, Lp3/i0;

    iget-object v0, p0, Lp3/b;->g:Landroid/content/Context;

    iget-object v1, p0, Lp3/b;->h:Lu2/c;

    .line 37
    invoke-direct {p2, v0, p3, v1}, Lp3/i0;-><init>(Landroid/content/Context;Lp3/o;Lu2/c;)V

    iput-object p2, p0, Lp3/b;->f:Lp3/i0;

    iput-object p1, p0, Lp3/b;->x:Lk6/f;

    iput-boolean p4, p0, Lp3/b;->y:Z

    iget-object p1, p0, Lp3/b;->g:Landroid/content/Context;

    .line 38
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    return-void
.end method

.method public static h(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;
    .locals 2

    .line 1
    :try_start_0
    invoke-interface {p5, p0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    long-to-double p1, p1

    .line 6
    new-instance p5, Landroidx/recyclerview/widget/e;

    .line 7
    .line 8
    const/16 v0, 0xa

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {p5, p0, p3, v0, v1}, Landroidx/recyclerview/widget/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 12
    .line 13
    .line 14
    const-wide v0, 0x3fee666666666666L    # 0.95

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    mul-double p1, p1, v0

    .line 20
    .line 21
    double-to-long p1, p1

    .line 22
    invoke-virtual {p4, p5, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 23
    .line 24
    .line 25
    return-object p0

    .line 26
    :catch_0
    move-exception p0

    .line 27
    const-string p1, "BillingClient"

    .line 28
    .line 29
    const-string p2, "Async task throws exception!"

    .line 30
    .line 31
    invoke-static {p1, p2, p0}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    return-object p0
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
.end method

.method public static bridge synthetic s(Lp3/b;I)V
    .locals 2

    .line 1
    if-nez p1, :cond_3

    .line 2
    .line 3
    iget-object p1, p0, Lp3/b;->a:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter p1

    .line 6
    :try_start_0
    iget v0, p0, Lp3/b;->b:I

    .line 7
    .line 8
    const/4 v1, 0x3

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    monitor-exit p1

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const/4 v0, 0x2

    .line 16
    invoke-virtual {p0, v0}, Lp3/b;->m(I)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lp3/b;->f:Lp3/i0;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, Lp3/b;->f:Lp3/i0;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    iget-boolean p0, p0, Lp3/b;->u:Z

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Lp3/i0;->a(Z)V

    .line 33
    .line 34
    .line 35
    :cond_2
    return-void

    .line 36
    :goto_1
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    throw p0

    .line 38
    :cond_3
    const/4 p1, 0x0

    .line 39
    invoke-virtual {p0, p1}, Lp3/b;->m(I)V

    .line 40
    .line 41
    .line 42
    return-void
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method public static bridge synthetic t(Lp3/b;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lp3/b;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget p0, p0, Lp3/b;->b:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    if-ne p0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    :goto_0
    monitor-exit v0

    .line 12
    return v1

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    throw p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static z()Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-class v1, Lq3/a;

    .line 3
    .line 4
    const-string v2, "VERSION_NAME"

    .line 5
    .line 6
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    return-object v1

    .line 17
    :catch_0
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method


# virtual methods
.method public final A(Lp3/e;Lcom/google/android/gms/internal/play_billing/zzie;Ljava/lang/String;Ljava/lang/Exception;)Lu2/e;
    .locals 2

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    invoke-static {p4}, Lp3/d0;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0, p2, v0, p1, v1}, Lp3/b;->D(Lcom/google/android/gms/internal/play_billing/zzie;ILp3/e;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string p2, "BillingClient"

    .line 11
    .line 12
    invoke-static {p2, p3, p4}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    new-instance p2, Lu2/e;

    .line 16
    .line 17
    const/4 p3, 0x0

    .line 18
    invoke-direct {p2, p1, p3}, Lu2/e;-><init>(Lp3/e;Ljava/util/ArrayList;)V

    .line 19
    .line 20
    .line 21
    return-object p2
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
.end method

.method public final B(Lcom/google/android/gms/internal/play_billing/zzie;ILp3/e;)V
    .locals 2

    .line 1
    :try_start_0
    sget v0, Lp3/d0;->a:I

    .line 2
    .line 3
    sget-object v0, Lcom/google/android/gms/internal/play_billing/zzil;->i:Lcom/google/android/gms/internal/play_billing/zzil;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {p1, p2, p3, v1, v0}, Lp3/d0;->b(Lcom/google/android/gms/internal/play_billing/zzie;ILp3/e;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/zzil;)Lcom/google/android/gms/internal/play_billing/zzhx;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0, p1}, Lp3/b;->j(Lcom/google/android/gms/internal/play_billing/zzhx;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    const-string p2, "BillingClient"

    .line 16
    .line 17
    const-string p3, "Unable to log."

    .line 18
    .line 19
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method

.method public final C(Lcom/google/android/gms/internal/play_billing/zzie;Lp3/e;J)V
    .locals 5

    .line 1
    const-string v0, "Unable to log."

    .line 2
    .line 3
    const-string v1, "BillingClient"

    .line 4
    .line 5
    :try_start_0
    sget v2, Lp3/d0;->a:I

    .line 6
    .line 7
    sget-object v2, Lcom/google/android/gms/internal/play_billing/zzil;->i:Lcom/google/android/gms/internal/play_billing/zzil;

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x0

    .line 11
    invoke-static {p1, v3, p2, v4, v2}, Lp3/d0;->b(Lcom/google/android/gms/internal/play_billing/zzie;ILp3/e;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/zzil;)Lcom/google/android/gms/internal/play_billing/zzhx;

    .line 12
    .line 13
    .line 14
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    :try_start_1
    iget-object p2, p0, Lp3/b;->h:Lu2/c;

    .line 16
    .line 17
    iget v2, p0, Lp3/b;->l:I

    .line 18
    .line 19
    invoke-virtual {p2, p1, v2, p3, p4}, Lu2/c;->k(Lcom/google/android/gms/internal/play_billing/zzhx;IJ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    :try_start_2
    invoke-static {v1, v0, p1}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catchall_1
    move-exception p1

    .line 29
    invoke-static {v1, v0, p1}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method

.method public final D(Lcom/google/android/gms/internal/play_billing/zzie;ILp3/e;Ljava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    sget v0, Lp3/d0;->a:I

    .line 2
    .line 3
    sget-object v0, Lcom/google/android/gms/internal/play_billing/zzil;->i:Lcom/google/android/gms/internal/play_billing/zzil;

    .line 4
    .line 5
    invoke-static {p1, p2, p3, p4, v0}, Lp3/d0;->b(Lcom/google/android/gms/internal/play_billing/zzie;ILp3/e;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/zzil;)Lcom/google/android/gms/internal/play_billing/zzhx;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lp3/b;->j(Lcom/google/android/gms/internal/play_billing/zzhx;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    const-string p2, "BillingClient"

    .line 15
    .line 16
    const-string p3, "Unable to log."

    .line 17
    .line 18
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
.end method

.method public final E(Lcom/google/android/gms/internal/play_billing/zzie;Lp3/e;JZ)V
    .locals 11

    .line 1
    const-string v1, "Unable to log."

    .line 2
    .line 3
    const-string v2, "BillingClient"

    .line 4
    .line 5
    :try_start_0
    sget v0, Lp3/d0;->a:I

    .line 6
    .line 7
    sget-object v0, Lcom/google/android/gms/internal/play_billing/zzil;->i:Lcom/google/android/gms/internal/play_billing/zzil;

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x0

    .line 11
    invoke-static {p1, v3, p2, v4, v0}, Lp3/d0;->b(Lcom/google/android/gms/internal/play_billing/zzie;ILp3/e;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/zzil;)Lcom/google/android/gms/internal/play_billing/zzhx;

    .line 12
    .line 13
    .line 14
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    :try_start_1
    iget-object v5, p0, Lp3/b;->h:Lu2/c;

    .line 16
    .line 17
    iget v7, p0, Lp3/b;->l:I

    .line 18
    .line 19
    move-wide v8, p3

    .line 20
    move/from16 v10, p5

    .line 21
    .line 22
    invoke-virtual/range {v5 .. v10}, Lu2/c;->n(Lcom/google/android/gms/internal/play_billing/zzhx;IJZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    move-object p1, v0

    .line 28
    :try_start_2
    invoke-static {v2, v1, p1}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 29
    .line 30
    .line 31
    :goto_0
    return-void

    .line 32
    :catchall_1
    move-exception v0

    .line 33
    move-object p1, v0

    .line 34
    invoke-static {v2, v1, p1}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    return-void
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
.end method

.method public final F(Lcom/google/android/gms/internal/play_billing/zzie;Lp3/e;Ljava/lang/String;JZ)V
    .locals 4

    .line 1
    const-string v1, "Unable to log."

    .line 2
    .line 3
    const-string v2, "BillingClient"

    .line 4
    .line 5
    :try_start_0
    sget v0, Lp3/d0;->a:I

    .line 6
    .line 7
    sget-object v0, Lcom/google/android/gms/internal/play_billing/zzil;->i:Lcom/google/android/gms/internal/play_billing/zzil;

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    invoke-static {p1, v3, p2, p3, v0}, Lp3/d0;->b(Lcom/google/android/gms/internal/play_billing/zzie;ILp3/e;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/zzil;)Lcom/google/android/gms/internal/play_billing/zzhx;

    .line 11
    .line 12
    .line 13
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 14
    :try_start_1
    iget-object p1, p0, Lp3/b;->h:Lu2/c;

    .line 15
    .line 16
    iget p3, p0, Lp3/b;->l:I

    .line 17
    .line 18
    invoke-virtual/range {p1 .. p6}, Lu2/c;->n(Lcom/google/android/gms/internal/play_billing/zzhx;IJZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    move-object p1, v0

    .line 24
    :try_start_2
    invoke-static {v2, v1, p1}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 25
    .line 26
    .line 27
    :goto_0
    return-void

    .line 28
    :catchall_1
    move-exception v0

    .line 29
    move-object p1, v0

    .line 30
    invoke-static {v2, v1, p1}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
.end method

.method public final G(Lp3/e;)V
    .locals 3

    .line 1
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Landroidx/recyclerview/widget/e;

    .line 9
    .line 10
    const/16 v1, 0x9

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, p0, p1, v1, v2}, Landroidx/recyclerview/widget/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lp3/b;->e:Landroid/os/Handler;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public a(La1/q;Lp3/f;)V
    .locals 6

    .line 1
    new-instance v0, Lp3/u;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, p2, v1}, Lp3/u;-><init>(Lp3/b;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    new-instance v3, Lj0/k;

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    invoke-direct {v3, p0, p1, p2, v1}, Lj0/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lp3/b;->u()Landroid/os/Handler;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-virtual {p0}, Lp3/b;->g()Ljava/util/concurrent/ExecutorService;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    const-wide/16 v1, 0x7530

    .line 22
    .line 23
    invoke-static/range {v0 .. v5}, Lp3/b;->h(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Lp3/b;->x()Lp3/e;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sget-object v1, Lcom/google/android/gms/internal/play_billing/zzie;->G:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 34
    .line 35
    const/4 v2, 0x4

    .line 36
    invoke-virtual {p0, v1, v2, v0}, Lp3/b;->B(Lcom/google/android/gms/internal/play_billing/zzie;ILp3/e;)V

    .line 37
    .line 38
    .line 39
    iget-object p2, p2, Lp3/f;->a:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {p1, v0, p2}, La1/q;->E(Lp3/e;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method public b()V
    .locals 5

    .line 1
    :try_start_0
    sget v0, Lp3/d0;->a:I

    .line 2
    .line 3
    sget-object v0, Lcom/google/android/gms/internal/play_billing/zzil;->i:Lcom/google/android/gms/internal/play_billing/zzil;

    .line 4
    .line 5
    const/16 v1, 0xc

    .line 6
    .line 7
    invoke-static {v1, v0}, Lp3/d0;->c(ILcom/google/android/gms/internal/play_billing/zzil;)Lcom/google/android/gms/internal/play_billing/zzib;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, v0}, Lp3/b;->k(Lcom/google/android/gms/internal/play_billing/zzib;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    const-string v1, "BillingClient"

    .line 17
    .line 18
    const-string v2, "Unable to log."

    .line 19
    .line 20
    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    iget-object v0, p0, Lp3/b;->a:Ljava/lang/Object;

    .line 24
    .line 25
    monitor-enter v0

    .line 26
    :try_start_1
    iget-object v1, p0, Lp3/b;->f:Lp3/i0;

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    iget-object v1, p0, Lp3/b;->f:Lp3/i0;

    .line 31
    .line 32
    iget-object v2, v1, Lp3/i0;->d:Lp3/h0;

    .line 33
    .line 34
    iget-object v3, v1, Lp3/i0;->a:Landroid/content/Context;

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Lp3/h0;->b(Landroid/content/Context;)V

    .line 37
    .line 38
    .line 39
    iget-object v1, v1, Lp3/i0;->e:Lp3/h0;

    .line 40
    .line 41
    invoke-virtual {v1, v3}, Lp3/h0;->b(Landroid/content/Context;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :catchall_1
    move-exception v1

    .line 46
    :try_start_2
    const-string v2, "BillingClient"

    .line 47
    .line 48
    const-string v3, "There was an exception while shutting down broadcast manager while ending connection!"

    .line 49
    .line 50
    invoke-static {v2, v3, v1}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 51
    .line 52
    .line 53
    :cond_0
    :goto_1
    :try_start_3
    const-string v1, "BillingClient"

    .line 54
    .line 55
    const-string v2, "Unbinding from service."

    .line 56
    .line 57
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/zzc;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lp3/b;->p()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :catchall_2
    move-exception v1

    .line 65
    :try_start_4
    const-string v2, "BillingClient"

    .line 66
    .line 67
    const-string v3, "There was an exception while unbinding from the service while ending connection!"

    .line 68
    .line 69
    invoke-static {v2, v3, v1}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 70
    .line 71
    .line 72
    :goto_2
    const/4 v1, 0x3

    .line 73
    :try_start_5
    invoke-virtual {p0}, Lp3/b;->n()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 74
    .line 75
    .line 76
    :goto_3
    :try_start_6
    invoke-virtual {p0, v1}, Lp3/b;->m(I)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 77
    .line 78
    .line 79
    goto :goto_4

    .line 80
    :catchall_3
    move-exception v1

    .line 81
    goto :goto_5

    .line 82
    :catchall_4
    move-exception v2

    .line 83
    :try_start_7
    const-string v3, "BillingClient"

    .line 84
    .line 85
    const-string v4, "There was an exception while shutting down the executor service while ending connection!"

    .line 86
    .line 87
    invoke-static {v3, v4, v2}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 88
    .line 89
    .line 90
    goto :goto_3

    .line 91
    :goto_4
    :try_start_8
    monitor-exit v0

    .line 92
    return-void

    .line 93
    :catchall_5
    move-exception v2

    .line 94
    invoke-virtual {p0, v1}, Lp3/b;->m(I)V

    .line 95
    .line 96
    .line 97
    throw v2

    .line 98
    :goto_5
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 99
    throw v1
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public c(Landroid/app/Activity;Landroidx/room/z;)Lp3/e;
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v5, p2

    .line 4
    .line 5
    new-instance v0, Ljava/util/Random;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    iget-object v0, v1, Lp3/b;->f:Lp3/i0;

    .line 15
    .line 16
    if-eqz v0, :cond_4d

    .line 17
    .line 18
    iget-object v0, v1, Lp3/b;->f:Lp3/i0;

    .line 19
    .line 20
    iget-object v0, v0, Lp3/i0;->b:Lp3/o;

    .line 21
    .line 22
    if-eqz v0, :cond_4d

    .line 23
    .line 24
    const-string v4, "BillingClient"

    .line 25
    .line 26
    const-string v0, "Reconnection failed with result: "

    .line 27
    .line 28
    const-string v6, "Reconnection succeeded with result: "

    .line 29
    .line 30
    :try_start_0
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 31
    .line 32
    const/16 v9, 0x1d

    .line 33
    .line 34
    if-ge v8, v9, :cond_0

    .line 35
    .line 36
    const-wide/16 v8, 0x0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const-wide/16 v8, 0xbb8

    .line 40
    .line 41
    :goto_0
    const-string v10, "BillingClient"

    .line 42
    .line 43
    const-string v11, "Already connected or not opted into auto reconnection."

    .line 44
    .line 45
    invoke-static {v10, v11}, Lcom/google/android/gms/internal/play_billing/zzc;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    sget-object v10, Lp3/f0;->g:Lp3/e;

    .line 49
    .line 50
    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/zzcu;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/zzcz;

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    sget-object v11, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 55
    .line 56
    invoke-interface {v10, v8, v9, v11}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    check-cast v8, Lp3/e;

    .line 61
    .line 62
    iget v8, v8, Lp3/e;->a:I

    .line 63
    .line 64
    if-nez v8, :cond_1

    .line 65
    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v4, v0}, Lcom/google/android/gms/internal/play_billing/zzc;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :catch_0
    move-exception v0

    .line 83
    goto :goto_1

    .line 84
    :cond_1
    new-instance v6, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {v4, v0}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :goto_1
    instance-of v6, v0, Ljava/lang/InterruptedException;

    .line 101
    .line 102
    if-eqz v6, :cond_2

    .line 103
    .line 104
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-virtual {v6}, Ljava/lang/Thread;->interrupt()V

    .line 109
    .line 110
    .line 111
    :cond_2
    const-string v6, "Error during reconnection attempt: "

    .line 112
    .line 113
    invoke-static {v4, v6, v0}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    :goto_2
    invoke-virtual {v1}, Lp3/b;->r()Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-nez v0, :cond_3

    .line 121
    .line 122
    sget-object v0, Lcom/google/android/gms/internal/play_billing/zzie;->j:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 123
    .line 124
    sget-object v4, Lp3/f0;->h:Lp3/e;

    .line 125
    .line 126
    invoke-virtual {v1, v0, v4, v2, v3}, Lp3/b;->C(Lcom/google/android/gms/internal/play_billing/zzie;Lp3/e;J)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v4}, Lp3/b;->G(Lp3/e;)V

    .line 130
    .line 131
    .line 132
    return-object v4

    .line 133
    :cond_3
    iget-object v4, v1, Lp3/b;->a:Ljava/lang/Object;

    .line 134
    .line 135
    monitor-enter v4

    .line 136
    :try_start_1
    iget-object v0, v1, Lp3/b;->j:Lp3/x;

    .line 137
    .line 138
    if-eqz v0, :cond_4

    .line 139
    .line 140
    iget-object v0, v1, Lp3/b;->j:Lp3/x;

    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    goto :goto_3

    .line 146
    :catchall_0
    move-exception v0

    .line 147
    goto/16 :goto_2b

    .line 148
    .line 149
    :cond_4
    :goto_3
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 150
    new-instance v0, Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 153
    .line 154
    .line 155
    iget-object v4, v5, Landroidx/room/z;->b:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v4, Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 160
    .line 161
    .line 162
    iget-object v4, v5, Landroidx/room/z;->d:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v4, Lcom/google/android/gms/internal/play_billing/zzbt;

    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v8

    .line 174
    if-eqz v8, :cond_5

    .line 175
    .line 176
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    goto :goto_4

    .line 181
    :cond_5
    const/4 v6, 0x0

    .line 182
    :goto_4
    if-nez v6, :cond_4c

    .line 183
    .line 184
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v8

    .line 192
    if-eqz v8, :cond_6

    .line 193
    .line 194
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    goto :goto_5

    .line 199
    :cond_6
    const/4 v6, 0x0

    .line 200
    :goto_5
    check-cast v6, Lp3/d;

    .line 201
    .line 202
    iget-object v8, v6, Lp3/d;->a:Lp3/l;

    .line 203
    .line 204
    move-object v10, v4

    .line 205
    move-wide/from16 v27, v2

    .line 206
    .line 207
    move-object v2, v5

    .line 208
    move-wide/from16 v4, v27

    .line 209
    .line 210
    iget-object v3, v8, Lp3/l;->c:Ljava/lang/String;

    .line 211
    .line 212
    iget-object v8, v8, Lp3/l;->d:Ljava/lang/String;

    .line 213
    .line 214
    const-string v11, "subs"

    .line 215
    .line 216
    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v11

    .line 220
    move-object v12, v6

    .line 221
    const/4 v6, 0x0

    .line 222
    if-eqz v11, :cond_8

    .line 223
    .line 224
    iget-boolean v11, v1, Lp3/b;->k:Z

    .line 225
    .line 226
    if-eqz v11, :cond_7

    .line 227
    .line 228
    goto :goto_6

    .line 229
    :cond_7
    const-string v0, "BillingClient"

    .line 230
    .line 231
    const-string v2, "Current client doesn\'t support subscriptions."

    .line 232
    .line 233
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    sget-object v2, Lcom/google/android/gms/internal/play_billing/zzie;->q:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 237
    .line 238
    sget-object v3, Lp3/f0;->j:Lp3/e;

    .line 239
    .line 240
    invoke-virtual/range {v1 .. v6}, Lp3/b;->E(Lcom/google/android/gms/internal/play_billing/zzie;Lp3/e;JZ)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1, v3}, Lp3/b;->G(Lp3/e;)V

    .line 244
    .line 245
    .line 246
    return-object v3

    .line 247
    :cond_8
    :goto_6
    iget-object v11, v2, Landroidx/room/z;->c:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v11, Lk6/f;

    .line 250
    .line 251
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    iget-boolean v11, v2, Landroidx/room/z;->a:Z

    .line 255
    .line 256
    const/4 v13, 0x0

    .line 257
    if-nez v11, :cond_9

    .line 258
    .line 259
    iget-object v11, v2, Landroidx/room/z;->d:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v11, Lcom/google/android/gms/internal/play_billing/zzbt;

    .line 262
    .line 263
    if-eqz v11, :cond_a

    .line 264
    .line 265
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 266
    .line 267
    .line 268
    move-result v14

    .line 269
    const/4 v15, 0x0

    .line 270
    :goto_7
    if-ge v15, v14, :cond_a

    .line 271
    .line 272
    invoke-interface {v11, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v16

    .line 276
    check-cast v16, Lp3/d;

    .line 277
    .line 278
    add-int/lit8 v15, v15, 0x1

    .line 279
    .line 280
    goto :goto_7

    .line 281
    :cond_9
    iget-boolean v11, v1, Lp3/b;->m:Z

    .line 282
    .line 283
    if-eqz v11, :cond_4b

    .line 284
    .line 285
    :cond_a
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 286
    .line 287
    .line 288
    move-result v11

    .line 289
    const/4 v14, 0x1

    .line 290
    if-le v11, v14, :cond_c

    .line 291
    .line 292
    iget-boolean v11, v1, Lp3/b;->q:Z

    .line 293
    .line 294
    if-eqz v11, :cond_b

    .line 295
    .line 296
    goto :goto_8

    .line 297
    :cond_b
    const-string v0, "BillingClient"

    .line 298
    .line 299
    const-string v2, "Current client doesn\'t support multi-item purchases."

    .line 300
    .line 301
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    sget-object v2, Lcom/google/android/gms/internal/play_billing/zzie;->A:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 305
    .line 306
    sget-object v3, Lp3/f0;->k:Lp3/e;

    .line 307
    .line 308
    invoke-virtual/range {v1 .. v6}, Lp3/b;->E(Lcom/google/android/gms/internal/play_billing/zzie;Lp3/e;JZ)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v1, v3}, Lp3/b;->G(Lp3/e;)V

    .line 312
    .line 313
    .line 314
    return-object v3

    .line 315
    :cond_c
    :goto_8
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 316
    .line 317
    .line 318
    move-result v11

    .line 319
    if-nez v11, :cond_e

    .line 320
    .line 321
    iget-boolean v11, v1, Lp3/b;->r:Z

    .line 322
    .line 323
    if-eqz v11, :cond_d

    .line 324
    .line 325
    goto :goto_9

    .line 326
    :cond_d
    const-string v0, "BillingClient"

    .line 327
    .line 328
    const-string v2, "Current client doesn\'t support purchases with ProductDetails."

    .line 329
    .line 330
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    sget-object v2, Lcom/google/android/gms/internal/play_billing/zzie;->B:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 334
    .line 335
    sget-object v3, Lp3/f0;->m:Lp3/e;

    .line 336
    .line 337
    invoke-virtual/range {v1 .. v6}, Lp3/b;->E(Lcom/google/android/gms/internal/play_billing/zzie;Lp3/e;JZ)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v1, v3}, Lp3/b;->G(Lp3/e;)V

    .line 341
    .line 342
    .line 343
    return-object v3

    .line 344
    :cond_e
    :goto_9
    const-string v11, "packageName"

    .line 345
    .line 346
    const-string v15, "."

    .line 347
    .line 348
    const-string v6, "play_pass_subs"

    .line 349
    .line 350
    iget-object v14, v2, Landroidx/room/z;->d:Ljava/lang/Object;

    .line 351
    .line 352
    check-cast v14, Lcom/google/android/gms/internal/play_billing/zzbt;

    .line 353
    .line 354
    invoke-virtual {v14}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 355
    .line 356
    .line 357
    move-result v14

    .line 358
    if-eqz v14, :cond_f

    .line 359
    .line 360
    sget-object v6, Lp3/f0;->g:Lp3/e;

    .line 361
    .line 362
    move-object/from16 v19, v3

    .line 363
    .line 364
    move-wide/from16 v20, v4

    .line 365
    .line 366
    move-object v3, v6

    .line 367
    move-object/from16 v22, v8

    .line 368
    .line 369
    const/16 v17, 0x0

    .line 370
    .line 371
    goto/16 :goto_11

    .line 372
    .line 373
    :cond_f
    iget-object v14, v2, Landroidx/room/z;->d:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v14, Lcom/google/android/gms/internal/play_billing/zzbt;

    .line 376
    .line 377
    invoke-interface {v14, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v14

    .line 381
    check-cast v14, Lp3/d;

    .line 382
    .line 383
    const/4 v13, 0x1

    .line 384
    const/16 v17, 0x0

    .line 385
    .line 386
    :goto_a
    iget-object v9, v2, Landroidx/room/z;->d:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast v9, Lcom/google/android/gms/internal/play_billing/zzbt;

    .line 389
    .line 390
    invoke-virtual {v9}, Ljava/util/AbstractCollection;->size()I

    .line 391
    .line 392
    .line 393
    move-result v9

    .line 394
    if-ge v13, v9, :cond_12

    .line 395
    .line 396
    iget-object v9, v2, Landroidx/room/z;->d:Ljava/lang/Object;

    .line 397
    .line 398
    check-cast v9, Lcom/google/android/gms/internal/play_billing/zzbt;

    .line 399
    .line 400
    invoke-interface {v9, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v9

    .line 404
    check-cast v9, Lp3/d;

    .line 405
    .line 406
    iget-object v1, v9, Lp3/d;->a:Lp3/l;

    .line 407
    .line 408
    iget-object v1, v1, Lp3/l;->d:Ljava/lang/String;

    .line 409
    .line 410
    move-object/from16 v19, v3

    .line 411
    .line 412
    iget-object v3, v14, Lp3/d;->a:Lp3/l;

    .line 413
    .line 414
    iget-object v3, v3, Lp3/l;->d:Ljava/lang/String;

    .line 415
    .line 416
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    move-result v1

    .line 420
    if-nez v1, :cond_11

    .line 421
    .line 422
    iget-object v1, v9, Lp3/d;->a:Lp3/l;

    .line 423
    .line 424
    iget-object v1, v1, Lp3/l;->d:Ljava/lang/String;

    .line 425
    .line 426
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 427
    .line 428
    .line 429
    move-result v1

    .line 430
    if-eqz v1, :cond_10

    .line 431
    .line 432
    goto :goto_b

    .line 433
    :cond_10
    const-string v1, "All products should have same ProductType."

    .line 434
    .line 435
    const/4 v3, 0x5

    .line 436
    invoke-static {v3, v1}, Lp3/f0;->a(ILjava/lang/String;)Lp3/e;

    .line 437
    .line 438
    .line 439
    move-result-object v6

    .line 440
    move-wide/from16 v20, v4

    .line 441
    .line 442
    move-object v3, v6

    .line 443
    move-object/from16 v22, v8

    .line 444
    .line 445
    goto/16 :goto_11

    .line 446
    .line 447
    :cond_11
    :goto_b
    add-int/lit8 v13, v13, 0x1

    .line 448
    .line 449
    move-object/from16 v1, p0

    .line 450
    .line 451
    move-object/from16 v3, v19

    .line 452
    .line 453
    goto :goto_a

    .line 454
    :cond_12
    move-object/from16 v19, v3

    .line 455
    .line 456
    iget-object v1, v14, Lp3/d;->a:Lp3/l;

    .line 457
    .line 458
    iget-object v3, v1, Lp3/l;->b:Lorg/json/JSONObject;

    .line 459
    .line 460
    invoke-virtual {v3, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v3

    .line 464
    new-instance v9, Ljava/util/HashMap;

    .line 465
    .line 466
    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 467
    .line 468
    .line 469
    new-instance v13, Ljava/util/HashSet;

    .line 470
    .line 471
    invoke-direct {v13}, Ljava/util/HashSet;-><init>()V

    .line 472
    .line 473
    .line 474
    move-wide/from16 v20, v4

    .line 475
    .line 476
    iget-object v4, v2, Landroidx/room/z;->d:Ljava/lang/Object;

    .line 477
    .line 478
    check-cast v4, Lcom/google/android/gms/internal/play_billing/zzbt;

    .line 479
    .line 480
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 481
    .line 482
    .line 483
    move-result v5

    .line 484
    move-object/from16 v22, v8

    .line 485
    .line 486
    const/4 v8, 0x0

    .line 487
    :goto_c
    if-ge v8, v5, :cond_18

    .line 488
    .line 489
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v23

    .line 493
    move-object/from16 v24, v4

    .line 494
    .line 495
    move-object/from16 v4, v23

    .line 496
    .line 497
    check-cast v4, Lp3/d;

    .line 498
    .line 499
    move/from16 v23, v5

    .line 500
    .line 501
    iget-object v5, v4, Lp3/d;->a:Lp3/l;

    .line 502
    .line 503
    move/from16 v25, v8

    .line 504
    .line 505
    iget-object v8, v5, Lp3/l;->c:Ljava/lang/String;

    .line 506
    .line 507
    move-object/from16 v26, v13

    .line 508
    .line 509
    iget-object v13, v5, Lp3/l;->c:Ljava/lang/String;

    .line 510
    .line 511
    iget-object v7, v5, Lp3/l;->h:Ljava/util/ArrayList;

    .line 512
    .line 513
    if-eqz v7, :cond_13

    .line 514
    .line 515
    iget-object v7, v4, Lp3/d;->b:Ljava/lang/String;

    .line 516
    .line 517
    if-eqz v7, :cond_14

    .line 518
    .line 519
    :cond_13
    const/4 v7, 0x5

    .line 520
    goto :goto_e

    .line 521
    :cond_14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 522
    .line 523
    const-string v3, "offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: "

    .line 524
    .line 525
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v1

    .line 535
    const/4 v7, 0x5

    .line 536
    invoke-static {v7, v1}, Lp3/f0;->a(ILjava/lang/String;)Lp3/e;

    .line 537
    .line 538
    .line 539
    move-result-object v6

    .line 540
    :goto_d
    move-object v3, v6

    .line 541
    goto/16 :goto_11

    .line 542
    .line 543
    :goto_e
    invoke-virtual {v9, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    move-result v8

    .line 547
    if-eqz v8, :cond_15

    .line 548
    .line 549
    new-instance v1, Ljava/lang/StringBuilder;

    .line 550
    .line 551
    const-string v3, "ProductId can not be duplicated. Invalid product id: "

    .line 552
    .line 553
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 557
    .line 558
    .line 559
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    move-result-object v1

    .line 566
    invoke-static {v7, v1}, Lp3/f0;->a(ILjava/lang/String;)Lp3/e;

    .line 567
    .line 568
    .line 569
    move-result-object v6

    .line 570
    goto :goto_d

    .line 571
    :cond_15
    invoke-virtual {v9, v13, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    iget-object v4, v1, Lp3/l;->d:Ljava/lang/String;

    .line 575
    .line 576
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 577
    .line 578
    .line 579
    move-result v4

    .line 580
    if-nez v4, :cond_17

    .line 581
    .line 582
    iget-object v4, v5, Lp3/l;->d:Ljava/lang/String;

    .line 583
    .line 584
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 585
    .line 586
    .line 587
    move-result v4

    .line 588
    if-nez v4, :cond_17

    .line 589
    .line 590
    iget-object v4, v5, Lp3/l;->b:Lorg/json/JSONObject;

    .line 591
    .line 592
    invoke-virtual {v4, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v4

    .line 596
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 597
    .line 598
    .line 599
    move-result v4

    .line 600
    if-eqz v4, :cond_16

    .line 601
    .line 602
    goto :goto_f

    .line 603
    :cond_16
    const-string v1, "All products must have the same package name."

    .line 604
    .line 605
    const/4 v3, 0x5

    .line 606
    invoke-static {v3, v1}, Lp3/f0;->a(ILjava/lang/String;)Lp3/e;

    .line 607
    .line 608
    .line 609
    move-result-object v6

    .line 610
    goto :goto_d

    .line 611
    :cond_17
    :goto_f
    add-int/lit8 v8, v25, 0x1

    .line 612
    .line 613
    move/from16 v5, v23

    .line 614
    .line 615
    move-object/from16 v4, v24

    .line 616
    .line 617
    move-object/from16 v13, v26

    .line 618
    .line 619
    goto/16 :goto_c

    .line 620
    .line 621
    :cond_18
    move-object/from16 v26, v13

    .line 622
    .line 623
    invoke-virtual/range {v26 .. v26}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 624
    .line 625
    .line 626
    move-result-object v3

    .line 627
    :cond_19
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 628
    .line 629
    .line 630
    move-result v4

    .line 631
    if-eqz v4, :cond_1a

    .line 632
    .line 633
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v4

    .line 637
    check-cast v4, Ljava/lang/String;

    .line 638
    .line 639
    invoke-virtual {v9, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 640
    .line 641
    .line 642
    move-result v5

    .line 643
    if-eqz v5, :cond_19

    .line 644
    .line 645
    invoke-virtual {v9, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 646
    .line 647
    .line 648
    move-result-object v1

    .line 649
    check-cast v1, Lp3/d;

    .line 650
    .line 651
    new-instance v1, Ljava/lang/StringBuilder;

    .line 652
    .line 653
    const-string v3, "OldProductId must not be one of the products to be purchased. Invalid old product id: "

    .line 654
    .line 655
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 659
    .line 660
    .line 661
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 662
    .line 663
    .line 664
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 665
    .line 666
    .line 667
    move-result-object v1

    .line 668
    const/4 v3, 0x5

    .line 669
    invoke-static {v3, v1}, Lp3/f0;->a(ILjava/lang/String;)Lp3/e;

    .line 670
    .line 671
    .line 672
    move-result-object v6

    .line 673
    goto/16 :goto_d

    .line 674
    .line 675
    :cond_1a
    iget-object v1, v1, Lp3/l;->i:Ljava/util/ArrayList;

    .line 676
    .line 677
    iget-object v3, v14, Lp3/d;->b:Ljava/lang/String;

    .line 678
    .line 679
    if-eqz v3, :cond_1d

    .line 680
    .line 681
    if-eqz v1, :cond_1d

    .line 682
    .line 683
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 684
    .line 685
    .line 686
    move-result v4

    .line 687
    const/4 v5, 0x0

    .line 688
    :cond_1b
    if-ge v5, v4, :cond_1c

    .line 689
    .line 690
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    move-result-object v6

    .line 694
    add-int/lit8 v5, v5, 0x1

    .line 695
    .line 696
    check-cast v6, Lp3/h;

    .line 697
    .line 698
    iget-object v7, v6, Lp3/h;->c:Ljava/lang/String;

    .line 699
    .line 700
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 701
    .line 702
    .line 703
    move-result v7

    .line 704
    if-eqz v7, :cond_1b

    .line 705
    .line 706
    goto :goto_10

    .line 707
    :cond_1c
    move-object/from16 v6, v17

    .line 708
    .line 709
    :goto_10
    if-eqz v6, :cond_1d

    .line 710
    .line 711
    iget-object v1, v6, Lp3/h;->f:Lk6/f;

    .line 712
    .line 713
    if-eqz v1, :cond_1d

    .line 714
    .line 715
    const-string v1, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay."

    .line 716
    .line 717
    const/4 v3, 0x5

    .line 718
    invoke-static {v3, v1}, Lp3/f0;->a(ILjava/lang/String;)Lp3/e;

    .line 719
    .line 720
    .line 721
    move-result-object v6

    .line 722
    goto/16 :goto_d

    .line 723
    .line 724
    :cond_1d
    sget-object v6, Lp3/f0;->g:Lp3/e;

    .line 725
    .line 726
    goto/16 :goto_d

    .line 727
    .line 728
    :goto_11
    sget-object v1, Lp3/f0;->g:Lp3/e;

    .line 729
    .line 730
    if-eq v3, v1, :cond_1e

    .line 731
    .line 732
    sget-object v2, Lcom/google/android/gms/internal/play_billing/zzie;->l1:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 733
    .line 734
    const/4 v6, 0x0

    .line 735
    move-object/from16 v1, p0

    .line 736
    .line 737
    move-wide/from16 v4, v20

    .line 738
    .line 739
    invoke-virtual/range {v1 .. v6}, Lp3/b;->E(Lcom/google/android/gms/internal/play_billing/zzie;Lp3/e;JZ)V

    .line 740
    .line 741
    .line 742
    invoke-virtual {v1, v3}, Lp3/b;->G(Lp3/e;)V

    .line 743
    .line 744
    .line 745
    return-object v3

    .line 746
    :cond_1e
    const/4 v6, 0x0

    .line 747
    move-object/from16 v1, p0

    .line 748
    .line 749
    move-wide/from16 v4, v20

    .line 750
    .line 751
    iget-boolean v3, v1, Lp3/b;->m:Z

    .line 752
    .line 753
    if-eqz v3, :cond_43

    .line 754
    .line 755
    iget-boolean v3, v1, Lp3/b;->n:Z

    .line 756
    .line 757
    iget-object v7, v1, Lp3/b;->x:Lk6/f;

    .line 758
    .line 759
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 760
    .line 761
    .line 762
    iget-object v7, v1, Lp3/b;->x:Lk6/f;

    .line 763
    .line 764
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 765
    .line 766
    .line 767
    iget-boolean v7, v1, Lp3/b;->y:Z

    .line 768
    .line 769
    iget-object v8, v1, Lp3/b;->c:Ljava/lang/String;

    .line 770
    .line 771
    iget-object v9, v1, Lp3/b;->d:Ljava/lang/String;

    .line 772
    .line 773
    iget-object v11, v1, Lp3/b;->A:Ljava/lang/Long;

    .line 774
    .line 775
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 776
    .line 777
    .line 778
    move-result-wide v13

    .line 779
    iget-object v11, v1, Lp3/b;->g:Landroid/content/Context;

    .line 780
    .line 781
    invoke-virtual {v11}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 782
    .line 783
    .line 784
    sget v11, Lcom/google/android/gms/internal/play_billing/zzc;->a:I

    .line 785
    .line 786
    const/16 v16, 0x0

    .line 787
    .line 788
    new-instance v6, Landroid/os/Bundle;

    .line 789
    .line 790
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 791
    .line 792
    .line 793
    invoke-static {v6, v8, v9, v13, v14}, Lcom/google/android/gms/internal/play_billing/zzc;->b(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;J)V

    .line 794
    .line 795
    .line 796
    const-string v8, "billingClientTransactionId"

    .line 797
    .line 798
    invoke-virtual {v6, v8, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 799
    .line 800
    .line 801
    iget-object v8, v2, Landroidx/room/z;->c:Ljava/lang/Object;

    .line 802
    .line 803
    check-cast v8, Lk6/f;

    .line 804
    .line 805
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 806
    .line 807
    .line 808
    invoke-static/range {v17 .. v17}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 809
    .line 810
    .line 811
    move-result v8

    .line 812
    if-nez v8, :cond_1f

    .line 813
    .line 814
    const-string v8, "accountId"

    .line 815
    .line 816
    move-object/from16 v9, v17

    .line 817
    .line 818
    invoke-virtual {v6, v8, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 819
    .line 820
    .line 821
    goto :goto_12

    .line 822
    :cond_1f
    move-object/from16 v9, v17

    .line 823
    .line 824
    :goto_12
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 825
    .line 826
    .line 827
    move-result v8

    .line 828
    if-nez v8, :cond_20

    .line 829
    .line 830
    const-string v8, "obfuscatedProfileId"

    .line 831
    .line 832
    invoke-virtual {v6, v8, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 833
    .line 834
    .line 835
    :cond_20
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 836
    .line 837
    .line 838
    move-result v8

    .line 839
    if-nez v8, :cond_21

    .line 840
    .line 841
    new-instance v8, Ljava/util/ArrayList;

    .line 842
    .line 843
    filled-new-array {v9}, [Ljava/lang/String;

    .line 844
    .line 845
    .line 846
    move-result-object v11

    .line 847
    invoke-static {v11}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 848
    .line 849
    .line 850
    move-result-object v11

    .line 851
    invoke-direct {v8, v11}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 852
    .line 853
    .line 854
    const-string v11, "skusToReplace"

    .line 855
    .line 856
    invoke-virtual {v6, v11, v8}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 857
    .line 858
    .line 859
    :cond_21
    iget-object v8, v2, Landroidx/room/z;->c:Ljava/lang/Object;

    .line 860
    .line 861
    check-cast v8, Lk6/f;

    .line 862
    .line 863
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 864
    .line 865
    .line 866
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 867
    .line 868
    .line 869
    move-result v8

    .line 870
    if-nez v8, :cond_22

    .line 871
    .line 872
    iget-object v8, v2, Landroidx/room/z;->c:Ljava/lang/Object;

    .line 873
    .line 874
    check-cast v8, Lk6/f;

    .line 875
    .line 876
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 877
    .line 878
    .line 879
    const-string v8, "oldSkuPurchaseToken"

    .line 880
    .line 881
    invoke-virtual {v6, v8, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 882
    .line 883
    .line 884
    :cond_22
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 885
    .line 886
    .line 887
    move-result v8

    .line 888
    if-nez v8, :cond_23

    .line 889
    .line 890
    const-string v8, "oldSkuPurchaseId"

    .line 891
    .line 892
    invoke-virtual {v6, v8, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 893
    .line 894
    .line 895
    :cond_23
    iget-object v8, v2, Landroidx/room/z;->c:Ljava/lang/Object;

    .line 896
    .line 897
    check-cast v8, Lk6/f;

    .line 898
    .line 899
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 900
    .line 901
    .line 902
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 903
    .line 904
    .line 905
    move-result v8

    .line 906
    if-nez v8, :cond_24

    .line 907
    .line 908
    iget-object v8, v2, Landroidx/room/z;->c:Ljava/lang/Object;

    .line 909
    .line 910
    check-cast v8, Lk6/f;

    .line 911
    .line 912
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 913
    .line 914
    .line 915
    const-string v8, "originalExternalTransactionId"

    .line 916
    .line 917
    invoke-virtual {v6, v8, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 918
    .line 919
    .line 920
    :cond_24
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 921
    .line 922
    .line 923
    move-result v8

    .line 924
    if-nez v8, :cond_25

    .line 925
    .line 926
    const-string v8, "paymentsPurchaseParams"

    .line 927
    .line 928
    invoke-virtual {v6, v8, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 929
    .line 930
    .line 931
    :cond_25
    if-eqz v3, :cond_26

    .line 932
    .line 933
    const-string v3, "enablePendingPurchases"

    .line 934
    .line 935
    const/4 v8, 0x1

    .line 936
    invoke-virtual {v6, v3, v8}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 937
    .line 938
    .line 939
    goto :goto_13

    .line 940
    :cond_26
    const/4 v8, 0x1

    .line 941
    :goto_13
    if-eqz v7, :cond_27

    .line 942
    .line 943
    const-string v3, "enableAlternativeBilling"

    .line 944
    .line 945
    invoke-virtual {v6, v3, v8}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 946
    .line 947
    .line 948
    :cond_27
    new-instance v3, Ljava/util/ArrayList;

    .line 949
    .line 950
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 951
    .line 952
    .line 953
    iget-object v7, v2, Landroidx/room/z;->d:Ljava/lang/Object;

    .line 954
    .line 955
    check-cast v7, Lcom/google/android/gms/internal/play_billing/zzbt;

    .line 956
    .line 957
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 958
    .line 959
    .line 960
    move-result-object v7

    .line 961
    :goto_14
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 962
    .line 963
    .line 964
    move-result v8

    .line 965
    if-eqz v8, :cond_28

    .line 966
    .line 967
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 968
    .line 969
    .line 970
    move-result-object v8

    .line 971
    check-cast v8, Lp3/d;

    .line 972
    .line 973
    goto :goto_14

    .line 974
    :cond_28
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 975
    .line 976
    .line 977
    move-result v7

    .line 978
    if-nez v7, :cond_29

    .line 979
    .line 980
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzdk;->t()Lcom/google/android/gms/internal/play_billing/zzdj;

    .line 981
    .line 982
    .line 983
    move-result-object v7

    .line 984
    invoke-virtual {v7}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    .line 985
    .line 986
    .line 987
    iget-object v8, v7, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 988
    .line 989
    check-cast v8, Lcom/google/android/gms/internal/play_billing/zzdk;

    .line 990
    .line 991
    invoke-static {v8, v3}, Lcom/google/android/gms/internal/play_billing/zzdk;->u(Lcom/google/android/gms/internal/play_billing/zzdk;Ljava/util/ArrayList;)V

    .line 992
    .line 993
    .line 994
    invoke-virtual {v7}, Lcom/google/android/gms/internal/play_billing/zzfe;->e()Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 995
    .line 996
    .line 997
    move-result-object v3

    .line 998
    check-cast v3, Lcom/google/android/gms/internal/play_billing/zzdk;

    .line 999
    .line 1000
    invoke-virtual {v3}, Lcom/google/android/gms/internal/play_billing/zzds;->b()[B

    .line 1001
    .line 1002
    .line 1003
    move-result-object v3

    .line 1004
    const-string v7, "subscriptionProductReplacementParamsList"

    .line 1005
    .line 1006
    invoke-virtual {v6, v7, v3}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 1007
    .line 1008
    .line 1009
    :cond_29
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1010
    .line 1011
    .line 1012
    move-result v3

    .line 1013
    if-nez v3, :cond_2e

    .line 1014
    .line 1015
    new-instance v3, Ljava/util/ArrayList;

    .line 1016
    .line 1017
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1018
    .line 1019
    .line 1020
    new-instance v7, Ljava/util/ArrayList;

    .line 1021
    .line 1022
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1023
    .line 1024
    .line 1025
    new-instance v7, Ljava/util/ArrayList;

    .line 1026
    .line 1027
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1028
    .line 1029
    .line 1030
    new-instance v7, Ljava/util/ArrayList;

    .line 1031
    .line 1032
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1033
    .line 1034
    .line 1035
    new-instance v7, Ljava/util/ArrayList;

    .line 1036
    .line 1037
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1038
    .line 1039
    .line 1040
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v7

    .line 1044
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1045
    .line 1046
    .line 1047
    move-result v8

    .line 1048
    if-nez v8, :cond_2d

    .line 1049
    .line 1050
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1051
    .line 1052
    .line 1053
    move-result v7

    .line 1054
    if-nez v7, :cond_2a

    .line 1055
    .line 1056
    const-string v7, "skuDetailsTokens"

    .line 1057
    .line 1058
    invoke-virtual {v6, v7, v3}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1059
    .line 1060
    .line 1061
    :cond_2a
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1062
    .line 1063
    .line 1064
    move-result v3

    .line 1065
    const/4 v8, 0x1

    .line 1066
    if-le v3, v8, :cond_2b

    .line 1067
    .line 1068
    new-instance v3, Ljava/util/ArrayList;

    .line 1069
    .line 1070
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1071
    .line 1072
    .line 1073
    move-result v7

    .line 1074
    add-int/lit8 v7, v7, -0x1

    .line 1075
    .line 1076
    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 1077
    .line 1078
    .line 1079
    new-instance v7, Ljava/util/ArrayList;

    .line 1080
    .line 1081
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1082
    .line 1083
    .line 1084
    move-result v9

    .line 1085
    add-int/lit8 v9, v9, -0x1

    .line 1086
    .line 1087
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 1088
    .line 1089
    .line 1090
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1091
    .line 1092
    .line 1093
    move-result v9

    .line 1094
    if-lt v8, v9, :cond_2c

    .line 1095
    .line 1096
    const-string v0, "additionalSkus"

    .line 1097
    .line 1098
    invoke-virtual {v6, v0, v3}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1099
    .line 1100
    .line 1101
    const-string v0, "additionalSkuTypes"

    .line 1102
    .line 1103
    invoke-virtual {v6, v0, v7}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1104
    .line 1105
    .line 1106
    :cond_2b
    move-wide/from16 v23, v4

    .line 1107
    .line 1108
    goto/16 :goto_1a

    .line 1109
    .line 1110
    :cond_2c
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v0

    .line 1114
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1115
    .line 1116
    .line 1117
    new-instance v0, Ljava/lang/ClassCastException;

    .line 1118
    .line 1119
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 1120
    .line 1121
    .line 1122
    throw v0

    .line 1123
    :cond_2d
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v0

    .line 1127
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1128
    .line 1129
    .line 1130
    new-instance v0, Ljava/lang/ClassCastException;

    .line 1131
    .line 1132
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 1133
    .line 1134
    .line 1135
    throw v0

    .line 1136
    :cond_2e
    const/4 v8, 0x1

    .line 1137
    new-instance v0, Ljava/util/ArrayList;

    .line 1138
    .line 1139
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 1140
    .line 1141
    .line 1142
    move-result v3

    .line 1143
    add-int/lit8 v3, v3, -0x1

    .line 1144
    .line 1145
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1146
    .line 1147
    .line 1148
    new-instance v3, Ljava/util/ArrayList;

    .line 1149
    .line 1150
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 1151
    .line 1152
    .line 1153
    move-result v7

    .line 1154
    add-int/lit8 v7, v7, -0x1

    .line 1155
    .line 1156
    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 1157
    .line 1158
    .line 1159
    new-instance v7, Ljava/util/ArrayList;

    .line 1160
    .line 1161
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1162
    .line 1163
    .line 1164
    new-instance v9, Ljava/util/ArrayList;

    .line 1165
    .line 1166
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 1167
    .line 1168
    .line 1169
    new-instance v11, Ljava/util/ArrayList;

    .line 1170
    .line 1171
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 1172
    .line 1173
    .line 1174
    new-instance v13, Ljava/util/ArrayList;

    .line 1175
    .line 1176
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 1177
    .line 1178
    .line 1179
    const/4 v14, 0x0

    .line 1180
    :goto_15
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 1181
    .line 1182
    .line 1183
    move-result v15

    .line 1184
    if-ge v14, v15, :cond_35

    .line 1185
    .line 1186
    invoke-interface {v10, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v15

    .line 1190
    check-cast v15, Lp3/d;

    .line 1191
    .line 1192
    iget-object v8, v15, Lp3/d;->a:Lp3/l;

    .line 1193
    .line 1194
    iget-object v2, v8, Lp3/l;->f:Ljava/lang/String;

    .line 1195
    .line 1196
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 1197
    .line 1198
    .line 1199
    move-result v2

    .line 1200
    if-nez v2, :cond_2f

    .line 1201
    .line 1202
    iget-object v2, v8, Lp3/l;->f:Ljava/lang/String;

    .line 1203
    .line 1204
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1205
    .line 1206
    .line 1207
    :cond_2f
    iget-object v2, v15, Lp3/d;->b:Ljava/lang/String;

    .line 1208
    .line 1209
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1210
    .line 1211
    .line 1212
    iget-object v2, v8, Lp3/l;->g:Ljava/lang/String;

    .line 1213
    .line 1214
    iget-object v15, v8, Lp3/l;->i:Ljava/util/ArrayList;

    .line 1215
    .line 1216
    if-eqz v15, :cond_32

    .line 1217
    .line 1218
    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1219
    .line 1220
    .line 1221
    move-result v15

    .line 1222
    if-nez v15, :cond_32

    .line 1223
    .line 1224
    iget-object v8, v8, Lp3/l;->i:Ljava/util/ArrayList;

    .line 1225
    .line 1226
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 1227
    .line 1228
    .line 1229
    move-result v15

    .line 1230
    move-object/from16 v18, v2

    .line 1231
    .line 1232
    const/4 v2, 0x0

    .line 1233
    :goto_16
    if-ge v2, v15, :cond_31

    .line 1234
    .line 1235
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v20

    .line 1239
    add-int/lit8 v2, v2, 0x1

    .line 1240
    .line 1241
    move/from16 v21, v2

    .line 1242
    .line 1243
    move-object/from16 v2, v20

    .line 1244
    .line 1245
    check-cast v2, Lp3/h;

    .line 1246
    .line 1247
    move-wide/from16 v23, v4

    .line 1248
    .line 1249
    iget-object v4, v2, Lp3/h;->e:Ljava/lang/String;

    .line 1250
    .line 1251
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1252
    .line 1253
    .line 1254
    move-result v4

    .line 1255
    if-nez v4, :cond_30

    .line 1256
    .line 1257
    iget-object v2, v2, Lp3/h;->e:Ljava/lang/String;

    .line 1258
    .line 1259
    goto :goto_19

    .line 1260
    :cond_30
    move/from16 v2, v21

    .line 1261
    .line 1262
    move-wide/from16 v4, v23

    .line 1263
    .line 1264
    goto :goto_16

    .line 1265
    :cond_31
    :goto_17
    move-wide/from16 v23, v4

    .line 1266
    .line 1267
    goto :goto_18

    .line 1268
    :cond_32
    move-object/from16 v18, v2

    .line 1269
    .line 1270
    goto :goto_17

    .line 1271
    :goto_18
    move-object/from16 v2, v18

    .line 1272
    .line 1273
    :goto_19
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1274
    .line 1275
    .line 1276
    move-result v4

    .line 1277
    if-nez v4, :cond_33

    .line 1278
    .line 1279
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1280
    .line 1281
    .line 1282
    :cond_33
    if-lez v14, :cond_34

    .line 1283
    .line 1284
    invoke-interface {v10, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v2

    .line 1288
    check-cast v2, Lp3/d;

    .line 1289
    .line 1290
    iget-object v2, v2, Lp3/d;->a:Lp3/l;

    .line 1291
    .line 1292
    iget-object v2, v2, Lp3/l;->c:Ljava/lang/String;

    .line 1293
    .line 1294
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1295
    .line 1296
    .line 1297
    invoke-interface {v10, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v2

    .line 1301
    check-cast v2, Lp3/d;

    .line 1302
    .line 1303
    iget-object v2, v2, Lp3/d;->a:Lp3/l;

    .line 1304
    .line 1305
    iget-object v2, v2, Lp3/l;->d:Ljava/lang/String;

    .line 1306
    .line 1307
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1308
    .line 1309
    .line 1310
    :cond_34
    add-int/lit8 v14, v14, 0x1

    .line 1311
    .line 1312
    move-object/from16 v2, p2

    .line 1313
    .line 1314
    move-wide/from16 v4, v23

    .line 1315
    .line 1316
    const/4 v8, 0x1

    .line 1317
    goto/16 :goto_15

    .line 1318
    .line 1319
    :cond_35
    move-wide/from16 v23, v4

    .line 1320
    .line 1321
    const-string v2, "SKU_OFFER_ID_TOKEN_LIST"

    .line 1322
    .line 1323
    invoke-virtual {v6, v2, v9}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1324
    .line 1325
    .line 1326
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1327
    .line 1328
    .line 1329
    move-result v2

    .line 1330
    if-nez v2, :cond_36

    .line 1331
    .line 1332
    const-string v2, "autoPayBalanceThresholdList"

    .line 1333
    .line 1334
    invoke-virtual {v6, v2, v13}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1335
    .line 1336
    .line 1337
    :cond_36
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1338
    .line 1339
    .line 1340
    move-result v2

    .line 1341
    if-nez v2, :cond_37

    .line 1342
    .line 1343
    const-string v2, "skuDetailsTokens"

    .line 1344
    .line 1345
    invoke-virtual {v6, v2, v7}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1346
    .line 1347
    .line 1348
    :cond_37
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1349
    .line 1350
    .line 1351
    move-result v2

    .line 1352
    if-nez v2, :cond_38

    .line 1353
    .line 1354
    const-string v2, "SKU_SERIALIZED_DOCID_LIST"

    .line 1355
    .line 1356
    invoke-virtual {v6, v2, v11}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1357
    .line 1358
    .line 1359
    :cond_38
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1360
    .line 1361
    .line 1362
    move-result v2

    .line 1363
    if-nez v2, :cond_39

    .line 1364
    .line 1365
    const-string v2, "additionalSkus"

    .line 1366
    .line 1367
    invoke-virtual {v6, v2, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1368
    .line 1369
    .line 1370
    const-string v0, "additionalSkuTypes"

    .line 1371
    .line 1372
    invoke-virtual {v6, v0, v3}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1373
    .line 1374
    .line 1375
    :cond_39
    :goto_1a
    const-string v0, "SKU_OFFER_ID_TOKEN_LIST"

    .line 1376
    .line 1377
    invoke-virtual {v6, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1378
    .line 1379
    .line 1380
    move-result v0

    .line 1381
    if-eqz v0, :cond_3a

    .line 1382
    .line 1383
    iget-boolean v0, v1, Lp3/b;->o:Z

    .line 1384
    .line 1385
    if-eqz v0, :cond_3b

    .line 1386
    .line 1387
    :cond_3a
    move-wide/from16 v20, v23

    .line 1388
    .line 1389
    const/4 v7, 0x0

    .line 1390
    goto :goto_1b

    .line 1391
    :cond_3b
    sget-object v2, Lcom/google/android/gms/internal/play_billing/zzie;->C:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 1392
    .line 1393
    sget-object v3, Lp3/f0;->l:Lp3/e;

    .line 1394
    .line 1395
    move-wide/from16 v4, v23

    .line 1396
    .line 1397
    const/4 v6, 0x0

    .line 1398
    invoke-virtual/range {v1 .. v6}, Lp3/b;->E(Lcom/google/android/gms/internal/play_billing/zzie;Lp3/e;JZ)V

    .line 1399
    .line 1400
    .line 1401
    invoke-virtual {v1, v3}, Lp3/b;->G(Lp3/e;)V

    .line 1402
    .line 1403
    .line 1404
    return-object v3

    .line 1405
    :goto_1b
    iget-object v0, v12, Lp3/d;->a:Lp3/l;

    .line 1406
    .line 1407
    iget-object v0, v0, Lp3/l;->b:Lorg/json/JSONObject;

    .line 1408
    .line 1409
    const-string v2, "packageName"

    .line 1410
    .line 1411
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v0

    .line 1415
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1416
    .line 1417
    .line 1418
    move-result v0

    .line 1419
    if-nez v0, :cond_3c

    .line 1420
    .line 1421
    iget-object v0, v12, Lp3/d;->a:Lp3/l;

    .line 1422
    .line 1423
    iget-object v0, v0, Lp3/l;->b:Lorg/json/JSONObject;

    .line 1424
    .line 1425
    const-string v2, "packageName"

    .line 1426
    .line 1427
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v0

    .line 1431
    const-string v2, "skuPackageName"

    .line 1432
    .line 1433
    invoke-virtual {v6, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1434
    .line 1435
    .line 1436
    const/4 v14, 0x1

    .line 1437
    :goto_1c
    const/4 v9, 0x0

    .line 1438
    goto :goto_1d

    .line 1439
    :cond_3c
    const/4 v14, 0x0

    .line 1440
    goto :goto_1c

    .line 1441
    :goto_1d
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1442
    .line 1443
    .line 1444
    move-result v0

    .line 1445
    if-nez v0, :cond_3d

    .line 1446
    .line 1447
    const-string v0, "accountName"

    .line 1448
    .line 1449
    invoke-virtual {v6, v0, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1450
    .line 1451
    .line 1452
    :cond_3d
    invoke-virtual/range {p1 .. p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v0

    .line 1456
    if-nez v0, :cond_3e

    .line 1457
    .line 1458
    const-string v0, "BillingClient"

    .line 1459
    .line 1460
    const-string v2, "Activity\'s intent is null."

    .line 1461
    .line 1462
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 1463
    .line 1464
    .line 1465
    goto :goto_1e

    .line 1466
    :cond_3e
    const-string v2, "PROXY_PACKAGE"

    .line 1467
    .line 1468
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1469
    .line 1470
    .line 1471
    move-result-object v2

    .line 1472
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1473
    .line 1474
    .line 1475
    move-result v2

    .line 1476
    if-nez v2, :cond_3f

    .line 1477
    .line 1478
    const-string v2, "PROXY_PACKAGE"

    .line 1479
    .line 1480
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1481
    .line 1482
    .line 1483
    move-result-object v0

    .line 1484
    const-string v2, "proxyPackage"

    .line 1485
    .line 1486
    invoke-virtual {v6, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1487
    .line 1488
    .line 1489
    :try_start_2
    iget-object v2, v1, Lp3/b;->g:Landroid/content/Context;

    .line 1490
    .line 1491
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v2

    .line 1495
    const/4 v3, 0x0

    .line 1496
    invoke-virtual {v2, v0, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 1497
    .line 1498
    .line 1499
    move-result-object v0

    .line 1500
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 1501
    .line 1502
    const-string v2, "proxyPackageVersion"

    .line 1503
    .line 1504
    invoke-virtual {v6, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_1

    .line 1505
    .line 1506
    .line 1507
    goto :goto_1e

    .line 1508
    :catch_1
    const-string v0, "proxyPackageVersion"

    .line 1509
    .line 1510
    const-string v2, "package not found"

    .line 1511
    .line 1512
    invoke-virtual {v6, v0, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1513
    .line 1514
    .line 1515
    :cond_3f
    :goto_1e
    iget-boolean v0, v1, Lp3/b;->r:Z

    .line 1516
    .line 1517
    if-eqz v0, :cond_40

    .line 1518
    .line 1519
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 1520
    .line 1521
    .line 1522
    move-result v0

    .line 1523
    if-nez v0, :cond_40

    .line 1524
    .line 1525
    const/16 v0, 0x11

    .line 1526
    .line 1527
    const/16 v2, 0x11

    .line 1528
    .line 1529
    goto :goto_1f

    .line 1530
    :cond_40
    iget-boolean v0, v1, Lp3/b;->p:Z

    .line 1531
    .line 1532
    if-eqz v0, :cond_41

    .line 1533
    .line 1534
    if-eqz v14, :cond_41

    .line 1535
    .line 1536
    const/16 v0, 0xf

    .line 1537
    .line 1538
    const/16 v2, 0xf

    .line 1539
    .line 1540
    goto :goto_1f

    .line 1541
    :cond_41
    iget-boolean v0, v1, Lp3/b;->n:Z

    .line 1542
    .line 1543
    if-eqz v0, :cond_42

    .line 1544
    .line 1545
    const/16 v0, 0x9

    .line 1546
    .line 1547
    const/16 v2, 0x9

    .line 1548
    .line 1549
    goto :goto_1f

    .line 1550
    :cond_42
    const/4 v0, 0x6

    .line 1551
    const/4 v2, 0x6

    .line 1552
    :goto_1f
    new-instance v0, Lp3/j0;

    .line 1553
    .line 1554
    move-object/from16 v5, p2

    .line 1555
    .line 1556
    move-object/from16 v3, v19

    .line 1557
    .line 1558
    move-object/from16 v4, v22

    .line 1559
    .line 1560
    invoke-direct/range {v0 .. v6}, Lp3/j0;-><init>(Lp3/b;ILjava/lang/String;Ljava/lang/String;Landroidx/room/z;Landroid/os/Bundle;)V

    .line 1561
    .line 1562
    .line 1563
    iget-object v14, v1, Lp3/b;->e:Landroid/os/Handler;

    .line 1564
    .line 1565
    invoke-virtual {v1}, Lp3/b;->g()Ljava/util/concurrent/ExecutorService;

    .line 1566
    .line 1567
    .line 1568
    move-result-object v15

    .line 1569
    const-wide/16 v11, 0x1388

    .line 1570
    .line 1571
    const/4 v13, 0x0

    .line 1572
    move-object v10, v0

    .line 1573
    invoke-static/range {v10 .. v15}, Lp3/b;->h(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    .line 1574
    .line 1575
    .line 1576
    move-result-object v0

    .line 1577
    goto :goto_20

    .line 1578
    :cond_43
    move-wide/from16 v20, v4

    .line 1579
    .line 1580
    move-object/from16 v9, v17

    .line 1581
    .line 1582
    move-object/from16 v3, v19

    .line 1583
    .line 1584
    move-object/from16 v4, v22

    .line 1585
    .line 1586
    const/4 v7, 0x0

    .line 1587
    new-instance v10, Lp3/u;

    .line 1588
    .line 1589
    const/4 v0, 0x3

    .line 1590
    invoke-direct {v10, v1, v3, v4, v0}, Lp3/u;-><init>(Lp3/b;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1591
    .line 1592
    .line 1593
    iget-object v14, v1, Lp3/b;->e:Landroid/os/Handler;

    .line 1594
    .line 1595
    invoke-virtual {v1}, Lp3/b;->g()Ljava/util/concurrent/ExecutorService;

    .line 1596
    .line 1597
    .line 1598
    move-result-object v15

    .line 1599
    const-wide/16 v11, 0x1388

    .line 1600
    .line 1601
    const/4 v13, 0x0

    .line 1602
    invoke-static/range {v10 .. v15}, Lp3/b;->h(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v0

    .line 1606
    :goto_20
    if-nez v0, :cond_44

    .line 1607
    .line 1608
    :try_start_3
    sget-object v2, Lcom/google/android/gms/internal/play_billing/zzie;->G:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 1609
    .line 1610
    sget-object v3, Lp3/f0;->b:Lp3/e;
    :try_end_3
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_3 .. :try_end_3} :catch_7
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_5

    .line 1611
    .line 1612
    move-wide/from16 v4, v20

    .line 1613
    .line 1614
    const/4 v6, 0x0

    .line 1615
    :try_start_4
    invoke-virtual/range {v1 .. v6}, Lp3/b;->E(Lcom/google/android/gms/internal/play_billing/zzie;Lp3/e;JZ)V

    .line 1616
    .line 1617
    .line 1618
    invoke-virtual {v1, v3}, Lp3/b;->G(Lp3/e;)V

    .line 1619
    .line 1620
    .line 1621
    return-object v3

    .line 1622
    :catch_2
    move-exception v0

    .line 1623
    goto/16 :goto_29

    .line 1624
    .line 1625
    :catch_3
    move-exception v0

    .line 1626
    goto/16 :goto_2a

    .line 1627
    .line 1628
    :catch_4
    move-exception v0

    .line 1629
    goto/16 :goto_2a

    .line 1630
    .line 1631
    :catch_5
    move-exception v0

    .line 1632
    move-wide/from16 v4, v20

    .line 1633
    .line 1634
    :goto_21
    const/4 v6, 0x0

    .line 1635
    goto/16 :goto_29

    .line 1636
    .line 1637
    :catch_6
    move-exception v0

    .line 1638
    :goto_22
    move-wide/from16 v4, v20

    .line 1639
    .line 1640
    :goto_23
    const/4 v6, 0x0

    .line 1641
    goto/16 :goto_2a

    .line 1642
    .line 1643
    :catch_7
    move-exception v0

    .line 1644
    goto :goto_22

    .line 1645
    :cond_44
    move-wide/from16 v4, v20

    .line 1646
    .line 1647
    const/4 v6, 0x0

    .line 1648
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 1649
    .line 1650
    const-wide/16 v7, 0x1388

    .line 1651
    .line 1652
    invoke-interface {v0, v7, v8, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v0

    .line 1656
    move-object v2, v0

    .line 1657
    check-cast v2, Landroid/os/Bundle;

    .line 1658
    .line 1659
    const-string v0, "BillingClient"

    .line 1660
    .line 1661
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/zzc;->a(Landroid/os/Bundle;Ljava/lang/String;)I

    .line 1662
    .line 1663
    .line 1664
    move-result v0

    .line 1665
    const-string v3, "BillingClient"

    .line 1666
    .line 1667
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/play_billing/zzc;->f(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 1668
    .line 1669
    .line 1670
    move-result-object v3

    .line 1671
    if-eqz v0, :cond_4a

    .line 1672
    .line 1673
    const-string v7, "BillingClient"

    .line 1674
    .line 1675
    new-instance v8, Ljava/lang/StringBuilder;

    .line 1676
    .line 1677
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 1678
    .line 1679
    .line 1680
    const-string v10, "Unable to buy item, Error response code: "

    .line 1681
    .line 1682
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1683
    .line 1684
    .line 1685
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1686
    .line 1687
    .line 1688
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1689
    .line 1690
    .line 1691
    move-result-object v8

    .line 1692
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 1693
    .line 1694
    .line 1695
    invoke-static {v0, v3}, Lp3/f0;->a(ILjava/lang/String;)Lp3/e;

    .line 1696
    .line 1697
    .line 1698
    move-result-object v3

    .line 1699
    const-string v7, "BillingClient"
    :try_end_4
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 1700
    .line 1701
    if-nez v2, :cond_45

    .line 1702
    .line 1703
    :try_start_5
    sget-object v0, Lcom/google/android/gms/internal/play_billing/zzie;->i:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 1704
    .line 1705
    goto :goto_25

    .line 1706
    :catchall_1
    move-exception v0

    .line 1707
    goto :goto_24

    .line 1708
    :cond_45
    const-string v0, "LOG_REASON"

    .line 1709
    .line 1710
    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 1711
    .line 1712
    .line 1713
    move-result-object v0

    .line 1714
    if-nez v0, :cond_46

    .line 1715
    .line 1716
    sget-object v0, Lcom/google/android/gms/internal/play_billing/zzie;->i:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 1717
    .line 1718
    goto :goto_25

    .line 1719
    :cond_46
    instance-of v8, v0, Ljava/lang/Integer;

    .line 1720
    .line 1721
    if-eqz v8, :cond_47

    .line 1722
    .line 1723
    check-cast v0, Ljava/lang/Integer;

    .line 1724
    .line 1725
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1726
    .line 1727
    .line 1728
    move-result v0

    .line 1729
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/zzie;->a(I)Lcom/google/android/gms/internal/play_billing/zzie;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v0

    .line 1733
    goto :goto_25

    .line 1734
    :cond_47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1735
    .line 1736
    .line 1737
    move-result-object v0

    .line 1738
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1739
    .line 1740
    .line 1741
    move-result-object v0

    .line 1742
    new-instance v8, Ljava/lang/StringBuilder;

    .line 1743
    .line 1744
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 1745
    .line 1746
    .line 1747
    const-string v10, "Unexpected type for bundle log reason: "

    .line 1748
    .line 1749
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1750
    .line 1751
    .line 1752
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1753
    .line 1754
    .line 1755
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1756
    .line 1757
    .line 1758
    move-result-object v0

    .line 1759
    invoke-static {v7, v0}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 1760
    .line 1761
    .line 1762
    sget-object v0, Lcom/google/android/gms/internal/play_billing/zzie;->i:Lcom/google/android/gms/internal/play_billing/zzie;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 1763
    .line 1764
    goto :goto_25

    .line 1765
    :goto_24
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1766
    .line 1767
    .line 1768
    move-result-object v0

    .line 1769
    const-string v8, "Failed to get log reason from bundle: "

    .line 1770
    .line 1771
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1772
    .line 1773
    .line 1774
    move-result-object v0

    .line 1775
    invoke-virtual {v8, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1776
    .line 1777
    .line 1778
    move-result-object v0

    .line 1779
    invoke-static {v7, v0}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 1780
    .line 1781
    .line 1782
    sget-object v0, Lcom/google/android/gms/internal/play_billing/zzie;->i:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 1783
    .line 1784
    :goto_25
    sget-object v7, Lcom/google/android/gms/internal/play_billing/zzie;->i:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 1785
    .line 1786
    if-ne v0, v7, :cond_48

    .line 1787
    .line 1788
    sget-object v0, Lcom/google/android/gms/internal/play_billing/zzie;->E:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 1789
    .line 1790
    :cond_48
    move-object v7, v0

    .line 1791
    const-string v8, "BillingClient"
    :try_end_6
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    .line 1792
    .line 1793
    if-nez v2, :cond_49

    .line 1794
    .line 1795
    :goto_26
    move-wide v5, v4

    .line 1796
    move-object v2, v7

    .line 1797
    move-object v4, v9

    .line 1798
    const/4 v7, 0x0

    .line 1799
    goto :goto_27

    .line 1800
    :cond_49
    :try_start_7
    const-string v0, "ADDITIONAL_LOG_DETAILS"

    .line 1801
    .line 1802
    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v9
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 1806
    goto :goto_26

    .line 1807
    :catchall_2
    move-exception v0

    .line 1808
    :try_start_8
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1809
    .line 1810
    .line 1811
    move-result-object v0

    .line 1812
    const-string v2, "Failed to get additional log details from bundle: "

    .line 1813
    .line 1814
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1815
    .line 1816
    .line 1817
    move-result-object v0

    .line 1818
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1819
    .line 1820
    .line 1821
    move-result-object v0

    .line 1822
    invoke-static {v8, v0}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_8 .. :try_end_8} :catch_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_8 .. :try_end_8} :catch_3
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2

    .line 1823
    .line 1824
    .line 1825
    goto :goto_26

    .line 1826
    :goto_27
    :try_start_9
    invoke-virtual/range {v1 .. v7}, Lp3/b;->F(Lcom/google/android/gms/internal/play_billing/zzie;Lp3/e;Ljava/lang/String;JZ)V
    :try_end_9
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_9 .. :try_end_9} :catch_a
    .catch Ljava/util/concurrent/CancellationException; {:try_start_9 .. :try_end_9} :catch_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_8

    .line 1827
    .line 1828
    .line 1829
    move-wide v4, v5

    .line 1830
    const/4 v6, 0x0

    .line 1831
    :try_start_a
    invoke-virtual {v1, v3}, Lp3/b;->G(Lp3/e;)V

    .line 1832
    .line 1833
    .line 1834
    return-object v3

    .line 1835
    :catch_8
    move-exception v0

    .line 1836
    move-wide v4, v5

    .line 1837
    goto/16 :goto_21

    .line 1838
    .line 1839
    :catch_9
    move-exception v0

    .line 1840
    :goto_28
    move-wide v4, v5

    .line 1841
    goto/16 :goto_23

    .line 1842
    .line 1843
    :catch_a
    move-exception v0

    .line 1844
    goto :goto_28

    .line 1845
    :cond_4a
    new-instance v0, Landroid/content/Intent;

    .line 1846
    .line 1847
    const-class v3, Lcom/android/billingclient/api/ProxyBillingActivity;

    .line 1848
    .line 1849
    move-object/from16 v7, p1

    .line 1850
    .line 1851
    invoke-direct {v0, v7, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1852
    .line 1853
    .line 1854
    const-string v3, "BUY_INTENT"

    .line 1855
    .line 1856
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 1857
    .line 1858
    .line 1859
    move-result-object v2

    .line 1860
    check-cast v2, Landroid/app/PendingIntent;

    .line 1861
    .line 1862
    const-string v3, "BUY_INTENT"

    .line 1863
    .line 1864
    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1865
    .line 1866
    .line 1867
    const-string v2, "billingClientTransactionId"

    .line 1868
    .line 1869
    invoke-virtual {v0, v2, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 1870
    .line 1871
    .line 1872
    const-string v2, "wasServiceAutoReconnected"

    .line 1873
    .line 1874
    invoke-virtual {v0, v2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1875
    .line 1876
    .line 1877
    invoke-virtual {v7, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_a
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_a .. :try_end_a} :catch_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_a .. :try_end_a} :catch_3
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2

    .line 1878
    .line 1879
    .line 1880
    sget-object v0, Lp3/f0;->g:Lp3/e;

    .line 1881
    .line 1882
    return-object v0

    .line 1883
    :goto_29
    const-string v2, "BillingClient"

    .line 1884
    .line 1885
    const-string v3, "Exception while launching billing flow. Try to reconnect"

    .line 1886
    .line 1887
    invoke-static {v2, v3, v0}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1888
    .line 1889
    .line 1890
    sget-object v2, Lcom/google/android/gms/internal/play_billing/zzie;->m:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 1891
    .line 1892
    sget-object v3, Lp3/f0;->h:Lp3/e;

    .line 1893
    .line 1894
    invoke-static {v0}, Lp3/d0;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 1895
    .line 1896
    .line 1897
    move-result-object v0

    .line 1898
    move-wide v5, v4

    .line 1899
    const/4 v7, 0x0

    .line 1900
    move-object v4, v0

    .line 1901
    invoke-virtual/range {v1 .. v7}, Lp3/b;->F(Lcom/google/android/gms/internal/play_billing/zzie;Lp3/e;Ljava/lang/String;JZ)V

    .line 1902
    .line 1903
    .line 1904
    invoke-virtual {v1, v3}, Lp3/b;->G(Lp3/e;)V

    .line 1905
    .line 1906
    .line 1907
    return-object v3

    .line 1908
    :goto_2a
    const-string v2, "BillingClient"

    .line 1909
    .line 1910
    const-string v3, "Time out while launching billing flow. Try to reconnect"

    .line 1911
    .line 1912
    invoke-static {v2, v3, v0}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1913
    .line 1914
    .line 1915
    sget-object v2, Lcom/google/android/gms/internal/play_billing/zzie;->l:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 1916
    .line 1917
    sget-object v3, Lp3/f0;->i:Lp3/e;

    .line 1918
    .line 1919
    invoke-static {v0}, Lp3/d0;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 1920
    .line 1921
    .line 1922
    move-result-object v0

    .line 1923
    move-wide v5, v4

    .line 1924
    const/4 v7, 0x0

    .line 1925
    move-object v4, v0

    .line 1926
    invoke-virtual/range {v1 .. v7}, Lp3/b;->F(Lcom/google/android/gms/internal/play_billing/zzie;Lp3/e;Ljava/lang/String;JZ)V

    .line 1927
    .line 1928
    .line 1929
    invoke-virtual {v1, v3}, Lp3/b;->G(Lp3/e;)V

    .line 1930
    .line 1931
    .line 1932
    return-object v3

    .line 1933
    :cond_4b
    const-string v0, "BillingClient"

    .line 1934
    .line 1935
    const-string v2, "Current client doesn\'t support extra params for buy intent."

    .line 1936
    .line 1937
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 1938
    .line 1939
    .line 1940
    sget-object v2, Lcom/google/android/gms/internal/play_billing/zzie;->z:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 1941
    .line 1942
    sget-object v3, Lp3/f0;->e:Lp3/e;

    .line 1943
    .line 1944
    invoke-virtual/range {v1 .. v6}, Lp3/b;->E(Lcom/google/android/gms/internal/play_billing/zzie;Lp3/e;JZ)V

    .line 1945
    .line 1946
    .line 1947
    invoke-virtual {v1, v3}, Lp3/b;->G(Lp3/e;)V

    .line 1948
    .line 1949
    .line 1950
    return-object v3

    .line 1951
    :cond_4c
    new-instance v0, Ljava/lang/ClassCastException;

    .line 1952
    .line 1953
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 1954
    .line 1955
    .line 1956
    throw v0

    .line 1957
    :goto_2b
    :try_start_b
    monitor-exit v4
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 1958
    throw v0

    .line 1959
    :cond_4d
    move-wide v5, v2

    .line 1960
    sget-object v0, Lcom/google/android/gms/internal/play_billing/zzie;->t:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 1961
    .line 1962
    sget-object v2, Lp3/f0;->o:Lp3/e;

    .line 1963
    .line 1964
    invoke-virtual {v1, v0, v2, v5, v6}, Lp3/b;->C(Lcom/google/android/gms/internal/play_billing/zzie;Lp3/e;J)V

    .line 1965
    .line 1966
    .line 1967
    return-object v2
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    .line 3000
    .line 3001
    .line 3002
    .line 3003
    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    .line 3009
    .line 3010
    .line 3011
    .line 3012
    .line 3013
    .line 3014
    .line 3015
    .line 3016
    .line 3017
    .line 3018
    .line 3019
    .line 3020
    .line 3021
    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    .line 3029
    .line 3030
    .line 3031
    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    .line 3039
    .line 3040
    .line 3041
    .line 3042
    .line 3043
    .line 3044
    .line 3045
    .line 3046
    .line 3047
    .line 3048
    .line 3049
    .line 3050
    .line 3051
    .line 3052
    .line 3053
    .line 3054
    .line 3055
    .line 3056
    .line 3057
    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    .line 3063
    .line 3064
    .line 3065
    .line 3066
    .line 3067
    .line 3068
    .line 3069
    .line 3070
    .line 3071
    .line 3072
    .line 3073
    .line 3074
    .line 3075
    .line 3076
    .line 3077
    .line 3078
    .line 3079
    .line 3080
    .line 3081
    .line 3082
    .line 3083
    .line 3084
    .line 3085
    .line 3086
    .line 3087
    .line 3088
    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    .line 3094
    .line 3095
    .line 3096
    .line 3097
    .line 3098
    .line 3099
    .line 3100
    .line 3101
    .line 3102
    .line 3103
    .line 3104
    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    .line 3113
    .line 3114
    .line 3115
    .line 3116
    .line 3117
    .line 3118
    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    .line 3127
    .line 3128
    .line 3129
    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    .line 3135
    .line 3136
    .line 3137
    .line 3138
    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    .line 3144
    .line 3145
    .line 3146
    .line 3147
    .line 3148
    .line 3149
    .line 3150
    .line 3151
    .line 3152
    .line 3153
    .line 3154
    .line 3155
    .line 3156
    .line 3157
    .line 3158
    .line 3159
    .line 3160
    .line 3161
    .line 3162
    .line 3163
    .line 3164
    .line 3165
    .line 3166
    .line 3167
    .line 3168
    .line 3169
    .line 3170
    .line 3171
    .line 3172
    .line 3173
    .line 3174
    .line 3175
    .line 3176
    .line 3177
    .line 3178
    .line 3179
    .line 3180
    .line 3181
    .line 3182
    .line 3183
    .line 3184
    .line 3185
    .line 3186
    .line 3187
    .line 3188
    .line 3189
    .line 3190
    .line 3191
    .line 3192
    .line 3193
    .line 3194
    .line 3195
    .line 3196
    .line 3197
    .line 3198
    .line 3199
    .line 3200
    .line 3201
    .line 3202
    .line 3203
    .line 3204
    .line 3205
    .line 3206
    .line 3207
    .line 3208
    .line 3209
    .line 3210
    .line 3211
    .line 3212
    .line 3213
    .line 3214
    .line 3215
    .line 3216
    .line 3217
    .line 3218
    .line 3219
    .line 3220
    .line 3221
    .line 3222
    .line 3223
    .line 3224
    .line 3225
    .line 3226
    .line 3227
    .line 3228
    .line 3229
    .line 3230
    .line 3231
    .line 3232
    .line 3233
    .line 3234
    .line 3235
    .line 3236
    .line 3237
    .line 3238
    .line 3239
    .line 3240
    .line 3241
    .line 3242
    .line 3243
    .line 3244
    .line 3245
    .line 3246
    .line 3247
    .line 3248
    .line 3249
    .line 3250
    .line 3251
    .line 3252
    .line 3253
    .line 3254
    .line 3255
    .line 3256
    .line 3257
    .line 3258
    .line 3259
    .line 3260
    .line 3261
    .line 3262
    .line 3263
    .line 3264
    .line 3265
    .line 3266
    .line 3267
    .line 3268
    .line 3269
    .line 3270
    .line 3271
    .line 3272
    .line 3273
    .line 3274
    .line 3275
    .line 3276
    .line 3277
    .line 3278
    .line 3279
    .line 3280
    .line 3281
    .line 3282
    .line 3283
    .line 3284
    .line 3285
    .line 3286
    .line 3287
    .line 3288
    .line 3289
    .line 3290
    .line 3291
    .line 3292
    .line 3293
    .line 3294
    .line 3295
    .line 3296
    .line 3297
    .line 3298
    .line 3299
    .line 3300
    .line 3301
    .line 3302
    .line 3303
    .line 3304
    .line 3305
    .line 3306
    .line 3307
    .line 3308
    .line 3309
    .line 3310
    .line 3311
    .line 3312
    .line 3313
    .line 3314
    .line 3315
    .line 3316
    .line 3317
    .line 3318
    .line 3319
    .line 3320
    .line 3321
    .line 3322
    .line 3323
    .line 3324
    .line 3325
    .line 3326
    .line 3327
    .line 3328
    .line 3329
    .line 3330
    .line 3331
    .line 3332
    .line 3333
    .line 3334
    .line 3335
    .line 3336
    .line 3337
    .line 3338
    .line 3339
    .line 3340
    .line 3341
    .line 3342
    .line 3343
    .line 3344
    .line 3345
    .line 3346
    .line 3347
    .line 3348
    .line 3349
    .line 3350
    .line 3351
    .line 3352
    .line 3353
    .line 3354
    .line 3355
    .line 3356
    .line 3357
    .line 3358
    .line 3359
    .line 3360
    .line 3361
    .line 3362
    .line 3363
    .line 3364
    .line 3365
    .line 3366
    .line 3367
    .line 3368
    .line 3369
    .line 3370
    .line 3371
    .line 3372
    .line 3373
    .line 3374
    .line 3375
    .line 3376
    .line 3377
    .line 3378
.end method

.method public d(Lp3/q;Ldev/jahir/frames/data/viewmodels/a;)V
    .locals 6

    .line 1
    new-instance v0, Lp3/u;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, p2, p1, v1}, Lp3/u;-><init>(Lp3/b;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    new-instance v3, Landroidx/recyclerview/widget/e;

    .line 8
    .line 9
    const/16 p1, 0xb

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v3, p0, p2, p1, v1}, Landroidx/recyclerview/widget/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lp3/b;->u()Landroid/os/Handler;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {p0}, Lp3/b;->g()Ljava/util/concurrent/ExecutorService;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    const-wide/16 v1, 0x7530

    .line 24
    .line 25
    invoke-static/range {v0 .. v5}, Lp3/b;->h(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, Lp3/b;->x()Lp3/e;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    sget-object v0, Lcom/google/android/gms/internal/play_billing/zzie;->G:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 36
    .line 37
    const/4 v1, 0x7

    .line 38
    invoke-virtual {p0, v0, v1, p1}, Lp3/b;->B(Lcom/google/android/gms/internal/play_billing/zzie;ILp3/e;)V

    .line 39
    .line 40
    .line 41
    new-instance v0, Lp3/r;

    .line 42
    .line 43
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzbt;->o()Lcom/google/android/gms/internal/play_billing/zzbt;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzbt;->o()Lcom/google/android/gms/internal/play_billing/zzbt;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-direct {v0, v1, v2}, Lp3/r;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2, p1, v0}, Ldev/jahir/frames/data/viewmodels/a;->a(Lp3/e;Lp3/r;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    return-void
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method public final e(Lp3/s;Ldev/jahir/frames/data/viewmodels/a;)V
    .locals 6

    .line 1
    iget-object p1, p1, Lp3/s;->a:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v0, Lp3/u;

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-direct {v0, p0, p2, p1, v1}, Lp3/u;-><init>(Lp3/b;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 7
    .line 8
    .line 9
    new-instance v3, Landroidx/recyclerview/widget/e;

    .line 10
    .line 11
    const/16 p1, 0xc

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v3, p0, p2, p1, v1}, Landroidx/recyclerview/widget/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lp3/b;->u()Landroid/os/Handler;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-virtual {p0}, Lp3/b;->g()Ljava/util/concurrent/ExecutorService;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    const-wide/16 v1, 0x7530

    .line 26
    .line 27
    invoke-static/range {v0 .. v5}, Lp3/b;->h(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0}, Lp3/b;->x()Lp3/e;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    sget-object v0, Lcom/google/android/gms/internal/play_billing/zzie;->G:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 38
    .line 39
    const/16 v1, 0x9

    .line 40
    .line 41
    invoke-virtual {p0, v0, v1, p1}, Lp3/b;->B(Lcom/google/android/gms/internal/play_billing/zzie;ILp3/e;)V

    .line 42
    .line 43
    .line 44
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzbt;->o()Lcom/google/android/gms/internal/play_billing/zzbt;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {p2, p1, v0}, Ldev/jahir/frames/data/viewmodels/a;->b(Lp3/e;Ljava/util/List;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    return-void
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method public f(Ldev/jahir/frames/data/viewmodels/BillingViewModel;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lp3/b;->o(Lp3/c;)V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final declared-synchronized g()Ljava/util/concurrent/ExecutorService;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lp3/b;->z:Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget v0, Lcom/google/android/gms/internal/play_billing/zzc;->a:I

    .line 7
    .line 8
    new-instance v1, Lp3/v;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Lp3/v;-><init>(Lp3/b;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lp3/b;->z:Ljava/util/concurrent/ExecutorService;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    iget-object v0, p0, Lp3/b;->z:Ljava/util/concurrent/ExecutorService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    monitor-exit p0

    .line 25
    return-object v0

    .line 26
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    throw v0
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final i(La1/q;Ljava/lang/String;Lp3/e;Lcom/google/android/gms/internal/play_billing/zzie;Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 1

    .line 1
    const-string v0, "BillingClient"

    .line 2
    .line 3
    invoke-static {v0, p5, p6}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    const/4 p5, 0x4

    .line 7
    invoke-static {p6}, Lp3/d0;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p6

    .line 11
    invoke-virtual {p0, p4, p5, p3, p6}, Lp3/b;->D(Lcom/google/android/gms/internal/play_billing/zzie;ILp3/e;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p3, p2}, La1/q;->E(Lp3/e;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
.end method

.method public final j(Lcom/google/android/gms/internal/play_billing/zzhx;)V
    .locals 5

    .line 1
    const-string v0, "Unable to log."

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lp3/b;->h:Lu2/c;

    .line 4
    .line 5
    iget v2, p0, Lp3/b;->l:I

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 8
    .line 9
    .line 10
    :try_start_1
    iget-object v3, v1, Lu2/c;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v3, Lcom/google/android/gms/internal/play_billing/zzis;

    .line 13
    .line 14
    invoke-virtual {v3}, Lcom/google/android/gms/internal/play_billing/zzfi;->i()Lcom/google/android/gms/internal/play_billing/zzfe;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Lcom/google/android/gms/internal/play_billing/zziq;

    .line 19
    .line 20
    invoke-virtual {v3}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    .line 21
    .line 22
    .line 23
    iget-object v4, v3, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 24
    .line 25
    check-cast v4, Lcom/google/android/gms/internal/play_billing/zzis;

    .line 26
    .line 27
    invoke-static {v4, v2}, Lcom/google/android/gms/internal/play_billing/zzis;->v(Lcom/google/android/gms/internal/play_billing/zzis;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3}, Lcom/google/android/gms/internal/play_billing/zzfe;->e()Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lcom/google/android/gms/internal/play_billing/zzis;

    .line 35
    .line 36
    iput-object v2, v1, Lu2/c;->h:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-virtual {v1, p1}, Lu2/c;->j(Lcom/google/android/gms/internal/play_billing/zzhx;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    :try_start_2
    const-string v1, "BillingLogger"

    .line 44
    .line 45
    invoke-static {v1, v0, p1}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :catchall_1
    move-exception p1

    .line 50
    const-string v1, "BillingClient"

    .line 51
    .line 52
    invoke-static {v1, v0, p1}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    return-void
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
.end method

.method public final k(Lcom/google/android/gms/internal/play_billing/zzib;)V
    .locals 6

    .line 1
    const-string v0, "BillingLogger"

    .line 2
    .line 3
    const-string v1, "Unable to log."

    .line 4
    .line 5
    :try_start_0
    iget-object v2, p0, Lp3/b;->h:Lu2/c;

    .line 6
    .line 7
    iget v3, p0, Lp3/b;->l:I

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 10
    .line 11
    .line 12
    :try_start_1
    iget-object v4, v2, Lu2/c;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v4, Lcom/google/android/gms/internal/play_billing/zzis;

    .line 15
    .line 16
    invoke-virtual {v4}, Lcom/google/android/gms/internal/play_billing/zzfi;->i()Lcom/google/android/gms/internal/play_billing/zzfe;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    check-cast v4, Lcom/google/android/gms/internal/play_billing/zziq;

    .line 21
    .line 22
    invoke-virtual {v4}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    .line 23
    .line 24
    .line 25
    iget-object v5, v4, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 26
    .line 27
    check-cast v5, Lcom/google/android/gms/internal/play_billing/zzis;

    .line 28
    .line 29
    invoke-static {v5, v3}, Lcom/google/android/gms/internal/play_billing/zzis;->v(Lcom/google/android/gms/internal/play_billing/zzis;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v4}, Lcom/google/android/gms/internal/play_billing/zzfe;->e()Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Lcom/google/android/gms/internal/play_billing/zzis;

    .line 37
    .line 38
    iput-object v3, v2, Lu2/c;->h:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 39
    .line 40
    :try_start_2
    invoke-virtual {v2, p1, v3}, Lu2/c;->s(Lcom/google/android/gms/internal/play_billing/zzib;Lcom/google/android/gms/internal/play_billing/zzis;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    :try_start_3
    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_1
    move-exception p1

    .line 50
    :try_start_4
    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 51
    .line 52
    .line 53
    :goto_0
    return-void

    .line 54
    :catchall_2
    move-exception p1

    .line 55
    const-string v0, "BillingClient"

    .line 56
    .line 57
    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    return-void
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
.end method

.method public final l(Lcom/google/android/gms/internal/play_billing/zzie;Lp3/e;)V
    .locals 3

    .line 1
    :try_start_0
    sget v0, Lp3/d0;->a:I

    .line 2
    .line 3
    sget-object v0, Lcom/google/android/gms/internal/play_billing/zzil;->i:Lcom/google/android/gms/internal/play_billing/zzil;

    .line 4
    .line 5
    const/4 v1, 0x6

    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-static {p1, v1, p2, v2, v0}, Lp3/d0;->b(Lcom/google/android/gms/internal/play_billing/zzie;ILp3/e;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/zzil;)Lcom/google/android/gms/internal/play_billing/zzhx;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/zzfi;->i()Lcom/google/android/gms/internal/play_billing/zzfe;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lcom/google/android/gms/internal/play_billing/zzhv;

    .line 16
    .line 17
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzjv;->x()Lcom/google/android/gms/internal/play_billing/zzjt;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/play_billing/zzjt;->i(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/zzjt;->l()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/play_billing/zzhv;->l(Lcom/google/android/gms/internal/play_billing/zzjt;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/zzfe;->e()Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Lcom/google/android/gms/internal/play_billing/zzhx;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lp3/b;->j(Lcom/google/android/gms/internal/play_billing/zzhx;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    const-string p2, "BillingClient"

    .line 43
    .line 44
    const-string v0, "Unable to log."

    .line 45
    .line 46
    invoke-static {p2, v0, p1}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    return-void
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method public final m(I)V
    .locals 6

    .line 1
    const-string v0, "Setting clientState from "

    .line 2
    .line 3
    iget-object v1, p0, Lp3/b;->a:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget v2, p0, Lp3/b;->b:I

    .line 7
    .line 8
    const/4 v3, 0x3

    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    monitor-exit v1

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    goto :goto_2

    .line 15
    :cond_0
    const-string v2, "BillingClient"

    .line 16
    .line 17
    iget v3, p0, Lp3/b;->b:I

    .line 18
    .line 19
    const/4 v4, 0x2

    .line 20
    const/4 v5, 0x1

    .line 21
    if-eqz v3, :cond_3

    .line 22
    .line 23
    if-eq v3, v5, :cond_2

    .line 24
    .line 25
    if-eq v3, v4, :cond_1

    .line 26
    .line 27
    const-string v3, "CLOSED"

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const-string v3, "CONNECTED"

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    const-string v3, "CONNECTING"

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    const-string v3, "DISCONNECTED"

    .line 37
    .line 38
    :goto_0
    if-eqz p1, :cond_6

    .line 39
    .line 40
    if-eq p1, v5, :cond_5

    .line 41
    .line 42
    if-eq p1, v4, :cond_4

    .line 43
    .line 44
    const-string v4, "CLOSED"

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_4
    const-string v4, "CONNECTED"

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_5
    const-string v4, "CONNECTING"

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_6
    const-string v4, "DISCONNECTED"

    .line 54
    .line 55
    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v0, " to "

    .line 64
    .line 65
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/zzc;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iput p1, p0, Lp3/b;->b:I

    .line 79
    .line 80
    monitor-exit v1

    .line 81
    return-void

    .line 82
    :goto_2
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    throw p1
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
.end method

.method public final declared-synchronized n()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lp3/b;->z:Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lp3/b;->z:Ljava/util/concurrent/ExecutorService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    monitor-exit p0

    .line 17
    return-void

    .line 18
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    throw v0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final o(Lp3/c;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lp3/b;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Lp3/b;->r()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lp3/b;->w()Lp3/e;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    monitor-exit v0

    .line 15
    goto/16 :goto_3

    .line 16
    .line 17
    :catchall_0
    move-exception p1

    .line 18
    goto/16 :goto_4

    .line 19
    .line 20
    :cond_0
    iget v1, p0, Lp3/b;->b:I

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    if-ne v1, v2, :cond_1

    .line 24
    .line 25
    const-string v1, "BillingClient"

    .line 26
    .line 27
    const-string v2, "Client is already in the process of connecting to billing service."

    .line 28
    .line 29
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    sget-object v1, Lcom/google/android/gms/internal/play_billing/zzie;->S:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 33
    .line 34
    sget-object v2, Lp3/f0;->c:Lp3/e;

    .line 35
    .line 36
    invoke-virtual {p0, v1, v2}, Lp3/b;->l(Lcom/google/android/gms/internal/play_billing/zzie;Lp3/e;)V

    .line 37
    .line 38
    .line 39
    monitor-exit v0

    .line 40
    :goto_0
    move-object v1, v2

    .line 41
    goto/16 :goto_3

    .line 42
    .line 43
    :cond_1
    iget v1, p0, Lp3/b;->b:I

    .line 44
    .line 45
    const/4 v3, 0x3

    .line 46
    if-ne v1, v3, :cond_2

    .line 47
    .line 48
    const-string v1, "BillingClient"

    .line 49
    .line 50
    const-string v2, "Client was already closed and can\'t be reused. Please create another instance."

    .line 51
    .line 52
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    sget-object v1, Lcom/google/android/gms/internal/play_billing/zzie;->T:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 56
    .line 57
    sget-object v2, Lp3/f0;->h:Lp3/e;

    .line 58
    .line 59
    invoke-virtual {p0, v1, v2}, Lp3/b;->l(Lcom/google/android/gms/internal/play_billing/zzie;Lp3/e;)V

    .line 60
    .line 61
    .line 62
    monitor-exit v0

    .line 63
    goto :goto_0

    .line 64
    :cond_2
    invoke-virtual {p0, v2}, Lp3/b;->m(I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Lp3/b;->p()V

    .line 68
    .line 69
    .line 70
    const-string v1, "BillingClient"

    .line 71
    .line 72
    const-string v3, "Starting in-app billing setup."

    .line 73
    .line 74
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/play_billing/zzc;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    new-instance v1, Lp3/x;

    .line 78
    .line 79
    invoke-direct {v1, p0, p1}, Lp3/x;-><init>(Lp3/b;Lp3/c;)V

    .line 80
    .line 81
    .line 82
    iput-object v1, p0, Lp3/b;->j:Lp3/x;

    .line 83
    .line 84
    iget-object v1, p0, Lp3/b;->j:Lp3/x;

    .line 85
    .line 86
    iget-object v1, v1, Lp3/x;->b:Lcom/google/android/gms/internal/play_billing/zzbi;

    .line 87
    .line 88
    const-wide/16 v3, 0x0

    .line 89
    .line 90
    iput-wide v3, v1, Lcom/google/android/gms/internal/play_billing/zzbi;->c:J

    .line 91
    .line 92
    const/4 v3, 0x0

    .line 93
    iput-boolean v3, v1, Lcom/google/android/gms/internal/play_billing/zzbi;->b:Z

    .line 94
    .line 95
    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/zzbi;->a()V

    .line 96
    .line 97
    .line 98
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    new-instance v0, Landroid/content/Intent;

    .line 100
    .line 101
    const-string v1, "com.android.vending.billing.InAppBillingService.BIND"

    .line 102
    .line 103
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    const-string v1, "com.android.vending"

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 109
    .line 110
    .line 111
    iget-object v1, p0, Lp3/b;->g:Landroid/content/Context;

    .line 112
    .line 113
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-virtual {v1, v0, v3}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    if-eqz v1, :cond_8

    .line 122
    .line 123
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-nez v4, :cond_8

    .line 128
    .line 129
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    check-cast v1, Landroid/content/pm/ResolveInfo;

    .line 134
    .line 135
    iget-object v1, v1, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    .line 136
    .line 137
    if-eqz v1, :cond_7

    .line 138
    .line 139
    iget-object v4, v1, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 140
    .line 141
    iget-object v1, v1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 142
    .line 143
    const-string v5, "com.android.vending"

    .line 144
    .line 145
    invoke-static {v4, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    if-eqz v5, :cond_6

    .line 150
    .line 151
    if-eqz v1, :cond_6

    .line 152
    .line 153
    new-instance v5, Landroid/content/ComponentName;

    .line 154
    .line 155
    invoke-direct {v5, v4, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    new-instance v1, Landroid/content/Intent;

    .line 159
    .line 160
    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1, v5}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 164
    .line 165
    .line 166
    iget-object v0, p0, Lp3/b;->c:Ljava/lang/String;

    .line 167
    .line 168
    const-string v4, "playBillingLibraryVersion"

    .line 169
    .line 170
    invoke-virtual {v1, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 171
    .line 172
    .line 173
    iget-object v0, p0, Lp3/b;->a:Ljava/lang/Object;

    .line 174
    .line 175
    monitor-enter v0

    .line 176
    :try_start_1
    iget v4, p0, Lp3/b;->b:I

    .line 177
    .line 178
    const/4 v5, 0x2

    .line 179
    if-ne v4, v5, :cond_3

    .line 180
    .line 181
    invoke-virtual {p0}, Lp3/b;->w()Lp3/e;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    monitor-exit v0

    .line 186
    goto :goto_3

    .line 187
    :catchall_1
    move-exception p1

    .line 188
    goto :goto_1

    .line 189
    :cond_3
    iget v4, p0, Lp3/b;->b:I

    .line 190
    .line 191
    if-eq v4, v2, :cond_4

    .line 192
    .line 193
    const-string v1, "BillingClient"

    .line 194
    .line 195
    const-string v2, "Client state no longer CONNECTING, returning service disconnected."

    .line 196
    .line 197
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    sget-object v1, Lcom/google/android/gms/internal/play_billing/zzie;->i1:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 201
    .line 202
    sget-object v2, Lp3/f0;->h:Lp3/e;

    .line 203
    .line 204
    invoke-virtual {p0, v1, v2}, Lp3/b;->l(Lcom/google/android/gms/internal/play_billing/zzie;Lp3/e;)V

    .line 205
    .line 206
    .line 207
    monitor-exit v0

    .line 208
    goto/16 :goto_0

    .line 209
    .line 210
    :cond_4
    iget-object v4, p0, Lp3/b;->j:Lp3/x;

    .line 211
    .line 212
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 213
    iget-object v0, p0, Lp3/b;->g:Landroid/content/Context;

    .line 214
    .line 215
    invoke-virtual {v0, v1, v4, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-eqz v0, :cond_5

    .line 220
    .line 221
    const-string v0, "BillingClient"

    .line 222
    .line 223
    const-string v1, "Service was bonded successfully."

    .line 224
    .line 225
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/zzc;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    const/4 v1, 0x0

    .line 229
    goto :goto_3

    .line 230
    :cond_5
    const-string v0, "BillingClient"

    .line 231
    .line 232
    const-string v1, "Connection to Billing service is blocked."

    .line 233
    .line 234
    sget-object v2, Lcom/google/android/gms/internal/play_billing/zzie;->U:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 235
    .line 236
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    goto :goto_2

    .line 240
    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 241
    throw p1

    .line 242
    :cond_6
    const-string v0, "BillingClient"

    .line 243
    .line 244
    const-string v1, "The device doesn\'t have valid Play Store."

    .line 245
    .line 246
    sget-object v2, Lcom/google/android/gms/internal/play_billing/zzie;->V:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 247
    .line 248
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    goto :goto_2

    .line 252
    :cond_7
    const-string v0, "BillingClient"

    .line 253
    .line 254
    const-string v1, "The device doesn\'t have valid Play Store."

    .line 255
    .line 256
    sget-object v2, Lcom/google/android/gms/internal/play_billing/zzie;->V:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 257
    .line 258
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    goto :goto_2

    .line 262
    :cond_8
    sget-object v2, Lcom/google/android/gms/internal/play_billing/zzie;->W:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 263
    .line 264
    :goto_2
    invoke-virtual {p0, v3}, Lp3/b;->m(I)V

    .line 265
    .line 266
    .line 267
    const-string v0, "BillingClient"

    .line 268
    .line 269
    const-string v1, "Billing service unavailable on device."

    .line 270
    .line 271
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/zzc;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    sget-object v1, Lp3/f0;->a:Lp3/e;

    .line 275
    .line 276
    invoke-virtual {p0, v2, v1}, Lp3/b;->l(Lcom/google/android/gms/internal/play_billing/zzie;Lp3/e;)V

    .line 277
    .line 278
    .line 279
    :goto_3
    if-eqz v1, :cond_9

    .line 280
    .line 281
    invoke-interface {p1, v1}, Lp3/c;->onBillingSetupFinished(Lp3/e;)V

    .line 282
    .line 283
    .line 284
    :cond_9
    return-void

    .line 285
    :goto_4
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 286
    throw p1
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
.end method

.method public final p()V
    .locals 5

    .line 1
    iget-object v0, p0, Lp3/b;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lp3/b;->j:Lp3/x;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :try_start_1
    iget-object v2, p0, Lp3/b;->g:Landroid/content/Context;

    .line 10
    .line 11
    iget-object v3, p0, Lp3/b;->j:Lp3/x;

    .line 12
    .line 13
    invoke-virtual {v2, v3}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 14
    .line 15
    .line 16
    :try_start_2
    iput-object v1, p0, Lp3/b;->i:Lcom/google/android/gms/internal/play_billing/zzam;

    .line 17
    .line 18
    iput-object v1, p0, Lp3/b;->j:Lp3/x;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    goto :goto_1

    .line 23
    :catchall_1
    move-exception v2

    .line 24
    :try_start_3
    const-string v3, "BillingClient"

    .line 25
    .line 26
    const-string v4, "There was an exception while unbinding service!"

    .line 27
    .line 28
    invoke-static {v3, v4, v2}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 29
    .line 30
    .line 31
    :try_start_4
    iput-object v1, p0, Lp3/b;->i:Lcom/google/android/gms/internal/play_billing/zzam;

    .line 32
    .line 33
    iput-object v1, p0, Lp3/b;->j:Lp3/x;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_2
    move-exception v2

    .line 37
    iput-object v1, p0, Lp3/b;->i:Lcom/google/android/gms/internal/play_billing/zzam;

    .line 38
    .line 39
    iput-object v1, p0, Lp3/b;->j:Lp3/x;

    .line 40
    .line 41
    throw v2

    .line 42
    :cond_0
    :goto_0
    monitor-exit v0

    .line 43
    return-void

    .line 44
    :goto_1
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 45
    throw v1
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public final q()Z
    .locals 18

    .line 1
    new-instance v1, Lcom/google/android/gms/internal/play_billing/zzbi;

    .line 2
    .line 3
    move-object/from16 v2, p0

    .line 4
    .line 5
    iget-object v0, v2, Lp3/b;->B:Lcom/google/android/gms/internal/play_billing/zzbl;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/play_billing/zzbi;-><init>(Lcom/google/android/gms/internal/play_billing/zzbl;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/zzbi;->a()V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    const-wide/16 v3, 0x7530

    .line 15
    .line 16
    move-wide v6, v3

    .line 17
    const/4 v5, 0x1

    .line 18
    :goto_0
    const/4 v8, 0x3

    .line 19
    const-string v9, "BillingClient"

    .line 20
    .line 21
    if-gt v5, v8, :cond_7

    .line 22
    .line 23
    const-wide/16 v10, 0x0

    .line 24
    .line 25
    :try_start_0
    invoke-static {v10, v11, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide v6

    .line 29
    cmp-long v0, v6, v10

    .line 30
    .line 31
    if-gtz v0, :cond_0

    .line 32
    .line 33
    const-string v0, "No time remaining for reconnection attempt."

    .line 34
    .line 35
    invoke-static {v9, v0}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Lp3/b;->r()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    return v0

    .line 43
    :catch_0
    move-exception v0

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    const-string v0, "Already connected or not opted into auto reconnection."

    .line 46
    .line 47
    invoke-static {v9, v0}, Lcom/google/android/gms/internal/play_billing/zzc;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    sget-object v0, Lp3/f0;->g:Lp3/e;

    .line 51
    .line 52
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/zzcu;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/zzcz;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    sget-object v12, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 57
    .line 58
    invoke-interface {v0, v6, v7, v12}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Lp3/e;

    .line 63
    .line 64
    iget v0, v0, Lp3/e;->a:I

    .line 65
    .line 66
    if-nez v0, :cond_1

    .line 67
    .line 68
    new-instance v6, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v7, "Reconnection succeeded with result: "

    .line 74
    .line 75
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v9, v0}, Lcom/google/android/gms/internal/play_billing/zzc;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Lp3/b;->r()Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    return v0

    .line 93
    :cond_1
    new-instance v6, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    const-string v7, "Reconnection failed with result: "

    .line 99
    .line 100
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-static {v9, v0}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :goto_1
    instance-of v6, v0, Ljava/lang/InterruptedException;

    .line 115
    .line 116
    if-eqz v6, :cond_2

    .line 117
    .line 118
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    invoke-virtual {v6}, Ljava/lang/Thread;->interrupt()V

    .line 123
    .line 124
    .line 125
    :cond_2
    const-string v6, "Error during reconnection attempt: "

    .line 126
    .line 127
    invoke-static {v9, v6, v0}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    :goto_2
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 131
    .line 132
    iget-boolean v6, v1, Lcom/google/android/gms/internal/play_billing/zzbi;->b:Z

    .line 133
    .line 134
    iget-object v7, v1, Lcom/google/android/gms/internal/play_billing/zzbi;->a:Lcom/google/android/gms/internal/play_billing/zzbl;

    .line 135
    .line 136
    if-eqz v6, :cond_3

    .line 137
    .line 138
    invoke-virtual {v7}, Lcom/google/android/gms/internal/play_billing/zzbl;->a()J

    .line 139
    .line 140
    .line 141
    move-result-wide v12

    .line 142
    iget-wide v14, v1, Lcom/google/android/gms/internal/play_billing/zzbi;->d:J

    .line 143
    .line 144
    sub-long/2addr v12, v14

    .line 145
    iget-wide v14, v1, Lcom/google/android/gms/internal/play_billing/zzbi;->c:J

    .line 146
    .line 147
    add-long/2addr v12, v14

    .line 148
    goto :goto_3

    .line 149
    :cond_3
    iget-wide v12, v1, Lcom/google/android/gms/internal/play_billing/zzbi;->c:J

    .line 150
    .line 151
    :goto_3
    sget-object v6, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 152
    .line 153
    invoke-virtual {v0, v12, v13, v6}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    .line 154
    .line 155
    .line 156
    move-result-wide v12

    .line 157
    sub-long v12, v3, v12

    .line 158
    .line 159
    add-int/lit8 v14, v5, -0x1

    .line 160
    .line 161
    int-to-double v14, v14

    .line 162
    move-wide/from16 v16, v3

    .line 163
    .line 164
    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    .line 165
    .line 166
    invoke-static {v3, v4, v14, v15}, Ljava/lang/Math;->pow(DD)D

    .line 167
    .line 168
    .line 169
    move-result-wide v3

    .line 170
    double-to-long v3, v3

    .line 171
    const-wide/16 v14, 0x3e8

    .line 172
    .line 173
    mul-long v3, v3, v14

    .line 174
    .line 175
    cmp-long v14, v12, v3

    .line 176
    .line 177
    if-gez v14, :cond_4

    .line 178
    .line 179
    const-string v0, "Reconnection failed due to timeout limit reached."

    .line 180
    .line 181
    invoke-static {v9, v0}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2}, Lp3/b;->r()Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    return v0

    .line 189
    :cond_4
    if-ge v5, v8, :cond_6

    .line 190
    .line 191
    cmp-long v8, v3, v10

    .line 192
    .line 193
    if-lez v8, :cond_6

    .line 194
    .line 195
    :try_start_1
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V

    .line 196
    .line 197
    .line 198
    iget-boolean v3, v1, Lcom/google/android/gms/internal/play_billing/zzbi;->b:Z

    .line 199
    .line 200
    if-eqz v3, :cond_5

    .line 201
    .line 202
    invoke-virtual {v7}, Lcom/google/android/gms/internal/play_billing/zzbl;->a()J

    .line 203
    .line 204
    .line 205
    move-result-wide v3

    .line 206
    iget-wide v7, v1, Lcom/google/android/gms/internal/play_billing/zzbi;->d:J

    .line 207
    .line 208
    sub-long/2addr v3, v7

    .line 209
    iget-wide v7, v1, Lcom/google/android/gms/internal/play_billing/zzbi;->c:J

    .line 210
    .line 211
    add-long/2addr v3, v7

    .line 212
    goto :goto_4

    .line 213
    :cond_5
    iget-wide v3, v1, Lcom/google/android/gms/internal/play_billing/zzbi;->c:J

    .line 214
    .line 215
    :goto_4
    invoke-virtual {v0, v3, v4, v6}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    .line 216
    .line 217
    .line 218
    move-result-wide v3
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 219
    sub-long v3, v16, v3

    .line 220
    .line 221
    move-wide v6, v3

    .line 222
    goto :goto_5

    .line 223
    :catch_1
    move-exception v0

    .line 224
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 229
    .line 230
    .line 231
    const-string v1, "Error sleeping during reconnection attempt: "

    .line 232
    .line 233
    invoke-static {v9, v1, v0}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 234
    .line 235
    .line 236
    goto :goto_6

    .line 237
    :cond_6
    move-wide v6, v12

    .line 238
    :goto_5
    add-int/lit8 v5, v5, 0x1

    .line 239
    .line 240
    move-wide/from16 v3, v16

    .line 241
    .line 242
    goto/16 :goto_0

    .line 243
    .line 244
    :cond_7
    :goto_6
    const-string v0, "Max retries reached."

    .line 245
    .line 246
    invoke-static {v9, v0}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2}, Lp3/b;->r()Z

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    return v0
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
.end method

.method public final r()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lp3/b;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lp3/b;->b:I

    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    const/4 v3, 0x0

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lp3/b;->i:Lcom/google/android/gms/internal/play_billing/zzam;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, Lp3/b;->j:Lp3/x;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    return v3

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v1
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final u()Landroid/os/Handler;
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lp3/b;->e:Landroid/os/Handler;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v0, Landroid/os/Handler;

    .line 11
    .line 12
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 17
    .line 18
    .line 19
    return-object v0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final v(Lp3/e;Lcom/google/android/gms/internal/play_billing/zzie;Ljava/lang/String;Ljava/lang/Exception;)Lp3/a0;
    .locals 1

    .line 1
    const-string v0, "BillingClient"

    .line 2
    .line 3
    invoke-static {v0, p3, p4}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    const/4 p3, 0x7

    .line 7
    invoke-static {p4}, Lp3/d0;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p4

    .line 11
    invoke-virtual {p0, p2, p3, p1, p4}, Lp3/b;->D(Lcom/google/android/gms/internal/play_billing/zzie;ILp3/e;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance p2, Lp3/a0;

    .line 15
    .line 16
    iget p3, p1, Lp3/e;->a:I

    .line 17
    .line 18
    iget-object p1, p1, Lp3/e;->c:Ljava/lang/String;

    .line 19
    .line 20
    new-instance p4, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-direct {p2, p3, p1, p4, v0}, Lp3/a0;-><init>(ILjava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 31
    .line 32
    .line 33
    return-object p2
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
.end method

.method public final w()Lp3/e;
    .locals 3

    .line 1
    const-string v0, "BillingClient"

    .line 2
    .line 3
    const-string v1, "Service connection is valid. No need to re-initialize."

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/zzc;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzib;->y()Lcom/google/android/gms/internal/play_billing/zzhz;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    .line 13
    .line 14
    .line 15
    iget-object v1, v0, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 16
    .line 17
    check-cast v1, Lcom/google/android/gms/internal/play_billing/zzib;

    .line 18
    .line 19
    const/4 v2, 0x6

    .line 20
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/zzib;->x(Lcom/google/android/gms/internal/play_billing/zzib;I)V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzjv;->x()Lcom/google/android/gms/internal/play_billing/zzjt;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    .line 28
    .line 29
    .line 30
    iget-object v2, v1, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 31
    .line 32
    check-cast v2, Lcom/google/android/gms/internal/play_billing/zzjv;

    .line 33
    .line 34
    invoke-static {v2}, Lcom/google/android/gms/internal/play_billing/zzjv;->w(Lcom/google/android/gms/internal/play_billing/zzjv;)V

    .line 35
    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/zzjt;->i(Z)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/zzjt;->l()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    .line 45
    .line 46
    .line 47
    iget-object v2, v0, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 48
    .line 49
    check-cast v2, Lcom/google/android/gms/internal/play_billing/zzib;

    .line 50
    .line 51
    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/zzfe;->e()Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Lcom/google/android/gms/internal/play_billing/zzjv;

    .line 56
    .line 57
    invoke-static {v2, v1}, Lcom/google/android/gms/internal/play_billing/zzib;->w(Lcom/google/android/gms/internal/play_billing/zzib;Lcom/google/android/gms/internal/play_billing/zzjv;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/zzfe;->e()Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Lcom/google/android/gms/internal/play_billing/zzib;

    .line 65
    .line 66
    invoke-virtual {p0, v0}, Lp3/b;->k(Lcom/google/android/gms/internal/play_billing/zzib;)V

    .line 67
    .line 68
    .line 69
    sget-object v0, Lp3/f0;->g:Lp3/e;

    .line 70
    .line 71
    return-object v0
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public final x()Lp3/e;
    .locals 5

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x0

    .line 3
    filled-new-array {v1, v0}, [I

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v2, p0, Lp3/b;->a:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v2

    .line 10
    :goto_0
    const/4 v3, 0x2

    .line 11
    if-ge v1, v3, :cond_1

    .line 12
    .line 13
    :try_start_0
    aget v3, v0, v1

    .line 14
    .line 15
    iget v4, p0, Lp3/b;->b:I

    .line 16
    .line 17
    if-ne v4, v3, :cond_0

    .line 18
    .line 19
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    sget-object v0, Lp3/f0;->h:Lp3/e;

    .line 21
    .line 22
    return-object v0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    sget-object v0, Lp3/f0;->f:Lp3/e;

    .line 30
    .line 31
    return-object v0

    .line 32
    :goto_1
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 33
    throw v0
.end method

.method public final y()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lp3/b;->g:Landroid/content/Context;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method
