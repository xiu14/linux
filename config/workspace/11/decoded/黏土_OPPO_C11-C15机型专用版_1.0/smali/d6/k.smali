.class public final Ld6/k;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ld5/a;


# instance fields
.field public final h:Ld6/s;

.field public final synthetic i:Ld6/o;


# direct methods
.method public constructor <init>(Ld6/o;Ld6/s;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld6/k;->i:Ld6/o;

    .line 5
    .line 6
    iput-object p2, p0, Ld6/k;->h:Ld6/s;

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
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Ld6/k;->i:Ld6/o;

    .line 2
    .line 3
    iget-object v1, p0, Ld6/k;->h:Ld6/s;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    :try_start_0
    invoke-virtual {v1, v2, p0}, Ld6/s;->a(ZLd6/k;)Z

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    if-eqz v4, :cond_1

    .line 12
    .line 13
    :cond_0
    const/4 v4, 0x0

    .line 14
    invoke-virtual {v1, v4, p0}, Ld6/s;->a(ZLd6/k;)Z

    .line 15
    .line 16
    .line 17
    move-result v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    if-nez v4, :cond_0

    .line 19
    .line 20
    const/16 v4, 0x9

    .line 21
    .line 22
    invoke-virtual {v0, v2, v4, v3}, Ld6/o;->a(IILjava/io/IOException;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-static {v1}, Lx5/b;->c(Ljava/io/Closeable;)V

    .line 26
    .line 27
    .line 28
    goto :goto_3

    .line 29
    :catchall_0
    move-exception v2

    .line 30
    goto :goto_1

    .line 31
    :catch_0
    move-exception v2

    .line 32
    goto :goto_2

    .line 33
    :cond_1
    :try_start_1
    new-instance v2, Ljava/io/IOException;

    .line 34
    .line 35
    const-string v4, "Required SETTINGS preface not received"

    .line 36
    .line 37
    invoke-direct {v2, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    :goto_1
    const/4 v4, 0x3

    .line 42
    invoke-virtual {v0, v4, v4, v3}, Ld6/o;->a(IILjava/io/IOException;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v1}, Lx5/b;->c(Ljava/io/Closeable;)V

    .line 46
    .line 47
    .line 48
    throw v2

    .line 49
    :goto_2
    const/4 v3, 0x2

    .line 50
    invoke-virtual {v0, v3, v3, v2}, Ld6/o;->a(IILjava/io/IOException;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :goto_3
    sget-object v0, Lp4/k;->a:Lp4/k;

    .line 55
    .line 56
    return-object v0
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
