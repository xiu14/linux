.class public final Landroidx/room/q0;
.super Lv4/h;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ld5/p;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public final synthetic j:Landroidx/room/r0;

.field public final synthetic k:Z

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/room/r0;Ld5/l;Lt4/c;Z)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Landroidx/room/q0;->h:I

    .line 1
    iput-object p1, p0, Landroidx/room/q0;->j:Landroidx/room/r0;

    iput-boolean p4, p0, Landroidx/room/q0;->k:Z

    iput-object p2, p0, Landroidx/room/q0;->l:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lv4/h;-><init>(ILt4/c;)V

    return-void
.end method

.method public constructor <init>(Landroidx/room/r0;Z[Ljava/lang/String;Lt4/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Landroidx/room/q0;->h:I

    .line 2
    iput-object p1, p0, Landroidx/room/q0;->j:Landroidx/room/r0;

    iput-boolean p2, p0, Landroidx/room/q0;->k:Z

    iput-object p3, p0, Landroidx/room/q0;->l:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lv4/h;-><init>(ILt4/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lt4/c;)Lt4/c;
    .locals 3

    .line 1
    iget p1, p0, Landroidx/room/q0;->h:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Landroidx/room/q0;

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/room/q0;->l:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ld5/l;

    .line 11
    .line 12
    iget-object v1, p0, Landroidx/room/q0;->j:Landroidx/room/r0;

    .line 13
    .line 14
    iget-boolean v2, p0, Landroidx/room/q0;->k:Z

    .line 15
    .line 16
    invoke-direct {p1, v1, v0, p2, v2}, Landroidx/room/q0;-><init>(Landroidx/room/r0;Ld5/l;Lt4/c;Z)V

    .line 17
    .line 18
    .line 19
    return-object p1

    .line 20
    :pswitch_0
    new-instance p1, Landroidx/room/q0;

    .line 21
    .line 22
    iget-object v0, p0, Landroidx/room/q0;->l:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, [Ljava/lang/String;

    .line 25
    .line 26
    iget-object v1, p0, Landroidx/room/q0;->j:Landroidx/room/r0;

    .line 27
    .line 28
    iget-boolean v2, p0, Landroidx/room/q0;->k:Z

    .line 29
    .line 30
    invoke-direct {p1, v1, v2, v0, p2}, Landroidx/room/q0;-><init>(Landroidx/room/r0;Z[Ljava/lang/String;Lt4/c;)V

    .line 31
    .line 32
    .line 33
    return-object p1

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Landroidx/room/q0;->h:I

    .line 2
    .line 3
    check-cast p1, Ln5/v;

    .line 4
    .line 5
    check-cast p2, Lt4/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Landroidx/room/q0;->create(Ljava/lang/Object;Lt4/c;)Lt4/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Landroidx/room/q0;

    .line 15
    .line 16
    sget-object p2, Lp4/k;->a:Lp4/k;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroidx/room/q0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Landroidx/room/q0;->create(Ljava/lang/Object;Lt4/c;)Lt4/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Landroidx/room/q0;

    .line 28
    .line 29
    sget-object p2, Lp4/k;->a:Lp4/k;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Landroidx/room/q0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Landroidx/room/q0;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lu4/a;->h:Lu4/a;

    .line 7
    .line 8
    iget v1, p0, Landroidx/room/q0;->i:I

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    new-instance p1, Lv1/e;

    .line 31
    .line 32
    iget-object v1, p0, Landroidx/room/q0;->l:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Ld5/l;

    .line 35
    .line 36
    iget-object v3, p0, Landroidx/room/q0;->j:Landroidx/room/r0;

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    iget-boolean v5, p0, Landroidx/room/q0;->k:Z

    .line 40
    .line 41
    invoke-direct {p1, v3, v1, v4, v5}, Lv1/e;-><init>(Landroidx/room/r0;Ld5/l;Lt4/c;Z)V

    .line 42
    .line 43
    .line 44
    iput v2, p0, Landroidx/room/q0;->i:I

    .line 45
    .line 46
    invoke-virtual {v3, v5, p1, p0}, Landroidx/room/r0;->useConnection$room_runtime_release(ZLd5/p;Lt4/c;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-ne p1, v0, :cond_2

    .line 51
    .line 52
    move-object p1, v0

    .line 53
    :cond_2
    :goto_0
    return-object p1

    .line 54
    :pswitch_0
    sget-object v0, Lu4/a;->h:Lu4/a;

    .line 55
    .line 56
    iget v1, p0, Landroidx/room/q0;->i:I

    .line 57
    .line 58
    const/4 v2, 0x1

    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    if-ne v1, v2, :cond_3

    .line 62
    .line 63
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 68
    .line 69
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 70
    .line 71
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p1

    .line 75
    :cond_4
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Landroidx/room/q0;->j:Landroidx/room/r0;

    .line 79
    .line 80
    invoke-static {p1}, Landroidx/room/r0;->access$getConnectionManager$p(Landroidx/room/r0;)Landroidx/room/i0;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    const/4 v3, 0x0

    .line 85
    if-eqz v1, :cond_6

    .line 86
    .line 87
    new-instance v4, Landroidx/room/p0;

    .line 88
    .line 89
    iget-object v5, p0, Landroidx/room/q0;->l:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v5, [Ljava/lang/String;

    .line 92
    .line 93
    iget-boolean v6, p0, Landroidx/room/q0;->k:Z

    .line 94
    .line 95
    invoke-direct {v4, p1, v6, v5, v3}, Landroidx/room/p0;-><init>(Landroidx/room/r0;Z[Ljava/lang/String;Lt4/c;)V

    .line 96
    .line 97
    .line 98
    iput v2, p0, Landroidx/room/q0;->i:I

    .line 99
    .line 100
    iget-object p1, v1, Landroidx/room/i0;->f:Lr1/b;

    .line 101
    .line 102
    const/4 v1, 0x0

    .line 103
    invoke-interface {p1, v1, v4, p0}, Lr1/b;->V(ZLd5/p;Lt4/c;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-ne p1, v0, :cond_5

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_5
    :goto_1
    sget-object v0, Lp4/k;->a:Lp4/k;

    .line 111
    .line 112
    :goto_2
    return-object v0

    .line 113
    :cond_6
    const-string p1, "connectionManager"

    .line 114
    .line 115
    invoke-static {p1}, Lkotlin/jvm/internal/j;->l(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw v3

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
