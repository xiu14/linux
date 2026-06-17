.class public final Landroidx/recyclerview/widget/e;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:I

.field public i:Ljava/lang/Object;

.field public final j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/recyclerview/widget/e;->h:I

    iput-object p2, p0, Landroidx/recyclerview/widget/e;->j:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/recyclerview/widget/e;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 2
    iput p3, p0, Landroidx/recyclerview/widget/e;->h:I

    iput-object p1, p0, Landroidx/recyclerview/widget/e;->i:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/recyclerview/widget/e;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :cond_0
    :try_start_0
    iget-object v1, p0, Landroidx/recyclerview/widget/e;->i:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v1, Ljava/lang/Runnable;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception v1

    .line 11
    :try_start_1
    sget-object v2, Lt4/i;->h:Lt4/i;

    .line 12
    .line 13
    invoke-static {v2, v1}, Ln5/x;->n(Lt4/h;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    iget-object v1, p0, Landroidx/recyclerview/widget/e;->j:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ls5/h;

    .line 19
    .line 20
    invoke-virtual {v1}, Ls5/h;->e0()Ljava/lang/Runnable;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    iput-object v1, p0, Landroidx/recyclerview/widget/e;->i:Ljava/lang/Object;

    .line 28
    .line 29
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    const/16 v1, 0x10

    .line 32
    .line 33
    if-lt v0, v1, :cond_0

    .line 34
    .line 35
    iget-object v1, p0, Landroidx/recyclerview/widget/e;->j:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Ls5/h;

    .line 38
    .line 39
    iget-object v2, v1, Ls5/h;->j:Ln5/r;

    .line 40
    .line 41
    invoke-static {v2, v1}, Ls5/b;->j(Ln5/r;Lt4/h;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    iget-object v0, p0, Landroidx/recyclerview/widget/e;->j:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Ls5/h;

    .line 50
    .line 51
    iget-object v1, v0, Ls5/h;->j:Ln5/r;

    .line 52
    .line 53
    invoke-static {v1, v0, p0}, Ls5/b;->i(Ln5/r;Lt4/h;Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 54
    .line 55
    .line 56
    :goto_1
    return-void

    .line 57
    :catchall_1
    move-exception v0

    .line 58
    iget-object v1, p0, Landroidx/recyclerview/widget/e;->j:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, Ls5/h;

    .line 61
    .line 62
    iget-object v2, v1, Ls5/h;->m:Ljava/lang/Object;

    .line 63
    .line 64
    monitor-enter v2

    .line 65
    :try_start_2
    sget-object v3, Ls5/h;->n:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 66
    .line 67
    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 68
    .line 69
    .line 70
    monitor-exit v2

    .line 71
    throw v0

    .line 72
    :catchall_2
    move-exception v0

    .line 73
    monitor-exit v2

    .line 74
    throw v0
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

.method private final b()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/e;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lt2/a;

    .line 4
    .line 5
    iget-object v0, v0, Lt2/a;->h:Lm2/r;

    .line 6
    .line 7
    iget-object v0, v0, Lm2/r;->f:Lm2/d;

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/recyclerview/widget/e;->i:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lm2/d;->c(Ljava/lang/String;)Lu2/p;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Lu2/p;->c()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v1, p0, Landroidx/recyclerview/widget/e;->j:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Lt2/a;

    .line 28
    .line 29
    iget-object v1, v1, Lt2/a;->j:Ljava/lang/Object;

    .line 30
    .line 31
    monitor-enter v1

    .line 32
    :try_start_0
    iget-object v2, p0, Landroidx/recyclerview/widget/e;->j:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, Lt2/a;

    .line 35
    .line 36
    iget-object v2, v2, Lt2/a;->m:Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-static {v0}, La/a;->B(Lu2/p;)Lu2/j;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    iget-object v2, p0, Landroidx/recyclerview/widget/e;->j:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v2, Lt2/a;

    .line 48
    .line 49
    iget-object v3, v2, Lt2/a;->o:Lp3/j;

    .line 50
    .line 51
    iget-object v4, v2, Lt2/a;->i:Lw2/a;

    .line 52
    .line 53
    check-cast v4, Lu2/i;

    .line 54
    .line 55
    iget-object v4, v4, Lu2/i;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v4, Ln5/r;

    .line 58
    .line 59
    invoke-static {v3, v0, v4, v2}, Lq2/l;->a(Lp3/j;Lu2/p;Ln5/r;Lq2/g;)Ln5/a0;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    iget-object v3, p0, Landroidx/recyclerview/widget/e;->j:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v3, Lt2/a;

    .line 66
    .line 67
    iget-object v3, v3, Lt2/a;->n:Ljava/util/HashMap;

    .line 68
    .line 69
    invoke-static {v0}, La/a;->B(Lu2/p;)Lu2/j;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v3, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    monitor-exit v1

    .line 77
    return-void

    .line 78
    :catchall_0
    move-exception v0

    .line 79
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    throw v0

    .line 81
    :cond_0
    return-void
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

.method private final c()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/e;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lv2/f;

    .line 4
    .line 5
    iget-object v0, v0, Lv2/f;->c:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Landroidx/recyclerview/widget/e;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lv2/f;

    .line 11
    .line 12
    iget-object v1, v1, Lv2/f;->d:Lk6/f;

    .line 13
    .line 14
    iget-object v2, p0, Landroidx/recyclerview/widget/e;->i:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Lk6/f;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v2, p0, Landroidx/recyclerview/widget/e;->j:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Lv2/f;

    .line 23
    .line 24
    iget-object v3, v2, Lv2/f;->a:Ljava/lang/Object;

    .line 25
    .line 26
    if-nez v3, :cond_0

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    iput-object v1, v2, Lv2/f;->a:Ljava/lang/Object;

    .line 31
    .line 32
    iget-object v2, v2, Lv2/f;->e:Landroidx/lifecycle/h0;

    .line 33
    .line 34
    invoke-virtual {v2, v1}, Landroidx/lifecycle/f0;->i(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v1

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    if-eqz v3, :cond_1

    .line 41
    .line 42
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-nez v2, :cond_1

    .line 47
    .line 48
    iget-object v2, p0, Landroidx/recyclerview/widget/e;->j:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Lv2/f;

    .line 51
    .line 52
    iput-object v1, v2, Lv2/f;->a:Ljava/lang/Object;

    .line 53
    .line 54
    iget-object v2, v2, Lv2/f;->e:Landroidx/lifecycle/h0;

    .line 55
    .line 56
    invoke-virtual {v2, v1}, Landroidx/lifecycle/f0;->i(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    :goto_0
    monitor-exit v0

    .line 60
    return-void

    .line 61
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    throw v1
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


# virtual methods
.method public final run()V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Landroidx/recyclerview/widget/e;->h:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    :try_start_0
    iget-object v0, v1, Landroidx/recyclerview/widget/e;->j:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/lang/Runnable;

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 16
    .line 17
    .line 18
    iget-object v0, v1, Landroidx/recyclerview/widget/e;->i:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Landroidx/room/c1;

    .line 21
    .line 22
    iget-object v2, v0, Landroidx/room/c1;->l:Ljava/lang/Object;

    .line 23
    .line 24
    monitor-enter v2

    .line 25
    :try_start_1
    iget-object v0, v1, Landroidx/recyclerview/widget/e;->i:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Landroidx/room/c1;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroidx/room/c1;->d()V

    .line 30
    .line 31
    .line 32
    monitor-exit v2

    .line 33
    return-void

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    throw v0

    .line 37
    :catchall_1
    move-exception v0

    .line 38
    iget-object v2, v1, Landroidx/recyclerview/widget/e;->i:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, Landroidx/room/c1;

    .line 41
    .line 42
    iget-object v2, v2, Landroidx/room/c1;->l:Ljava/lang/Object;

    .line 43
    .line 44
    monitor-enter v2

    .line 45
    :try_start_2
    iget-object v3, v1, Landroidx/recyclerview/widget/e;->i:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v3, Landroidx/room/c1;

    .line 48
    .line 49
    invoke-virtual {v3}, Landroidx/room/c1;->d()V

    .line 50
    .line 51
    .line 52
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 53
    throw v0

    .line 54
    :catchall_2
    move-exception v0

    .line 55
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 56
    throw v0

    .line 57
    :pswitch_0
    invoke-direct {v1}, Landroidx/recyclerview/widget/e;->c()V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_1
    invoke-direct {v1}, Landroidx/recyclerview/widget/e;->b()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_2
    invoke-direct {v1}, Landroidx/recyclerview/widget/e;->a()V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_3
    iget-object v0, v1, Landroidx/recyclerview/widget/e;->i:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Lp3/b;

    .line 72
    .line 73
    iget-object v2, v1, Landroidx/recyclerview/widget/e;->j:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v2, Ldev/jahir/frames/data/viewmodels/a;

    .line 76
    .line 77
    sget-object v3, Lcom/google/android/gms/internal/play_billing/zzie;->F:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 78
    .line 79
    sget-object v4, Lp3/f0;->i:Lp3/e;

    .line 80
    .line 81
    const/16 v5, 0x9

    .line 82
    .line 83
    invoke-virtual {v0, v3, v5, v4}, Lp3/b;->B(Lcom/google/android/gms/internal/play_billing/zzie;ILp3/e;)V

    .line 84
    .line 85
    .line 86
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzbt;->o()Lcom/google/android/gms/internal/play_billing/zzbt;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v2, v4, v0}, Ldev/jahir/frames/data/viewmodels/a;->b(Lp3/e;Ljava/util/List;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :pswitch_4
    iget-object v0, v1, Landroidx/recyclerview/widget/e;->i:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Lp3/b;

    .line 97
    .line 98
    iget-object v2, v1, Landroidx/recyclerview/widget/e;->j:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v2, Ldev/jahir/frames/data/viewmodels/a;

    .line 101
    .line 102
    sget-object v3, Lcom/google/android/gms/internal/play_billing/zzie;->F:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 103
    .line 104
    sget-object v4, Lp3/f0;->i:Lp3/e;

    .line 105
    .line 106
    const/4 v5, 0x7

    .line 107
    invoke-virtual {v0, v3, v5, v4}, Lp3/b;->B(Lcom/google/android/gms/internal/play_billing/zzie;ILp3/e;)V

    .line 108
    .line 109
    .line 110
    new-instance v0, Lp3/r;

    .line 111
    .line 112
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzbt;->o()Lcom/google/android/gms/internal/play_billing/zzbt;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzbt;->o()Lcom/google/android/gms/internal/play_billing/zzbt;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    invoke-direct {v0, v3, v5}, Lp3/r;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v4, v0}, Ldev/jahir/frames/data/viewmodels/a;->a(Lp3/e;Lp3/r;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :pswitch_5
    iget-object v0, v1, Landroidx/recyclerview/widget/e;->i:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v0, Ljava/util/concurrent/Future;

    .line 130
    .line 131
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-nez v2, :cond_0

    .line 136
    .line 137
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-nez v2, :cond_0

    .line 142
    .line 143
    iget-object v2, v1, Landroidx/recyclerview/widget/e;->j:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v2, Ljava/lang/Runnable;

    .line 146
    .line 147
    invoke-interface {v0, v4}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 148
    .line 149
    .line 150
    const-string v0, "BillingClient"

    .line 151
    .line 152
    const-string v3, "Async task is taking too long, cancel it!"

    .line 153
    .line 154
    invoke-static {v0, v3}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    if-eqz v2, :cond_0

    .line 158
    .line 159
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 160
    .line 161
    .line 162
    :cond_0
    return-void

    .line 163
    :pswitch_6
    iget-object v0, v1, Landroidx/recyclerview/widget/e;->i:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v0, Lp3/b;

    .line 166
    .line 167
    iget-object v2, v1, Landroidx/recyclerview/widget/e;->j:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v2, Lp3/e;

    .line 170
    .line 171
    iget-object v3, v0, Lp3/b;->f:Lp3/i0;

    .line 172
    .line 173
    iget-object v3, v3, Lp3/i0;->b:Lp3/o;

    .line 174
    .line 175
    if-eqz v3, :cond_1

    .line 176
    .line 177
    iget-object v0, v0, Lp3/b;->f:Lp3/i0;

    .line 178
    .line 179
    iget-object v0, v0, Lp3/i0;->b:Lp3/o;

    .line 180
    .line 181
    const/4 v3, 0x0

    .line 182
    invoke-interface {v0, v2, v3}, Lp3/o;->onPurchasesUpdated(Lp3/e;Ljava/util/List;)V

    .line 183
    .line 184
    .line 185
    goto :goto_0

    .line 186
    :cond_1
    const-string v0, "BillingClient"

    .line 187
    .line 188
    const-string v2, "No valid listener is set in BroadcastManager"

    .line 189
    .line 190
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    :goto_0
    return-void

    .line 194
    :pswitch_7
    iget-object v0, v1, Landroidx/recyclerview/widget/e;->j:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v0, Ln5/h;

    .line 197
    .line 198
    iget-object v2, v1, Landroidx/recyclerview/widget/e;->i:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v2, Ln5/r0;

    .line 201
    .line 202
    invoke-virtual {v0, v2}, Ln5/h;->B(Ln5/r;)V

    .line 203
    .line 204
    .line 205
    return-void

    .line 206
    :pswitch_8
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    sget-object v2, Ln2/a;->e:Ljava/lang/String;

    .line 211
    .line 212
    new-instance v5, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    const-string v6, "Scheduling work "

    .line 215
    .line 216
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    iget-object v6, v1, Landroidx/recyclerview/widget/e;->i:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v6, Lu2/p;

    .line 222
    .line 223
    iget-object v7, v6, Lu2/p;->a:Ljava/lang/String;

    .line 224
    .line 225
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    invoke-virtual {v0, v2, v5}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    iget-object v0, v1, Landroidx/recyclerview/widget/e;->j:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v0, Ln2/a;

    .line 238
    .line 239
    iget-object v0, v0, Ln2/a;->a:Ln2/c;

    .line 240
    .line 241
    new-array v2, v4, [Lu2/p;

    .line 242
    .line 243
    aput-object v6, v2, v3

    .line 244
    .line 245
    invoke-virtual {v0, v2}, Ln2/c;->b([Lu2/p;)V

    .line 246
    .line 247
    .line 248
    return-void

    .line 249
    :pswitch_9
    iget-object v0, v1, Landroidx/recyclerview/widget/e;->i:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v0, Ll6/x;

    .line 252
    .line 253
    invoke-static {v0}, Le6/l;->w(Lt4/c;)Lt4/c;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    iget-object v2, v1, Landroidx/recyclerview/widget/e;->j:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v2, Ljava/lang/Throwable;

    .line 260
    .line 261
    invoke-static {v2}, Le6/l;->i(Ljava/lang/Throwable;)Lp4/g;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    invoke-interface {v0, v2}, Lt4/c;->resumeWith(Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    return-void

    .line 269
    :pswitch_a
    iget-object v0, v1, Landroidx/recyclerview/widget/e;->i:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast v0, Lj0/e;

    .line 272
    .line 273
    iget-object v2, v1, Landroidx/recyclerview/widget/e;->j:Ljava/lang/Object;

    .line 274
    .line 275
    invoke-virtual {v0, v2}, Lj0/e;->accept(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    return-void

    .line 279
    :pswitch_b
    iget-object v0, v1, Landroidx/recyclerview/widget/e;->i:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v0, La1/q;

    .line 282
    .line 283
    iget-object v2, v1, Landroidx/recyclerview/widget/e;->j:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v2, Landroid/graphics/Typeface;

    .line 286
    .line 287
    iget-object v0, v0, La1/q;->i:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v0, Ld0/b;

    .line 290
    .line 291
    if-eqz v0, :cond_2

    .line 292
    .line 293
    invoke-virtual {v0, v2}, Ld0/b;->j(Landroid/graphics/Typeface;)V

    .line 294
    .line 295
    .line 296
    :cond_2
    return-void

    .line 297
    :pswitch_c
    iget-object v0, v1, Landroidx/recyclerview/widget/e;->j:Ljava/lang/Object;

    .line 298
    .line 299
    iget-object v5, v1, Landroidx/recyclerview/widget/e;->i:Ljava/lang/Object;

    .line 300
    .line 301
    :try_start_4
    sget-object v6, Lb0/l;->d:Ljava/lang/reflect/Method;

    .line 302
    .line 303
    if-eqz v6, :cond_3

    .line 304
    .line 305
    const/4 v7, 0x3

    .line 306
    new-array v7, v7, [Ljava/lang/Object;

    .line 307
    .line 308
    aput-object v0, v7, v3

    .line 309
    .line 310
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 311
    .line 312
    aput-object v0, v7, v4

    .line 313
    .line 314
    const-string v0, "AppCompat recreation"

    .line 315
    .line 316
    aput-object v0, v7, v2

    .line 317
    .line 318
    invoke-virtual {v6, v5, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    goto :goto_3

    .line 322
    :catchall_3
    move-exception v0

    .line 323
    goto :goto_1

    .line 324
    :catch_0
    move-exception v0

    .line 325
    goto :goto_2

    .line 326
    :cond_3
    sget-object v6, Lb0/l;->e:Ljava/lang/reflect/Method;

    .line 327
    .line 328
    new-array v2, v2, [Ljava/lang/Object;

    .line 329
    .line 330
    aput-object v0, v2, v3

    .line 331
    .line 332
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 333
    .line 334
    aput-object v0, v2, v4

    .line 335
    .line 336
    invoke-virtual {v6, v5, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 337
    .line 338
    .line 339
    goto :goto_3

    .line 340
    :goto_1
    const-string v2, "ActivityRecreator"

    .line 341
    .line 342
    const-string v3, "Exception while invoking performStopActivity"

    .line 343
    .line 344
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 345
    .line 346
    .line 347
    goto :goto_3

    .line 348
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    const-class v3, Ljava/lang/RuntimeException;

    .line 353
    .line 354
    if-ne v2, v3, :cond_5

    .line 355
    .line 356
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    if-eqz v2, :cond_5

    .line 361
    .line 362
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    const-string v3, "Unable to stop"

    .line 367
    .line 368
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 369
    .line 370
    .line 371
    move-result v2

    .line 372
    if-nez v2, :cond_4

    .line 373
    .line 374
    goto :goto_3

    .line 375
    :cond_4
    throw v0

    .line 376
    :cond_5
    :goto_3
    return-void

    .line 377
    :pswitch_d
    iget-object v0, v1, Landroidx/recyclerview/widget/e;->i:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast v0, Landroid/app/Application;

    .line 380
    .line 381
    iget-object v2, v1, Landroidx/recyclerview/widget/e;->j:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast v2, Lb0/k;

    .line 384
    .line 385
    invoke-virtual {v0, v2}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 386
    .line 387
    .line 388
    return-void

    .line 389
    :pswitch_e
    iget-object v0, v1, Landroidx/recyclerview/widget/e;->i:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast v0, Lb0/k;

    .line 392
    .line 393
    iget-object v2, v1, Landroidx/recyclerview/widget/e;->j:Ljava/lang/Object;

    .line 394
    .line 395
    iput-object v2, v0, Lb0/k;->h:Ljava/lang/Object;

    .line 396
    .line 397
    return-void

    .line 398
    :pswitch_f
    iget-object v0, v1, Landroidx/recyclerview/widget/e;->j:Ljava/lang/Object;

    .line 399
    .line 400
    check-cast v0, Landroidx/fragment/app/b2;

    .line 401
    .line 402
    iget-object v5, v0, Landroidx/fragment/app/b2;->m:Ljava/lang/Object;

    .line 403
    .line 404
    check-cast v5, Landroidx/recyclerview/widget/h;

    .line 405
    .line 406
    iget v6, v5, Landroidx/recyclerview/widget/h;->g:I

    .line 407
    .line 408
    iget v7, v0, Landroidx/fragment/app/b2;->i:I

    .line 409
    .line 410
    if-ne v6, v7, :cond_11

    .line 411
    .line 412
    iget-object v6, v0, Landroidx/fragment/app/b2;->k:Ljava/util/List;

    .line 413
    .line 414
    iget-object v7, v1, Landroidx/recyclerview/widget/e;->i:Ljava/lang/Object;

    .line 415
    .line 416
    check-cast v7, Landroidx/recyclerview/widget/u;

    .line 417
    .line 418
    iget-object v0, v0, Landroidx/fragment/app/b2;->l:Ljava/lang/Object;

    .line 419
    .line 420
    check-cast v0, Ljava/lang/Runnable;

    .line 421
    .line 422
    iget-object v8, v5, Landroidx/recyclerview/widget/h;->f:Ljava/util/List;

    .line 423
    .line 424
    iput-object v6, v5, Landroidx/recyclerview/widget/h;->e:Ljava/util/List;

    .line 425
    .line 426
    invoke-static {v6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 427
    .line 428
    .line 429
    move-result-object v6

    .line 430
    iput-object v6, v5, Landroidx/recyclerview/widget/h;->f:Ljava/util/List;

    .line 431
    .line 432
    iget-object v6, v5, Landroidx/recyclerview/widget/h;->a:Landroidx/recyclerview/widget/c;

    .line 433
    .line 434
    iget-object v9, v7, Landroidx/recyclerview/widget/u;->b:[I

    .line 435
    .line 436
    iget-object v10, v7, Landroidx/recyclerview/widget/u;->a:Ljava/util/ArrayList;

    .line 437
    .line 438
    iget v11, v7, Landroidx/recyclerview/widget/u;->e:I

    .line 439
    .line 440
    iget-object v12, v7, Landroidx/recyclerview/widget/u;->d:Landroidx/recyclerview/widget/c;

    .line 441
    .line 442
    new-instance v13, Landroidx/recyclerview/widget/i;

    .line 443
    .line 444
    invoke-direct {v13, v6}, Landroidx/recyclerview/widget/i;-><init>(Landroidx/recyclerview/widget/t0;)V

    .line 445
    .line 446
    .line 447
    new-instance v6, Ljava/util/ArrayDeque;

    .line 448
    .line 449
    invoke-direct {v6}, Ljava/util/ArrayDeque;-><init>()V

    .line 450
    .line 451
    .line 452
    iget v14, v7, Landroidx/recyclerview/widget/u;->f:I

    .line 453
    .line 454
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 455
    .line 456
    .line 457
    move-result v15

    .line 458
    sub-int/2addr v15, v4

    .line 459
    move v2, v15

    .line 460
    move v15, v14

    .line 461
    move v14, v11

    .line 462
    :goto_4
    if-ltz v2, :cond_10

    .line 463
    .line 464
    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v16

    .line 468
    const/16 v17, 0x1

    .line 469
    .line 470
    move-object/from16 v4, v16

    .line 471
    .line 472
    check-cast v4, Landroidx/recyclerview/widget/t;

    .line 473
    .line 474
    iget v3, v4, Landroidx/recyclerview/widget/t;->a:I

    .line 475
    .line 476
    iget v1, v4, Landroidx/recyclerview/widget/t;->c:I

    .line 477
    .line 478
    move/from16 v18, v2

    .line 479
    .line 480
    add-int v2, v3, v1

    .line 481
    .line 482
    iget v4, v4, Landroidx/recyclerview/widget/t;->b:I

    .line 483
    .line 484
    move/from16 v19, v3

    .line 485
    .line 486
    add-int v3, v4, v1

    .line 487
    .line 488
    :goto_5
    if-le v14, v2, :cond_9

    .line 489
    .line 490
    add-int/lit8 v14, v14, -0x1

    .line 491
    .line 492
    aget v20, v9, v14

    .line 493
    .line 494
    and-int/lit8 v21, v20, 0xc

    .line 495
    .line 496
    if-eqz v21, :cond_8

    .line 497
    .line 498
    move/from16 v21, v2

    .line 499
    .line 500
    shr-int/lit8 v2, v20, 0x4

    .line 501
    .line 502
    move/from16 v22, v4

    .line 503
    .line 504
    move-object/from16 v23, v9

    .line 505
    .line 506
    const/4 v4, 0x0

    .line 507
    invoke-static {v6, v2, v4}, Landroidx/recyclerview/widget/u;->a(Ljava/util/ArrayDeque;IZ)Landroidx/recyclerview/widget/w;

    .line 508
    .line 509
    .line 510
    move-result-object v9

    .line 511
    if-eqz v9, :cond_7

    .line 512
    .line 513
    iget v4, v9, Landroidx/recyclerview/widget/w;->b:I

    .line 514
    .line 515
    sub-int v4, v11, v4

    .line 516
    .line 517
    add-int/lit8 v4, v4, -0x1

    .line 518
    .line 519
    invoke-virtual {v13, v14, v4}, Landroidx/recyclerview/widget/i;->b(II)V

    .line 520
    .line 521
    .line 522
    and-int/lit8 v9, v20, 0x4

    .line 523
    .line 524
    if-eqz v9, :cond_6

    .line 525
    .line 526
    invoke-virtual {v12, v14, v2}, Landroidx/recyclerview/widget/c;->g(II)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v2

    .line 530
    const/4 v9, 0x1

    .line 531
    invoke-virtual {v13, v4, v9, v2}, Landroidx/recyclerview/widget/i;->d(IILjava/lang/Object;)V

    .line 532
    .line 533
    .line 534
    goto :goto_6

    .line 535
    :cond_6
    const/4 v9, 0x1

    .line 536
    goto :goto_6

    .line 537
    :cond_7
    const/4 v9, 0x1

    .line 538
    new-instance v2, Landroidx/recyclerview/widget/w;

    .line 539
    .line 540
    sub-int v4, v11, v14

    .line 541
    .line 542
    sub-int/2addr v4, v9

    .line 543
    invoke-direct {v2, v14, v4, v9}, Landroidx/recyclerview/widget/w;-><init>(IIZ)V

    .line 544
    .line 545
    .line 546
    invoke-virtual {v6, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 547
    .line 548
    .line 549
    goto :goto_6

    .line 550
    :cond_8
    move/from16 v21, v2

    .line 551
    .line 552
    move/from16 v22, v4

    .line 553
    .line 554
    move-object/from16 v23, v9

    .line 555
    .line 556
    const/4 v9, 0x1

    .line 557
    invoke-virtual {v13, v14, v9}, Landroidx/recyclerview/widget/i;->a(II)V

    .line 558
    .line 559
    .line 560
    add-int/lit8 v11, v11, -0x1

    .line 561
    .line 562
    :goto_6
    move/from16 v2, v21

    .line 563
    .line 564
    move/from16 v4, v22

    .line 565
    .line 566
    move-object/from16 v9, v23

    .line 567
    .line 568
    const/16 v17, 0x1

    .line 569
    .line 570
    goto :goto_5

    .line 571
    :cond_9
    move/from16 v22, v4

    .line 572
    .line 573
    move-object/from16 v23, v9

    .line 574
    .line 575
    :goto_7
    if-le v15, v3, :cond_d

    .line 576
    .line 577
    add-int/lit8 v15, v15, -0x1

    .line 578
    .line 579
    iget-object v2, v7, Landroidx/recyclerview/widget/u;->c:[I

    .line 580
    .line 581
    aget v2, v2, v15

    .line 582
    .line 583
    and-int/lit8 v4, v2, 0xc

    .line 584
    .line 585
    if-eqz v4, :cond_c

    .line 586
    .line 587
    shr-int/lit8 v4, v2, 0x4

    .line 588
    .line 589
    move/from16 v17, v2

    .line 590
    .line 591
    const/4 v9, 0x1

    .line 592
    invoke-static {v6, v4, v9}, Landroidx/recyclerview/widget/u;->a(Ljava/util/ArrayDeque;IZ)Landroidx/recyclerview/widget/w;

    .line 593
    .line 594
    .line 595
    move-result-object v2

    .line 596
    if-nez v2, :cond_b

    .line 597
    .line 598
    new-instance v2, Landroidx/recyclerview/widget/w;

    .line 599
    .line 600
    sub-int v4, v11, v14

    .line 601
    .line 602
    const/4 v9, 0x0

    .line 603
    const/16 v20, 0x1

    .line 604
    .line 605
    invoke-direct {v2, v15, v4, v9}, Landroidx/recyclerview/widget/w;-><init>(IIZ)V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v6, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 609
    .line 610
    .line 611
    :cond_a
    const/4 v4, 0x1

    .line 612
    goto :goto_7

    .line 613
    :cond_b
    const/4 v9, 0x0

    .line 614
    const/16 v20, 0x1

    .line 615
    .line 616
    iget v2, v2, Landroidx/recyclerview/widget/w;->b:I

    .line 617
    .line 618
    sub-int v2, v11, v2

    .line 619
    .line 620
    add-int/lit8 v2, v2, -0x1

    .line 621
    .line 622
    invoke-virtual {v13, v2, v14}, Landroidx/recyclerview/widget/i;->b(II)V

    .line 623
    .line 624
    .line 625
    and-int/lit8 v2, v17, 0x4

    .line 626
    .line 627
    if-eqz v2, :cond_a

    .line 628
    .line 629
    invoke-virtual {v12, v4, v15}, Landroidx/recyclerview/widget/c;->g(II)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v2

    .line 633
    const/4 v4, 0x1

    .line 634
    invoke-virtual {v13, v14, v4, v2}, Landroidx/recyclerview/widget/i;->d(IILjava/lang/Object;)V

    .line 635
    .line 636
    .line 637
    goto :goto_7

    .line 638
    :cond_c
    const/4 v4, 0x1

    .line 639
    const/4 v9, 0x0

    .line 640
    invoke-virtual {v13, v14, v4}, Landroidx/recyclerview/widget/i;->c(II)V

    .line 641
    .line 642
    .line 643
    add-int/lit8 v11, v11, 0x1

    .line 644
    .line 645
    goto :goto_7

    .line 646
    :cond_d
    move/from16 v2, v19

    .line 647
    .line 648
    move/from16 v3, v22

    .line 649
    .line 650
    const/4 v4, 0x0

    .line 651
    :goto_8
    const/4 v9, 0x0

    .line 652
    if-ge v4, v1, :cond_f

    .line 653
    .line 654
    aget v14, v23, v2

    .line 655
    .line 656
    and-int/lit8 v14, v14, 0xf

    .line 657
    .line 658
    const/4 v15, 0x2

    .line 659
    if-ne v14, v15, :cond_e

    .line 660
    .line 661
    invoke-virtual {v12, v2, v3}, Landroidx/recyclerview/widget/c;->g(II)Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object v14

    .line 665
    const/4 v9, 0x1

    .line 666
    invoke-virtual {v13, v2, v9, v14}, Landroidx/recyclerview/widget/i;->d(IILjava/lang/Object;)V

    .line 667
    .line 668
    .line 669
    goto :goto_9

    .line 670
    :cond_e
    const/4 v9, 0x1

    .line 671
    :goto_9
    add-int/lit8 v2, v2, 0x1

    .line 672
    .line 673
    add-int/lit8 v3, v3, 0x1

    .line 674
    .line 675
    add-int/lit8 v4, v4, 0x1

    .line 676
    .line 677
    goto :goto_8

    .line 678
    :cond_f
    const/4 v9, 0x1

    .line 679
    const/4 v15, 0x2

    .line 680
    add-int/lit8 v2, v18, -0x1

    .line 681
    .line 682
    move-object/from16 v1, p0

    .line 683
    .line 684
    move/from16 v14, v19

    .line 685
    .line 686
    move/from16 v15, v22

    .line 687
    .line 688
    move-object/from16 v9, v23

    .line 689
    .line 690
    const/4 v3, 0x0

    .line 691
    const/4 v4, 0x1

    .line 692
    goto/16 :goto_4

    .line 693
    .line 694
    :cond_10
    invoke-virtual {v13}, Landroidx/recyclerview/widget/i;->e()V

    .line 695
    .line 696
    .line 697
    invoke-virtual {v5, v8, v0}, Landroidx/recyclerview/widget/h;->a(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 698
    .line 699
    .line 700
    :cond_11
    return-void

    .line 701
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
