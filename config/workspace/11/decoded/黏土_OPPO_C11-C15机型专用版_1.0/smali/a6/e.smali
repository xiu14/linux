.class public final La6/e;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final a:La6/j;

.field public final b:La6/f;

.field public final c:Lb6/e;

.field public d:Z

.field public final e:La6/n;


# direct methods
.method public constructor <init>(La6/j;La6/f;Lb6/e;)V
    .locals 1

    .line 1
    const-string v0, "finder"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, La6/e;->a:La6/j;

    .line 10
    .line 11
    iput-object p2, p0, La6/e;->b:La6/f;

    .line 12
    .line 13
    iput-object p3, p0, La6/e;->c:Lb6/e;

    .line 14
    .line 15
    invoke-interface {p3}, Lb6/e;->h()La6/n;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, La6/e;->e:La6/n;

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
.end method


# virtual methods
.method public final a(ZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 1

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p3}, La6/e;->c(Ljava/io/IOException;)V

    .line 4
    .line 5
    .line 6
    :cond_0
    iget-object v0, p0, La6/e;->a:La6/j;

    .line 7
    .line 8
    invoke-virtual {v0, p0, p2, p1, p3}, La6/j;->i(La6/e;ZZLjava/io/IOException;)Ljava/io/IOException;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
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

.method public final b(Z)Lw5/y;
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, La6/e;->c:Lb6/e;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lb6/e;->f(Z)Lw5/y;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iput-object p0, p1, Lw5/y;->m:La6/e;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :catch_0
    move-exception p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-object p1

    .line 15
    :goto_0
    invoke-virtual {p0, p1}, La6/e;->c(Ljava/io/IOException;)V

    .line 16
    .line 17
    .line 18
    throw p1
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

.method public final c(Ljava/io/IOException;)V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, La6/e;->d:Z

    .line 3
    .line 4
    iget-object v1, p0, La6/e;->b:La6/f;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, La6/f;->c(Ljava/io/IOException;)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, La6/e;->c:Lb6/e;

    .line 10
    .line 11
    invoke-interface {v1}, Lb6/e;->h()La6/n;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, p0, La6/e;->a:La6/j;

    .line 16
    .line 17
    monitor-enter v1

    .line 18
    :try_start_0
    instance-of v3, p1, Ld6/c0;

    .line 19
    .line 20
    if-eqz v3, :cond_2

    .line 21
    .line 22
    move-object v3, p1

    .line 23
    check-cast v3, Ld6/c0;

    .line 24
    .line 25
    iget v3, v3, Ld6/c0;->h:I

    .line 26
    .line 27
    const/16 v4, 0x8

    .line 28
    .line 29
    if-ne v3, v4, :cond_0

    .line 30
    .line 31
    iget p1, v1, La6/n;->n:I

    .line 32
    .line 33
    add-int/2addr p1, v0

    .line 34
    iput p1, v1, La6/n;->n:I

    .line 35
    .line 36
    if-le p1, v0, :cond_5

    .line 37
    .line 38
    iput-boolean v0, v1, La6/n;->j:Z

    .line 39
    .line 40
    iget p1, v1, La6/n;->l:I

    .line 41
    .line 42
    add-int/2addr p1, v0

    .line 43
    iput p1, v1, La6/n;->l:I

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_2

    .line 48
    :cond_0
    check-cast p1, Ld6/c0;

    .line 49
    .line 50
    iget p1, p1, Ld6/c0;->h:I

    .line 51
    .line 52
    const/16 v3, 0x9

    .line 53
    .line 54
    if-ne p1, v3, :cond_1

    .line 55
    .line 56
    iget-boolean p1, v2, La6/j;->t:Z

    .line 57
    .line 58
    if-nez p1, :cond_5

    .line 59
    .line 60
    :cond_1
    iput-boolean v0, v1, La6/n;->j:Z

    .line 61
    .line 62
    iget p1, v1, La6/n;->l:I

    .line 63
    .line 64
    add-int/2addr p1, v0

    .line 65
    iput p1, v1, La6/n;->l:I

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    iget-object v3, v1, La6/n;->g:Ld6/o;

    .line 69
    .line 70
    if-eqz v3, :cond_3

    .line 71
    .line 72
    const/4 v3, 0x1

    .line 73
    goto :goto_0

    .line 74
    :cond_3
    const/4 v3, 0x0

    .line 75
    :goto_0
    if-eqz v3, :cond_4

    .line 76
    .line 77
    instance-of v3, p1, Ld6/a;

    .line 78
    .line 79
    if-eqz v3, :cond_5

    .line 80
    .line 81
    :cond_4
    iput-boolean v0, v1, La6/n;->j:Z

    .line 82
    .line 83
    iget v3, v1, La6/n;->m:I

    .line 84
    .line 85
    if-nez v3, :cond_5

    .line 86
    .line 87
    iget-object v2, v2, La6/j;->h:Lw5/u;

    .line 88
    .line 89
    iget-object v3, v1, La6/n;->b:Lw5/c0;

    .line 90
    .line 91
    invoke-static {v2, v3, p1}, La6/n;->d(Lw5/u;Lw5/c0;Ljava/io/IOException;)V

    .line 92
    .line 93
    .line 94
    iget p1, v1, La6/n;->l:I

    .line 95
    .line 96
    add-int/2addr p1, v0

    .line 97
    iput p1, v1, La6/n;->l:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    .line 99
    :cond_5
    :goto_1
    monitor-exit v1

    .line 100
    return-void

    .line 101
    :goto_2
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 102
    throw p1
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
