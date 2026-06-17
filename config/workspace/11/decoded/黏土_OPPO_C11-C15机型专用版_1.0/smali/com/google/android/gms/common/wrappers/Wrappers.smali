.class public Lcom/google/android/gms/common/wrappers/Wrappers;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation


# static fields
.field public static final b:Lcom/google/android/gms/common/wrappers/Wrappers;


# instance fields
.field public a:Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/common/wrappers/Wrappers;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/common/wrappers/Wrappers;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/common/wrappers/Wrappers;->b:Lcom/google/android/gms/common/wrappers/Wrappers;

    .line 7
    .line 8
    return-void
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
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/google/android/gms/common/wrappers/Wrappers;->a:Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;

    .line 6
    .line 7
    return-void
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
.end method

.method public static a(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/common/wrappers/Wrappers;->b:Lcom/google/android/gms/common/wrappers/Wrappers;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, v0, Lcom/google/android/gms/common/wrappers/Wrappers;->a:Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;

    .line 5
    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    :goto_0
    new-instance v1, Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;

    .line 22
    .line 23
    invoke-direct {v1, p0}, Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;-><init>(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, v0, Lcom/google/android/gms/common/wrappers/Wrappers;->a:Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;

    .line 27
    .line 28
    :cond_1
    iget-object p0, v0, Lcom/google/android/gms/common/wrappers/Wrappers;->a:Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    monitor-exit v0

    .line 31
    return-object p0

    .line 32
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    throw p0
    .line 34
    .line 35
    .line 36
    .line 37
.end method
