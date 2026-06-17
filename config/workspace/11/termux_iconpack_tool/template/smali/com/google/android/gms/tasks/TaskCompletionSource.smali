.class public Lcom/google/android/gms/tasks/TaskCompletionSource;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lcom/google/android/gms/tasks/zzw;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/android/gms/tasks/zzw;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/google/android/gms/tasks/zzw;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/android/gms/tasks/TaskCompletionSource;->a:Lcom/google/android/gms/tasks/zzw;

    .line 10
    .line 11
    return-void
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


# virtual methods
.method public final a(Ljava/lang/Exception;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/tasks/TaskCompletionSource;->a:Lcom/google/android/gms/tasks/zzw;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v1, "Exception must not be null"

    .line 7
    .line 8
    invoke-static {p1, v1}, Lcom/google/android/gms/common/internal/Preconditions;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, Lcom/google/android/gms/tasks/zzw;->a:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v1

    .line 14
    :try_start_0
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/zzw;->l()V

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    iput-boolean v2, v0, Lcom/google/android/gms/tasks/zzw;->c:Z

    .line 19
    .line 20
    iput-object p1, v0, Lcom/google/android/gms/tasks/zzw;->f:Ljava/lang/Exception;

    .line 21
    .line 22
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    iget-object p1, v0, Lcom/google/android/gms/tasks/zzw;->b:Lcom/google/android/gms/tasks/zzr;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/zzr;->b(Lcom/google/android/gms/tasks/Task;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    throw p1
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/tasks/TaskCompletionSource;->a:Lcom/google/android/gms/tasks/zzw;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/zzw;->j(Ljava/lang/Object;)V

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

.method public final c(Ljava/lang/Exception;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/tasks/TaskCompletionSource;->a:Lcom/google/android/gms/tasks/zzw;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v1, "Exception must not be null"

    .line 7
    .line 8
    invoke-static {p1, v1}, Lcom/google/android/gms/common/internal/Preconditions;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, Lcom/google/android/gms/tasks/zzw;->a:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v1

    .line 14
    :try_start_0
    iget-boolean v2, v0, Lcom/google/android/gms/tasks/zzw;->c:Z

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    monitor-exit v1

    .line 19
    const/4 p1, 0x0

    .line 20
    return p1

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v2, 0x1

    .line 24
    iput-boolean v2, v0, Lcom/google/android/gms/tasks/zzw;->c:Z

    .line 25
    .line 26
    iput-object p1, v0, Lcom/google/android/gms/tasks/zzw;->f:Ljava/lang/Exception;

    .line 27
    .line 28
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    iget-object p1, v0, Lcom/google/android/gms/tasks/zzw;->b:Lcom/google/android/gms/tasks/zzr;

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/zzr;->b(Lcom/google/android/gms/tasks/Task;)V

    .line 32
    .line 33
    .line 34
    return v2

    .line 35
    :goto_0
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    throw p1
    .line 37
.end method

.method public final d(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/tasks/TaskCompletionSource;->a:Lcom/google/android/gms/tasks/zzw;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/tasks/zzw;->a:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget-boolean v2, v0, Lcom/google/android/gms/tasks/zzw;->c:Z

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    monitor-exit v1

    .line 11
    const/4 p1, 0x0

    .line 12
    return p1

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v2, 0x1

    .line 16
    iput-boolean v2, v0, Lcom/google/android/gms/tasks/zzw;->c:Z

    .line 17
    .line 18
    iput-object p1, v0, Lcom/google/android/gms/tasks/zzw;->e:Ljava/lang/Object;

    .line 19
    .line 20
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    iget-object p1, v0, Lcom/google/android/gms/tasks/zzw;->b:Lcom/google/android/gms/tasks/zzr;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/zzr;->b(Lcom/google/android/gms/tasks/Task;)V

    .line 24
    .line 25
    .line 26
    return v2

    .line 27
    :goto_0
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw p1
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
