.class public final Lr2/a;
.super Lkotlin/jvm/internal/k;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ld5/a;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lr2/a;->h:I

    .line 2
    .line 3
    iput-object p2, p0, Lr2/a;->i:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lr2/a;->j:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/k;-><init>(I)V

    .line 9
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


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lr2/a;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr2/a;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ly3/b;

    .line 9
    .line 10
    iget-object v1, p0, Lr2/a;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, [Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ly3/b;->g([Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sget-object v0, Lp4/k;->a:Lp4/k;

    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    iget-object v0, p0, Lr2/a;->i:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lm2/r;

    .line 23
    .line 24
    iget-object v1, v0, Lm2/r;->c:Landroidx/work/impl/WorkDatabase;

    .line 25
    .line 26
    const-string v2, "workManagerImpl.workDatabase"

    .line 27
    .line 28
    invoke-static {v1, v2}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, Lr2/a;->j:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, Ljava/util/UUID;

    .line 34
    .line 35
    new-instance v3, Landroidx/appcompat/app/z;

    .line 36
    .line 37
    const/16 v4, 0xf

    .line 38
    .line 39
    invoke-direct {v3, v4, v0, v2}, Landroidx/appcompat/app/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v3}, Landroidx/room/r0;->runInTransaction(Ljava/lang/Runnable;)V

    .line 43
    .line 44
    .line 45
    iget-object v1, v0, Lm2/r;->b:Ll2/a;

    .line 46
    .line 47
    iget-object v2, v0, Lm2/r;->c:Landroidx/work/impl/WorkDatabase;

    .line 48
    .line 49
    iget-object v0, v0, Lm2/r;->e:Ljava/util/List;

    .line 50
    .line 51
    invoke-static {v1, v2, v0}, Lm2/i;->b(Ll2/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 52
    .line 53
    .line 54
    sget-object v0, Lp4/k;->a:Lp4/k;

    .line 55
    .line 56
    return-object v0

    .line 57
    :pswitch_1
    iget-object v0, p0, Lr2/a;->i:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Lr2/c;

    .line 60
    .line 61
    iget-object v0, v0, Lr2/c;->a:Ls2/f;

    .line 62
    .line 63
    iget-object v1, p0, Lr2/a;->j:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Lr2/b;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iget-object v2, v0, Ls2/f;->c:Ljava/lang/Object;

    .line 71
    .line 72
    monitor-enter v2

    .line 73
    :try_start_0
    iget-object v3, v0, Ls2/f;->d:Ljava/util/LinkedHashSet;

    .line 74
    .line 75
    invoke-virtual {v3, v1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_0

    .line 80
    .line 81
    iget-object v1, v0, Ls2/f;->d:Ljava/util/LinkedHashSet;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_0

    .line 88
    .line 89
    invoke-virtual {v0}, Ls2/f;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :catchall_0
    move-exception v0

    .line 94
    goto :goto_1

    .line 95
    :cond_0
    :goto_0
    monitor-exit v2

    .line 96
    sget-object v0, Lp4/k;->a:Lp4/k;

    .line 97
    .line 98
    return-object v0

    .line 99
    :goto_1
    monitor-exit v2

    .line 100
    throw v0

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
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
