.class public abstract Lcom/google/android/gms/common/api/internal/BasePendingResult;
.super Lcom/google/android/gms/common/api/PendingResult;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation

.annotation build Lcom/google/android/gms/common/annotation/KeepName;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/common/api/internal/BasePendingResult$CallbackHandler;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R::",
        "Lcom/google/android/gms/common/api/Result;",
        ">",
        "Lcom/google/android/gms/common/api/PendingResult<",
        "TR;>;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lcom/google/android/gms/common/api/internal/BasePendingResult$CallbackHandler;

.field public final c:Ljava/util/concurrent/CountDownLatch;

.field public final d:Ljava/util/ArrayList;

.field public e:Lcom/google/android/gms/common/api/ResultCallback;

.field public final f:Ljava/util/concurrent/atomic/AtomicReference;

.field public g:Lcom/google/android/gms/common/api/Result;

.field public h:Lcom/google/android/gms/common/api/Status;

.field public volatile i:Z

.field public j:Z

.field private resultGuardian:Lcom/google/android/gms/common/api/internal/zas;
    .annotation build Lcom/google/android/gms/common/annotation/KeepName;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/internal/zas;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/internal/zaq;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/common/api/internal/zaq;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
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
.end method

.method public constructor <init>()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/common/api/PendingResult;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->a:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->c:Ljava/util/concurrent/CountDownLatch;

    .line 18
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->d:Ljava/util/ArrayList;

    .line 25
    .line 26
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 32
    .line 33
    new-instance v0, Lcom/google/android/gms/common/api/internal/BasePendingResult$CallbackHandler;

    .line 34
    .line 35
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/base/zau;-><init>(Landroid/os/Looper;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->b:Lcom/google/android/gms/common/api/internal/BasePendingResult$CallbackHandler;

    .line 43
    .line 44
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-void
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

.method public static g(Lcom/google/android/gms/common/api/Result;)V
    .locals 3

    .line 1
    instance-of v0, p0, Lcom/google/android/gms/common/api/Releasable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    move-object v0, p0

    .line 6
    check-cast v0, Lcom/google/android/gms/common/api/Releasable;

    .line 7
    .line 8
    invoke-interface {v0}, Lcom/google/android/gms/common/api/Releasable;->m()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catch_0
    move-exception v0

    .line 13
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v1, "BasePendingResult"

    .line 18
    .line 19
    const-string v2, "Unable to release "

    .line 20
    .line 21
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {v1, p0, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
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


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/common/api/Result;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->e(Lcom/google/android/gms/common/api/Result;)V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public abstract b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
.end method

.method public final c(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->d()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->e(Lcom/google/android/gms/common/api/Result;)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->j:Z

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    monitor-exit v0

    .line 24
    return-void

    .line 25
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw p1
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

.method public final d()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->c:Ljava/util/concurrent/CountDownLatch;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->getCount()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long v4, v0, v2

    .line 10
    .line 11
    if-nez v4, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
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

.method public final e(Lcom/google/android/gms/common/api/Result;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->j:Z

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->d()Z

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->d()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    xor-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    const-string v2, "Results have already been set"

    .line 18
    .line 19
    invoke-static {v2, v1}, Lcom/google/android/gms/common/internal/Preconditions;->f(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    iget-boolean v1, p0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->i:Z

    .line 23
    .line 24
    xor-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    const-string v2, "Result has already been consumed"

    .line 27
    .line 28
    invoke-static {v2, v1}, Lcom/google/android/gms/common/internal/Preconditions;->f(Ljava/lang/String;Z)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->f(Lcom/google/android/gms/common/api/Result;)V

    .line 32
    .line 33
    .line 34
    monitor-exit v0

    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->g(Lcom/google/android/gms/common/api/Result;)V

    .line 39
    .line 40
    .line 41
    monitor-exit v0

    .line 42
    return-void

    .line 43
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    throw p1
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
.end method

.method public final f(Lcom/google/android/gms/common/api/Result;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->d:Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->b:Lcom/google/android/gms/common/api/internal/BasePendingResult$CallbackHandler;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->g:Lcom/google/android/gms/common/api/Result;

    .line 6
    .line 7
    invoke-interface {p1}, Lcom/google/android/gms/common/api/Result;->c()Lcom/google/android/gms/common/api/Status;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->h:Lcom/google/android/gms/common/api/Status;

    .line 12
    .line 13
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->c:Ljava/util/concurrent/CountDownLatch;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->e:Lcom/google/android/gms/common/api/ResultCallback;

    .line 19
    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->g:Lcom/google/android/gms/common/api/Result;

    .line 23
    .line 24
    instance-of p1, p1, Lcom/google/android/gms/common/api/Releasable;

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    new-instance p1, Lcom/google/android/gms/common/api/internal/zas;

    .line 29
    .line 30
    invoke-direct {p1, p0}, Lcom/google/android/gms/common/api/internal/zas;-><init>(Lcom/google/android/gms/common/api/internal/BasePendingResult;)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->resultGuardian:Lcom/google/android/gms/common/api/internal/zas;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v2, 0x2

    .line 37
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 38
    .line 39
    .line 40
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->a:Ljava/lang/Object;

    .line 41
    .line 42
    monitor-enter v2

    .line 43
    :try_start_0
    iget-boolean v3, p0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->i:Z

    .line 44
    .line 45
    const/4 v4, 0x1

    .line 46
    xor-int/2addr v3, v4

    .line 47
    const-string v5, "Result has already been consumed."

    .line 48
    .line 49
    invoke-static {v5, v3}, Lcom/google/android/gms/common/internal/Preconditions;->f(Ljava/lang/String;Z)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->d()Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    const-string v5, "Result is not ready."

    .line 57
    .line 58
    invoke-static {v5, v3}, Lcom/google/android/gms/common/internal/Preconditions;->f(Ljava/lang/String;Z)V

    .line 59
    .line 60
    .line 61
    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->g:Lcom/google/android/gms/common/api/Result;

    .line 62
    .line 63
    const/4 v5, 0x0

    .line 64
    iput-object v5, p0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->g:Lcom/google/android/gms/common/api/Result;

    .line 65
    .line 66
    iput-object v5, p0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->e:Lcom/google/android/gms/common/api/ResultCallback;

    .line 67
    .line 68
    iput-boolean v4, p0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->i:Z

    .line 69
    .line 70
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 72
    .line 73
    invoke-virtual {v2, v5}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, Lcom/google/android/gms/common/api/internal/zadb;

    .line 78
    .line 79
    if-nez v2, :cond_3

    .line 80
    .line 81
    invoke-static {v3}, Lcom/google/android/gms/common/internal/Preconditions;->d(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    new-instance v2, Landroid/util/Pair;

    .line 85
    .line 86
    invoke-direct {v2, p1, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    const/4 p1, 0x1

    .line 90
    invoke-virtual {v1, p1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {v1, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 95
    .line 96
    .line 97
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    const/4 v1, 0x0

    .line 102
    :goto_1
    if-ge v1, p1, :cond_2

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    check-cast v2, Lcom/google/android/gms/common/api/PendingResult$StatusListener;

    .line 109
    .line 110
    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->h:Lcom/google/android/gms/common/api/Status;

    .line 111
    .line 112
    invoke-interface {v2, v3}, Lcom/google/android/gms/common/api/PendingResult$StatusListener;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 113
    .line 114
    .line 115
    add-int/lit8 v1, v1, 0x1

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_3
    const/4 p1, 0x0

    .line 123
    throw p1

    .line 124
    :catchall_0
    move-exception p1

    .line 125
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 126
    throw p1
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
