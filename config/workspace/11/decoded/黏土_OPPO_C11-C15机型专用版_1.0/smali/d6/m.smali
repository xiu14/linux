.class public final Ld6/m;
.super Lz5/a;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Ld6/o;

.field public final synthetic g:I

.field public final synthetic h:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ld6/o;ILjava/util/List;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ld6/m;->e:I

    iput-object p2, p0, Ld6/m;->f:Ld6/o;

    iput p3, p0, Ld6/m;->g:I

    iput-object p4, p0, Ld6/m;->h:Ljava/util/List;

    const/4 p2, 0x1

    .line 1
    invoke-direct {p0, p1, p2}, Lz5/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ld6/o;ILjava/util/List;Z)V
    .locals 0

    const/4 p5, 0x0

    iput p5, p0, Ld6/m;->e:I

    iput-object p2, p0, Ld6/m;->f:Ld6/o;

    iput p3, p0, Ld6/m;->g:I

    iput-object p4, p0, Ld6/m;->h:Ljava/util/List;

    const/4 p2, 0x1

    .line 2
    invoke-direct {p0, p1, p2}, Lz5/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method

.method private final b()J
    .locals 3

    .line 1
    iget-object v0, p0, Ld6/m;->f:Ld6/o;

    .line 2
    .line 3
    iget-object v0, v0, Ld6/o;->r:Ld6/a0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v0, p0, Ld6/m;->f:Ld6/o;

    .line 9
    .line 10
    iget-object v0, v0, Ld6/o;->D:Ld6/x;

    .line 11
    .line 12
    iget v1, p0, Ld6/m;->g:I

    .line 13
    .line 14
    const/16 v2, 0x9

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Ld6/x;->x(II)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Ld6/m;->f:Ld6/o;

    .line 20
    .line 21
    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    :try_start_1
    iget-object v1, p0, Ld6/m;->f:Ld6/o;

    .line 23
    .line 24
    iget-object v1, v1, Ld6/o;->F:Ljava/util/LinkedHashSet;

    .line 25
    .line 26
    iget v2, p0, Ld6/m;->g:I

    .line 27
    .line 28
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    .line 34
    .line 35
    :try_start_2
    monitor-exit v0

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception v1

    .line 38
    monitor-exit v0

    .line 39
    throw v1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 40
    :catch_0
    :goto_0
    const-wide/16 v0, -0x1

    .line 41
    .line 42
    return-wide v0
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
.end method


# virtual methods
.method public final a()J
    .locals 3

    .line 1
    iget v0, p0, Ld6/m;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ld6/m;->f:Ld6/o;

    .line 7
    .line 8
    iget-object v0, v0, Ld6/o;->r:Ld6/a0;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    :try_start_0
    iget-object v0, p0, Ld6/m;->f:Ld6/o;

    .line 14
    .line 15
    iget-object v0, v0, Ld6/o;->D:Ld6/x;

    .line 16
    .line 17
    iget v1, p0, Ld6/m;->g:I

    .line 18
    .line 19
    const/16 v2, 0x9

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Ld6/x;->x(II)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Ld6/m;->f:Ld6/o;

    .line 25
    .line 26
    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    :try_start_1
    iget-object v1, p0, Ld6/m;->f:Ld6/o;

    .line 28
    .line 29
    iget-object v1, v1, Ld6/o;->F:Ljava/util/LinkedHashSet;

    .line 30
    .line 31
    iget v2, p0, Ld6/m;->g:I

    .line 32
    .line 33
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    .line 39
    .line 40
    :try_start_2
    monitor-exit v0

    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v1

    .line 43
    monitor-exit v0

    .line 44
    throw v1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 45
    :catch_0
    :goto_0
    const-wide/16 v0, -0x1

    .line 46
    .line 47
    return-wide v0

    .line 48
    :pswitch_0
    invoke-direct {p0}, Ld6/m;->b()J

    .line 49
    .line 50
    .line 51
    move-result-wide v0

    .line 52
    return-wide v0

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
