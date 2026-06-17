.class public final synthetic Lg2/h;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ls/j;
.implements Lcom/google/android/datatransport/runtime/synchronization/SynchronizationGuard$CriticalSection;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lg2/h;->h:I

    iput-object p1, p0, Lg2/h;->i:Ljava/lang/Object;

    iput-object p2, p0, Lg2/h;->j:Ljava/lang/Object;

    iput-object p3, p0, Lg2/h;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Runnable;Lg2/y;Ljava/lang/Runnable;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lg2/h;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg2/h;->i:Ljava/lang/Object;

    iput-object p2, p0, Lg2/h;->k:Ljava/lang/Object;

    iput-object p3, p0, Lg2/h;->j:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lt4/h;Ln5/w;Ld5/p;)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput v0, p0, Lg2/h;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg2/h;->i:Ljava/lang/Object;

    iput-object p2, p0, Lg2/h;->j:Ljava/lang/Object;

    check-cast p3, Lv4/h;

    iput-object p3, p0, Lg2/h;->k:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ls/i;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lg2/h;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg2/h;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 9
    .line 10
    iget-object v1, p0, Lg2/h;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/lang/String;

    .line 13
    .line 14
    iget-object v2, p0, Lg2/h;->k:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Ld5/a;

    .line 17
    .line 18
    new-instance v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    invoke-direct {v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 22
    .line 23
    .line 24
    new-instance v4, Ll2/n;

    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    invoke-direct {v4, v3, v5}, Ll2/n;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;I)V

    .line 28
    .line 29
    .line 30
    iget-object v5, p1, Ls/i;->c:Ls/n;

    .line 31
    .line 32
    if-eqz v5, :cond_0

    .line 33
    .line 34
    sget-object v6, Ll2/k;->h:Ll2/k;

    .line 35
    .line 36
    invoke-virtual {v5, v4, v6}, Ls/h;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    new-instance v4, La1/o;

    .line 40
    .line 41
    const/4 v5, 0x3

    .line 42
    invoke-direct {v4, v3, p1, v2, v5}, La1/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v0, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 46
    .line 47
    .line 48
    return-object v1

    .line 49
    :pswitch_0
    iget-object v0, p0, Lg2/h;->i:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Lt4/h;

    .line 52
    .line 53
    iget-object v1, p0, Lg2/h;->j:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Ln5/w;

    .line 56
    .line 57
    iget-object v2, p0, Lg2/h;->k:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, Lv4/h;

    .line 60
    .line 61
    sget-object v3, Ln5/x0;->h:Ln5/x0;

    .line 62
    .line 63
    invoke-interface {v0, v3}, Lt4/h;->get(Lt4/g;)Lt4/f;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    check-cast v3, Ln5/y0;

    .line 68
    .line 69
    new-instance v4, La1/x;

    .line 70
    .line 71
    const/16 v5, 0xc

    .line 72
    .line 73
    invoke-direct {v4, v5, v3}, La1/x;-><init>(ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object v3, p1, Ls/i;->c:Ls/n;

    .line 77
    .line 78
    if-eqz v3, :cond_1

    .line 79
    .line 80
    sget-object v5, Ll2/k;->h:Ll2/k;

    .line 81
    .line 82
    invoke-virtual {v3, v4, v5}, Ls/h;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 83
    .line 84
    .line 85
    :cond_1
    invoke-static {v0}, Ln5/x;->a(Lt4/h;)Ls5/d;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    new-instance v3, Landroidx/room/r;

    .line 90
    .line 91
    const/4 v4, 0x0

    .line 92
    invoke-direct {v3, v2, p1, v4}, Landroidx/room/r;-><init>(Ld5/p;Ls/i;Lt4/c;)V

    .line 93
    .line 94
    .line 95
    const/4 p1, 0x1

    .line 96
    invoke-static {v0, v4, v1, v3, p1}, Ln5/x;->p(Ln5/v;Lt4/h;Ln5/w;Ld5/p;I)Ln5/a0;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    return-object p1

    .line 101
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
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

.method public f()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lg2/h;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/datatransport/runtime/scheduling/DefaultScheduler;

    .line 4
    .line 5
    iget-object v1, p0, Lg2/h;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lcom/google/android/datatransport/runtime/TransportContext;

    .line 8
    .line 9
    iget-object v2, p0, Lg2/h;->k:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lcom/google/android/datatransport/runtime/EventInternal;

    .line 12
    .line 13
    iget-object v3, v0, Lcom/google/android/datatransport/runtime/scheduling/DefaultScheduler;->d:Lcom/google/android/datatransport/runtime/scheduling/persistence/EventStore;

    .line 14
    .line 15
    invoke-interface {v3, v1, v2}, Lcom/google/android/datatransport/runtime/scheduling/persistence/EventStore;->O(Lcom/google/android/datatransport/runtime/TransportContext;Lcom/google/android/datatransport/runtime/EventInternal;)Lcom/google/android/datatransport/runtime/scheduling/persistence/PersistedEvent;

    .line 16
    .line 17
    .line 18
    iget-object v0, v0, Lcom/google/android/datatransport/runtime/scheduling/DefaultScheduler;->a:Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/WorkScheduler;

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-interface {v0, v1, v2}, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/WorkScheduler;->a(Lcom/google/android/datatransport/runtime/TransportContext;I)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    return-object v0
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method
