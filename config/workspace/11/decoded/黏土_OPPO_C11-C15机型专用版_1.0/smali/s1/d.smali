.class public final Ls1/d;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroidx/room/e1;
.implements Lr1/v;


# instance fields
.field public final a:Ls1/a;


# direct methods
.method public constructor <init>(Ls1/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls1/d;->a:Ls1/a;

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


# virtual methods
.method public final a(Lv4/h;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p1, p0, Ls1/d;->a:Ls1/a;

    .line 2
    .line 3
    iget-object p1, p1, Ls1/a;->h:Lz1/a;

    .line 4
    .line 5
    invoke-interface {p1}, Lz1/a;->L()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
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

.method public final b()Ly1/a;
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/d;->a:Ls1/a;

    .line 2
    .line 3
    return-object v0
    .line 4
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
.end method

.method public final c(Ljava/lang/String;Ld5/l;Lv4/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p3, p0, Ls1/d;->a:Ls1/a;

    .line 2
    .line 3
    invoke-virtual {p3, p1}, Ls1/a;->a(Ljava/lang/String;)Ls1/g;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    :try_start_0
    invoke-interface {p2, p1}, Ld5/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    const/4 p3, 0x0

    .line 12
    invoke-static {p1, p3}, La/a;->o(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    return-object p2

    .line 16
    :catchall_0
    move-exception p2

    .line 17
    :try_start_1
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 18
    :catchall_1
    move-exception p3

    .line 19
    invoke-static {p1, p2}, La/a;->o(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    throw p3
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

.method public final d(Landroidx/room/d1;Ld5/p;Lv4/h;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Ls1/d;->e(Landroidx/room/d1;Ld5/p;Lv4/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public final e(Landroidx/room/d1;Ld5/p;Lv4/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, Ls1/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Ls1/c;

    .line 7
    .line 8
    iget v1, v0, Ls1/c;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ls1/c;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ls1/c;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Ls1/c;-><init>(Ls1/d;Lv4/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Ls1/c;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lu4/a;->h:Lu4/a;

    .line 28
    .line 29
    iget v2, v0, Ls1/c;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, Ls1/c;->i:Lz1/a;

    .line 37
    .line 38
    iget-object p2, v0, Ls1/c;->h:Ls1/d;

    .line 39
    .line 40
    :try_start_0
    invoke-static {p3}, Le6/l;->H(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :catchall_0
    move-exception p3

    .line 45
    goto :goto_3

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-static {p3}, Le6/l;->H(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p3, p0, Ls1/d;->a:Ls1/a;

    .line 58
    .line 59
    iget-object p3, p3, Ls1/a;->h:Lz1/a;

    .line 60
    .line 61
    invoke-interface {p3}, Lz1/a;->L()Z

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_5

    .line 69
    .line 70
    if-eq p1, v3, :cond_4

    .line 71
    .line 72
    const/4 v2, 0x2

    .line 73
    if-ne p1, v2, :cond_3

    .line 74
    .line 75
    invoke-interface {p3}, Lz1/a;->k()V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    new-instance p1, Landroidx/fragment/app/i0;

    .line 80
    .line 81
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 82
    .line 83
    .line 84
    throw p1

    .line 85
    :cond_4
    invoke-interface {p3}, Lz1/a;->b0()V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_5
    invoke-interface {p3}, Lz1/a;->I()V

    .line 90
    .line 91
    .line 92
    :goto_1
    :try_start_1
    new-instance p1, Lr1/o;

    .line 93
    .line 94
    const/4 v2, 0x1

    .line 95
    invoke-direct {p1, v2, p0}, Lr1/o;-><init>(ILjava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iput-object p0, v0, Ls1/c;->h:Ls1/d;

    .line 99
    .line 100
    iput-object p3, v0, Ls1/c;->i:Lz1/a;

    .line 101
    .line 102
    iput v3, v0, Ls1/c;->l:I

    .line 103
    .line 104
    invoke-interface {p2, p1, v0}, Ld5/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 108
    if-ne p1, v1, :cond_6

    .line 109
    .line 110
    return-object v1

    .line 111
    :cond_6
    move-object p2, p3

    .line 112
    move-object p3, p1

    .line 113
    move-object p1, p2

    .line 114
    move-object p2, p0

    .line 115
    :goto_2
    :try_start_2
    invoke-interface {p1}, Lz1/a;->Z()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 116
    .line 117
    .line 118
    invoke-interface {p1}, Lz1/a;->j()V

    .line 119
    .line 120
    .line 121
    invoke-interface {p1}, Lz1/a;->L()Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-nez p1, :cond_7

    .line 126
    .line 127
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    :cond_7
    return-object p3

    .line 131
    :catchall_1
    move-exception p1

    .line 132
    move-object p2, p3

    .line 133
    move-object p3, p1

    .line 134
    move-object p1, p2

    .line 135
    move-object p2, p0

    .line 136
    :goto_3
    invoke-interface {p1}, Lz1/a;->j()V

    .line 137
    .line 138
    .line 139
    invoke-interface {p1}, Lz1/a;->L()Z

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    if-nez p1, :cond_8

    .line 144
    .line 145
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    :cond_8
    throw p3
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method
